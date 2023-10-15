import  java.math.BigDecimal;

public class Account {

    private int id;
    private Customer customer;
    private double balancee = 0.0;
    BigDecimal bigDecimal = new BigDecimal(balancee);

    public Account(int id, Customer customer, double balancee) {
        this.id = id;
        this.customer = customer;
        this.balancee = balancee;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balancee;
    }

    public void setBalance(double balancee) {
        this.balancee = balancee;
    }
     public  String toString() {
       return  customer.getName() + "(" + id + ") balance=$" + (double)(Math.round(balancee *  100)) / 100  ;
     }
     public String getCustomerName() {
        return customer.getName();
     }
     public Account deposit(double amount) {
        balancee += amount;
        return this;
     }
     public Account withdraw(double amount) {
        if(balancee >= amount) {
            balancee -= amount;
        }
        else {
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return this;
     }
}

