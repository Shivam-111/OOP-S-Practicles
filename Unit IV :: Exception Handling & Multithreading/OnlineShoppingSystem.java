// 19.	Online Shopping System
// Create a class OnlineShoppingSystem. Create threads for payment and order processing.
// Output: 'Processing payment...' and 'Order confirmed...'
// // 


class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Thread for payment processing
        Thread paymentThread = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        // Thread for order processing
        Thread orderThread = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        // Start both threads
        paymentThread.start();
        orderThread.start();
    }
}