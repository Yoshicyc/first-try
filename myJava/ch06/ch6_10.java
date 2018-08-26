import java.lang.*;
public class ch6_10{
	public static void main(String args[]){
	//	int lottos[] = new int[6];
		final int lottos[] = new int[6];

		
		generate_lottos(lottos);
		System.out.println("The number is:");
			for(int i=0; i<6; i++)
				System.out.print(lottos[i]+"\t");
	}
	
	public static void generate_lottos(int[] arr){
		for(int i=0; i<arr.length;i++){
			arr[i]=(int)((Math.random()*49)+1);
			System.out.println("第" +i+"個變數="+arr[i]);
		}
	}
}