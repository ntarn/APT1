import java.util.Arrays;

public class SandwichBar {
	public int whichOrder(String[] available, String[] orders){
        for(int i =0; i<orders.length;i++) {
        	if(canMake(orders[i], available)) {
        		return i;
        	}
        	
        }
        return -1;
     }

	private boolean canMake(String sandwich, String[] available) {
		//String [] ingredients=sandwich.split(" ");
		for(String s: sandwich.split(" ")) {
		//for(int i =0; i<ingredients.length; i++) {
			/*if(!Arrays.asList(available).contains(ingredients[i])) {
				return false;
			}*/
			if(!isIn (s,available)) {
				return false;
			}
			
		}
		//for(String s: sandwich.split(" "))
		return true; //return true if each aprt of sandiwch in available and false otherwise
	}
	
	private boolean isIn(String s, String[] list) {
		for(String t: list) {
			if (t.equals(s)) {
				return true;
			}
		}
		return false;
	}
	

}
