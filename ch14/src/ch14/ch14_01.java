package ch14;

public class ch14_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyclass obj1 = new CMyclass();
		System.out.println(obj1.last(1.7D,3.5D));
		System.out.println(obj1.last("what", "the", "hell"));
		System.out.println(obj1.last(3, 4));
	}
}
class CMyclass{
	public <M> M last(M a,M b){
		return b;
	}
	public <N> N last(N a,N b,N c){
		return c;
	}
}