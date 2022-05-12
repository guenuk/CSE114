//Geunuk Na, geunuk.na@stonybrook.edu
public class More {
	public static String consonants = "bcdfghjklmnpqrstvwyzBCDFGHJKLMNPQRSTVWYZ";
	public static String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
        String s = "Abcdef";
        System.out.println("Testing hasMoreVowelsThanConsonants(s) with Abcdef");
        System.out.println("6: " + s.length());
        System.out.println("A: " + s.substring(0, 1));
        System.out.println("true: " + s.contains("b"));
        System.out.println("false: " + s.contains("B"));
        System.out.println("bcdef: " + s.substring(1));
        System.out.println("false: " + hasMoreVowelsThanConsonants(s));

	System.out.println("Testing putEvensBeforeOdds");
        int[] ints1 = {2, 4, 4, 2};
        int[] ints2 = {1, 3, 3, 1, 5};
        int[] ints3 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] ints4 = {2, 4, 2, 6, 2, 8, 2};
        int[] ints5 = {1, 3, 5, 7, 9, 11};
        int[] ints6 = {1 ,2, 3, 6, 12, 11, 10, 4, 19, 5};
        putEvensBeforeOdds(ints1);
        printIntsArray(ints1);
        putEvensBeforeOdds(ints2);
        printIntsArray(ints2);
        putEvensBeforeOdds(ints3);
        printIntsArray(ints3);
        putEvensBeforeOdds(ints4);
        printIntsArray(ints4);
        putEvensBeforeOdds(ints5);
        printIntsArray(ints5);
        putEvensBeforeOdds(ints6);
        printIntsArray(ints6);
    }
    
    public static void printIntsArray(int[] u) {
        for (int i : u) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static boolean hasMoreVowelsThanConsonants(String s) {
    	return auxVowel(s,0,0,0);
    }
    public static boolean auxVowel(String s, int i, int vowelCount, int consCount) {
    	if (i== s.length()) {
    		return vowelCount>consCount;
    	}
    	else if(vowels.contains(charToString(s.charAt(i)))){
    		vowelCount++;
    		return auxVowel(s,i+1,vowelCount,consCount);
    	}
    	else if(consonants.contains(charToString(s.charAt(i)))) {
    		consCount ++;
    		return auxVowel(s,i+1,vowelCount,consCount);
    	}
    	else {
    		return vowelCount>consCount;
    	}
    }
    public static String charToString(char c) {
    	String s = "";
    	return s+c;
    }
    
    // Add your functions below
    public static int[] putEvensBeforeOdds(int[] ia) {
    	auxSort(ia,0);
    	return ia;
    }
    public static void auxSort(int[] ia, int i) {
    	if (i<ia.length) {
	    	if(ia[i]%2 ==0) {
	    		if(i-1>=0&&(ia[i-1]%2!=0)) {
	    			swap(ia,i,i-1);
	    			auxSort(ia, i-1);
	    		}
	    		else {
	    			auxSort(ia,i+1);
	    		}
	    	}
	    	else {
	    		auxSort(ia, i+1);
	    	}
    	}
    }
    public static void swap(int[] a, int i, int j) {
    	int temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
   
 }
