//Geunuk Na, geunuk.na@stonybrook.edu
public class Unique {

    public static void main(String[] args) {
        int[] ints1 = {8, 4, 2, 6, 3, 7, 5, 8, 9, 15};
        int[] ints2 = {8, 4, 2, 6, 3, 7, 5, 9, 15};
        System.out.println("true: " + occurs(8, ints1, 1));
        System.out.println("false: " + occurs(8, ints2, 1));
        System.out.println("false: " + unique(ints1));
        System.out.println("true: " + unique(ints2));
    }

    public static boolean occurs(int x, int[] nums, int i) {
    	if(i==nums.length) {
    		return false;
    	}
    	else {
    		if(x==nums[i]) {
    			return true;
    		}
    		else {
    			return occurs(x,nums,i+1);
    		}
    	}
    }

    public static boolean unique(int[] nums) {
    	return auxUnique(nums,0);
    }
    
    public static boolean auxUnique(int[] nums, int i) {
    	if(i==nums.length){
    		return true;
    	}
    	else if(occurs(nums[i],nums,i+1)) {
    		return false;
    	}
    	else {
    		return auxUnique(nums, i+1);
    	}
    }
}
