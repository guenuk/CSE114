//Geunuk Na, geunuk.na@stonybrook.edu
public class Message {
    private String from;
    private String to;
    private String date;
    private String subject;
    private int id;
    private String body;
    private Mailbox mb;

    
    public Message(String from, String to, String date, String subject, int id, String body, Mailbox mb){
	this.from = from;
	this.to= to;
	this.date = date;
	this.subject = subject;
	this.id = id;
	this.body =body;
	this.mb = mb;
    }
    
    public String getFrom() {
	return from;
    }
    public String getTo() {
	return to;
    }
    public String getDate() {
	return date;
    }
    public String getSubject() {
	return subject;
    }
    public int getID(){
	return id;
    }
    public void setID(int newId){
	this.id=newId;
    }
    public String getBody() {
	return body;
    }
    public Mailbox getMailBox(){
	return mb;
    }
    
    public String toString() {
        return from + " " + to + " " + date + " " + subject+ " " + id+ " " +  body ;
    }
    
	
}
