
public class CirclesCountry {
	
	public int leastBorders(int[] x, int[] y, int[] r,  int x1, int y1, int x2, int y2) {
		int crosses = 0;
		for(Circle c : input parameters){
			if (isInside(x1,y1,c) && ! isInside(x2,y2,c) {
				crosses += 1;
			}
			if (!isInside(x1,y1,c) &&  isInside(x2,y2,c) {
				crosses += 1;
			}
		}
		return crosses;

			return 0;
		}// can only hit a border if x2,y2 is inside a border
	//if its between circlex+-radius and circley+-radius
	
	/**
	 * Returns true if a point is inside a circle and 
	 * returns false otherwise.
	 * @param x is x-coordinate of point
	 * @param y is y-coordinate of point
	 * @param cx is center of circle x-coordinate
	 * @param cy is center of circle y-coordinate
	 * @param r is radius of circle
	 * @return true if (x,y) is inside circle, returns
	 * false if (x,y) is on or outside circle
	 */
	public boolean isInside(int x, int y, int cx, int cy, int r){
		double dist=Math.pow(x-cx, 2)+Math.pow(y-cx, 2);
		return dist < r*r;
	}

}
