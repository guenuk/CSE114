//Geunuk Na, geunuk.na@stonybrook.edu
import java.io.*;

public class ProcessApplications {

    public static String readALine (BufferedReader input) {
        String line = "";
        try {
            line = input.readLine();
        }
        catch (IOException e) {
            System.out.println("Oops");
        }
        return line;
    }

    public static void main (String[] args) throws IOException {

        String inputFile = "./a0.txt";
        BufferedReader input = new BufferedReader(new FileReader(inputFile));
        int numApplications = Integer.parseInt(readALine(input));
        Application[] applications = new Application[numApplications];
	
        String name = readALine(input); // Read the name of first application
        String addr = "";
        int m=0;

        while (name != null) {   // Reached the end of the input file?
	    String state = "";
	    for(int j=0; j<4; j++){
		if (j==2){
		    state = readALine(input);
		    addr += state;
		}
		else{
		    addr += readALine(input);
		}
	    }
	    String phoneNum = readALine(input);
	    int ID = Integer.parseInt(readALine(input));
	    String major = readALine(input);
	    String gpa = readALine(input);
	    String scholarship = readALine(input);
	    applications[m]= new Application(name,addr,state,phoneNum,ID,major,gpa,scholarship);
	    m++;
	    name = readALine(input);
	    addr = "";
        }

        input.close();
	
	System.out.println("Scholarship recipents: ");
	for(int i=0; i<numApplications; i++){
	    if (applications[i].getGPA()>3.8 &&
	       (applications[i].getMajor().equals("Philosophy")||
		applications[i].getMajor().equals("History")||
		applications[i].getMajor().equals("Sociology")) &&
	       (applications[i].getState().equals("Montana")||
		applications[i].getState().equals("Idaho")) &&
	       applications[i].getScholar()){
	       System.out.println(applications[i].getName());
	    }
	}
	
	State state = new State(); 
	for(int i=0; i<numApplications; i++){
	    for(int j=0; j<State.getSize();j++){
		if(applications[i].getState().equals(State.getStates()[j].getStateName())){
		    State.getStates()[j].addApp(applications[i]);
		}
	    }
	}
	
        
	double caliGPAsum = 0.0;
	for(int i=0; i<State.getSize();i++){
	    if(State.getStates()[i].getStateName().equals("California")){
		if(State.getStates()[i].getNumApp()==0){
		    System.out.println("There are no applicants from California");
		    break;
		}
		else{
		for(int j=0; j<State.getStates()[i].getNumApp();j++){
		    caliGPAsum += State.getStates()[i].getApps()[j].getGPA();
		    System.out.println(State.getStates()[i].getApps()[j].getGPA());
		}
		caliGPAsum /= State.getStates()[i].getNumApp();
		System.out.println("Average GPA of All the applicants from California is: " + caliGPAsum);
		}
	    }
	}
	
	String highestName = "";
	double highestGPA = 0.0;
	for(int i=0; i<State.getSize();i++){
	    if(State.getStates()[i].getStateName().equals("Washington")){
		if(State.getStates()[i].getNumApp()==0){
		    System.out.println("There are no applicants from Washington");
		    break;
		}
		else{
		    for(int j=0; j<State.getStates()[i].getNumApp();j++){
			if(State.getStates()[i].getApps()[j].getGPA()>highestGPA){
			    highestGPA = State.getStates()[i].getApps()[j].getGPA();
			    highestName = State.getStates()[i].getApps()[j].getName();
			}
		    }
		    System.out.println("Highest GPA of Applicants from Washington is: " + highestName+ "("+ highestGPA + ")");
		}
	    }
	}
	
	System.out.println("State, No of Applications");
	for(int i=0; i<State.getSize();i++){
	    if(State.getStates()[i].getNumApp()>0){
		System.out.println(State.getStates()[i].getStateName() + ", " + State.getStates()[i].getNumApp());
	    }
	}

    }

}
