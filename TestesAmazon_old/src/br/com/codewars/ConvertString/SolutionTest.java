package br.com.codewars.ConvertString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

/**
* Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
* The first word within the output should be capitalized only if the original word was capitalized.
* Examples
* toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
* 
* toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
* 
* @author wbarros
*
*/


public class SolutionTest {
	
	public static void main(String[] args) {
		

		
		
	}
	
    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
}