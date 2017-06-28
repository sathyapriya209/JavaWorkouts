package com.collection;

import java.util.Scanner;

    public class Solution {

	/*  public static void main(String[] args) {
	//Scanner in = new Scanner(System.in);
        //int N = in.nextInt();
		int N=3;
        for(int i=1;i<=10;i++){
        	int result = N*i ;
        	System.out.println(N + " x " + i + " = " + result);
        }
        Long.MAX_VALUE
        
	}
}
	private void addLeadingZeros() {
		String[] arr = new String[3];
		int val = 65;
		String str = String.valueOf(val);
		char[] ch = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = ch.length - 1; j >= 0; j--) {
				arr[i] = ch[j];
			}
		}
	}

		 
        public static void main(String[] args) {
               
                //array of 10 numbers
                int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
               
                //assign first element of an array to largest and smallest
                int smallest = numbers[0];
                int largetst = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > largetst)
                                largetst = numbers[i];
                        else if (numbers[i] < smallest)
                                smallest = numbers[i];
                       
                }
               
                System.out.println("Largest Number is : " + largetst);
                System.out.println("Smallest Number is : " + smallest);
        }
}
	class ForLoopExample2 {
	    public static void main(String args[]){
	         for(int i=1; i>=1; i++){
	              System.out.println("The value of i is: "+i);
	         }
	    }
}
	  int aaa[4] = {1,3,4,5};
    

	for(;;)
	{
		System.out.println("for loop");
	}
	}
}
		  
		  int arr[]= new int[] {2,11,45,9};
	         //i starts with 0 as array index starts with 0 too
	         for(int i=0; i<4; i++){
	              System.out.println(arr[i]);
	         }
	  }
}

	
*/
		 /* class RecursionReverseDemo
    	 while( num != 0 )
         {
             reversenum = reversenum * 10;
             reversenum = reversenum + num%10;
             num = num/10;
         }
*/
		     //A method for reverse
		     public static void reverseMethod(int number) {
		         if (number < 10) {
		  	   System.out.println(number);
		  	   return;
		         }
		         else {
		             System.out.print(number % 10);
		             //Method is calling itself: recursion
		             reverseMethod(number/10);
		         }
		     }
		     public static void main(String args[])
		     {
		  	int num=0;
		  	System.out.println("Input your number and press enter: ");
		  	Scanner in = new Scanner(System.in);
		  	num = in.nextInt();
		  	System.out.print("Reverse of the input number is:");
		  	reverseMethod(num);
		  	System.out.println();
		     }
		  }
    
		  
		  
		  
		  
		  