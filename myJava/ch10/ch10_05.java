import java.util.Scanner;

public class ch10_05{
	public static void main(String args[]){
		Scanner ki = new Scanner(System.in);
		System.out.print("Array size= ");
		int lottoSize = 0;
		try{
			lottoSize = Integer.parseInt(ki.nextLine());
			if(lottoSize > 48)
				throw new CmyException1("too Big");
			if(lottoSize < 6)
				throw new CmyException2("too Small");
		}
		catch(CmyException1 | CmyException2 e){
			System.out.println("Array size will be 6");
			lottoSize = 6;
		}
		finally{
			System.out.println("lotto balls is "+lottoSize);
		}
		int lottoArray[] = new int[lottoSize];
		System.out.println("Done");
	}
}

class CmyException1 extends Exception{
	public CmyException1(){	super();}
	public CmyException1(String msg){	super(msg);}
}

class CmyException2 extends Exception{
//class CmyException2 extends CmyException1{
	public CmyException2(){	super();}
	public CmyException2(String msg){	super(msg);}
}