public class ch9_13{
	public static void main(String args[]){
		CA objCA = new CA();
		CB objCB = new CB();

		objCB.show3(objCA);

		objCA = (CA) objCB.set(10);
		System.out.println("objCA varB= "+objCA.varB);
	}
}

interface IA{
	public static final int varA = 5;
	public abstract void show1();
}

class CA implements IA{
	public int varB;
	public CA(){varB = 0;}
	public CA(int i){varB = i;}
	@Override public void show1(){System.out.println("CA show1");}
	public void show2(){System.out.println("CA show2");}
}

class CB{
	public void show3(IA obj){
		System.out.println("varA ="+obj.varA);
		obj.show1();
	}
	public IA set(int i){
		CA obj = new CA(i);
		return obj;
	}
}