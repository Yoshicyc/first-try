public class ch9_08{
	public static void main(String args[]){
		CA obj = new CA();
		obj.show();
	}
}

interface IX{
	public default void show(){
		System.out.println("IX");
	}
}

interface IY{
	public default void show(){
		System.out.println("IY");
	}
}

interface IZ extends IX,IY{
	public default void show(){
		IY.super.show();
	}
}

class CA implements IZ{}
