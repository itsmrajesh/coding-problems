import java.util.*;

public class Land{
		public static void main(String args[]){
		int field;
		Scanner sc = new Scanner(System.in);
		int num=6;
		if(num%2 !=0 && num%3 !=0){
			System.out.println("NO");
		}
		else{
			int share=num/3;
			System.out.println("YES");
			for(int i=0;i<3;i++)
				System.out.print(share+" ");
						
			}
	
}

}