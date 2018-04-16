package sample;

/**
 *)      Tester Program for Amoeba Class
 *       Constructs Amoeba objects
 *       'to String' method defined to print Amoeba Object
 *       Class method defined to relate two Amoeba Objects (cannibal)
 */
public class PetriDish
{   
  public static void main( String[] args )
  {
   Amoeba firstCell = new Amoeba();         // construct default Amoeba object
   System.out.println( firstCell.getSize() );   // print instance variables
   System.out.println( firstCell.getCilia() );
   System.out.println();
   
   firstCell.grow();            //  call to 'grow' modifier method
   System.out.println (firstCell) ; // Print object (as defined by 'toString"
   System.out.println();
   
   Amoeba secondCell = new Amoeba( "Hal", 1.4, 32000 );  // construct Amoeba
   System.out.println (secondCell) ;   // Print object
   System.out.println();
   
   secondCell.grow();       // call to 'grow' modifer method
   System.out.println (secondCell) ;    // Print object
   System.out.println();
   
   firstCell.cannibal(secondCell);  // Class method called 'cannibal'
   System.out.println (firstCell) ; // Print objects to show result of method!
   System.out.println (secondCell) ; 
   System.out.println();
   
   secondCell.regenerate( 0.1, 5000);  // call made to reset variables of object
   System.out.println(secondCell);
   
   secondCell.cannibal(firstCell);  // Class method 'cannibal' called again
   System.out.println (firstCell) ;    // result of 'cannibal' method
   System.out.println (secondCell) ; 
   System.out.println();
   
  }
}

