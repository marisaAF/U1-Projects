import javax.swing.JOptionPane;
public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    public static void main(String[] args) {
        String inputString;
        double Price;
        int Quantity;
        double TAX = 7.0; //0.07
        double TAXRATE = TAX/100.0;
        double finalPrice;
        double subTotal;
        double Discount;

    inputString = JOptionPane.showInputDialog(" What is the regular price for this item?");
    Price = Double.parseDouble(inputString);

    inputString = JOptionPane.showInputDialog(" How many of this item did you bye? ");
    Quantity = Integer.parseInt(inputString);

    inputString = JOptionPane.showInputDialog(" What is the TAXRATE of this item? ");
    TAXRATE = Double.parseDouble(inputString);

    inputString = JOptionPane.showInputDialog(" What is the sales tax of this item? ");
    TAX = Double.parseDouble(inputString);

    inputString = JOptionPane.showInputDialog(" What is the discount of this item? ");
    Discount = Double.parseDouble(inputString);

    subTotal = Price * Quantity + Discount;
    double tax = subTotal * TAXRATE;
    finalPrice = subTotal * (1 + TAXRATE);

    JOptionPane.showMessageDialog(null, " Your final price is $ " + finalPrice);

    System.exit(0);
    }
}