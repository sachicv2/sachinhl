class groceryStoreRunner{
	
	public static void main(String[] sachin)
	groceryStore.displayDetails();
	{
		groceryStore.setPlace("mysore");
		
		String place=groceryStore.getPlace();
		 
		 groceryStore.setName("Abcd");
		 
		 String name=groceryStore.getName();
		 
		 groceryStore.setFloors(4);
		 
		 int floors=groceryStore.getFloors();
		 
		 groceryStore.setNoOfWorkers(90);
		 
		 int noOfWorkers=groceryStore.getNoOfWorkers();
		 
		 groceryStore.setDiscount(50);
		 
		 int discount=groceryStore.getDiscount();
		 
		 groceryStore.setArea(2522.2);
		 
		 double area=groceryStore.getArea();
		 
		 groceryStore.setHygenic(true);
		 
		 boolean hygenic=groceryStore.getHygenic();
		 
		 if(hygenic==true)
	 {
		System.out.println("ok"); 
	 }
	else{
		
		System.out.println("not ok");  
	}
	groceryStore.displayDetails();
		 
		 
		 
		 
		 
	}




}