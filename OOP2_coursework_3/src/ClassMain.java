import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		ArrayList<Students> Students = new ArrayList<Students>();
		Students sn=null;
		
		System.out.println("Enter students details"+" (Press 1 to continue)");
		int num = s.nextInt();
				int i = 0;
		while(true) {
			if(i>=num)
			   break;
			else
				sn=new Students(); 
				sn.setScores();
				Students.add(sn);
				System.out.println("************************************************************** ");
				  sn.printStdInfo();
	                sn.printScores();
	       
	        }
	        i++;
		}
	}
	



	


