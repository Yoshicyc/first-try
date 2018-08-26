public class ch8_07{
	public static void main(String args[]){
		CA obj = new CB();	//"父"參考"子"
		obj.show1();
		obj.show2();
		//obj.show3();
	}
}

class CA{
	protected int varA;
	public void show1(){
		System.out.println("父 show1()...");
	}
	public void show2(){
		System.out.println("父 show2()...");
	}
}

class CB extends CA{
	protected int varB;
	@Override public void show1(){
		System.out.println("子改寫父 show1()...");
	}
	public void show3(){
		System.out.println("子新增的 show3()...");
	}
}