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
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName);
            customer.addTransaction(initialTransaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
