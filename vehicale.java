class vehicle{
	static double transport(String source, String destination)
	{
		System.out.println("Entered transport - String, String");
		if(source=="Bengaluru")
		{
			System.out.println("Source: " +source+ ", Destination: "+destination );
			return 700d;
		}
		return 0;
	}
	static double transport(String source, String destination, boolean ontime)
	{
		System.out.println("Entered transport - String, String, Boolean");
		if(source=="Bengaluru")
		{
			System.out.println("Source: " +source+ ", Destination: "+destination+ ", Ontime:" +ontime );
			return 700d;
		}
		return 0;
	}
	static boolean transport(String destination)
	{
		System.out.println("Entered transport - String");
		if(destination=="Mysore")
		{
			System.out.println("Destination: "+destination);
			return true;
		}
		return false;
	}
    static boolean transport(String destination, boolean ontime )
	{
		System.out.println("Entered transport - String, Boolean");
		if(destination=="Mysore")
		{
			System.out.println("Destination: "+destination+ ", Ontime: " +ontime);
			return true;
		}
		return false;
	} 
	static boolean transport(boolean ontime)
	{
		System.out.println("Entered transport - String, Boolean");
		if(ontime==true)
		{
			System.out.println("Ontime: " +ontime);
			return true;
		}
		return false;
	}
	
}