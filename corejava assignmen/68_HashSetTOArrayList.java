package Assignment;

import java.util.HashSet;

public class Ass_68_HashSetTOArrayList 
{
	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<String>();
		h.add("Ghanu");
		h.add("vd");
		h.add("Yash");
		h.add("Tarun");
		h.add("vidhi");
		h.add("angel");
		h.add("Nimish");
		
		System.out.println("HashSet  Is : "+h);
		System.out.println("");
		
		String a2[]=new String[h.size()];
		h.toArray(a2);
		
		System.out.println("Array Elements Are : ");
		System.out.println("");
		
		for(String a:a2)
		{
			System.out.println(a);
		}
		
	}
}
