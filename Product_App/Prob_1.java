import java.util.*;
class Product {

    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;

        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }

        if (stockQuantity < 0) {
            this.stockQuantity = 0;
        } else {
            this.stockQuantity = stockQuantity;
        }
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            this.stockQuantity = 0;
        } else {
            this.stockQuantity = stockQuantity;
        }
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0) {
            price = price - (price * percentage / 100);
        }
    }
}
public class Prob_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String productId = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = sc.nextInt();

        Product p = new Product(productId, productName, price, stockQuantity);

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        p.applyDiscount(discount);

        System.out.println("\nProduct Details After Discount");
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());

        sc.close();
    }
}
