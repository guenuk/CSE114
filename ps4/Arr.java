//Geunuk Na, Geunuk.na@stonybrook.edu
public class Arr{
    public static int[] randomArray (int sizeOfArr, int rangeOfInt) {
	int[] aa = new int[sizeOfArr];
	java.util.Random rand = new java.util.Random();
	for (int i = 0; i < sizeOfArr; i++){
	    aa[i] = rand.nextInt(rangeOfInt);
	}
	return aa;
    }
    public static void print(int[] arr1){
	for (int i=0; i<arr1.length; i++){
	    System.out.print(arr1[i] + " ");
	}
    }
    public static int arrSum(int[] arr2){
	int sum = 0;
	for (int i=0; i<arr2.length; i++){
	    sum += arr2[i];
	}
	return sum;
    }
    public static boolean contains (int[]arr3, int x){
	boolean result = false;
	for (int i=0; i<arr3.length; i++){
	    if (arr3[i] == x){
	        result = true;
	    }
	}
	return result;
    }
    public static int contains2(int[]arr4, int x){
	int result = -1;
	for (int i=0; i<arr4.length; i++){
	    if (arr4[i] == x){
		result = i;
		break;
	    }
	}
	return result;
    }
    public static int countMultiplesOf(int[]arr5, int x){
	int count = 0;
	for (int i=0; i<arr5.length; i++){
	    if (multipleCheck(x, arr5[i])){
		count += 1;
	    }
	}
	return count;
    }
    public static boolean multipleCheck(int x, int y){
	return (y%x == 0);
    }
    public static int[] buildHistogram(int[] scores){
	int [] hist = new int[largest(scores)+1];
	for (int i=0; i<hist.length; i++){
	    hist[(scores[i])] = containsAlot(scores, (scores[i]));
	}
	return hist;
    }
    public static int containsAlot (int[]arr, int x){
	int count = 0;
	for (int i=0; i<arr.length; i++){
	    if (arr[i] == x){
		count += 1;
	    }
	}
	return count;
    }
    public static int largest (int[] arr6){
	int largest = arr6[0];
	for (int i =1; i<arr6.length; i++){
	    if (arr6[i]>largest){
		    largest = arr6[i];
	    }
	}
	return largest;
    }
    public static void printHistogram(int[] arr7){
	for(int i=0; i<arr7.length; i++){
	    System.out.println(i + ": " + arr7[i] + ": " + star(arr7[i]));
	}
    }
    public static String star(int x){
	String stars = "";
	for (int i=0; i<x; i++){
	    stars += '*';
	}
	return stars;
    }
    public static String strHist(int[] aa){
	int max=0;
	for(int i=0; i < aa.length; i++){
	    if(aa[i]>max)
		max = aa[i];
	}
	System.out.println(max);
	String ret= "";
	for(int i=0; i<max; i++){
	    String temp ="";
	    for(int j=0; j<aa.length; j++){
		if(aa[j]<max-i)
		    temp+="   ";
		else if(aa[j]>= max-i)
		    temp+=" * ";
	    }
	    ret += temp+"\n";
	}

	return ret;
    }
	    
    public static void main(String[]args){
	int [] aa = randomArray(100, 21);
	//int [] aa = {0,2,2,3,4,5,6,6,6}; //ALTER FOR @@STEP2@@ 
	print(aa);
	System.out.println();
	System.out.println("Average of randomArray is: " + arrSum(aa)/aa.length);
	System.out.println("contains(randArray, 12): " + contains(aa, 12));
	System.out.println("contains2(randArray, 12): " + contains2(aa,12));
	System.out.println("countMultiplesOf(randArray, 7): " + countMultiplesOf(aa,7));
	//System.out.println(containsAlot(aa,6)); // test for auxiliary function for buildHistogram
	//System.out.println(largest(aa)); // test for auxiliary function for buildHistogram
	int [] bb = buildHistogram(aa);
	//print(bb); //testing
	printHistogram(bb);
	System.out.println(strHist(bb));
    }
}
