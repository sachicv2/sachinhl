class ToothPasteRunner{

public static void main(String[] args)
{
	ToothPaste.displayDetails();
	
	ToothPaste.setBrand("colgate");
	 
	 String brand=ToothPaste.getBrand();
	 
	 ToothPaste.setPrice(68);
	  
	  int price=ToothPaste.getPrice();
	  
	  ToothPaste.setNetWeight(150);
	  
	  int netWeight=ToothPaste.getNetWeight();
	   
	   ToothPaste.setColour("white");
	   
	   String colour=ToothPaste.getColour();
	   
	   ToothPaste.setDiscount(10);
	  
	  int discount=ToothPaste.getDiscount();

	   
	 
	  if(brand=="colgate")
	 {
		System.out.println("ok"); 
	 }
	else{
		
		System.out.println("not ok");  
	}
	ToothPaste.displayDetails();
}
}


