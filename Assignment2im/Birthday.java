import javax.swing.JOptionPane;

public class Birthday {
	public static void main(String[] args) {
		String name, ans, agestr;
		int age;
		Toy p;
		
		do {
			JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");
			name = JOptionPane.showInputDialog("Enter the name of the child");/*This program display display the information 
 * of the toy and the cost (including the card and the balloon), and the total amount of the order.
 * Name :Anh Tu Pham 
 * Date : 02/25/2020
 * 
 */
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;

public class Birthday {
	public static void main(String[] args) {
		String toy, name, extra;
		int age;
		double cost = 0;
		double entireCost = 0;
		String ans, ans2;
		Toy p;
		String myName = "Anh Tu Pham";
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");// Display welcome message
		do {
			
			name = JOptionPane.showInputDialog("Enter the name of the child");// get the name of the child
			age = Integer.parseInt(JOptionPane.showInputDialog("How old is the child?"));// get age
			toy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book"); // get toy
			
			while (!toy.toLowerCase().equals("plushie") && !toy.toLowerCase().equals("blocks") && !toy.toLowerCase().equals("book"))
			{
				JOptionPane.showMessageDialog(null, "Invalid choice");
				toy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
			}
			p = new Toy(); 
			p.setAge(age); 
			p.setToy(toy);
			p.getToy();
			p.getAge();
			boolean ageok = p.ageOK(); // match toy and age
			if (ageok == true) {
				JOptionPane.showMessageDialog(null, "Good Choice");
			}
			else{
				ans2 = JOptionPane.showInputDialog("Toy is not age-appropriate\nDo you want to buy a different toy? yes or no");
				while (ans2.equals("no")) {
				break;
				}
				while (ans2.equals("yes")) {
					
					toy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
					while (!toy.toLowerCase().equals("plushie") && !toy.toLowerCase().equals("blocks") && !toy.toLowerCase().equals("book"))
					{
						JOptionPane.showMessageDialog(null, "Invalid choice");
						toy = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
					}
					p.setAge(age);
					p.setToy(toy);

					boolean ageok1 = p.ageOK();
					if (ageok1 == true) {
						JOptionPane.showMessageDialog(null, "Good Choice");
						break;
					}
					else{
						ans2 = JOptionPane.showInputDialog("Toy is not age-appropriate\nDo you want to buy a different toy? yes or no");
					}
				}
				
			}

			p = new Toy(toy, age);// toString is called automatically here
			p.setCost(toy);
			extra = JOptionPane.showInputDialog("Do you want a card with the gift? yes or no");
			p.addCard(extra);
			extra = JOptionPane.showInputDialog("Do you want a ballon with the gift? yes or no");
			p.addBalloon(extra);
			p.addCost(cost);
			double totalcost = p.getCost();
			JOptionPane.showMessageDialog(null, "The gift for " + name + " " + p);
			entireCost += totalcost; // add cost for each kid's toy
			ans = JOptionPane.showInputDialog("Do you want another toy? yes or no");
		} while(ans.equals("yes") );
		JOptionPane.showMessageDialog(null, "The total cost of your order is $"  + dollar.format(entireCost));
		Random r = new Random();// get random number from 1 - 100000
		int randomInt = r.nextInt(100000) + 1;
		JOptionPane.showMessageDialog(null, "Order number is " + randomInt + "\nProgramer: " + myName); // Display order and programmer name


}
	
}

			agestr = JOptionPane.showInputDialog("How old is the child");
			age = Integer.parseInt(agestr);
			JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
			p = new Toy();
		} while (ans.equals("y"));
}
}
