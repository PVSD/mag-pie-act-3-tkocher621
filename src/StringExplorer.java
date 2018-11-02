/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:

        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

        int notFoundPsn1 = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn1);
        // Starts from the beginning of the string, so it will find the word

        int notFoundPsn2 = sample.indexOf("quick", 5);
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn2);
        //Starts from the fifth index in the string, which is past the full word of 'quick', so it wont find it


	}

}
