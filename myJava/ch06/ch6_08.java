import java.lang.*;
import java.lang.Math;
import java.util.Arrays;

public class ch6_08{
	public static void main(String args[]){
		int lottos[] = new int[49];
	
		for(int i=0; i<6; i++){
			lottos[i] = (int)(Math.random()*49)+1;
			System.out.println(lottos[i]);
		}
		Arrays.sort(lottos);
	//	for(int num:lottos)
	//
		System.out.print(num+"\t");
		System.out.println();
	}
}