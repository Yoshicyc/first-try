import java.lang.*;
public class ch5_03{
	public static void main(String args[]){
		int N[] = {49,83,29,62,4};
		int tempN,k,times;
		
		k = N.length;
		while(k != 0){
			times=0;
			for(int i=0; i<=k-1; i++){
				if(N[i]>N[i+1]){
					tempN = N[i]; N[i] = N[i+1]; N[i+1] = tempN;
					times = i;
				}
			}
			k = times;
		}
		System.out.println("順序是:\n");
		for(int x=0; x<N.length; x++){
			System.out.print(N[x]);
		}
	}
}