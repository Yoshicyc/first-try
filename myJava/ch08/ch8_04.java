public class ch8_04{
	public static void main(String args[]){
		CB objB = new CB();
		objB.show();
		objB.show(10);
		objB.show(10.0);
	}
}

class CA{
	protected void show(){
		System.out.println("Father's show()");
	}
}

class CB extends CA{
	@Override public void show(){		//override父類別的"show"方法
						//隱藏父類別的"show"方法
		System.out.println("Son's show()");
	}
	public void show(int x){
		System.out.println("Son's show(10)");
	}
	public void show(double x){
		System.out.println("Son's show(10.0)");
		super.show();			//呼叫父類別的"show"方法
	}
}