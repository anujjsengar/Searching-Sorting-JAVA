package Searching;
public class BinarySearch {
	public static int Binary(int[] arr,int key) {
		int start=0;
		int end=arr.length-1;
		int mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>key) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int x=15;
		int arr[]= {1,12,12,15};
		System.out.println(Binary(arr,x));
	}
	
}
