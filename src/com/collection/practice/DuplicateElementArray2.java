package com.collection.practice;

public class DuplicateElementArray2 {

	public static void main(String[] args) {

		
		String[] arr = {"Java", "C++", "C", "Python", "Java","C"};
		
//		System.out.println(arr.length);
		
		boolean flag=false;
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found Duplicate Elements : "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("Duplicate element not found");
		}
		
		
	}

}
