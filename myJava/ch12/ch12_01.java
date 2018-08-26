package myJava.ch12;
import java.lang.*;
import java.io.*;

public class ch12_01{
	public static void main(String args[]) throws IOException,FileNotFoundException{
		char cbuf[] = new char[256];
		FileReader fr = new FileReader("myJava/ch12/file/text1.txt");
		int num = fr.read(cbuf);
		
		String str1 = new String(cbuf,0,num);
		System.out.println("字元數=:"+num);
		System.out.println("檔案內容為:");
		System.out.println(str1);
		fr.close();
	}
}