package JAVA_AM_20220328;

import java.util.Scanner;

public class Assignment_A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int count = 0;;
		  count = sc.nextInt();
		  
          for(int i=2; i<=count; i++) // because number 1 is not prime
          {		boolean isPrime = true; // Initial value
              for(int j=2; j*j<=i; j++)
              {
                   if(i%j ==0) // not prime number 
                   {
                        isPrime = false;
                        break;
                   }    
                   
              }

              if(isPrime)
              {
                   System.out.print(i+" ");
              }
          }          
        
           sc.close();
		}
	}


