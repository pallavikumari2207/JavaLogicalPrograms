package singleNumber;

import java.util.Arrays;

public class XorApproach {
	public static void main(String [] args)
	{
		int [] array={1,2,3,3,1};
		System.out.println(singleNumber(array,array.length));
	}
	 static int singleNumber(int A[], int n) {
	        // Since XOR is associative and commutative, (1^1)^(3^3)^2
	        int res = 0;
	        for(int i = 0; i<n; ++i)
	            res ^= A[i]; // property A xor A = 0, 0 xor A = A, A xor B = B xor A;
	        return res;
	    }
}
