package Abstraction;

public class SmartPhone extends Computer implements iPod{

	
	public void HardDrive() {
		System.out.println("Computer must have Hard Drive");
		
	}

	public void Monitor(){
		System.out.println("Computer must have monitor");		
	
	}

	public void Applications(){

		System.out.println("Computer must have applications that will allows you to perform specific tasks");
		
	}

	
	public void Keybord() {
		System.out.println("Must have keybord to type");
		
	}
	
		public void Text(){
			System.out.println("You can text");
			
		}
		public void ViedoChat (){
			System.out.println("You can viedo chat");
	
	}

		
		public void ipodNano() {
			System.out.println("ipod nano 32gb");
			
		}
	
		

}
