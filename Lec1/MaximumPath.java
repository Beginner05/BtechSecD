package Lec1;

public class MaximumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,5,8,10};
int b[]= {4,6,8,9};
sol(a,b);
	}
	 public static int sol(int a1[],int a2[])
		{
			int i=0;
			int j=0;
			long ts=0;
			long s1=0;
			long s2=0;
			while(i<a1.length&&j<a2.length)
			{
				if(a1[i]>a2[j])
				{
					s2+=a2[j];
					j++;
				}
				else if(a1[i]<a2[j])
				{
					s1+=a1[i];
					i++;
				}
				else {
					ts+=Math.max(s1, s2)+a1[i];
					i++;j++;
	                s1=0;
	                s2=0;
				}
			}
			while(a1.length>i)
			{
				s1+=a1[i];
				i++;
			}
			while(j<a2.length)
			{
				s2+=a2[j];
				j++;
			}
			ts+=Math.max(s1, s2);
		return (int)(ts%1000000007);
		
		}

}


