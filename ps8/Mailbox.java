//Geunuk Na, geunuk.na@stonybrook,edu

public class Mailbox {
    
    private String name;
    private Message[] inbox = new Message[50];
    private Message[] delbox = new Message[50];
    private int inboxCount=0;
    private int delboxCount=0;
       
    public static Message recentDelete;

    public Mailbox(String name){
	this.name=name;
    }
    public void newID(Message m){
	String [] dateSplit =m.getDate().split("[/]");
	int newID = Integer.parseInt(dateSplit[1]);
	m.setID(newID);
    }
	
    public void receive(Message m){
	inbox[inboxCount] = m;
	inboxCount +=1;
	newID(m);
	ssort(inbox, inboxCount);
    }
    public void delete(Message m){
	if (!checkInbox(m)){
	    System.out.println("Message ("+m.getID()+") not in inbox.");
	}
	for(int i=0;i<inboxCount; i++){
	    if(inbox[i].equals(m)){
		recentDelete = m;
		inbox[i] = null;
		delbox[delboxCount] = m;
		for(int j=i; j<inboxCount; j++){
		  swap(inbox,j, j+1);
		}
		inboxCount -=1;
		delboxCount +=1;
		break;
	    }
	}
	ssort(delbox, delboxCount);
    }
    public void undelete(){
	if (recentDelete == null){
	    System.out.println("There is no message to undelete.");
	}
	else{
	    for(int i=0; i<delboxCount; i++){
		if(delbox[i].equals(recentDelete)){
		    delbox[i]=null;
		    for(int j=i; j<delboxCount; j++){
			swap(delbox,j, j+1);
		    }
		    delboxCount -= 1;
		    this.receive(recentDelete);
		    recentDelete = null;
		}
	    }
	}
    }
    private boolean checkInbox(Message m){
	for(int i=0; i<inboxCount; i++){
	    if(inbox[i].equals(m)){
		return true;
	    }
	}
	newID(m);
	return false;
    }
    public String searchMessage(int id){
	for(int i= 0; i<inboxCount; i++){
	    if(inbox[i].getID()==id){
		return "inbox";
	    }
	}
	for(int j=0; j<delboxCount; j++){
	    if(delbox[j].getID()==id){
		return "delbox";
	    }
	}
	return "neither";
    }
    
    public void ssort(Message[] m, int size){
	for(int i=0;i<size;i++){
	    for(int j=0;j<size;j++){
		if (m[j].getID() > m[i].getID()){
		    swap(m, i, j);
		}
	    }
	}
    }
    private void swap(Message[] m, int i, int j){
	Message temp = m[i];
	m[i] = m[j];
	m[j] = temp;
    }
    
    public String toString(){
	String s ="  Inbox: ";
	for(int i=0; i<inboxCount;i++){
	    s += "("+inbox[i].getID()+")";
	}
	s += "\n  Delbox: ";
	for(int j=0; j<delboxCount;j++){
	    s += "("+delbox[j].getID()+")";
	}
	return s;
    }
}
