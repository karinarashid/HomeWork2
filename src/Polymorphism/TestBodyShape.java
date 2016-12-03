package Polymorphism;

public class TestBodyShape {

	public static void main(String[] args) {
		Shape shape = new Shape();
		int womanBodyShape = shape.bodyShape(3, 5, 7);
		System.out.println(womanBodyShape );
	
		int petitewomanBodyShape = shape.bodyShape(3, 5, 7, 10);
		System.out.println(petitewomanBodyShape);
		
		Shape superBodyShape= new SuperBodyShape();
		int superpetitewomanBodyShape = superBodyShape.bodyShape(3, 5, 7, 10);
		System.out.println(superpetitewomanBodyShape);
		
	}
}
