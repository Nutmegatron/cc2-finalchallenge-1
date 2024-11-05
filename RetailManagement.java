public class RetailManagement {
    public static void main(String[] args) {
        // Product prices are stored in an array
        double[] productPrices = {100, 20, 35, 15, 250, 80, 40, 45, 28, 34};

        // Stock levels are stored in an array
        double[] stockLevels = {11, 200, 150, 300, 25, 30, 140, 80, 220, 57};

        // Initialize the total value of the products
        double totalValue = 0.0;

        // For loop to get the total value of the stocks
        for (int i = 0; i < stockLevels.length; i++) {
//            Total value is stock levels multiplied by the product prices
            totalValue += stockLevels[i] * productPrices[i];
        }

        // Output the total value of all items in stock
        System.out.println("The value for all the items in stock is: PHP " + totalValue);
    }
}
