public class ch11_12{
	public static void main(String args[]){
		String str = "中文測試";
		String str1 = "This is a book";
		String str2;
		System.out.println("字串["+str+"]共有"+str.length()+"個字元");
		System.out.println("字串["+str1+"]共有"+str1.length()+"個字元");
		System.out.println("字串的字首為is==>"+str1.startsWith("is"));
		System.out.println("轉大寫"+str1.toUpperCase());
		System.out.println("第5個字元為"+str1.charAt(5));
		str2=str1.substring(5);
		System.out.println("第5個字元後的字串為"+str2);
		System.out.println("子字串的字首為is==>"+str2.startsWith("is"));
	}
}