import javax.swing.JOptionPane;

public class InvoiceApp5 {

    public static void main(String[] args) {

        while (true) {

            int op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1-New Customer \n 2-Exit"));
            if (op1 == 2)
                break;

            String itmcode;
            String itemname;
            double price;

            int quantity;
            double linetotal = 0.0;
            double grandtotal = 0.0;

            String custmcode;
            String cusName;
            double cusDiscount;

            custmcode = JOptionPane.showInputDialog(null, "Enter Customer Code");

            Customer customer = CustomerDao.getCustomer(custmcode);
            cusName = customer.getName();
            cusDiscount = customer.getDiscount();

            JOptionPane.showMessageDialog(null,
                    "Welcome : " + cusName + "\n\n" + "You have Discount per Item : Rs. " + cusDiscount);

            String output = "";

            while (true) {

                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1-New Item \n 2-Finish \n 3-Exit"));
                if (op == 2)
                    break;
                if (op == 3)
                    System.exit(0);

                itmcode = JOptionPane.showInputDialog(null, "Enter Item Code");

                Item item = ItemDao.getItem(itmcode);
                itemname = item.getName();
                price = item.getPrice();

                String qty = JOptionPane.showInputDialog(null, "Item : " + itemname + "\n\n" + "Enter Quantity");

                quantity = Integer.parseInt(qty);

                linetotal = (linetotal + price * quantity) - (quantity * cusDiscount);
                grandtotal = linetotal;

                output = itemname + "    " + price + "    " + linetotal;

            }
            output = output + "\n\nGrand Total : " + grandtotal;

            JOptionPane.showMessageDialog(null, output);
            JOptionPane.showMessageDialog(null, "Good Bye and Come Again" + "\n\n" + "Have a Nice Day..!");

        }

    }

}