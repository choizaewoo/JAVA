package JAVA_20220329;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0;
		int month=0;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("�⵵ �Է�: ");
	    year=scan.nextInt();
	       
	    System.out.println("�� �Է�: ");
	    month=scan.nextInt();
	       
	       //���
	       String[] strWeek= {"��","��","ȭ","��","��","��","��"};

	       
	       for(String week:strWeek)
	       {
	           System.out.print(week+"\t");
	       }
	       
	       int total=(year-1)*365
	                +(year-1)/4
	                -(year-1)/100
	                +(year-1)/400;
	       
	       
	       //����
	       int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
	       if((year%4==0 && year%100!=0)||(year%400==0)) //���� => 2�� 29��
	           lastDay[1]=29;
	       else
	           lastDay[1]=28;
	       
	       for(int i=0;i<month-1;i++)
	       {
	           total+=lastDay[i];
	       }
	       //1������ ����
	       total++;
	       
	       int week=total%7;
	       //�޷� ���
	       System.out.println();
	       for(int i=1;i<=lastDay[month-1];i++)
	       {
	           if(i==1)
	           {
	              for(int j=0;j<week;j++)
	              {
	               System.out.print("\t");
	              }
	           }
	           System.out.printf("%2d\t",i);
	           week++;
	           if(week>6)
	           {
	               week=0;
	               System.out.println();
	               }
	       }
	   }
	
}
