package Lec3;

public class HackerBlocks {

	public static void main(String args[])
	{
		String str="1123765";
		sol(str,"");
	}
	public static void sol(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			String temp=str.substring(0,i+1);
		int idx=Integer.parseInt(temp);
		if(idx>26)return;
		char ch=(char)(96+idx);
//		System.out.println(ch);
		sol(str.substring(i+1),ans+ch);
		}
	}
}
