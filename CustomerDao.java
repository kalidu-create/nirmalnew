public class CustomerDao {

  public static Customer getCustomer(String CustmCode) {
    Customer customer = new Customer();

    String cusCodes[] = { "C2121", "C2222", "C2323", "C2424" };
    String cusNames[] = { "Nimal", "Kamal", "Seetha", "Amali" };
    double cusDiscounts[] = { 20.00, 15.00, 30.00, 25.00 };

    int c = 0;

    while (c < cusCodes.length) {
      if (CustmCode.equalsIgnoreCase(cusCodes[c])) {
        customer.setCode(cusCodes[c]);
        customer.setName(cusNames[c]);
        customer.setDiscount(cusDiscounts[c]);
      }
      c++;
    }
    return customer;
  }
}
