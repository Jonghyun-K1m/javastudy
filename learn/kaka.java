/*
  Using Pattern to analyze String 

*/
package plz;

import java.util.regex.*;
public class kaka {

	
	public static void main(String[] args) {

		Pattern pt = Pattern.compile("^[0-9]*$");
		Pattern pts = Pattern.compile("^[a-zA-Z]*$");
		
		String str= "asd";
		
		Matcher matcher= pt.matcher(str);
		Matcher matchers= pts.matcher(str);

		System.out.println(matcher.find());
		System.out.println(matchers.find());

	}
}
