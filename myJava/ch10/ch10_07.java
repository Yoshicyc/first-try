import java.util.Scanner;
public class ch10_07{
	public static void main(String args[]){
		Scanner ki = new Scanner(System.in);
		System.out.print("Array Size=?");
		int lottoSize = 0;
		
		try{
			lottoSize = Integer.parseInt(ki.nextLine());
			if(lottoSize > 48)	throw new CmyException1("Too Big");
			else if(lottoSize <6)	throw new CmyException2("Too Small");
		}
		catch(NumberFormatException e){
			System.out.println("Not an Number, set to 6");
			lottoSize = 6;
		}
		catch(CmyException1 | CmyException2 e){
			System.out.println("LottoSize be set to 6");
			lottoSize = 6;
		}
		finally{
			System.out.println("Lotto Size is "+lottoSize);
		}
		int lottoArray[] = new int[lottoSize];
		System.out.println("Create lotto array instance is done");
	}
}

class CmyException1 extends Exception{
//	public CmyException1(){	super();}
	public CmyException1(String msg){	
		super();
		System.out.println(msg);
	}
}

class CmyException2 extends Exception{
//	public CmyException2(){	super();}
	public CmyException2(String msg){
		super();
		System.out.println(msg);
	}
}