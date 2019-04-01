import java.util.Scanner;

public class Students {
	Scanner s= new Scanner(System.in);
	private String StdId,regNo;
	private int year;
	private int sum;
	private double avge;
	private String[] Courses = {"OOP","WEBDESIGN","COMPUTERAPLLICATION","COMPUTERSYSTEMS","COMMUNICATIONSKILLS","ENT","MATHS","PROBLEMSOLVING"};
	int n=Courses.length;
	int [] Score = new int[n];  
	public Students() {
		System.out.println("Enter Student's Name: ");
		StdId = s.nextLine();
		System.out.println("Enter Student's Registration N0.: ");
		regNo = s.nextLine();
		System.out.println("Enter Student's Date Of Birth: ");
		year=s.nextInt();}
		public String getStdId() {
			return StdId;
		}
		public void setStdId(String StdId) {
			this.StdId = StdId;
		}
		public String getRegNo() {
			return regNo;
		}
		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public void setScores() {
			for(int i=0;i<n;i++) {
				System.out.print("Enter Marks for "+Courses[i]+":"); 
				int marks = s.nextInt();
				if(marks>=0 && marks<=100) {
					Score[i]= marks;
					sum=sum+marks;
				}else
					System.out.println("invalid input (between 0 and 100)");
			}
		}
			
		 public void printScores() {
			 System.out.println();
		        System.out.println("\nCourses\t\tMarks");
		        for(int i=0;i<n;i++){
		            System.out.println(Courses[i]+"\t"+Score[i]);
		        }
		        System.out.println();
		        System.out.println("SUM = "+sum);
				avge = sum/n;
				System.out.println(" Average marks is ="+avge);
		    }
		
		  public void printStdInfo(){
		       System.out.printf("Full name: %s\nReg No: %s\nYear of birth: %d%n", StdId, regNo, year);
		    }
	}

		