package Online.tests;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {

	public static void main(String[] args) {
	
		//1. Creating List of 10 strings
		
		ArrayList<String> StringLists=new ArrayList<String>();
		
		StringLists.add("The patient should be informed of his therapeutic options.");
		StringLists.add("It wouldn't be as if the lone astronaut would be completely by himself.");
		StringLists.add("Now, a writer is entitled to have a Roget on his desk.");
		StringLists.add("Somebody should let you borrow their book");
		StringLists.add("From the earliest times until about the 1960s");
		StringLists.add("whether we may not, nay ought not, to use a neutral pronoun relative");
		StringLists.add("phone 9280018281");
		StringLists.add("Notionalplurality");
		StringLists.add("A starting point would be to give more support");
		StringLists.add("abc@gmail.com");
		
		//2. Creating list of 5 regex
		
		ArrayList<String> regexps=new ArrayList<String>();
		regexps.add(".*\\.$");
		regexps.add(".*\\d{10}.*");
		regexps.add(".*@.*");
		regexps.add("\\w+");
		regexps.add(".*\\s.*");
		
		//3. Matching all 10 strings with 5 Regex
		
		for(int i=0;i<StringLists.size();i++)
		{
			String stringToSearch=StringLists.get(i);
			for(int j=0;j<regexps.size();j++)
			{
				
			Matcher m=Pattern.compile(regexps.get(j)).matcher(stringToSearch);
			if(m.find())
			{
				//4. printing the output in the format String: n matches regex: n 
				
				System.out.println("String: "+(i+1)+" matches regex: "+(j+1));
			}
			
			
			}
		}
		
		
	
		
		
	}

}
