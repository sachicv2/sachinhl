class person{
	static void work(String company,double salary)
	{
		System.out.println("Entered work - String, double");
		if(company=="Xworkz")
		{
			System.out.println("Company = " +company + "   Salary =" +salary);
			return;
		}
		
		if(company=="Oracle")
		{
			System.out.println("Company = " +company + "   Salary =" +salary);
			return;
		}
	}
	static void work(String company,double salary, String designation)
	{
		System.out.println("Entered work - String, double, String");
		if(company=="Xworkz")
		{
		System.out.println("Company = " +company + "   Salary =" +salary+ "  Designation= " +designation);
		}
		if(company=="Oracle")
		{
			System.out.println("Company = " +company + "   Salary =" +salary+ "  Designation= " +designation);
			return;
		}
	}
}