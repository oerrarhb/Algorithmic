package classes;

public class Palindrome {
	private int count_s;
	private int count_e;
	
	public Palindrome() {
		count_e = 0; count_s = 0;
	}
	
	public void count_e_s(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '(') ++count_s;
			else ++count_e;
		}
	}

	public boolean isPalindromme(String str)
	{

		if(str == null) return false;
		else
		{
			String str_t = str.replaceAll(" ", "");
		
			
			if((str_t.charAt(0) == ')' ) || (str_t.charAt(str_t.length()-1) == '(')) return false;
			else
			{
				count_e_s(str_t);
				if(count_e != count_s) return false;
				else
				{
					count_e = 0; count_s =0;
					for(int i=0;i<str_t.length();i++)
					{
						if(str_t.charAt(i) == '(') ++count_s;
						else ++count_e;
						if(count_e > count_s) return false;
						
					}
					
				}
				return true;
			}
		}
	}

}
