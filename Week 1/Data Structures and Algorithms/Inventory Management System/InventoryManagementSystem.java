import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {

    static class Product {
        int productId;
        String productName;
        int quantity;
        double price;

        Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public String toString() {
            return "ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: " + price + " rupees";
        }
    }

    static class Inventory {
        Map<Integer, Product> productMap = new HashMap<>();

        void addProduct(Product product) {
            if (productMap.containsKey(product.productId)) {
                System.out.println("Product already exists. Use update.");
            } else {
                productMap.put(product.productId, product);
                System.out.println("Product added.");
            }
        }

        void updateProduct(int id, String name, int quantity, double price) {
            if (productMap.containsKey(id)) {
                Product p = productMap.get(id);
                p.productName = name;
                p.quantity = quantity;
                p.price = price;
                System.out.println("Product updated.");
            } else {
                System.out.println("Product not found.");
            }
        }

        void deleteProduct(int id) {
            if (productMap.remove(id) != null) {
                System.out.println("Product deleted.");
            } else {
                System.out.println("Product not found.");
            }
        }

        void displayAllProducts() {
            if (productMap.isEmpty()) {
                System.out.println("Inventory is empty.");
            } else {
                for (Product p : productMap.values()) {
                    System.out.println(p);
                }
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 5, 75000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1000);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.displayAllProducts();

        inventory.updateProduct(102, "Wireless Mouse", 45, 800);
        inventory.deleteProduct(103);

        inventory.displayAllProducts();
    }
}
