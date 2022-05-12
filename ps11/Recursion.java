//Geunuk Na, geunuk.na@stonybrook.edu
public class Recursion {

    public static void main (String[] args) {
        System.out.println("power(3, 0) = " + power(3, 0));
        System.out.println("power(2, 5) = " + power(2, 5));
        System.out.println("power(3, 4) = " + power(3, 4));

        System.out.println("gcd(36, 20) = " + gcd(36, 20));
        System.out.println("gcd(34, 0) = " + gcd(34, 0));
        System.out.println("gcd(3346, 468) = " + gcd(3346, 468));

        System.out.println("fib(0) = " + fib(0));
        System.out.println("fib(1) = " + fib(1));
        System.out.println("fib(2) = " + fib(2));
        System.out.println("fib(3) = " + fib(3));
        System.out.println("fib(4) = " + fib(4));
        System.out.println("fib(10) = " + fib(10));


        System.out.println("f(2) = " + f(2));
        System.out.println("f(3) = " + f(3));
        System.out.println("f(10) = " + f(10));

        printBackward("Java Fun!");
        System.out.println("before printString");
        printString("Java Fun!");
        System.out.println("after printString");
        String reversed = reverseString("Java Fun!");
        System.out.println(reversed);
    }
    public static double power (double x, int n) {
    	if(n==0) {
    		return 1;
    	}
    	else {
    		return x * power(x,n-1);
    	}
    }
    
    public static int gcd (int a, int b) {
    	if(b==0) {
    		return a;
    	}
    	else {
    		return gcd(b,a%b);
    	}
    }
    public static int f(int n) {
    	if(n<3) {
    		return n;
    	}
    	else {
    		return f(n-1)+2*f(n-2)+3*f(n-3);
    	}
    }
    public static int fib(int n) {
    	if(n==0) {
    		return 0;
    	}
    	else if(n==1) {
    		return 1;
    	}
    	else {
    		return fib(n-1)+fib(n-2);
    	}
    }
    public static void printBackward(String s) {
	   if(s.length()==1) {
		  System.out.println(s.charAt(0));
	   }
	   else {
		   System.out.println(s.charAt(s.length()-1));
		   s = s.substring(0,s.length()-1);
		   printBackward(s);
	   }
   }
   public static void printString(String s) {
	   if(s.length()==1) {
		   System.out.println(s.charAt(0));
	   }
	   else {
		   System.out.println(s.charAt(0));
		   s = s.substring(1);
		   printString(s);
	   }
   }
   public static String reverseString(String s) {
	  String newString = "";
	  if (s.length()==1){
		  return s.substring(0,1);
	  }
	  else {
		  newString += s.charAt(s.length()-1);
		  s=s.substring(0,s.length()-1);
		  return newString+reverseString(s);
	  }
   }
}
