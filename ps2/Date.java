//Geunuk Na, Geunuk.na@stonybrook.edu
public class Date {
    
    public static String alphaToNum (String m, int d, int y) {
        return (month(m) + "/" +  d + "/" +  y); 
    }
    
    public static int month(String m) {
	if (m == "January"){
	    return 1;
	}
	else if (m == "Febuary"){
	    return 2;
        }
	else if (m == "March"){
	    return 3;
	}
	else if (m == "April"){
	    return 4;
	}
	else if (m == "May"){
	    return 5;
	}
	else if (m == "June"){
	    return 6;
	}
	else if (m == "July"){
	    return 7;
	}
	else if (m == "August"){
	    return 8;
	}
	else if (m == "September"){
	    return 9;
	}
	else if (m == "October"){
	    return 10;
	}
	else if (m == "November"){
	    return 11;
	}
	else if (m == "December"){
	    return 12;
	}
	return -1;
    }
    
    public static void main(String[] args) {
	System.out.print("alphaToNum(\"March\",14, 2019) should be 3/14/2019");
	System.out.println(" : " + alphaToNum("March", 14, 2019));
	System.out.print("alpahToNum(\"January\",26, 1998) should be 1/26/1998");
	System.out.println(" : " + alphaToNum("January", 26, 1998));
	System.out.print("alphaToNum(\"August\", 13, 2007) should be 8/13/2007");
	System.out.println(" : " + alphaToNum("August" , 13, 2007));
    }
}
