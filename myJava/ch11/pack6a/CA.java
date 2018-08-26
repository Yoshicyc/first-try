package pack6a;
import java.util.Scanner;

public class CA{
	Scanner keyboardInput = new Scanner(System.in);
	public int varX;
	protected int varY;
	private int varZ;
	public void inputX(){
		System.out.print("varX:");
		varX = Integer.parseInt(keyboardInput.nextLine());
	}
	public void inputY(){
		System.out.print("varY:");
		varY = Integer.parseInt(keyboardInput.nextLine());
	}
	public void inputZ(){
		System.out.print("varZ:");
		varZ = Integer.parseInt(keyboardInput.nextLine());
	}
	public void show(){
		System.out.println(varX+" "+varY+" "+varZ);
	}
}