public class ch11_13{
	public static void main(String args[]){
		StringBuffer strBuf = new StringBuffer("中文測試");
		StringBuffer strBuf1 = new StringBuffer("This is a test");
		System.out.print("字串["+strBuf+"]共有");
		System.out.println(strBuf.length()+"個字元");
		StringBuffer strBuf2 = strBuf.reverse();
		System.out.println("strBuf容量為"+strBuf.capacity()+"個字元");
		System.out.println("strBuf反轉後為["+strBuf2+"]");
		strBuf.setCharAt(3,'T');
		System.out.println("strBuf2為["+strBuf2+"]");
		System.out.println("strBuf1原始字串內容為["+strBuf1+"]");
		System.out.println("長度為["+strBuf1.length()+"]");
		strBuf1.replace(10,14,"pen");
		System.out.println("strBuf1更改後內容為["+strBuf1+"]");
		System.out.println("長度為["+strBuf1.length()+"]");
	}
}