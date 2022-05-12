//Geunuk Na, Geunuk.na@stonybrook.edu
public class Diamond {
    public static void printLines (int n) {
	for (int i= 1; i<=n; i++) {
	    System.out.println(1);
	}
    }
    public static void printRightHalf (int n) {
	for (int i = 0; i<n; i++) {
	    for (int j = 0; j<=i; j++) {
		System.out.print(1);
	    }
	    System.out.println();
	}
    }
    public static void printTop1 (int n) {
	for (int i =0; i<n; i++) {
	    for (int j = 0; j<=i; j++) {
		System.out.print(2);
	    }
	    for (int j = 0; j<=i; j++) {
		System.out.print(1);
	    }
	    System.out.println();
	}
    }
    public static void printTop2 (int n) {
	for (int i=0; i<n; i++){
	    for (int j=n-i; j>1; j--){
		System.out.print(" ");
	    }
	    for (int j=0; j<=i; j++){
		System.out.print(2);
	    }
	    for (int j=0; j<=i; j++){
		System.out.print(1);
	    }
	    System.out.println();
	}
    }
    
    public static void printBottom (int n) {
    	for (int i=n; i>0; i--){
	    for (int j=n-i; j>=1; j--){
		System.out.print(" ");
	    }
	    for (int j=0; j<i; j++){
		System.out.print(2);
	    }
	    for (int j=0; j<i; j++){
		System.out.print(1);
	    }
	    System.out.println();
	}
    }
    public static void printDiamond (int n) {
	printTop2(n);
	printBottom(n);
    }
    public static void printDiamonds (int m, int n) {
	for (int i=0; i<m; i++){
	    printDiamond(n);
	}
    }
    public static void main (String[] args){
	System.out.println("printLine(5) should be:");
	printLines (5);
	System.out.println("printRightHalf(5) should be:");
	printRightHalf(5);
	System.out.println("printTop1(5) should be:");
	printTop1(5);
	System.out.println("printTop2(5) should be:");
	printTop2(5);
	System.out.println("printBottom(5) should be:");
	printBottom(5);
	System.out.println("printDiamond(5) should be:");
	printDiamond(5);
	System.out.println("printDiamonds(3,5) should be:");
	printDiamonds(3, 5);
    }
}
