package BillsBurgers;

public class HealthyBurger extends Hamburger {

    // And for the third class, HealthyBurger, there will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and healthyExtra2Price.
    // The names are type String and the prices are type double.
    // The constructor for this class accepts two(2) parameters for meat and price.
    // Those are set in the constructor along with an appropriate name for the type of burger.

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Health Burger", meat, price, "Brown rye roll");
        System.out.println("Healthy hamburger on a Brown rye roll with Bacon, price is 5.67");
    }

    /*public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }*/

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = 0;
        if (healthyExtra1Name != null && healthyExtra1Price > 0) {
            totalPrice = this.healthyExtra1Price + totalPrice;
        }
        if (healthyExtra2Name != null && healthyExtra2Price > 0) {
            totalPrice = this.healthyExtra2Price + totalPrice;
        }
        return super.itemizeHamburger() + totalPrice;
    }
}
