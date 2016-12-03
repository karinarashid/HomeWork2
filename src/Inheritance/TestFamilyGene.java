package Inheritance;

public class TestFamilyGene {

	public static void main(String[] args) {
		GrandMother gm= new GrandMother ();
		gm.LovesTORead();
		
		Mother mother = new Mother ();
		mother.blackhair();
		mother.LovesTORead();
		
		GrandDaughter gg = new GrandDaughter ();
		gg.Shopping();
		gg.blackhair();
		gg.LovesTORead();
	}

}
