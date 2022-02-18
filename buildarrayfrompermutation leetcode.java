import java.util.*;
public class practice
{
   static void buildarray(int arr[])
   {
       int temp[]=new int[arr.length];
       int k=0;
       for(int i=0;i<arr.length;i++)
       {
           temp[k]=arr[arr[i]];
           k++;
       }
       for(int i=0;i<temp.length;i++)
       {
           System.out.print(temp[i]+" ");
       }
   }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        buildarray(arr);
    }
}
