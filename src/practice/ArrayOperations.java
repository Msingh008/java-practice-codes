package practice;

import java.util.ArrayList;

public class ArrayOperations {
public static void main(String[] args) {
	ArrayList<String> nums=new ArrayList<String>();
	for(int i=0;i<20;i++) {
		nums.add(String.valueOf(i));
	}
	for(int j=8;j<15;j++) {
		nums.remove(String.valueOf(j));
	}
	for(int p=0;p<5;p++) {
		nums.add(String.valueOf(p));
	}
	
	System.out.println(nums);
}
}
