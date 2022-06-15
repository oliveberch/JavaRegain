/* SWAPPING VALUES OF TWO VARIABLE WITHOUT USING THIRD VARIABLE.
*/
import java.util.*;
class SwapA
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE VALUES OF TWO VARIABLE TO SWAP THEIR VALUES");
        System.out.println("FIRST VALUE");
        int x= obj.nextInt();
        System.out.println("SECOND VALUE");
        int y= obj.nextInt();
        x= x+y;
        y= x-y;
        x=x-y;
        
        System.out.println("New first value :"+x);
        System.out.println("New second value :"+y);
        obj.close();
    }
}
