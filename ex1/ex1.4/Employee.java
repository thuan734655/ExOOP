public class Employee {
    private  int id;
    private  String fistName;
    private String lastName;
    private int salary;

    public Employee(int id, String fistName, String lastName, int salary) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return this.fistName + this.lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return this.salary*12;
    }
    public  int raiseSalary(int percent ) {

        return this.salary += this.salary * percent/100;
    }
    public String toString() {
        return   "[Employee[ id =  " + this.id + ",name= " + this.fistName + " "+ this.lastName + ", salary = " + this.salary +"]";
    }
}
