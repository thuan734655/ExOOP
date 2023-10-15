public class Test {
    public static void main(String[] args) {
   // test Customer
        Customer C1 = new Customer (1,"alice",'m');
        Customer C2 = new Customer (2,"hoang",'f');
        Customer C3 = new Customer (3,"Charlie",'m');

        System.out.println(C1);
        System.out.println(C2);
        System.out.println(C3);
        System.out.println("c1 ID:" +C1.getId());
        System.out.println("c1 NAME: " + C1.getName());
        System.out.println("c1 gender: " + C1.getGender());

        // test Account
        // Create some Customer objects
        Account c1 = new Account (101, C1,7.8);
        Account c2 = new Account (102, C2,8.3);
        Account c3 = new Account (103, C3,11.2);

        // Test the getBalance and getCustomerName methods

        System.out.println ("The balance of c1 is " + c1.getBalance ());
        System.out.println ("The name of c1 is " + c1.getCustomerName ());
        System.out.println ("The balance of c2 is " + c2.getBalance ());
        System.out.println ("The name of c2 is " + c2.getCustomerName ());
        System.out.println ("The balance of c3 is " + c3.getBalance ());
        System.out.println ("The name of c3 is " + c3.getCustomerName ());

        // Test the deposit and withdraw methods
        c1.deposit (100); // Deposit 100 to c1's account
        c2.withdraw (50); // Try to withdraw 50 from c2's account
        c3.deposit (-10); // Try to deposit -10 to c3's account

        // Test the toString method
        System.out.println (c1);
        System.out.println (c2);
        System.out.println (c3);
    }
}



