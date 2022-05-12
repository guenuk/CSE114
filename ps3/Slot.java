import java.util.Scanner;
public class Slot {
    public static int[] randArray (int n) {
	int[] aa = new int[n];
	java.util.Random rand = new java.util.Random();
	for (int i = 0; i < n; i++){
	    aa[i] = rand.nextInt(10);
	}
	return aa;
    }
    public static String printArray (int[] aa){
	return aa[0] +", "+ aa[1]+ ", " + aa[2];
    }
    public static int slotmachine (int[] bb) {
	int triple = 3;
	int douBle = 2;
	int single = 1;
	    if(bb[0] == bb[1] && bb[0] == bb[2]){
		return triple;
	    }
	    else if(bb[0] == bb[1] && bb[0]!=bb[2]){
		return douBle;
	    }
	    else if(bb[0] == bb[2] && bb[0]!=bb[1]){
		return douBle;
	    }
	    else if(bb[1]== bb[2] && bb[0]!=bb[1]){
		return douBle;
	    }
	    return single;
    }
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int playtimecount = 0;
	int triplecount = 0;
	int doublecount = 0;
	int singlecount = 0;
	System.out.print("Continue? (enter 1 to continue 2 to stop): ");
	int playercontinue = scan.nextInt();
	while (playercontinue == 1){
	    int[] aa = randArray(3);
	    int randomSlot = slotmachine(aa);
	    System.out.println("The numbers you drew are: " + printArray(aa));
	    //System.out.println("\t" + randomSlot);
	    if (randomSlot ==  3){
		System.out.println("\twow, triple luck!");
		triplecount += 1;
	    }
	    else if (randomSlot == 2){
		System.out.println("\twow, double luck!");
		doublecount += 1;
	    }
	    else if (randomSlot == 1){
		System.out.println("\tBetter luck next time!");
		singlecount += 1;
	    }
	    playtimecount += 1;
	    System.out.print("Continue? (enter 1 to continue 2 to stop): ");
	    playercontinue = scan.nextInt();
	}
	System.out.println("Out of " + playtimecount + " hands, you had");
	System.out.println("\t" + triplecount + " triple jack pots (" + ((100*triplecount)/playtimecount) +  "%)," +
			   "\n\t" + doublecount + " doubles (" + ((100*doublecount)/playtimecount) + "%), and" +
			   "\n\t" + singlecount + " singles (" + ((singlecount*100)/playtimecount) + "%) today!!!" +
			  "\n\tCome again...");
    }
}
			
	
