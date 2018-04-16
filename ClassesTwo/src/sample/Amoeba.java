package sample;


/**     TO STRING and CLASS methods
 * Amoeba Class....eats anything, even other Amoeba  ('cannibal' method )
 * Computer Programming 2
 */
import java.util.Random;  
public class Amoeba   
{   private String sample;
    private double size;
    private int numberCilia;

    public Amoeba()    // default constructor 
    {   sample = "ZZZ";
        size = 1.0 ; 
        numberCilia = 20000; }
   
    public Amoeba (String samp, double s, int c)  // assignment constructor
    {   sample = samp;
        size = s; 
        numberCilia = c; }
    
     public double getSize()    // accessor method for size
    {     return size;   }  
    
     public int getCilia()      // accessor method for number of cilia
    {     return numberCilia;  }
   
     public void regenerate(double amt, int cNum) // modifier method, restart cell
     {   size = amt ; 
         numberCilia = cNum;}
     
     public void grow()     // modifier method, amoeba grows randomly
    {    Random r = new Random();
         size = size + r.nextDouble(); }
    
    public void cannibal (Amoeba aCell) // class method....1st amoeba eats 2nd!
    {  this.size = this.size + aCell.getSize() ;  // add second amoeba size to first
       aCell.size = 0.0 ;                         // second cell dies
       aCell.numberCilia = 0 ;}
    
    public String toString()    // 'toString' method defined to PRINT object
    {
        return "Amoeba " + sample + " :  Size.... " + size + "\n" +
               "           :  Cilia... " + numberCilia; // print sample name, size and cilia
    }
         
}

