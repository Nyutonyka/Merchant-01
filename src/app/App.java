package app;

public class App {

    static String productName;
    static int quantity;
    static double price;
    static ProductA product;
    static String infoProduct;

    public static void main(String[] args) {
        initVars();
        processData();
    }

    private static void initVars() {
        productName = "апельсины";
        quantity = 1000;
        price = 19.99;
    }

    private static void processData() {
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
    }
}
