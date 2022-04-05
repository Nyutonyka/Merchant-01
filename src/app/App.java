package app;

public class App {

    static String productName;
    static int quantity;
    static double price;
    static String merchantName;
    static String email;
    static String phone;
    static ProductA product;
    static String infoProduct;
    static String roundBonus;
    static MerchantA merchantA;
    static String infoMerchant;

    public static void main(String[] args) {
        initVars();
        processData();
    }

    private static void initVars() {
        merchantName = "Роберт";
        email = "bob@mail.com";
        phone = "055 123-4567";
        productName = "апельсины";
        quantity = 1000;
        price = 19.99;
    }

    private static void processData() {
        merchantA = new MerchantA(merchantName, phone, email);
        infoMerchant = merchantA.infoMerchant();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(merchantA.calcBonus(sales));
    }
}
