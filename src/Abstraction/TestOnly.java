package Abstraction;

public class TestOnly {

	public static void main(String[] args) {
		
		//from interface class
		TV tv = new SmartPhone ();
		tv.screen();
		tv.remoteControl();
		
		//abstract class 
		Computer computer = new SmartPhone ();
		computer.HardDrive();
		computer.Keybord();
		computer.Monitor();
		computer.Applications();
		
		//from interface class but it can be access though here now because it was extended to complete class
		computer.screen();
		computer.remoteControl();

		//full complete class
		SmartPhone smartphone = new SmartPhone();
		smartphone.Text();
		smartphone.ViedoChat();
			
		iPod ipod = new SmartPhone ();
		ipod.ipodNano();
		
		
		iPad ipad = new NewiPad2016();
		ipad.ipadAirColor();
		
	}

}
