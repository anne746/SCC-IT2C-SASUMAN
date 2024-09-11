package sasuman;

public class Product {
    int id;
    String name;
    double price;
    int stocks;
    int sold;

    public void addProduct(int id, String name, double price, int stocks, int sold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stocks = stocks;
        this.sold = sold;
    }

    public double getProfit() {
        return this.price * this.sold;
    }

    public double getTotalEstimatedPrice() {
        return this.price * this.stocks;
    }

    public void viewProduct() {
        double profit = getProfit();
        double totalEstimatedPrice = getTotalEstimatedPrice();
        String status = (this.stocks > 0) ? "Available" : "Out-of-Stocks";

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stocks: " + stocks);
        System.out.println("Sold: " + sold);
        System.out.printf("Profit: %.2f%n", profit);
        System.out.printf("Total Estimated Price: %.2f%n", totalEstimatedPrice);
        System.out.println("Status: " + status);
    }
}
