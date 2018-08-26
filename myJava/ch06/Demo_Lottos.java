import java.lang.*;
import java.util.Scanner;

public class Demo_Lottos{
	public static void main(String args[]){
		int special;
		int lottos[] = new int[6];

		special = generate_lottos(lottos);
		System.out.println("特別號是："+special);
		System.out.println("號碼是：");
		for(int num: lottos)
			System.out.print(num+"\t");
		System.out.println();
		System.out.println("特別號："+special);
	}

	public static int generate_lottos(int[] arr){
		int generateNum;
		
		for(int i=0; i<arr.length; i++){
			generateNum = (int)((Math.random()*49)+1);
			while(seqSearch(generateNum,arr)!=-1){
				generateNum = (int)((Math.random()*49)+1);
			}
			arr[i] = generateNum;
		}
		generateNum = (int)((Math.random()*49)+1);
		while(seqSearch(generateNum,arr)!=-1){
			generateNum = (int)((Math.random()*49)+1);
		}
		return generateNum;
	}

	public static int seqSearch(int target, int[] arr){
		for(int i=0; i<arr.length; i++)
			if(target == arr[i]) return i;
		return -1;
	}
}