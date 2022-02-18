//Efficient approach
import java.util.*;
public class practice
{
    static boolean pweroftwo(int number)
    {
        if (number==0){
            return false;
        }
        while(number!=1)
        {
            if (number%2!=0){
                return false;
            }
            number=number/2;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (pweroftwo(n)==true)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
//Naive approach (My appraoach)
import java.util.*;
public class practice
{
    static final int n=128;
    static boolean pweroftwo(int number)
    {
        if (number==0){
            return false;
        }
        for (int i=0;i<n;i++)
        {
            if (Math.pow(2,i)==number)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (pweroftwo(n)==true)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
