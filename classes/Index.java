package classes;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Index {

	private Map<String,Set<Integer>> listeIndex;
	
	public Index() 
	{
		listeIndex = new TreeMap<String, Set<Integer>>();
		
	}
	
	
	public void ajouter(String entry , int page_num)
	{
		
		Set<Integer> numerosExistants = listeIndex.get(entry);
		if(numerosExistants!=null)
		{
			numerosExistants.add(page_num);
			listeIndex.put(entry, numerosExistants);
		}
		else
		{
			Set<Integer> numerosNonExistants = new HashSet<Integer>();
			numerosNonExistants.add(page_num);
			listeIndex.put(entry, numerosNonExistants);
		}
		
		
	}
	public void liste()
	{
		for(String str : listeIndex.keySet())
		{
			System.out.println("***************************** " + str + "*******************************************************");
			for(Integer n : listeIndex.get(str))
			{
				System.out.print( n + " ");
			}
			System.out.println("*************************************************************************************************");
		}
	}

}
