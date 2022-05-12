//Geunuk Na, geunuk.na@stonybrook.edu
public class Player{
    private int jersNum;
    private String position;
    private String playerName;
    private String height;
    private int weight;
    private String hand;
    private double battingAverage;

    public Player(int jersNum, String position, String playerName, String height, int weight, String hand, double battingAverage){
	this.jersNum = jersNum;
	this.position = position;
	this.playerName = playerName;
	this.height = height;
	this.weight = weight;
	this.hand = hand;
	this.battingAverage = battingAverage;
    }

    public String getPosition(){
	return position;
    }
    public String getName(){
	return playerName;
    }
    public String getHand(){
	return hand;
    }
    public double getBattingAverage(){
	return battingAverage;
    }
    public int getHeight(){
	return heightConvert(height);
    }
    public int heightConvert(String height){
	String[] splitHeight = height.split("[-]");
	int hFeet = Integer.parseInt(splitHeight[0])*12;
	int hInch = Integer.parseInt(splitHeight[1]);
	return hFeet + hInch;
    }
    public int getWeight(){
	return weight;
    }
    public String toString(){
	return "("+jersNum+", "+position+", "+playerName+", "+height+", "+weight+", "+hand+", "+battingAverage+")";
    }
    
}
