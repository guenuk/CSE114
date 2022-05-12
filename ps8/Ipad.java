//Geunuk Na, geunuk.na@stonybrook.edu

public class Ipad{
    private String name;
    private int price;
    private double displaySize;
    private int memoryCapacity;
    private boolean cellular;
    private String type;
    
    private int serialNum;
    private int appcount;

    private static Ipad[] ipads = new Ipad[20];
    private static int serialGen = -1;
    private static int ipadssize = 0;
    private static int totalNumbsApps = 0;

    private int getNewID(){
	serialGen += 1;
	return serialGen;
    }

    /* public boolean equals(Ipad ip){ //test
	return ip.name.equals(name)&& ip.price == price;
	}*/
    
    public Ipad(String name, int price, double displaySize, int memoryCapacity, boolean cellular, String type){
	this.name=name;
	this.price=price;
	this.displaySize=displaySize;
	this.memoryCapacity=memoryCapacity;
	this.cellular=cellular;
	this.type = type;
	serialNum = getNewID();
	
    }

    public static void add(Ipad ip){
	ipads[ipadssize] = ip;
	ipadssize += 1;
    }
    
    public static void remove(Ipad ip){
	for(int i=0;i<ipadssize; i++){
	    if(ipads[i].equals(ip)){
		ipads[i] = null;
		
		for(int j=i; j<ipadssize; j++){
		    swap(ipads,j, j+1);
		}
		break;
	    }
	}
	totalNumbsApps = totalNumbsApps - ip.getAppcount();
	ipadssize -= 1;
    } 

    private static void swap(Ipad[] ipads,int x, int y){ 
	Ipad temp = ipads[x];
	ipads[x] = ipads[y];
	ipads[y] = temp;
    }

    public int getAppcount(){
	return appcount;
    }
    
    public void installApp(){
	totalNumbsApps +=1;
	appcount +=1;
    }

    public static int getTotalNumberOfApps(){
	return totalNumbsApps;
    }
    public String toString(){
	return "   (" + name + ", " + serialNum + ", " + price + ", " +displaySize+ ", "+memoryCapacity+ ", "
	    +appcount + "," + cellular + ", " +  type + ")";
    }
    public static void print(String s){
	System.out.println(s);
	for(int i=0; i<ipadssize; i++){
	    System.out.println(ipads[i]);
	}
    }
    
	
}
