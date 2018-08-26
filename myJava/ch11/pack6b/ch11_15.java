package pack6b;
import pack6a.CA;

public class ch11_15{
	public static void main(String args[]){
		CA objA = new CA();
		CB objB = new CB();
		System.out.println("input class CA's info.");
		objA.inputX();
		objA.inputY();
		objA.inputZ();
		System.out.print("class CA's obj info.");
		objA.show();
		System.out.println("----------------");
		System.out.println("input class CB's info.");
		objB.inputX();
		objB.inputY();
		objB.inputZ();
		objB.varX++;
		//objB.varY++;
		objB.addOne();
		System.out.print("class CB's obj info.");
		objB.show();
	}
}

class CB extends CA{
	public int varW;
	public void addOne(){
		varX++;
		varY++;
		//varZ++;
	}
}