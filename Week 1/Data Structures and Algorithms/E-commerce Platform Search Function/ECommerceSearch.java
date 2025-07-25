import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return "Product{" +
                   "ID=" + productId +
                   ", Name='" + productName + '\'' +
                   ", Category='" + category + '\'' +
                   '}';
        }
    }

    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.productId == productId) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int productId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == productId) {
                return products[mid];
            } else if (products[mid].productId < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Phone", "Electronics"),
            new Product(205, "Shoes", "Footwear"),
            new Product(303, "Shirt", "Clothing"),
            new Product(109, "Watch", "Accessories")
        };

        System.out.println("Linear Search for product ID 205:");
        Product foundLinear = linearSearch(products, 205);
        System.out.println(foundLinear != null ? foundLinear : "Product not found.");

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        System.out.println("\nBinary Search for product ID 205:");
        Product foundBinary = binarySearch(products, 205);
        System.out.println(foundBinary != null ? foundBinary : "Product not found.");
    }
}
