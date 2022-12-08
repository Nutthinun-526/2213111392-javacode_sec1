package week2;

import java.text.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class MusicWorldApp {

	public static void main(String[] args) {

		//String cdId;
		//String cdTitle;
		//int cdQuantity;
		//double cdPrice;
		final double TAX_RATE = .0625;	
		
		DecimalFormat frmId = new DecimalFormat("0.00");
		//NumberFormat f1 = NumberFormat.getCurrencyInstance();
				
		String cdId = JOptionPane.showInputDialog(null,
				"This progarm calculates the total cost of a CD order"
				+ "\nPlease enter the ID of the CD");

		String cdTitle = JOptionPane.showInputDialog(null,
				"Please enter the title of the CD");

		String cdPrice = JOptionPane.showInputDialog(null,
				"Please enter the price of the CD in U.S. dollars");
		double price = Double.parseDouble(cdPrice);

		String cdQuantity = JOptionPane.showInputDialog(null,
				"Please enter the quantity to be purchased");
		double quantity = Double.parseDouble(cdPrice);
		
	
		double cdSubtotal = (price*quantity);
		double cdTotal = cdSubtotal*(1+TAX_RATE);

		
		JOptionPane.showMessageDialog(null,"Summary of the transaction:"
				+ "\n\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCD Unit Price: "+frmId.format(cdPrice)+""
						+ "\nCD Quantity: "+cdQuantity+"\n\nSubtotal: "+frmId.format(cdSubtotal)+"\nTax rate: "
						+TAX_RATE*100+"%\nTotal: "+frmId.format(cdTotal)+"\n\nEnd of Program");
	}

}
