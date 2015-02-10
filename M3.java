
public class M3 {
	public static boolean isPrime(int n){
		for(int i=2;i<n; i++)
			if(n%i==0)
				return false;
		return true;
	}
	public static int largestPrimeFactor(int n){
		for(int i=2;i<=n;i++)
			if(n%i==0)
				if(isPrime(n/i))
					return n/i;
		return 0;
	}
public static void main(String args []){
	
	System.out.println(largestPrimeFactor(13195));
}
}
