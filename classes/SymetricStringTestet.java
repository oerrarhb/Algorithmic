package classes;

public class SymetricStringTestet {

	public SymetricStringTestet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean test(String str)
	{
		String str_e = new String();
		String str_s = new String();
		String str_t = new String();
		if(str == null)
		{
			return false;
		}
		else
		{
			str_t = str.replaceAll(" ", "");
			
			for(int i=0,j=str_t.length() ; i< j ; i++,j--)
			{
				str_s = str_t.substring(i, i+1).toLowerCase();
				str_e = str_t.substring(j-1, j).toLowerCase();
				if(!(str_e.equals(str_s))) return false;
			}
			return true;
		}
	}
	

}
