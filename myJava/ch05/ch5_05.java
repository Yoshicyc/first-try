//package javaStudy;
import java.util.*;

public class ch5_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double scores[][] = {{83,60,50,0},										{3,60,12,0},
				{62,7,92,0}};
		System.out.println("1\t\t2\t\t3\t\tAverage");
		for(int i=0; i<3; i++){
			scores[i][3]=(scores[i][0]+scores[i][1]+scores[i][2])/3;
		//	for(int j=0;  j<4; j++){
		//		System.out.print(scores[i][j]+"\t\t");
			for(double score: scores)
				System.out.print(score+"\t\t");
		//	}
			System.out.println();
		}
	}

}
