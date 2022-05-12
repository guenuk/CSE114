//Geunuk Na, geunuk.na@stonybrook.edu
public class State{
    
    private String stateName;
    private int numberOfApplications=0;
    private Application[] apps = new Application[50];
    
    private static String[] stateNames = {
           "Alabama", "Alaska", "Arizona", "Arkansas", "California",
	   "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
           "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
           "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
           "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
           "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
           "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
	   "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
	   "South Dakota", "Tennessee", "Texas", "Utah", "Vermont",
           "Virginia", "Washington", "West Virginia", "Wisconsin",
           "Wyoming"};
    private static State[] states = new State[50];
    private static int statesSize = 0;

    public State(){
	for(int i=0; i<stateNames.length;i++){
	    states[statesSize] = new State(stateNames[i]);
	    statesSize++;
	}
    }
    public State(String stateName){
	this.stateName=stateName;
    }
    public void addApp(Application app){
	apps[numberOfApplications]= app;
	numberOfApplications++;
    }
    public int getNumApp(){
	return numberOfApplications;
    }
    public Application[] getApps(){
	return apps;
    }
    public static int getSize(){
	return statesSize;
    }
    public static State[] getStates(){
	return states;
    }
    public String getStateName(){
	return stateName;
    }
}
    
	
    
    
      
    
