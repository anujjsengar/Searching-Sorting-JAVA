package Sorting;

public class Armstrong {
	public static boolean ArmstrongCheck(int num) {
	int r=0;
	int x=num;
	int l=num;
	int len=0;
	while(l>0) {
		len++;
		l=l/10;
	}
	while(num>0) {
		int rem=num%10;
		num=num/10;
		r=r+(int)Math.pow(rem, len);
	}
	if(r==x) {
		return true;
	}
	else {
		return false;
	}

}
	public static void main(String args[]){
		System.out.println(ArmstrongCheck(9475));
	}
}
