package myJava.ch12;
import java.io.*;
public class ch12_03{
	public static void main(String args[]){
		char cbuf[] = new char[256];
		try(FileReader fr = new FileReader("myJava/ch12/file/TextWriteTest1.txt")){
			int num = fr.read(cbuf);
			String str1 = new String(cbuf,0,num);
			System.out.println("共讀取"+num+"字元");
			System.out.println("內容：");
			System.out.println(str1);
			fr.close();
		}
		catch(FileNotFoundException e){
			System.out.println("找不到檔案");
		}
		catch(final IOException e){
			System.out.println("其他意外");
		}
	}
}