/*What am i being asked to do?
 * Multiply by the number until 10 2*1 = 2, 2*2 = 4
 * It is set up in an aligned table
 * Professor note is that you will need %4d for spacing
 * Supposed to use 2 for loops for this
 * Supposed to use printf method for this
*/

public class DisplayTable
{
	public static void main(String[] args)
	{	
    int outer, inner;

    for (outer = 1; outer <= 10; ++outer){ //1 to 10
        for (inner = 1; inner <= 10; ++inner){
          System.out.printf("%4d", outer*inner);
        }

        System.out.printf("\n");
    }
  }
}