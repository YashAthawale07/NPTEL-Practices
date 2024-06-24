
import java.util.Scanner;
class EvenNumbers{
	public static void main(String args[]){
		//System.out.println("Hello world");
	
	// Print Even number up to n 
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter A NUmber ");
	int n =scan.nextInt();
	System.out.println("Even & Odd Numbers ");
	System.out.println();
	
	for(int i=1;i<=n;i++){
		if(i%2==0){
			System.out.print(i);
		}
		else{
			System.out.println(" ,  "+ i);
		}
	}
	
	
	}
}