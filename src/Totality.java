
public class Totality {
	   public int sum(int[] a, String stype) {
			int osum=0;
			int esum=0;

		    for(int i =0; i< a.length; i++){
				if(i%2==0) {
					esum+=a[i];
				}
				else{
					osum+=a[i];
				}
				
			}
			if(stype.equals("odd")){
				return osum;

			}
			else if(stype.equals("even")){
				return esum;
			}
			return esum+osum;
	   }
	   
}
