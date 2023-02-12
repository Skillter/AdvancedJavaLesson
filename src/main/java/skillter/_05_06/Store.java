package skillter._05_06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {

    // Make this method a synchronized method
    static synchronized void purchase(StockChecker stockChecker, int amount) {
        int stock = stockChecker.getStock();
        if(stock - amount < 0) {
            System.out.println("Out of stock");
        } else {
            System.out.println("Item is in stock");
            stockChecker.updateStock(amount);
            System.out.println(amount + " items purchased");
        }
        System.out.println("Current stock: " + stockChecker.getStock());
    }

    public static void main(String[] args) {

        // Create a new StockChecker object.
        StockChecker stockChecker = new StockChecker();
        // Create an ExecutorService with a fixed thread pool of 4 threads
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // Submit 4 tasks to the executor service.
        for (int i = 0; i < 4; i++) {
            executorService.submit(() -> {
                purchase(stockChecker, 20);
            });
        }
        // In each task you should call the purchase method and pass in 20,
        // to represent a customer purchasing 20 items.
        executorService.shutdown();
        // Shut down the executor service.

    }

}
