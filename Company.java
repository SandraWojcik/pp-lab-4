import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Dodawanie pracowników
        employees[0] = new Manager("Sandra Wójcik", 50000, 0);
        employees[1] = new Worker("Przemysław Zaremski", 60000, "Deweloper");
        employees[2] = new Employee("Sylwia Poznańska", 55000);
        employees[3] = new Worker("Dajana Majda", 65000, "Księgowa");
        employees[4] = new Worker("Julita Reklińska", 70000, "Menedżer marketingu");

        // Wyświetlanie danych dla wszystkich pracowników
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}