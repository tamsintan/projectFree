package math6;
public class problem6 {
	public static void main (String [] args){
		long sum = 0;
		long sumSqur = 0;
		long sumOfSqur = 0;
		for (long i=1;i<=100;i++){
			sum += (i*i);
			sumSqur += i;
		}
		sumOfSqur = (sumSqur*sumSqur);
		long sub = sumOfSqur-sum;
		System.out.println(sub);
		}
	}


