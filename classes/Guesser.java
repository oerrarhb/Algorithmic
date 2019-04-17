package classes;

public class Guesser {
	private int value_guessed;
	public Guesser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getValue_guessed() {
		return value_guessed;
	}


	public void setValue_guessed(int value_guessed) {
		this.value_guessed = value_guessed;
	}


	public void gess(int value)
	{
		System.out.println("Start Guessing");
		int ie = 10000;
		int is = 0;
		int im =0;
		boolean find = false;
		while(!(find) && ((ie - is > 1)))
		{
			System.out.println("Guessing ........" + im);
			im = (ie+is)/2;
			if(im > value) ie = im;
			else if(im< value) is = im;
			else 
				{
				System.out.println("Number Found : " + im);
				find = true;
				}
		}
		if(find)
			{
				System.out.println("It's found");
				value_guessed = im;
			}
	}
	
	
	
	
	

}
