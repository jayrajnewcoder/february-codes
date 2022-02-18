import java.util.*;
public class practice
{
   static void sortarray(int arr[])
   {
       int start=0,end=arr.length-1;
       for(int i=0;i<=end;i++)
       {
           if (arr[i]==0)
           {
               int tempvar=arr[i];
               arr[i]=arr[start];
               arr[start]=tempvar;
               start++;
            }else if (arr[i]==2)
            {
                int tempvar=arr[i];
                arr[i]=arr[end];
                arr[end]=tempvar;
                end--;
                i--;
            }
       }
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
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
        sortarray(arr);
    }
}
