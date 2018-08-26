import java.lang.*;

public class ch7_16{
	public int Var;
	public static int sVar;
	public void show(String str){
		System.out.println(str+"'s Var="+Var);
		System.out.println("ch7-16 class sVar="+sVar);
	}
	public static void add(){
		sVar++;
	}
	public static void main(String args[]){
		ch7_16 X = new ch7_16();
		ch7_16 Y = new ch7_16();
		X.Var = 3;
		Y.Var = 10;
		X.sVar = 5;
		X.add();
		Y.add();
		X.show("X");
		Y.show("Y");
	}
}