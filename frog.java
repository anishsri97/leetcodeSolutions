import java.util.*;

// dp solution for frog jump

class frog
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];


        for(var i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int dp[] = new int[n];
        Arrays.fill(dp,2,n,-1);
        dp[0]=0;
        dp[1]=Math.abs(arr[1]-arr[0]);
 //new comment added in the file
       System.out.println("dp array");
        for(int x:dp)
        {
            System.out.println(x);
        }

        System.out.println("Minimum Energy = "+jump(arr,n-1,dp));

    }

    public static int jump(int a[],int n,int dp[])
    {
        if(n==0) return 0;

        if(n==1) return Math.abs(a[1]-a[0]);

        if(dp[n]!=-1) return dp[n];

        return dp[n]= Math.min((Math.abs(a[n]-a[n-1]))+jump(a,n-1,dp),Math.abs((a[n]-a[n-2]))+jump(a,n-2,dp));
    }
}