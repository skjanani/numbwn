package janani;
import java.util.Scanner;
public class Btwnum {

	public static void main(String[] args) {
		
		int i,count=0,n,l,a;
		System.out.println("enter the number");
		 Scanner in=new Scanner(System.in);
		 n=in.nextInt();
		 l=in.nextInt();
		 a=in.nextInt();
		 for(i=l+1;i<=a;i++){
			 if(i==n){
				 count++;
				 break;
			 }
		 }
		 if(count==1){
			 System.out.println("yes");
		 }
		 else{
			 System.out.println("no");
		 }
	}

}
