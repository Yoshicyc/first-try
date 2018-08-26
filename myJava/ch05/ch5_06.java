import java.lang.*;
public class ch5_06{
	public static void main(String args[]){
		int scores[][]=	{{30,24,1},
				{83},
				{20,3,60}};
		int ary[];
		ary = scores[2].clone();
		for(int score : ary)
			System.out.println(score + "\t");
	}
}