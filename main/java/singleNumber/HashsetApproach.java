package singleNumber;

import java.util.Arrays;
import java.util.HashMap;

public class HashsetApproach {
	public static void main(String [] args)
		{  int [] array={1,2,2,3,1};
		   Arrays.sort(array);
		   HashMap<Integer,Integer> count= new HashMap<>();
		for(int i=0;i<array.length;i++)
		{
			count.putIfAbsent(array[i], 0);
			count.put(array[i],count.get(array[i])+1);
		}
		count.forEach((k,v)->{
			if(v==1)
				System.out.println(k );
		});
			
		}

}
