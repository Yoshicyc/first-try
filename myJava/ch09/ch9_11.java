public class ch9_11{
	public static void main(String args[]){
		CA obj = new CB();
	//	obj.show1();
		obj.show2();
		obj.show3();
		obj.show4();
		System.out.println("--------------------");
		obj = new CC();
	//	obj.show1();
		obj.show2();
		obj.show3();
		obj.show4();
	}
}

interface IA{
	public abstract void show1();
}

abstract class CA{
	public final void show2(){System.out.println("CA show2");}
	public abstract void show3();
	public void show4(){System.out.println("CA show4");}
}

class CB extends CA implements IA{
	public void show1(){System.out.println("CB show1");}
	public void show3(){System.out.println("CB show3");}
}

class CC extends CA implements IA{
	public void show1(){System.out.println("CC show1");}
	public void show3(){System.out.println("CC show3");}
	public void show4(){System.out.println("CC show4");}
}