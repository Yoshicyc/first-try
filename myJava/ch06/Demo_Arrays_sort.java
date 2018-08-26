import java.lang.*;
import java.util.Arrays;
public class Demo_Arrays_sort{
	public static void main(String args[]){
		int x[] = {1,63,23,78,337,7};
		
		Arrays.sort(x);
		for(int element: x)
			System.out.print(element+"\t");
		System.out.println();
	}
}