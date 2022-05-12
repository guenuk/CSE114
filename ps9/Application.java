//Geunuk Na, geunuk.na@stonybrook.edu
public class Application{
    
    private String name;
    private String addr;
    private String phoneNum;
    private int id;
    private String major;
    private double gpa;
    private boolean scholarship;
    private String state;

    public Application(String name,String addr, String state, String phoneNum, int id, String major,
		       String gpa, String scholarship){
	this.name=name;
	this.addr=addr;
	this.state=state;
	this.phoneNum=phoneNum;
	this.id=id;
	this.major=major;
	this.gpa=gpaToDouble(gpa);
	this.scholarship=scholarIdentify(scholarship);
    }
    public String getName(){
	return name;
    }
    public String getAddr(){
	return addr;
    }
    public String getPhoneNum(){
	return phoneNum;
    }
    public int getID(){
	return id;
    }
    public String getMajor(){
	return major;
    }
    public double getGPA(){
	return gpa;
    }
    public boolean getScholar(){
	return scholarship;
    }
    public String getState(){
	return state;
    }
    private double gpaToDouble(String gpa){
	String[] splitGPA = gpa.split("[.]");
	double newGPA = Integer.parseInt(splitGPA[0]+splitGPA[1])/100.0;
	return newGPA;
    }
    private boolean scholarIdentify(String scholarship){
	return scholarship.equals("Applying4Scholarship");
    }
}
