import javax.swing.*;

public class Prog611 {
	public static void main (String[] args)
	{
		String name = JOptionPane.showInputDialog("Your name please?");
		String input = JOptionPane.showInputDialog("what age are you?");
		int age = Integer.parseInt(input);
		
		System.out.print("Hello " + name + " .\n");
		System.out.println("Next year you will be " + (age+1));
		
		System.exit(0);
	}

}
