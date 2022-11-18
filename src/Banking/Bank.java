package Banking;

import java.util.ArrayList;

public class Bank {

    /*Bank:
            -  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
            -  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
            -  And five methods, they are (their functions are in their names):
            -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true if the branch was added successfully or false otherwise.
    -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or false otherwise.
    -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch if it exists or null otherwise.
    -  */

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }


    // addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
    // It returns true if the branch was added successfully or false otherwise.
    public boolean addBranch(String name) {
        if (branches.contains(name)) {
            return false;
        }
        //TODO
        // Add possibility of another branch with the same name.

        System.out.println("Customer details for branch " + name);
        branches.add(new Branch(name));
        return true;
    }

    // addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean.
    // It returns true if the customer was added successfully or false otherwise.
    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        }
        boolean isAddCustomer = branch.newCustomer(customerName, transaction);
        if (!isAddCustomer) {
            return false;
        }
        return true;

    }

    // addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean.
    // It returns true if the customers transaction was added successfully or false otherwise.

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(customerName);
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    // findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
    // Return the Branch if it exists or null otherwise.
    private Branch findBranch(String branchName) {
        if (!branchName.isEmpty()) {
            for (int i = 0; i < branches.size(); i++) {
                Branch branch = branches.get(i);
                if (branches.get(i).getName().equals(branchName)) {
                    return branch;
                }
            }
        }
        return null;
    }

    // listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean.
    // Return true if the branch exists or false otherwise.
    // This method prints out a list of customers.
    public boolean listCustomers(String branchName, boolean printTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            if (printTransaction == true) {
                for (int i = 0; i < branch.getCustomers().size(); i++) {
                    System.out.println("Customer: " + (branch.getCustomers().get(i).getName()) + " [" + (i + 1) + "]");
                    Customer customer = branch.findCustomer(branch.getCustomers().get(i).getName());
                    System.out.println("Transactions");
                    for (int j = 0; j < customer.getTransactions().size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + " Amount: " + customer.getTransactions().get(j));
                    }
                    customer.getTransactions();
                    //System.out.println("Customer: " + (branch.getCustomers().get(i).getName()) + " ["+ (i+1) +"]");
                }
            } else {
                for (int i = 0; i < branch.getCustomers().size(); i++) {
                    System.out.println("Customer: " + (branch.getCustomers().get(i).getName()) + " [" + (i + 1) + "]");
                }
            }
            return true;
        }
        return false;
    }
}
