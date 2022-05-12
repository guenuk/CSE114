//Geunuk Na, geunuk.na@stonybrook.edu
public class Arith {

    public static void main(String[] args) {
        System.out.println(add1(1));
        System.out.println(sub1(1));
        System.out.println("17: " + add(4, 13));
        System.out.println("-7: " + add(-15,8)); 
        System.out.println("-9: " + sub(4, 13));
        System.out.println("-10: " + sub(-15,-5));
        System.out.println("52: " + mul(13, 4));
	System.out.println("-32: " + mul(-4, 8));
        System.out.println("4: " + quo(53, 13)); 
	System.out.println("2: " + quo(11, 5)); 
    }

    public static int add1(int n) {
        return n + 1;
    }

    public static int sub1(int n) {
        return n - 1;
    }

    public static int add(int n, int m) {

    	if(m==0) {
    		return n;
    	}
	else if(m<0){
	    return add(sub1(n),add1(m));
	}
	else{
	    return add(add1(n),sub1(m));
	}
    }

    public static int sub(int n, int m) {

	    if(m==0) {
	    	return n;
	    }
	    else if (m<0){
	    	return sub(add1(n),add1(m));
	    }
	    else {
	    	return sub(sub1(n),sub1(m));
	    }
    }
    
    public static int mul(int n, int m) {

    	if(m==1) {
    		return n;
    	}
    	else {
	    return add(n,mul(n,m-1));
	}
    }
    
    
    public static int quo(int n, int m) {

	if(n<m){
	    return 0;
	}
	else{
	    return add(1,quo(sub(n,m),m));
	}
    }
    

}
