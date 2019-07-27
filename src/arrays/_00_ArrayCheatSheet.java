package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		//String[] letters =new String[5];
		String [] letters= {"aa","cc","bb","dd","ee"};
		//2. print the third element in the array
		System.out.println(letters[2]);
		//3. set the third element to a different value
		letters[2]="zz";
		//4. print the third element again
		System.out.println(letters[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<letters.length;i++) {
			System.out.println(letters[i]);
		}
		
		//6. make an array of 50 integers
		int [] nums=new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0;i<nums.length;i++) {
			Random r=new Random();
			int x=r.nextInt(100);
			nums[i]=x;
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small=101;
		for (int i=0;i<nums.length;i++) {
			if (nums[i]<small) {
				small=nums[i];
			}
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		//10. print the largest number in the array.
		int big=1;
		for (int i=0;i<nums.length;i++) {
			if (nums[i]>big) {
				big=nums[i];
			}
		}
		System.out.println("biggest number"+big);
	}
}
