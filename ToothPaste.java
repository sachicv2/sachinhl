class ToothPaste{
	
	static String brand;
	static int price;
	static int netWeight;
	static String colour;
	static int discount;

	static void setBrand(String value)
	{
		brand=value;
	}
	static String getBrand()
	{
		return brand;
	}
	static void setPrice(int value )
	{
		price=value;
	}
	static int getPrice()
	{
		return price;
		
	}
	static void setNetWeight(int value)
	{
		netWeight=value;
	}
	static int getNetWeight()
	{
		return netWeight;
		
	}
	static void setColour(String value)
	{
		colour=value;
	}	
static String getColour()
{
	return colour;

}
static void setDiscount(int value)
{
	discount=value;
	
}
static int getDiscount()
{
	return discount;
}
static void displayDetails()
	{
		System.out.println("brand:" +brand);
		System.out.println("price:" +price);
		System.out.println("netweight:" +netWeight);
		System.out.println("colour:" +colour);
		System.out.println("discount:" +discount);
	}
}