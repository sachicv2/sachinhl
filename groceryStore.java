class groceryStore{
	
	static String place;
	static String name;
	static int floors;
	static int noOfWorkers;
	static int discount;
	static double area;
	static boolean hygenic;
	
System.out.println("reading start");

  static void setPlace(String A1)
  {
	  place=A1;
  }
 static String getPlace()
 {
   return place;
 }
 static void setName(String A2)
 {
	 name=A2;
 }
 	  static String getName()
	  {
		  return name;
	  }
	static void setFloors(int A3)
	{
		floors=A3;
	}
 static int getfloors()
 {
	 return floors;
 }
 static void setNoOfWorkers(int A4)
 {
	 noOfWorkers=A4;
 }
	static int getNoOfWorkers()
	{
		return noOfWorkers;
		
	}
	static void setDiscount(int A5)
	{
		discount=A5;
	}
	static int getDiscount()
	{
		return=discount;
	}
	static void setArea(double A6)
	{
		area=A6;
	}
	static double getArea()
	{
		return area;
	}
	
	static void setHygenic(boolean A7)
	{
		hygenic=A7;
	}
	static boolean getHygenic()
	{
		return hygenic;
	}
	
	static void displayDetails()
	{
		System.out.println("place:" +place);
		System.out.println("name:" +name);
		System.out.println("noOfWorkers:" +noOfWorkers);
		System.out.println("discount:" +discount);
		System.out.println("area:" +area);
		System.out.println("hygenic:" +hygenic);
	}
	System.out.println("reading ends");

}