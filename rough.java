import java.util.Scanner;

public class rough {
    public static boolean makeCut(int mid,int sum,int n, int k){
        int tmp = sum-(n*mid);
        if(tmp<=k) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        int k = sc.nextInt();
        
        int arr[]= new int[n];
        
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max = Math.max(max, arr[i]);
        }

        int start = 0;
        int end = max;

        int ans = 0; // ans represents minimum height at which we can make a cut in the tree
        while(start<=end){
            int m = (start+end)/2;

            if(makeCut(m,sum,n,k)){
                ans = Math.min(ans,m);
                start = m+1;
            }else{
                end = end-1;
            }
        }
        System.out.println(ans);
    }
}
