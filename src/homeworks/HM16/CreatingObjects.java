package homeworks.HM16;

public class CreatingObjects {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 45,"+234323232","Street",1000, "Worker") ;
        Manager manager = new Manager ("Nick",45,"+342342342", "Street", 2000,"Sales");

        employee.printSalary();
        manager.printSalary();

    }
}
