package Encapsulation;

public class TestDoctorDatabase {

	public static void main(String[] args) {
	
		Doctor first1 = new Doctor();
		first1.setDoctorRedencyTestScore(3200);
		first1.setDocotrName("Toma Hossain");
		first1.setDoctorSSN("541-52-2536");
		first1.setDocotrDOB("05-23-1988");
		
		System.out.println(first1.getDoctorRedencyTestScore()+ " " + first1.getDocotrName()+ " " + first1.getDoctorSSN()+ " " + first1.getDocotrDOB());

	}

}
