package Lec1;

public class HackerBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,15,25,30};
int b[]= {5,20,35};
sol(a,b,0,0,true,"",-1,-1);
	}

	public static void sol(int a[], int b[], int idxa, int idxb, boolean flag, String ans, int lva, int lvb) {
		if (flag == true && ans.length() > 0) {
			System.out.println(ans);
		}
		if (flag == true) {
			for (int i = idxa; i < a.length; i++) {
				if (a[i] > lvb) {
					sol(a, b, i + 1, idxb, false, ans + a[i] + " ", a[i], lvb);
				}
			}
		} else {
			for (int i = idxb; i < b.length; i++) {
				if (b[i] > lva) {
					sol(a, b, idxa, i + 1, true, ans + b[i] + " ", lva, b[i]);
				}
			}
		}
	}


}
