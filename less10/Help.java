import java.io.*;
class Help
{
	String helpfile; // imya fayla so spravkoy

	Help(String fname)
	{
		helpfile = fname;
	}

	boolean helpon(String what)
	{
		int ch;
		String topic,info;

		try(BufferedReader helpRdr = new BufferedReader(new FileReader("spravka.dat")))
		{
			do
			{
				//chitat' simvoli do teh por poka ne vstretitsa znak #
				ch = helpRdr.read();

				//a teper' proveryaem sovpadayut li temi
				if(ch == '#')
				{
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0) //found topic
					{
						do
						{
							info = helpRdr.readLine();
							if(info != null)
								System.out.println(info);
						}
						while((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			}
			while(ch != -1);
		}
		catch(IOException exc)
		{
			System.out.println("Error accesing help file.");
			return false;
		}
		return false; //tema ne naydena
	}

	//poluchit' temu
	String getSelection()
	{
		String topic = "";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter topic: ");
		try
		{
			topic = br.readLine();
		}
		catch(IOException exc)
		{
			System.out.println("Error reading console.");
		}
		return topic;
	}
}