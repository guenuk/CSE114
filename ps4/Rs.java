//Geunuk Na, geunuk.na@stonybrook.edu
import java.util.Scanner;
public class Rs{
    public static char[][] createboard(int n){
	char[][] board = new char[n][n];
	for(int i=0; i<n; i++){
	    for(int j=0; j<n; j++){
		board[i][j] = ' ';
	    }
	}
	return board;
    }
    public static void printArray(char[][] n, int x){
	for (int i=0; i<x; i++){
	    for (int j=0; j<x; j++){
		System.out.print(n[i][j] + " ");
	    }
	    System.out.println();
	}
    }
    public static char[][] fillboard(char[][] n,int size, int perc){
	int fillCount = (int)Math.round(((n.length*n.length*perc)/100.0));
	//System.out.println(percentage);
	int count=0;
	java.util.Random rand = new java.util.Random();
        while (count<fillCount){
	    int ran01=rand.nextInt(size);
	    int ran02=rand.nextInt(size);
	    if(isNotFilled(n, ran01, ran02)){
		fillCell(n, ran01, ran02);
		count++;
	    }
	}
	return n;
    }
    public static boolean isNotFilled(char[][] arr, int x, int y){
	return arr[x][y] != '.';
    }
    public static char fillCell(char[][] arr, int x, int y){
	return arr[x][y] = '.';
    }
    public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Type a borad size: ");
	int boardsize = scan.nextInt();
	System.out.println("How much do you want to fill in? (type the percentage): ");
	int perce = scan.nextInt();
	char[][] bb = createboard(boardsize);
	char[][] newboard = fillboard(bb,boardsize,perce);
	printArray(newboard, boardsize);
    }   
}

