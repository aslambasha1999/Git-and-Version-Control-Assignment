package Online.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		
		     List<Integer>list=Arrays.asList(0,1 ,5 ,8 ,14 ,18 ,44 ,81 ,89 ,99 ,102);
		    
		     ArrayList<Integer>res= new ArrayList<Integer>();
		    
		     int num1= 10, num2 = 20;
		  
		    System.out.println(list.stream().filter(s->(num1<=s)&&(num2>=s)).count());
		    
		   
		 
	}

}