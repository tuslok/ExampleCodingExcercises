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

        temp = new StockItem("Car", 12.50, 1);
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


        //System.out.println(stockList);

        /*for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }*/


        sellItem(timsBasket, "Car", 1);
        //System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        //System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        sellItem(timsBasket, "Spanner", 5);
        //System.out.println(timsBasket);

        sellItem(timsBasket, "Juice", 3);
        sellItem(timsBasket, "Cup", 4);
        sellItem(timsBasket, "Bread", 2);

        Basket basket = new Basket("Customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        sellItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(timsBasket, "Car", 1);
        removeItem(timsBasket, "Cup", 9);
        removeItem(timsBasket, "Car", 1);

        System.out.println("Cars removed: " + removeItem(timsBasket, "Car", 1));
        System.out.println(timsBasket);

        // remove all items from timsBasket
        removeItem(timsBasket, "Bread", 1);
        removeItem(timsBasket, "Cup", 3);
        removeItem(timsBasket, "Juice", 4);
        removeItem(timsBasket, "Cup", 3);
        System.out.println(timsBasket);
        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

        //System.out.println(stockList);

        /*temp = new StockItem("Pen", 1.12);
        stockList.Items().put(temp.getName(), temp);*/

        stockList.Items().get("Car").adjustStock(2000);
        stockList.get("Cup").adjustStock(-200);
        System.out.println(stockList);

        /*for (Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }*/
        checkOut(timsBasket);
        System.out.println(timsBasket);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
