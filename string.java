import java.util.*;

public class string {

// static int fibo(int n, int[] dp)  
// {
//     if (n<=1) {
//         return n;
//     }
//     if (dp[n]!=-1) {
//         return dp[n];
//     }
//     dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
//     return dp[n];
// }
// public static void main(String[] args) {
//     int n =6;
//     int[] dp=new int[n+1];
//     Array.fill(dp,-1);
//     System.out.println(fibo(n,dp));
// }
// }


// static String ways(String str,String[] dp){
//         if(str.length()==0)
//             return "";
//         int len=str.length();
//         if(dp[len]!=null)
//             return dp[len];
//     dp[len]=ways(str.substring(1), dp)+str.charAt(0);
//     return dp[len];
// }
//     public static void main(String[] args) {
//         String str="hello";
//         String[] dp=new String[str.length()+1];
//         System.out.println(ways(str,dp));
//     }
// }


// import java.util.*;
// public class memoition{
//     static int ways(int n,int[] dp){
//         if(n==0){
//             return 0;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//     }
//     dp[n]=1+ways(n/10,dp);
//     return dp[n];
// }
//     public static void main(String[] args) {
//         int n=12345;
//         int[] dp=new int[n+1];
//         Arrays.fill(dp, -1);
//         System.out.println(ways(n,dp));
//     }
// }

// import java.util.*;
// public class memoition{
//     static int ways(String str, int i,int[] dp){
//         if(i==str.length())
//             return 1;
//         if(dp[i]!=-1)
//             return dp[i];
//    int x=ways(str,i+1,dp);
//    int y=ways(str,i+1,dp);
//    dp[i]=x+y;
//     return dp[i];
// }
//     public static void main(String[] args) {
//         String str="abc";
//         int[] dp=new int[str.length()+1];
//         Arrays.fill(dp,-1);
//         int i=0;
//         System.out.println(ways(str,i,dp));
//     }
// }

// import java.util.*;
// public class memoition{
//     static int ways(String str,int[] dp){
//       if(str.equals("")) return 0;
//       int len=str.length();
//       if(dp[len]!=-1){
//         return dp[len];
//       }
//       dp[len]=1+ways(str.substring(1),dp);
//       return dp[len];
// }
//     public static void main(String[] args) {
//         String str="hello";
//         int[] dp=new int[str.length()+1];
//         Arrays.fill(dp,-1);
//         System.out.println(ways(str,dp));
//     }
// }

// import java.util.*;
// public class memoition{
//     static int ways(int n,int[] dp){
//       if(n==0) return 0;
//       if(dp[n]!=-1) return dp[n];
//       if(n%10==0){
//       dp[n]=1+ways(n/10,dp);}
//       else{
//         dp[n]=ways(n/10,dp);
//       }
//       return dp[n];
// }
//     public static void main(String[] args) {
//         int n=102030700;
//         int[] dp=new int[n+1];
//         Arrays.fill(dp,-1);
//         System.out.println(ways(n,dp));
//     }
// }