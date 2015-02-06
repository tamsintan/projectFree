
public class Number {
public static void main (String[] args)
{
	int x=1;
	int y=2;
	int sum=0; 
	while (y<=4000000){
		int z = x;
		x = y;
		y=x+z;
		if(x%2==0) sum=sum+x;
	}
	System.out.println(sum);
}

}
