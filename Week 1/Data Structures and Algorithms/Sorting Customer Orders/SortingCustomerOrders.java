import java.util.Arrays;

public class SortingCustomerOrders {

    static class Order {
        int orderId;
        String customerName;
        double totalPrice;

        public Order(int orderId, String customerName, double totalPrice) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.totalPrice = totalPrice;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId=" + orderId +
                    ", customerName='" + customerName + '\'' +
                    ", totalPrice=" + totalPrice +
                    '}';
        }
    }

    static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    // Swap
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Akash", 250.0),
            new Order(2, "Bala", 1200.0),
            new Order(3, "Charu", 450.0),
            new Order(4, "Dhivakar", 900.0)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        bubbleSort(bubbleSortedOrders);
        System.out.println("Orders Sorted by Bubble Sort:");
        printOrders(bubbleSortedOrders);

        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("Orders Sorted by Quick Sort:");
        printOrders(quickSortedOrders);
    }
}
