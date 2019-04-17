package classes;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Eratosthene {
	private ArrayList<Integer> TableCrible;

	public Eratosthene() {
		TableCrible = new ArrayList<Integer>();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public ArrayList<Integer> getTableCrible() {
		return TableCrible;
	}

	


	public void setTableCrible(ArrayList<Integer> tableCrible) {
		TableCrible = tableCrible;
	}

	public boolean isPremier(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)if(n%i == 0)return false;
		return true;
		
	}


	public void cribler(int n)
	{
		if(n<=1) System.out.println("Impossible de cribler");
		else
		{
			for(int i=2;i<n;i++)
			{
				if(isPremier(i)) 
					{
					TableCrible.add(i);
					}
			}
		}

	}

}
