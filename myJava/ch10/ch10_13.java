import java.util.Scanner;
public class ch10_13{
	public static void main(String args[]){
		Scanner ki = new Scanner(System.in);
		System.out.print("input #?");
		int lottoSize = 0;
		CmyClass1 obj1 = new CmyClass1();
		
		try{
			lottoSize = obj1.check(ki.nextLine());
		}
		catch(CmyException1 e){
			System.out.println("too big");
			lottoSize = 6;
		}
		catch(CmyException2 e){
			System.out.println("too small");
			lottoSize = 6;
		}
		catch(NumberFormatException e){
			System.out.println("not a #");
			lottoSize = 6;
		}
		catch(Exception e){
			System.out.println("Something wrong");
		}
		finally{
			System.out.println("Balls are "+lottoSize);
		}
		int lottoAry[] = new int[lottoSize];
		System.out.println("Create instance done");
	}
}

class CmyClass1{
	private int lottoSize;
	public int check(String inputStr) throws CmyException1, CmyException2, NumberFormatException{
		try{
			lottoSize = Integer.parseInt(inputStr);
			if(lottoSize > 48)	throw new CmyException1("too big big");
			else if(lottoSize < 6)	throw new CmyException2("too Small Small");
			return lottoSize;
		}
		catch(final Exception e){
			throw e;
		}
	}
}

class CmyException1 extends Exception{
	public CmyException1(){		super();}
	public CmyException1(String msg){	
		super();
		System.out.println(msg);
	}
}

class CmyException2 extends Exception{
	public CmyException2(){		super();}
	public CmyException2(String msg){	
		super();	
		System.out.println(msg);
	}
}












