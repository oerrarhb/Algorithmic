package testing;

import classes.Eratosthene;
import classes.Guesser;
import classes.Index;
import classes.Palindrome;
import classes.Point;
import classes.PowerOfStreams;
import classes.SymetricStringTestet;

public class Test {

	public static void main(String[] args) {
		
		//This is Othmane Branch
		// TODO Auto-generated method stub
/*		Eratosthene E = new Eratosthene();
		System.out.println(E.isPremier(4));
		E.cribler(89);
		System.out.println(E.getTableCrible());*/
		
/*		Guesser G = new Guesser();
		G.gess(88);
		System.out.println(G.getValue_guessed());*/
		
/*		Index I = new Index();
		I.ajouter("Java", 9);I.ajouter("Java", 10);I.ajouter("Java", 11);I.ajouter("Java", 12);
		I.ajouter("C++", 5);I.ajouter("C++", 6);I.ajouter("C++", 7);I.ajouter("C++", 8);
		I.ajouter("python", 1);I.ajouter("python", 2);I.ajouter("python", 3);I.ajouter("python", 4);
		I.ajouter("Javascript", 90);
		I.liste();*/
		
/*		
		Palindrome P = new Palindrome();
		System.out.println(P.isPalindromme("(()(())((())))"));*/
		
		
		
/*		SymetricStringTestet SMT = new SymetricStringTestet();
		System.out.println(SMT.test("Ra d a r"));*/
		
		
		Point[] tab_points = {new Point(5,4),new Point(-1,3), new Point(22,4),new Point(8,5),new Point(0,2),new Point(-5,4)};
		Integer[] tab_integer = {1,2,3,4,5,-1,-2,-9,4,4,4,4,4,-9};
		PowerOfStreams POS = new PowerOfStreams();
		String[] strings = {"NEWYORK","LOSANGELOS","TORONTO","PARIS","VANCOUVER","LONDRES","TORINO","PAU"};
		
		for(Point p : POS.positiveXPointsFilter(tab_points))
		{
			System.out.println(p.getX());
		}
		
		for(Point p : POS.streamOFPointCreation(tab_integer))
		{
			System.out.println(p.getX()+ " " +p.getY());
		}
		
		System.out.println(POS.stickStrings(strings));
		System.out.println(POS.organizeStreams(strings));
		
		System.out.println(POS.calculateOccurences(tab_integer));
		
		
		
		
	}

}
