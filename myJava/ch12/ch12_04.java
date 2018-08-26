import java.io.*;

public class ch12_04
{
	public static void main(String args[]) throws IOException
	{
		String str1="print words as below:";
		char endCh[]={'C','t','.'};
		int numF;
		FileWriter fw = new FileWriter("file/TextWriteTest1.txt",true);
		
		fw.write(str1);
		fw.write('\r');
		fw.write('\n');

		for(int i=1; i<10; i++)
		{
			numF = Fib(i);
			fw.write(numF+" ");
		}
		fw.write(endCh);
		fw.write('\r');
		fw.close();
	}
	public static int Fib(int n)
	{
		if((n==1)||(n==0))
			return n;
		else
			return Fib(n-1)+Fib(n-2);
	}
}