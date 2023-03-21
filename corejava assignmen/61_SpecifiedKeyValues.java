package Assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Ass_61_SpecifiedKeyValues 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put(1, "Ghanu");
		h.put(2, "mota ankevaliya");
		h.put(3, "vd");
		h.put(4, "ramalpur");
		
		Set s1=h.entrySet();
		Iterator i=s1.iterator();
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry) i.next();
			System.out.println("Key Is : "+m.getKey());
			System.out.println("Value Is : "+m.getValue());
		}
		
		
	}
}
