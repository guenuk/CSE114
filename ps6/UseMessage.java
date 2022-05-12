//Geunuk Na, geunuk.na@stonybrook.edu
public class UseMessage{
    public static void main(String[] args){
	Message msg1 = new Message();
	System.out.println("msg1: ");
	System.out.println("From:" + msg1.getFrom());
	System.out.println("To:" + msg1.getTo());
	System.out.println("Date:" +msg1.getDate());
	System.out.println("Subject:" +msg1.getSubject());
	System.out.println("Body:" + msg1.getBody());
	System.out.println("Length of the body:" + msg1.getLength());
	System.out.println("------NEW msg1: ------");
	msg1 = new Message("Geunuk Na", "Yoojin Jeong", "Love ya");
	System.out.println("From:" + msg1.getFrom());
	System.out.println("To:" + msg1.getTo());
	System.out.println("Date:" +msg1.getDate());
	System.out.println("Subject:" +msg1.getSubject());
	System.out.println("Body:" + msg1.getBody());
	System.out.println("Length of the body:" + msg1.getLength());
	System.out.println("msg2: ");
	Message msg2 = new Message("Yoojin Jeong", "Geunuk Na", "Wed, Apr 24, 2019", "Hey", "I love you See ya");
	System.out.println("From:" + msg2.getFrom());
	System.out.println("To:" + msg2.getTo());
	System.out.println("Date:" +msg2.getDate());
	System.out.println("Subject:" +msg2.getSubject());
	System.out.println("Body:" + msg2.getBody());
	System.out.println("Length of the body:" + msg2.getLength());
	System.out.println("------NEW msg2 it is now important message------");
	msg2 = new Message("Yoojin Jeong", "Geunuk Na", "Wed, Apr 24, 2019", "Hey", "It is too hot to hike and too cold to plunge");
	System.out.println("Is msg2 important?: " + msg2.isImportant());
	System.out.println("Is msg1 important?: " + msg1.isImportant());
	System.out.println("msg1.print() would print: ");
	msg1.print();
	System.out.println("msg1.toString() would print: ");
	System.out.println(msg1.toString());
	Message msg3 = new Message("Alice", "Jon", "Mon, Feb 22, 2019", "Important", "plunge");
	Message msg4 = new Message("President Kim", "Geunuk Na", "Tue, Jan 12, 2019", "This is important", "kite");
	Message msg5 = new Message("Artlee", "Geunuk Na", "Wed, May 23, 2018", "Not important", "kite");
	Message messages[] = {msg1,msg2,msg3,msg4,msg5};
	System.out.println("Printing messages[] using print() method:");
	for (int i=0; i<5; i++){
	    messages[i].print();
	}
	System.out.println("Printing messages[] using toString() method:");
	for (int i=0; i<5; i++){
	    System.out.println(messages[i].toString());
	}
	System.out.println("Printing only important messages:");
	for (int i=0; i<5; i++){
	    if (messages[i].isImportant()){
		System.out.println(messages[i].toString());
	    }
	}
    }
    
}
