package galaxies;

public class GalaxyTester {
	public static void main(String[] args) {

		Galaxy firstObject = new Galaxy();
		Galaxy secondObject = new Galaxy("Comet", 134, 34000);
		Galaxy thirdObject = new Galaxy ("Star", 12000, 42300.65);
		Object greatestMass;
		Object lowestVelocity;
		
		System.out.println(firstObject);
		firstObject.klingonRay();
		firstObject.solarFlare();
		System.out.println(firstObject);
		System.out.println();

		System.out.println(secondObject);
		secondObject.klingonRay();
		secondObject.solarFlare();
		System.out.println(secondObject);
		System.out.println();
		
		System.out.println(thirdObject);
		thirdObject.klingonRay();
		thirdObject.solarFlare();
		System.out.println(thirdObject);
		System.out.println();
		
		secondObject.collide(firstObject);
		System.out.println(firstObject);
		System.out.println(secondObject);
		System.out.println();
		
		thirdObject.collide(secondObject);
		System.out.println(secondObject);
		System.out.println(thirdObject);
		System.out.println();
		
		if ((thirdObject.mass > firstObject.mass) && (thirdObject.mass > secondObject.mass)) {
			greatestMass = thirdObject;
		} else if ((secondObject.mass > firstObject.mass) && (secondObject.mass > thirdObject.mass)) {
			greatestMass = secondObject;
		} else {
			greatestMass = firstObject;
		}
		
		if ((thirdObject.velocity < firstObject.velocity) && (thirdObject.velocity < secondObject.velocity)) {
			lowestVelocity = thirdObject;
		} else if ((secondObject.velocity < firstObject.velocity) && (secondObject.velocity < thirdObject.velocity)) {
			lowestVelocity = secondObject;
		} else {
			lowestVelocity = firstObject;
		}
		
		System.out.println(((Galaxy) greatestMass).getName() + " has the greatest mass!");
		System.out.println(((Galaxy) lowestVelocity).getName() + " has the lowest velocity!");
		

	}
}
