import java.lang.*;
public class ch5_bubble_sort{
	public static void main(String args[]){
		int x[] = {26,1,64,24,76,39};
		int k,times,temp;
	
		k = x.length-1;
		while(k != 0){
			times = 0;
			for(int i=0; i<=k-1; i++){
				if(x[i]>x[i+1]){
					temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
					times=i;
				}
			}
			k=times;
		}
		for(int xyz:x){
			System.out.print(xyz+"\t");
		}
	}
}