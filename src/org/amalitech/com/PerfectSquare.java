package org.amalitech.com;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nextSquare;
		int num=121;

		if (findNextSquare(num)) {
			
		double temp_num=Math.sqrt(num);
		 nextSquare=(temp_num+1)*(temp_num+1);
		 int value_result = (int)Math.round(nextSquare); 
			System.out.print("findNextSquare("+num+") --> returns "+ value_result); 
	
			}
		else
			
			System.out.print("findNextSquare("+num+") --> returns -1 since "+ num +" is not a perfect");
		  
		} 
	
	static boolean findNextSquare(int x)  
    { 

	// finding the square root of given number 
	double sq = Math.sqrt(x); 
	
	return ((sq - Math.floor(sq)) == 0); 
    } 

}
