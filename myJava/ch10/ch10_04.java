public class ch10_04{
	public static void main(String args[]) throws CmyException{
		System.out.println("Go");
		int i = -2;
		if(i<0)	throw new CmyException("Array is -");
		int ary[] = new int[i];
	}
}

class CmyException extends Exception{
	public CmyException(){	super();}
	public CmyException(String msg){	super(msg);}
}