import javax.swing.JOptionPane;

import edu.nvcc.csc130.math.*;
public class AreaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] score = {92.5, 98.2, 99.0};
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		String list [] = {"Circle", "Rectangle", "Triangle"};
		String option = (String)JOptionPane.showInputDialog(null,"Enter your choice to find an area", "Find Area",  JOptionPane.PLAIN_MESSAGE, null, list, "Circle");
		
		switch (option) {
		case "Circle":
			System.out.println(Area.circle(2));
			break;
		case "Rectangle":
			System.out.println(Area.rectangle(2, 4));
			break;
		case "Triangle":
			System.out.println(Area.triangle(2,5));
			break;
		default:
			System.out.println("Invalid option");
		}
		/*;
		System.out.println(Area.rectangle(2, 2));
		System.out.println(Area.triangle(2,3));
*/
	}

}
