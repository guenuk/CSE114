//Geunuk Na, geunuk.na@stonybrook.edu
public class Rev{
    public static void reverse (int[] A){
	for (int i = 0; i<A.length/2; i++){
	    int reve = A[i];
	    A[i] = A[A.length-i-1];
	    A[A.length-i-1] = reve;
	}
    }
    public static void print (int[] A){
	for (int i=0; i<A.length; i++){
	    System.out.print(A[i] + " ");
	}
	System.out.println();
    }
    public static void main (String[]Args){
	int [] arr = {1,2,3,4,5,6,7};
	print(arr);
	reverse(arr);
	print(arr);
	int [] arr2 = {1,3,5,7};
	print(arr2);
	reverse(arr2);
	print(arr2);
	int [] arr3 = {1,2,3,4,5,6,7,8,9,10};
	print(arr3);
	reverse(arr3);
	print(arr3);
    }
}
    
