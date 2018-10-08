import java.util.*;

class Employee{
    String name;
    int empID;
    double salary;
    Employee(){}
    Employee(String name, int empID, double salary){
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getEmpID(){
        return empID;
    }
    public double salary(){
        return salary;
    }
}
class Scratch extends Employee {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList();
        Map<Integer, Employee> hm = new HashMap<Integer, Employee>();
        Map<String, Employee> hs = new HashMap<String, Employee>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Employee EmployeeID should be different");
        System.out.println("2. Remove Employee by ID");
        System.out.println("3. Get employee with a name");
        System.out.println("4. Get Employee with in Salary");
        System.out.println("5. Press 0 to exit");
        Scratch s = new Scratch();
        loop : while(true){
            int choice = sc.nextInt();
            switch (choice) {
                case 0 : break loop;
                case 1: {
                    System.out.println("Enter Employee Name");
                    String name = sc.next();
                    System.out.println("Enter Employee ID");
                    int empID = sc.nextInt();
                    Integer empid = new Integer(empID);
                    if (hm.containsKey(empid)) {
                        System.out.println("Employee ID is present");
                        break;
                    }
                    System.out.println("Enter Employee Salary");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(name, empID, salary);
                    arr.add(emp);
                    hm.put(empid, emp);
                    hs.put(name, emp);
                    break;
                }
                case 2: {
                    System.out.println("Enter Employee ID to remove");
                    int empID = sc.nextInt();
                    Integer empid = new Integer(empID);
                    if (hm.containsKey(empid)){
                        Employee emp = hm.get(empid);
                        hm.remove(empid);
                        hs.remove(emp.name);
                        arr.remove(emp);
                    } else {
                        System.out.println("Employee ID is not present");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter Employee name to get Employee details");
                    String name = sc.next();
                    Employee emp = hs.get(name);
                    System.out.println("Employee ID " + emp.empID + " Employee Name " + emp.name + " Employee Salary " + emp.salary);
                    }
                    break;  
                case 4: {
                    System.out.println("Enter Range of Salary as two double value");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    Iterator<Employee> it = arr.iterator();
                    Employee emp = null;
                    while (it.hasNext()) {
                        emp = it.next();
                        if (emp.salary >= a && emp.salary <= b) {
                            System.out.println("Employee ID " + emp.empID + " Employee Name " + emp.name + " Employee Salary " + emp.salary);
                        }
                    }
                }
                    break;
                default : System.out.println("Wrong Entry");
            }
        }
    }
}