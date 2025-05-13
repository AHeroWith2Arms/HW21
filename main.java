class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        initializeEmployees();
        listEmployees();
        System.out.println("Total Salary: " + totalSalary());
        System.out.println("Min Salary Employee: " + minSalary());
        System.out.println("Max Salary Employee: " + maxSalary());
        System.out.println("Average Salary: " + averageSalary());
    }

    private static void initializeEmployees() {
        employees[0] = new Employee("Иванов И.И.", 1, 30000);
        employees[1] = new Employee("Петров П.П.", 2, 35000);
        employees[2] = new Employee("Сидоров С.С.", 3, 25000);
        employees[3] = new Employee("Кузнецов К.К.", 4, 40000);
        employees[4] = new Employee("Попов П.П.", 5, 15000);
        employees[5] = new Employee("Васильев В.В.", 2, 45000);
        employees[6] = new Employee("Лебедев Л.Л.", 3, 50000);
        employees[7] = new Employee("Семенов С.С.", 4, 28000);
        employees[8] = new Employee("Федоров Ф.Ф.", 5, 30000);
        employees[9] = new Employee("Дмитриев Д.Д.", 1, 32000);
    }

    public static void listEmployees() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public static double totalSalary() {
        double total = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                total += emp.getSalary();
            }
        }
        return total;
    }

    public static Employee minSalary() {
        Employee min = employees[0];
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() < min.getSalary()) {
                min = emp;
            }
        }
        return min;
    }

    public static Employee maxSalary() {
        Employee max = employees[0];
        for (Employee emp : employees) {
            if (emp != null && emp.getSalary() > max.getSalary()) {
                max = emp;
            }
        }
        return max;
    }

    public static double averageSalary() {
        return totalSalary() / 10;
    }
}