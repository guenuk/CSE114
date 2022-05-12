
public class UseTeam {
    
    private static Team buildTeam (String teamName) {

        Team tm = new Team(teamName);

        if (teamName.equals("Giants")) {
            tm.addPlayer(41, "P", "Jeremy Affeldt", "6-5", 226, "L", .231);
            tm.addPlayer(40, "P", "Madison Bumgarner", "6-4", 215, "R", .171);
            tm.addPlayer(18, "P", "Matt Cain", "6-3", 230, "R", .114);
            tm.addPlayer(46, "P", "Santiago Casilla", "6-0", 201, "R", .153);
            tm.addPlayer(17, "P", "Tim Hudson", "6-1", 175, "R", .145);
            tm.addPlayer(78, "P", "David Huff", "6-2", 215, "S", .175);
            tm.addPlayer(55, "P", "Tim Lincecum", "5-11", 170, "L", .13);
            tm.addPlayer(49, "P", "Javier Lopez", "6-4", 230, "L", .111);
            tm.addPlayer(63, "P", "Jean Machi", "6-0", 255, "R", .129);
            tm.addPlayer(52, "P", "Yusmeiro Petit", "6-1", 250, "R", .211);
            tm.addPlayer(54, "P", "Sergio Romo", "5-11", 191, "R", .123);
            tm.addPlayer(32, "P", "Ryan Vogelsong", "6-4", 215, "R", .159);
            tm.addPlayer(28, "C", "Buster Posey", "6-1", 205, "R", .298);
            tm.addPlayer(29, "C", "Hector Sanchez", "6-0", 235, "S", .234);
            tm.addPlayer(53, "I", "Ehire Adrianza", "6-1", 170, "S", .298);
            tm.addPlayer(13, "I", "Joaquin Arias", "6-1", 165, "R", .234);
            tm.addPlayer(9,  "I", "Brandon Belt", "6-1", 220, "L", .254);
            tm.addPlayer(35, "I", "Brandon Crawford", "6-2", 215, "L", .253);
            tm.addPlayer(48, "I", "Pablo Sandoval", "5-11", 246, "S", .305);
            tm.addPlayer(19, "I", "Marco Scutaro", "5-10", 185, "R", .321);
            tm.addPlayer(7,  "O", "Gregor Blanco", "5-11", 175, "L", .295);
            tm.addPlayer(38, "O", "Michael Morse", "6-5", 245, "R", .312);
            tm.addPlayer(16, "O", "Angel Pagan", "6-2", 200, "S", .342);
            tm.addPlayer(8,  "O", "Hunter Pence", "6-4", 220, "R", .287);
            tm.addPlayer(2,  "O", "Juan Perez", "5-11", 185, "R", .284);
	}
        else if (teamName.equals("Angels")) {
	    tm.addPlayer(41, "P", "Jeremy Affeldt", "6-5", 226, "L", .231);
            tm.addPlayer(40, "P", "Cristiano Ronaldo", "6-4", 205, "R", .194);
            tm.addPlayer(98, "P", "Lionel Messi", "6-3", 237, "R", .192);
            tm.addPlayer(26, "P", "Santiago Bernabeu", "6-0", 101, "R", .253);
            tm.addPlayer(87, "P", "Ellen Show", "6-1", 195, "R", .135);
            tm.addPlayer(76, "P", "Hulk Buster", "6-2", 195, "S", .177);
            tm.addPlayer(52, "P", "Iron Man", "5-11", 165, "L", .113);
            tm.addPlayer(55, "P", "Joe Blanton", "6-3", 215, "R", .123);
	    tm.addPlayer(44, "P", "Art Lee", "6-4", 210, "R", .384);
	    tm.addPlayer(33, "P", "Josh Ryu", "5-4", 200, "L", .221);
	    tm.addPlayer(8, "P", "Uejene Kim", "6-7", 180, "L", .297);
	    tm.addPlayer(9, "P", "Jeemin Myung", "5-11", 170, "R", .305);
	    tm.addPlayer(3, "C", "Jimmy Jeong", "6-7", 195, "S", .111);
	    tm.addPlayer(27, "C", "JoonSang Yun", "5-7", 160, "S", .305);
	    tm.addPlayer(53, "I", "John Adams", "5-8", 200, "S", .288);
            tm.addPlayer(13, "I", "Hooda fong", "6-7", 185, "R", .214);
            tm.addPlayer(9,  "I", "Brandon Liew", "5-11", 220, "L", .354);
            tm.addPlayer(35, "I", "Nick Fury", "6-7", 215, "L", .205);
            tm.addPlayer(48, "I", "Scarlet Johanson", "5-9", 186, "S", .391);
            tm.addPlayer(19, "I", "Mark Rufallo", "7-10", 285, "R", .393);
	    tm.addPlayer(7,  "O", "Robert Downy", "6-1", 185, "L", .392);
            tm.addPlayer(39, "O", "Michael Cors", "5-9", 265, "R", .202);
            tm.addPlayer(16, "O", "Coco Chanel", "4-9", 300, "S", .102);
            tm.addPlayer(77, "O", "Elon Musk", "5-5", 228, "R", .101);
            tm.addPlayer(2,  "O", "Burak Obama", "5-11", 195, "R", .114);
        }
        else {
            System.out.println(teamName + " is not supported yet.");
            return null;
        }
        return tm;
    }

    public static void main (String[] args) {
        
        Team giants = buildTeam("Giants");
        Team angels = buildTeam("Angels");

        Player p = giants.searchPlayer("Jeremy Affeldt");

        System.out.println("Info on Jeremy Affeldt is: " + p.toString());
        System.out.println("\nBatting average of Giants is: "
                           + giants.battingAverage());
        System.out.println("Batting average of Giants not including pitchers is: "
                           + giants.battingAverageMinusPitchers());
        System.out.println("\nAverage height of Giants players is: "
                           + giants.heightAverage());
        System.out.println("\nNumber of switch hitters on the Giants team is: "
                           + giants.numberOfPlayersBatting("S"));
        System.out.println("Number of right handed hitters on the Giants team is: "
                           + giants.numberOfPlayersBatting("R"));
        System.out.println("Number of left handed hitters on the Giants team is: "
                           + giants.numberOfPlayersBatting("L"));
        System.out.println("\nNumber of pitchers on the Giants team is: "
                           + giants.numberOfPlayersInPosition("P"));
        System.out.println("Number of catchers on the Giants team is: "
                           + giants.numberOfPlayersInPosition("C"));
        System.out.println("Number of infielders on the Giants team is: "
                           + giants.numberOfPlayersInPosition("I"));
	
    }

}
