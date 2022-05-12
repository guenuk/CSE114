/* CSE 114
 * Geunuk Na, Geunuk.na@stonybrook.edu
 *
 * Use this UseMailbox.java when you test your program.
 *
 * I am also providing the output that was produced by my sample solution.
 */

public class UseMailbox{

    public static void main(String[] args){
        
        Mailbox jims = new Mailbox("Jim's MBox");

        // I am using simple values for readability...
        //
        // Also note that I am passing jims (a Mailbox object) to the
        // constructor of Message so that each new message that gets created
        // can get a unique id from Mailbox object, jims in this case.
        //
        Message jm0 = new Message("f0", "t0", "11/0", "s0",2, "b0", jims);
        Message jm1 = new Message("f1", "t1", "11/1", "s1",2, "b1", jims);
        Message jm2 = new Message("f2", "t2", "11/2", "s2",2, "b2", jims);
        Message jm3 = new Message("f3", "t3", "11/3", "s3",2, "b3", jims);
        Message jm4 = new Message("f4", "t4", "11/4", "s4",2, "b4", jims);
        Message jm5 = new Message("f5", "t5", "11/5", "s5",2, "b5", jims);
        Message jm6 = new Message("f6", "t6", "11/6", "s6",2, "b6", jims);

        jims.receive(jm0);
        jims.receive(jm1);
        jims.receive(jm2);
        jims.receive(jm3);
        jims.receive(jm4);
        jims.receive(jm5);
        System.out.println("1.Jim's MBox: \n" + jims);

	jims.delete(jm3);
	jims.delete(jm5);
	jims.delete(jm0);
	jims.delete(jm6);
	System.out.println("2.Jim's MBox: \n" + jims);

        jims.undelete();
        System.out.println("3.Jim's MBox: \n" + jims);

        jims.undelete();

        System.out.println("Id 1 is in " + jims.searchMessage(1));
        System.out.println("Id 5 is in " + jims.searchMessage(5));
        System.out.println("Id 7 is in " + jims.searchMessage(7));
       
        Mailbox kays = new Mailbox("Kay's MBox");

        Message km0 = new Message("f0", "t0", "11/0", "s0",2, "b0", kays);
        Message km1 = new Message("f1", "t1", "11/1", "s1",2, "b1", kays);
        Message km2 = new Message("f2", "t2", "11/2", "s2",2, "b2", kays);
        Message km3 = new Message("f3", "t3", "11/3", "s3",2, "b3", kays);

        Message km4 = new Message("f4", "t4", "11/4", "s4",2, "b4", kays);
        Message km5 = new Message("f5", "t5", "11/5", "s5",2, "b5", kays);

        kays.receive(km0);
        kays.receive(km2);
        kays.receive(km5);
        kays.receive(km4);
        kays.receive(km1);
        kays.receive(km3);
        System.out.println("4.Kay's MBox: \n" + kays);

        kays.delete(km4);
        kays.delete(km0);
        kays.delete(km3);
        System.out.println("5.Kay's MBox: \n" + kays);
    
        kays.undelete();
        System.out.println("6.Kay's MBox: \n" + kays);

        kays.undelete();

        System.out.println("Id 5 is in " + kays.searchMessage(5));
        System.out.println("Id 4 is in " + kays.searchMessage(4));
        System.out.println("Id 8 is in " + kays.searchMessage(8));
    }
}
            
            
