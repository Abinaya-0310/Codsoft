package studentgrade;
import java.util.*;
public class studentgradecalculate 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=6,total=0;
		float avg;;
		float mark[]=new float[6];
		String grade;
		String sub[]= {"Optional Language","English","Mathematics","Physics","Chemistry","Computer Science"};
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter mark for "+sub[i]+":");
			mark[i]=sc.nextFloat();
			total+=mark[i];
		}
		avg=total/num;
		if(avg>=90 && avg<=100)
		{
			grade="O";
		}
		else if( avg<90 && avg>=80)
		{
			grade="A+";
		}
		else if( avg<80 && avg>=70)
		{
			grade="A";
		}
		else if( avg<70 && avg>=60)
		{
			grade="B";
		}
		else if( avg<60 && avg>=50)
		{
			grade="C";
		}
		else
		{
			grade="FAIL";
		}
		System.out.println("Total Mark:"+total+"\nAverage Percentage:"+avg+"\n Grade:"+grade);
		sc.close();
	}

}
