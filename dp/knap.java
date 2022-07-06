import java.util.*;


// 0-1 knapsack solution
class knap
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int wt[] = new int[n];
        int vl[] = new int[n];

        for(int i=0;i<n;i++)
        {
            wt[i]=in.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            vl[i]=in.nextInt();
        }

        int dp[][] = new int[n+1][w+1];

        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<w+1;j++)
            {
                if(i==0 || j==0) continue;
                dp[i][j]=-1;
            }
        }

        System.out.println("Maximum profit = "+profit(n,w,wt,vl,dp));
    }

    public static int profit(int n,int w,int wt[],int arr[],int dp[][])
    {
        if(n==0 || w==0) return 0;

        if(dp[n][w]!=-1) return dp[n][w];

        else if(wt[n-1]<=w)
        {
            return dp[n][w] = Math.max(vl[n-1]+profit(n-1,w-wt[n-1],wt,arr,dp),profit(n-1,w,wt,arr,dp));
        }
        else{
            return dp[n][w]=profit(n-1,w,wt,arr,dp);
        }
    }
}