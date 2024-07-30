public class QuickSort {
    public static void quickSort(order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        order[] orders = {
                new order(1, "Alice", 250),
                new order(2, "Bob", 150),
                new order(3, "Charlie", 350),
                new order(4, "David", 200)
        };

        System.out.println("Before Sorting:");
        for (order order : orders) {
            System.out.println(order);
        }

        quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Sorting:");
        for (order order : orders) {
            System.out.println(order);
        }
    }
}
