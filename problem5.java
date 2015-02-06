package mathproblem;

public class problem5 {
	public static void main (String[] args){
		for(int x = 2520;true;x++)
		{
			for(int y = 2; y <= 20; y ++)
			{
				if(x % y != 0)break;
				if(y == 20) System.out.println(x);
			}
			
		}
	}
}

