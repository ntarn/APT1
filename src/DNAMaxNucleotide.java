
public class DNAMaxNucleotide {
	  public String max(String[] strands, String nuc) {
		 int[] nucCount = new int[50];
		 int i=0;
		 int max = nucCount[0];
    	 int maxIndex=0;
         for(i=0; i<strands.length; i++) {
        	 for(int j=0; j<strands[i].length();j++) {
        		 if((strands[i].substring(j,j+1)).equals(nuc)) {
        			 nucCount[i]++;
        		 }
        	 }
        	 if(nucCount[i]==max&&nucCount[i]!=0) {
        		 if(strands[i].length()>strands[maxIndex].length()) {
        			 max=nucCount[i];
        			 maxIndex=i;
        		 }
        	 }
        	 else if (nucCount[i]>max) {
        		 max=nucCount[i];
    			 maxIndex=i;
        	 }
         }
         if(max==0) {
        	 return "";
         }
       
         return strands[maxIndex];
       
    }
	
}
