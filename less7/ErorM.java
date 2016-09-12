class ErrorMsg
{
	final int ms1 = 0;
	final int ms2 = 1;
	final int ms3 = 2;
	final int ms4 = 3;

	String msgs[] = {"error 1", "error 2", "error 3", "error 4"};

	String getMsg(int i)
	{
		if(i>=0 & i<msgs.length)
		return msgs[i];
		else
			return "Invalid error code";
	}
}

class ErorM
{
	public static void main(String args[])
	{
		ErrorMsg err = new ErrorMsg();
		System.out.println(err.getMsg(err.ms1));
		System.out.println(err.getMsg(err.ms3)); 
	}

}