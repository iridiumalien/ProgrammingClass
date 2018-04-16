package sample;

public class CheeseTester {
	public static void main(String[] args) {
		Cheese block1 = new Cheese();
		System.out.println(block1.getWeight());
		block1.eatCheeese(2);
		System.out.println(block1.getWeight());
		System.out.println();
		
		Cheese block2 = new Cheese(10.0);
		System.out.println(block2.getWeight());
		block2.eatCheeese(1);
		System.out.println(block2.getWeight());
		System.out.println();
		
		Cheese block3 = new Cheese();
		System.out.println(block3.getWeight());
		block3.eatCheeese(4);
		System.out.println(block3.getWeight());
		System.out.println();
		
		Cheese block4 = new Cheese(20.0);
		System.out.println(block4.getWeight());
		block4.eatCheeese(7);
		System.out.println(block4.getWeight());
		System.out.println();
		

	}
}
