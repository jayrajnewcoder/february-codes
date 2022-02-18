import java.util.*;
public class practice
{
   static int searchpossition(int arr[],int target)
   {
       int ans=0;
       if (target==0)
       {
           return 0;
       }
       if (target>arr[arr.length-1])
       {
           return arr.length;
       }
       for(int i=1;i<arr.length;i++)
       {
           if (arr[i-1]<target && arr[i]>target)
           {
               ans=i;
           }
       }
       return ans;
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
        int value=sc.nextInt();
        int finalans=searchpossition(arr,value);
        System.out.println(finalans);
    }
}
