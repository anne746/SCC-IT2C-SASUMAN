package sasuman;

import java.util.Scanner;

public class Products {
    Product[] products;
    int productCount;

    public Products(int size) {
        products = new Product[size];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Error: Product list is full.");
        }
    }

    public void inputProducts() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Stocks: ");
            int stocks = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();

            Product product = new Product();
            product.addProduct(id, name, price, stocks, sold);
            addProduct(product);
        }

        sc.close();
    }

    public void displayProducts() {
        if (productCount == 0) {
            System.out.println("No products available.");
        } else {
            for (int i = 0; i < productCount; i++) {
                products[i].viewProduct();
                System.out.println("--------------------------------------");
            }
        }
    }
}
