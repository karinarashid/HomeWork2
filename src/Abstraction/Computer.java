package Abstraction;

public abstract class Computer implements TV{

		public void screen(){
		System.out.println("Color screen TV");
	}
	
		public void remoteControl(){
		System.out.println("Remote control carry signals between a remote control and the device it's directing");
		
	}
		public abstract void HardDrive();
		public abstract void Monitor();
		public abstract void Applications ();
		public abstract void Keybord ();
	
}
