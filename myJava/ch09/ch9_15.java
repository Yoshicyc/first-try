public class ch9_15{
	public static void main(String args[]){
		CA objA = new CA();
		CB objB = new CB();
		CC objC = new CC();
	//	===============================
		if(objA instanceof CA)	System.out.println("objA has CA's");
		if(objB instanceof CA)	System.out.println("objB has CA's");
		if(objC instanceof CA)	System.out.println("objC has CA's");
		if(objA instanceof CC)	System.out.println("objA has CC's");
		if(objB instanceof IA)	System.out.println("objB has IA's");

	}
}

interface IA{
	public static final int var1 = 5;
}

class CA implements IA{
	public int var2;
}

class CB extends CA{
	public int var3;
}

class CC extends CB{
	public int var4;
}