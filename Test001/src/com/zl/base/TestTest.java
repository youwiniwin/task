package com.zl.base;

public class TestTest {
	
	public static void bubbleSort(){
		int[] ints = new int[]{2,4,6,7,8,3,5,1};
		for(int i=1; i<ints.length; i++){
			for(int j=0; j<ints.length-i; j++){
				if(ints[j]>ints[j+1]){
					int a = ints[j+1];
					ints[j+1] = ints[j];
					ints[j] = a;
				}
			}
		}
		for(int i=0; i<ints.length; i++){
			System.out.print(ints[i] + ",");
		}
		
	}
	
	public static void chooseSort(){
		int[] ints = new int[]{3,4,6,7,8,2,1,5};
		for(int i=0; i<ints.length-1; i++){
			for(int j=i+1; j<ints.length; j++){
				if(ints[i]<ints[j]){
					int a = ints[i];
					ints[i] = ints[j];
					ints[j] = a;
				}
			}
		}
		for(int i=0; i<ints.length; i++){
			System.out.print(ints[i] + ",");
		}
		
	}
	
	public static void main(String[] args) {
		chooseSort();
		
	}
} 