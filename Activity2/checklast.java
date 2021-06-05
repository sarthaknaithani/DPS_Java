import java.util.Scanner;

public class checklast {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
    String p1 = scan.nextLine();
    
    String p2 = scan.nextLine();
    
    String [] ps = p1.split(" ");
    String [] ps1 = p2.split(" ");
    if(ps[1].equals(ps1[1]))
    {
    	System.out.println("YES");
    }
    else
    {
    	System.out.println("NO");
    }
}
}
