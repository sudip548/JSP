package trailDemo;

public class StringConverter {
	public String uppercaseConverter(String value) {
		return value.toUpperCase();
	}
	public String lowercaseConverter(String value) {
		return value.toLowerCase();
	}
	public String stringReverser(String value) {
		String temp=" ";
		for(int i= value.length()-1;i>=0;i--) {
		temp+=value.charAt(i);	
		}
		return temp;
	}

}
