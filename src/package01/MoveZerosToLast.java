package package01;

public class MoveZerosToLast {
public static void main(String[] args) {
	int [] numbers= {1,4,0,6,0,5,0,4,0};
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]==0) {
			int counter=i;
			while(counter>=i && counter<numbers.length-1) {
				if(numbers[counter]!=0) {
					break;
				}
				counter++;
					
				
			}
			numbers[i]=numbers[counter];
			numbers[counter]=0;
		}
	}
	System.out.println("Here");
	for(int p:numbers) {
		System.out.print(p+" ");
	}
}
}
