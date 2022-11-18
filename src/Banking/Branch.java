package Banking;

import java.util.ArrayList;

public class Branch {

    /*Branch
    -  It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
            -  A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
            -  And five methods, they are (their functions are in their names):
            -  getName(), getter for name.
        -  getCustomers(), getter for customers.
        -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean. Returns true if the customer was added successfully or false otherwise.
        -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.
        */


    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    // newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean.
    // Returns true if the customer was added successfully or false otherwise.
    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            customer.addTransaction(initialTransaction);
            //System.out.println(customer.getName() + " -> " + initialTransaction);
            this.customers.add(customer);
            return true;
        }
        return false;
    }

    // addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean.
    // Returns true if the customers transaction was added successfully or false otherwise.

    public boolean addCustomerTransaction(String customerName, double transaction){
        if (findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, transaction);
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    // findCustomer(), has one parameter of type String (name of customer) and returns a Customer.
    // Return the Customer if they exist, null otherwise.
    public Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
