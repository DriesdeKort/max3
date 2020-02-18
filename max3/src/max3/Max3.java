package max3;

public class Max3 {
	/**
	 * Returns the maximum of the giver numbers.
	 * 
	 * @post The result equals one of the given numbers.
	 * 		| result == i || result == j || result == k
	 * @post The result is not less than any of the given ...
	 * 		| i <= result && j <= result 
	 */

	public static int max3(int i, int j, int k) {
		// TODO Auto-generated method stub
		if (i <j) 
			if (j <k)
				return k;
			else 
				return j;
		else 
			if (i<k)
				return k;
			else
				return i;
	}
	

}
