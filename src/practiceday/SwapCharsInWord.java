package practiceday;

public class SwapCharsInWord {
public static void main(String[] args) {
	String input="Manish Kumar";
	String[] nmarr = input.split("");
	StringBuilder sb=new StringBuilder(input);
	int start=0;
	int end =0;
	char temp=' ';
	for(int i=0;i<sb.length();i++) {
		if(sb.charAt(i)==' ') {
			end=i-1;
			temp=sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end,temp);
			start=i+1;
		}else if(i==sb.length()-1) {
			end=i   ;
			temp=sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end,temp);
			start=i+1;
		}
	}
	System.out.println(sb);
}
}
