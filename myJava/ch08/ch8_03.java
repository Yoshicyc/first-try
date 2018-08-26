import java.lang.*;

public class ch8_03{
	public static void main(String args[]){
		CB objB = new CB(10);
		objB.show();
	}
}

class CA{
	public int varX;
	public CA(){
		System.out.println("Constract Father...");
	}
	public CA(int i){
		varX = i;
	}
}

class CB extends CA{
	public int varX;
	public CB(){}
	public CB(int i){
//		super(i);		//呼叫父類別Constractor,要放在第一行
		varX = 100;
	}
	public void show(){
		super.varX++;		//存取父類別的成員
		System.out.println("子類別 varX= "+varX);
		System.out.println("父類別 varX= "+super.varX);
	}
}