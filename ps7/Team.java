//Geunuk Na, geunuk.na@stonybrook.edu
public class Team{
    private int CAPACITY =50;
    private Player[] players = new Player[CAPACITY];
    private int size=0;
    private String name;

    public Team(String teamname){
	name = teamname;
    }
    public void addPlayer(int jersyNum, String position, String playername, String height, int weight, String hand, double battingAve){
	Player p1  = new Player(jersyNum,position,playername,height,weight,hand,battingAve);
	players[size] = p1;
	size += 1;
    }
    public Player searchPlayer(String playername){
	for(int i=0;i<size; i++){
	    if(players[i].getName().equals(playername)){
		return players[i];
	    }
	}
	return null;
    }
    public double battingAverage(){
	double sum = 0.0;
	for(int i=0;i<size; i++){
	    sum += players[i].getBattingAverage();
	}
	return sum/size;
    }
    public double battingAverageMinusPitchers(){
	double sum=0;
	int count= 0;
	for(int i=0; i<size;i++){
	    String s = players[i].getPosition();
	    if(players[i].getPosition().equals("C")||players[i].getPosition().equals("I")||players[i].getPosition().equals("O")){
		sum += players[i].getBattingAverage();
		count += 1;
	    }
	}
	return sum/count;
    }
    public String heightAverage(){
	int sum=0;
	for(int i=0;i<size; i++){
	    sum += players[i].getHeight();
	}
	return heightConvert(sum/size);
    }
    public String heightConvert (int i0){
	int i1 = i0/12;
	int i2 = i0-(i1*12);
	return i1 + "-" + i2;
    }
    public int numberOfPlayersBatting(String hand){
	int count=0;
	for(int i=0;i<size;i++){
	    if(players[i].getHand().equals(hand)){
		count += 1;
	    }
	}
	return count;
    }
    public int numberOfPlayersInPosition(String position){
	int count=0;
	for(int i=0; i<size; i++){
	    if(players[i].getPosition().equals(position)){
		count += 1;
	    }
	}
	return count;
    }
}
