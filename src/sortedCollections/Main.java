package sortedCollections;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);
        Basket timsBasket = new Basket("Tim");

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        if (sellItem(timsBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        temp = new StockItem("Chair", 62.00, 200);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 79.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 37);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 70);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.99, 40);
        stockList.addStock(temp);


        System.out.println(stockList);

        /*for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }*/


        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        sellItem(timsBasket, "Spanner", 5);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Juice", 3);
        sellItem(timsBasket, "Cup", 4);
        sellItem(timsBasket, "Bread", 2);

        System.out.println(stockList);

        /*temp = new StockItem("Pen", 1.12);
        stockList.Items().put(temp.getName(), temp);*/

        stockList.Items().get("Car").adjustStock(2000);
        stockList.get("Cup").adjustStock(-200);
        System.out.println(stockList);

        for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
