package Assignment;

import java.util.HashMap;

public class Ass_70_HashMapContainKeyValue 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(1, "ghanu");
		h.put(2, "s.nagar");
		h.put(3, "vd");
		h.put(4, "ranmalpur");
		
		System.out.println("Element Of HashMap : "+h);
		
		System.out.println("Is Key 2 Is Present ? : "+h.containsKey(2));
		
		System.out.println("");
		
		System.out.println("Is Key 3 Is Present ? : "+h.containsKey(3));
		
		System.out.println("");
		
		System.out.println("Is Key 5 Is Present ? : "+h.containsKey(5));
	}
}
