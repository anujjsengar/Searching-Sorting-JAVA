package Sorting;

public class Palindrome {
	public static boolean PalindromeArray(int[]arr) {
		int[] a=new int[arr.length];
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			a[j]=arr[i];
			j=j-1;
		}
		int flag=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=a[i]) {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,2,1};
		System.out.println(PalindromeArray(arr));
	}

}
