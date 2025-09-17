package Lec3;
import java.util.*;
public class Leetcode {

	class  Box implements Comparable<Box>
	{
		int val;
		int freq;
		@Override
		public int compareTo(Box o) {
			// TODO Auto-generated method stub
			int diff=this.freq-o.freq;
			if(diff==0)
			{
			return o.val-this.val;	
			}
			else
			return this.freq-o.freq;
		}
		
	}
	public static void main(String args[])
	{
		Leetcode lc=new Leetcode();
		lc.check();
	}
	public void check() {
		// TODO Auto-generated method stub

		int arr[]= {5,5,5,5,5,5,5,0,0,0,0,0,0,0,3,3,3};
		HashMap<Integer,Integer>map=new HashMap();
		for(int val:arr)
		{
			map.put(val,map.getOrDefault(val,0)+1);
		}
		System.out.println(map);
	Box res[]=new Box[map.size()];
	int idx=0;
	for(int val:map.keySet())
	{
		Box b=new Box();
		b.val=val;
		b.freq=map.get(val);
		res[idx]=b;
		idx++;
	}
//	for(int i=0;i<res.length;i++)
//	{
//		System.out.println("val"+ res[i].val+" freq"+res[i].freq);
//	}
	Arrays.sort(res);
	for(int i=0;i<res.length;i++)
	{
		System.out.println("val"+ res[i].val+" freq"+res[i].freq);
	}
	}

}
