import java.lang.*;
public class ch4_18
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=0; i<9; i++)
		{
			if(i%2==1)
				continue;
			sum = sum+i;
		}System.out.println("2+4+6+8 = "+sum);
	}
}