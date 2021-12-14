import java.util.Scanner;

public class LineComparisionUC1 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt(); 
		int y1  = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
        System.out.println("Enter x1,y1 Co-ordinates:");

        System.out.println("Enter x2,y2 Co-ordinates:");

	
        double length = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        
        System.out.println("The line length is " + length);
		
		 
	

}
}
