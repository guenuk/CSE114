/* CSE 114
 * Geunuk Na, geunuk.na@stonybrook.edu
 */

public class UseIpad {

    public static void main (String[] args) {

        Ipad ip1 = new Ipad("Jim", 629, 9.7, 16, true, "pro");
        ip1.installApp();
        ip1.installApp();
	Ipad.add(ip1);

        Ipad ip2 = new Ipad("Amy", 599, 9.7, 32, false, "air");
        ip2.installApp();
        ip2.installApp();
        ip2.installApp();
	Ipad.add(ip2);

        Ipad ip3 = new Ipad("Art", 829, 9.7, 64, true, "pro");
        ip3.installApp();
	Ipad.add(ip3);

        Ipad ip4 = new Ipad("Ken", 599, 9.7, 32, false, "air");
        ip4.installApp();
        ip4.installApp();
        ip4.installApp();
        ip4.installApp();
	Ipad.add(ip4); 

        Ipad ip5 = new Ipad("Jan", 829, 9.7, 64, true, "pro");
        ip5.installApp();
	Ipad.add(ip5); 

        Ipad.print("All Ipads:");
        System.out.println("The total number of apps: " +
                           Ipad.getTotalNumberOfApps());

        Ipad.remove(ip3);
        Ipad.print("All Ipads:");
        System.out.println("The total number of apps: " +
                           Ipad.getTotalNumberOfApps());

        Ipad.remove(ip1);
        Ipad.print("All Ipads:");
        System.out.println("The total number of apps: " +
                           Ipad.getTotalNumberOfApps());

        Ipad.remove(ip5);
        Ipad.print("All Ipads:");
        System.out.println("The total number of apps: " +
                           Ipad.getTotalNumberOfApps());
	/*System.out.println(ip4.equals(ip5)); // test
	  System.out.println(ip4.name);*/
    }
}
