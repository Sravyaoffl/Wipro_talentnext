package java_fundamentals;
public class miniproject { 
    static class Employee {
        int empNo;
        String empName;
        String department;
        char designationCode;
        String designation;
        int basic, hra, it, salary;

        Employee(int empNo, String empName, String department, char designationCode, int basic, int hra, int it) {
            this.empNo = empNo;
            this.empName = empName;
            this.department = department;
            this.designationCode = designationCode;
            this.basic = basic;
            this.hra = hra;
            this.it = it;
            this.designation = getDesignation(designationCode);
            int da = getDA(designationCode);
            this.salary = basic + hra + da - it;
        }

        static String getDesignation(char code) {
            switch (code) {
                case 'e': return "Engineer";
                case 'c': return "Consultant";
                case 'k': return "Clerk";
                case 'r': return "Receptionist";
                case 'm': return "Manager";
                default: return "Unknown";
            }
        }

        static int getDA(char code) {
            switch (code) {
                case 'e': return 20000;
                case 'c': return 32000;
                case 'k': return 12000;
                case 'r': return 15000;
                case 'm': return 40000;
                default: return 0;
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide employee ID");
            return;
        }

        int searchId = Integer.parseInt(args[0]);

        Employee[] employees = {
            new Employee(1001, "Ashish", "R&D", 'e', 20000, 8000, 3000),
            new Employee(1002, "Sushma", "PM", 'c', 30000, 12000, 9000),
            new Employee(1003, "Rahul", "Acct", 'k', 10000, 8000, 1000),
            new Employee(1004, "Chahat", "Front Desk", 'r', 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "Engg", 'm', 50000, 20000, 20000),
            new Employee(1006, "Tanmay", "Manufacturing", 'c', 23000, 9000, 4400)
        };

        boolean found = false;

        for (Employee emp : employees) {
            if (emp.empNo == searchId) {
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(emp.empNo + "\t" + emp.empName + "\t" + emp.department + "\t" + emp.designation + "\t" + emp.salary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + searchId);
        }
    }
}
