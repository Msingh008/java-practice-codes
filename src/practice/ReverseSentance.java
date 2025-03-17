package practice;

public class ReverseSentance {
public static void main(String[] args) {
	String input="MyNameisManish";
	String temp="";
	for(int i=input.length()-1;i>=0;i--) {
		if(Character.isUpperCase(input.charAt(i))) {
			temp=input.substring(i,input.length());
			break;
		}
	}
	
System.out.println(temp);

}
}
