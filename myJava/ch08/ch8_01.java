import java.util.Scanner;
public class ch8_01{
	public static void main(String args[]){
		CA objA = new CA();
		CB objB = new CB();
		System.out.println("of A");
		objA.inputX();
		objA.inputY();
		objA.inputZ();
		System.out.print("A is ");
		objA.show();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("of B");
		objB.inputX();
		objB.inputY();
		objB.inputZ();
		objB.varX++;			//
		objB.addOne();			//
		System.out.print("B is ");
		objB.show();
	}
}

class CA{
	Scanner ki = new Scanner(System.in);
	public int varX;				//public varX
	protected int varY;			//protected varY
	private int varZ;			//private varZ

	public void inputX(){
		System.out.print("varX:");
		varX = Integer.parseInt(ki.nextLine());
	}
	
	public void inputY(){
		System.out.print("varY:");
		varY = Integer.parseInt(ki.nextLine());
	}
	
	public void inputZ(){
		System.out.print("varZ:");
		varZ = Integer.parseInt(ki.nextLine());
	}
	
	public void show(){
		System.out.println("varX="+varX+"varY="+varY+"varZ="+varZ);
	}
}

class CB extends CA{
	public int varW;
	public void addOne(){
		varX++;
		varY++;
	}
}







