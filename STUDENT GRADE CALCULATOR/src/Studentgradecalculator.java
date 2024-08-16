import java.util.Scanner;

public class Studentgradecalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of subjects :");
		int numOfSubjects = sc.nextInt();
		int[] marks = new int[numOfSubjects];
		
		for(int i=0;i<numOfSubjects;i++)
		{
			System.out.println("Enter marks for subject"+(i+1)+":");
			marks[i]=sc.nextInt();
		}
		int totalMarks=calculateTotalMarks(marks);
		
		double averagePercentage=calculateAveragePercentage(totalMarks,numOfSubjects);
		
		String grade=assignGrade(averagePercentage);
		System.out.println("Total Marks:"+totalMarks);
		System.out.println("Average Percentage:"+averagePercentage+"%");
		System.out.println("Grade:"+grade);
		
		sc.close();
	}
	public static int calculateTotalMarks(int[] marks)
	{
	int totalMarks=0;
	
	for(int mark : marks)
	{
		totalMarks+=mark;
	}
	return totalMarks;
	}
	
	public static double calculateAveragePercentage(int totalMarks,int numOfSubjects)
	{
		return(double)totalMarks/numOfSubjects;
	}
	public static String assignGrade(double averagePercentage)
	{
		if(averagePercentage >=90){
			return "A+";
		}
		else if(averagePercentage>=80)
		{
			return"A";
		}
		else if(averagePercentage>=70)
		{
			return"B";
		}
		else if(averagePercentage>=60)
		{
			return"C";
		}
		else if(averagePercentage>=80)
		{
			return"D";
		}
		else
		{
		return"F";
		}
			
	}

}
