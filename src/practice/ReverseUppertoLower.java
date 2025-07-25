package practice;

public class ReverseUppertoLower {
public static void main(String[] args) {
	String name="MANISH kumar"
	String temp="";
	int x=0;
	for(int i=0;i<name.length();i++) {
		if(65<=(int)name.charAt(i) && (int)name.charAt(i)<=90){
			 x=(int)name.charAt(i)+32;
		}if(97<=(int)name.charAt(i) && (int)name.charAt(i)<=122){
		   x=(int)name.charAt(i)+-32;
		}
		
		temp=temp+Character.valueOf((char)x).toString();
		
	}
	System.out.println(temp);
}
}
