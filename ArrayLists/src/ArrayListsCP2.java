/**
 *ArrayLists example with Strings
 */
import java.util.ArrayList;     // access ArrayList utility package

public class ArrayListsCP2
{
     public static void main (String[] args) 
    {                                           // create ArrayList of Strings
        ArrayList <String> techList = new ArrayList <String> (); 
       
        techList.add("computer");    // add String to index 0
        techList.add("programming"); // add String to end of list
        techList.add("analyst");     // add String to end of list
        System.out.println( techList );  // print out the arrayList of Strings
        
        techList.add(2, "engineer"); // insert String at index 2
        System.out.println( techList );
        
        techList.set(0,"cell phone");  // change ('set') String at index 0
        techList.set(2,"manager");     // 'set' String at index 2
        
        System.out.println( " word at 1: " + techList.get(1) );
        System.out.println( " word at 3: " + techList.get(3) );
        techList.remove(1);     // remove String at index 1, ArrayList resizes!
        System.out.println( techList );
        System.out.println( "length of array: " + techList.size() );
        
           
    }
}
