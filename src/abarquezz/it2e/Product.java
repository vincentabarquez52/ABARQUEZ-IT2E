
package abarquezz.it2e;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Products: ");
        int numProducts = scanner.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= numProducts; i++) {
            System.out.println("Enter details of product " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Category: ");
            String category = scanner.next();
            System.out.print("Stock Quantity: ");
            int stockQuantity = scanner.nextInt();
            System.out.print("Price per unit: ");
            double pricePerUnit = scanner.nextDouble();

            Product product = new Product(id, name, category, stockQuantity, pricePerUnit);
            products.add(product);
        }

        // Display products in a tabular format
        System.out.println("Product ID\tProduct Name\tCategory\tStock Quantity\tPrice per Unit");
        for (Product product : products) {
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getCategory() + "\t" + product.getStockQuantity() + "\t" + product.getPricePerUnit());
        }

        // Perform operations on products
        while (true) {
            System.out.println("Enter operation to perform:");
            System.out.println("1. Update stock quantity");
            System.out.println("2. Display products by category");
            System.out.println("3. Exit");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter product ID to update stock quantity: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new stock quantity: ");
                    int newStockQuantity = scanner.nextInt();

                    for (Product product : products) {
                        if (product.getId() == updateId) {
                            product.setStockQuantity(newStockQuantity);
                            System.out.println("Stock quantity updated successfully!");
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.print("Enter category to display products: ");
                    String categoryToDisplay = scanner.next();

                    System.out.println("Product ID\tProduct Name\tCategory\tStock Quantity\tPrice per Unit");
                    for (Product product : products) {
                        if (product.getCategory().equals(categoryToDisplay)) {
                            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getCategory() + "\t" + product.getStockQuantity() + "\t" + product.getPricePerUnit());
                        }
                    }

                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }
    }
}
    

