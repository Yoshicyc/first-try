package myJava.ch12;
import java.io.*;

public class ch12_02{
	public static void main(String args[])
			throws IOException,FileNotFoundException{
		
		char cbuf[] = new char[7];
		FileReader fr = new FileReader("myJava/ch12/file/text1.txt");
		int num;
		String str1;
		while((num = fr.read(cbuf,0,5)) != -1){
			str1 = new String(cbuf,0,num);
			System.out.println("以下"+num+"個字元");
			System.out.println(str1);
			System.out.println("------------");
		}
		fr.close();
	}
}