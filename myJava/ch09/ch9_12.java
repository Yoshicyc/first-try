public class ch9_12{
	public static void main(String args[]){
		CA obj1;
		obj1 = new CB();
	//	obj1.show1();
		((CB) obj1).show1();
		obj1.show2();
	//	obj1.show3();
		((CB) obj1).show3();
		System.out.println("------------");
		CB obj2;
		obj2 = (CB) obj1;
		obj2.show1();
		obj2.show2();
		obj2.show3();
	}
}

interface IA{
	public abstract void show1();
}

abstract class CA{
	public void show2(){System.out.println("CA show2");}
}

class CB extends CA implements IA{
	@Override public void show1(){System.out.println("CB show1");}
	public void show3(){System.out.println("CB show3");}
}