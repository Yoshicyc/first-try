public class ch9_14{
	public static void main(String args[]){
		int[][] ary1 = new int[][]{{1,2,3},{4,5,6}};
		Object obj1;
		obj1 = (Object)ary1;
		System.out.println("ary1執行 toString= "+ary1.toString());
		System.out.println("obj1執行 toString= "+obj1.toString());
		
		int[][] ary2 = (int[][]) obj1;
		System.out.println("ary1[1][1]= "+ary1[1][1]);
		System.out.println("ary2[1][1]= "+ary2[1][1]);
	}
}