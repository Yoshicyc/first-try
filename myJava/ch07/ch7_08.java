import java.lang.*;

public class ch7_08{
	public static void main(String args[]){
		CVector2 i = new CVector2();
		i.set(20,40);
		CVector2 j = new CVector2();
		j.set(15,45);
		System.out.print(i.x+"\t"+i.y+"\t"+j.x+"\t"+j.y+"\n");
		
		CMyClass change = new CMyClass();
		change.swap(i,j);
		System.out.print(i.x+"\t"+i.y+"\t"+j.x+"\t"+j.y+"\n");
	}
}

class CVector2{
	public int x,y;
	public void set(int m, int n){
		x = m; y = n;
	}
}

class CMyClass{
	public void swap(CVector2 a, CVector2 b){
		CVector2 temp;
		temp = a;
		a = b;
		b = temp;
	}
}