import javax.swing.JOptionPane;

public class InvoiceApp1 {

    public static void main(String[] args) {


        String opcode = JOptionPane.showInputDialog(null, "1-New Customer \n 2-Exit") ;
        int op1 = Integer.parseInt( opcode);
        if(op1==2) System.exit(1);
        
        String codes[] = { "I001", "I002", "I003", "I004" };
        String names[] = { "Apple", "Yogurt", "Pencil", "Milk" };
        double prices[] = { 150.00, 60.00, 20.00, 875.00 };

        String cuscodes[] = { "C2121", "C2222", "C2323", "C2424", };
        String cusnames[] = { "Nimal", "Kamal", "Seetha", "Amali" };
        double cusdiscounts[] = { 20.00, 15.00, 30.00, 25.00 };

        String itmcode;
        String itmname;
        double price;

        int quantity;
        double linetotal;
        double grandtotal;

        String custmcode;
        String cusName;
        double cusDiscount;

        custmcode = JOptionPane.showInputDialog(null, "Enter Customer Code");

        int c = 0;

        while (c < cuscodes.length) {
            if (custmcode.equalsIgnoreCase(cuscodes[c]))break;
            c++;
        }

        cusName = cusnames[c];
        cusDiscount = cusdiscounts[c];

        JOptionPane.showMessageDialog(null, "Welcome : " + cusName + "\n\n" + "You have Discount per Item : Rs. " + cusDiscount);
                
        itmcode = JOptionPane.showInputDialog(null, "Enter Item Code");

        int i = 0;

        while (i < codes.length) {
            if (itmcode.equalsIgnoreCase(codes[i]))
                break;
            i++;
        }

        itmname = names[i];
        price = prices[i];

        String qty = JOptionPane.showInputDialog(null, "Item : " + itmname + "\n\n" + "Enter Quantity");
        quantity = Integer.parseInt(qty);

        linetotal = (price * quantity) - (quantity * cusDiscount);
        grandtotal = linetotal;

        String output = itmname + "    " + price + "    " + quantity + "    " + linetotal;

        output = output + "\n\nGrand Total :  " + grandtotal;

        JOptionPane.showMessageDialog(null, output);
        JOptionPane.showMessageDialog(null, "Good Bye and Come Again" + "\n\n" + "Have a nice day...!");
    }

}

