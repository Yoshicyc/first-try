package ch14_02;

public class ch14_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMyclass<Integer> obj1 = new CMyclass<>();
		CMyclass<String> obj2 = new CMyclass<>();
		System.out.println("First is "+obj2.first("hello", "world"));
		System.out.println("Last is "+obj1.last(10, 11));
	}
}

class CMyclass<N>{
	public N first(N a, N b){
		return a;
	}
	public N last(N a, N b){
		return b;
	}
}