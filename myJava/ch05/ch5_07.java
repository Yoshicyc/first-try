import java.lang.*;
public class Demo_arraycopy{
	public static void main(String args[]){
		char ary1[] = {'a','b','c'};
		char ary2[] = {'A','B','C'};
		System.arraycopy(ary1,2,ary2,0,1);
		for(char element : ary2)
			System.out.print(element+"\t");
 	}
}