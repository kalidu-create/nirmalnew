public class ItemDao {

  public static Item getItem(String itemCode) {
    Item item = new Item();

    String codes[] = { "I001", "I002", "I003", "I004" };
    String names[] = { "Apple", "Yogurt", "Pencil", "Milk" };
    double prices[] = { 150.00, 60.00, 20.00, 875.00 };

    int i = 0;

    while (i < codes.length) {
      if (itemCode.equalsIgnoreCase(codes[i])) {
        item.setCode(codes[i]);
        item.setName(names[i]);
        item.setPrice(prices[i]);
      }
      i++;
    }
    return item;
  }
}
