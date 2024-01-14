package practiceStrings;


//IN BUILT METHODS IN STRINGS CAN BE USED.(3)
/*
1. --indexOf(string) (string1.indexOf(string2) --> gives the index of first occurence of string2 in string1, means 
string1 will be>strin2 in length.
2. --substring(index1,index2) (it gives substring of given string  till the index requested... 
like prefix = prefix.substring(0,10); then till 10th index from it will give from source indes to destination 
index you needs.
3. --isEmpty()
*/
public class StringOperations {

	public static void main(String[] args) {
		String first = "Umang is a good boy";
		String last = "Umang Madeshia";
		
	    //while(first.indexOf(last)!=0) { last = last.substring(0,last.length()-1); }
		System.out.println(first.indexOf(last));
		System.out.println(first.substring(0,2));
		System.out.println(last.isEmpty());
	}
}
