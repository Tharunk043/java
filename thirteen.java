import java.io.*;
//in below line if user doesnot give a input value it throws exception to throw that error we use throws IOExecption after(String args[])
class thirteen{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a stirng to print char ASCII values");
		String str = br.readLine();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			int ascii = (int) c;
			System.out.println("ASCII VALUE OF "+c+" is "+ascii);
		
		
		}
	
	
	}


}
