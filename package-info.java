package Searching;
import java.util.*;
class LinearSearch{
	public static int Linear(int[]arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			
			arr[i]=input.nextInt();	
		}
		int index=Linear(arr,x);
		System.out.println(index);
	}
}