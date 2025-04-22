public class main {
    public static void main(String[] args) {
    // Задача 1
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;

    System.out.println("Ф. И. О. сотрудника — " + fullName);

    // Задача 2
    String upperCaseFullName = fullName.toUpperCase();
    System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);

    // Задача 3
    String employeeWithYo = "Иванов Семён Семёнович";
    String fixedEmployeeName = employeeWithYo.replace('ё', 'е');
    System.out.println("Данные Ф. И. О. сотрудника — " + fixedEmployeeName);

}
}
