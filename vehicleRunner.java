class vehicleRunner{
	public static void main(String[] Transportation)
	{
		
		double ref1=vehicle.transport("Bengaluru", "Mysore");
		System.out.println(ref1);
		
		double ref2=vehicle.transport("Bengaluru", "Mysore", true);
		System.out.println(ref2);
		
		boolean ref3=vehicle.transport("Mysore");
		System.out.println(ref3);
		
		boolean ref4=vehicle.transport("Mysore", true);
		System.out.println(ref4);
		
		boolean ref5=vehicle.transport(true);
		System.out.println(ref5);
		
		//reverse or opposite to above
		
		double ref11=vehicle.transport("Chennai", "Bengaluru");
		System.out.println(ref11);
		
		double ref12=vehicle.transport("Chennai", "Bengaluru", false);
		System.out.println(ref12);
		
		boolean ref13=vehicle.transport("Bengaluru");
		System.out.println(ref13);
		
		boolean ref14=vehicle.transport("Bengaluru", false);
		System.out.println(ref14);
		
		boolean ref15=vehicle.transport(false);
		System.out.println(ref15);
	}
}