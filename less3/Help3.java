class Help3
{
	public static void main(String args[])
	throws java.io.IOException
	{
		char choice, ignore;
		do
		{
		System.out.println("Help on: ");
		System.out.println("1. if ");
		System.out.println("2. switch ");
		System.out.println("3. for ");
		System.out.println("4. while ");
		System.out.println("5. do-while ");
		System.out.println("6. break ");
		System.out.println("7. continue \n");
		System.out.println("Choose one (q to quit)");
		choice = (char) System.in.read();
		     do
		      {
			    ignore = (char) System.in.read();
		      }
		     while(ignore!='\n');
	    }
	    while(choice < '1' | choice > '7' & choice != 'q');
	  	        
		switch(choice)
		{
			case '1': System.out.println("The if:\t");
			System.out.println("if(condition) statement; ");
			System.out.println("else statement; ");
			break;
			case '2': System.out.println("The switch:");
			System.out.println("switch(expression) \n{");
			System.out.print("case constant:");
			System.out.println("statement sequence");
			System.out.println("break;");
			System.out.println("}");
			break;
			case '3': System.out.println("The for: \n");
			System.out.print("for(init; condition; interation)");
			System.out.println(" statement;");
			break;
			case '4': System.out.println("The while: \n");
			System.out.println("while(condition) statement;");
			break;
			case '5': System.out.println("The do-while:\n");
			System.out.println("do \n{");
			System.out.println("statement;");
			System.out.println("} \nwhile (condition);");
			break;
			case '6': System.out.println("The break:\n");
			System.out.println("break; or break lable;");
			break;
			case '7': System.out.println("The continue:\n");
			System.out.println("continue; or continue lable;");
			break;
		}

	}
}