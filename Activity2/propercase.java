import java.util.Scanner;

public class propercase{

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String stringF = scan.nextLine();
	    String stringS = scan.nextLine();
	    String stringF1="";
	   for (int i=0;i< stringF.length();i++)
	    {
	      char ch = stringF.charAt(i);
	      if (i == 0)
	      {
	      stringF1 = stringF1 + (Character.toUpperCase(ch));
	      }
	      else
	      {
	      stringF1 = stringF1 + (Character.toLowerCase(ch)) ;
	      } 
	    }  
	   
	   stringS = stringS.toUpperCase(); 
	   
	   System.out.println(stringF1 +" " + stringS);
}
}
