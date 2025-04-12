public class main {
    public static void main(String[] args) {
        //1
        int[] monthlyExpenses = {100, 200, 150, 180, 220};
        int totalExpenses = 0;
        for (int expense : monthlyExpenses) {
            totalExpenses += expense;
        }
        System.out.println("Total expenses for the month: " + totalExpenses + " rubles");

        //2
        int[] weeklyExpenses = {40, 60, 30, 80, 50};
        int minExpense = weeklyExpenses[0];
        int maxExpense = weeklyExpenses[0];
        for (int expense : weeklyExpenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Minimum expense for the week: " + minExpense + " rubles");
        System.out.println("Maximum expense for the week: " + maxExpense + " rubles");

        //3
        int[] weeklyExpenses2 = {80, 90, 100, 110, 120};
        int totalWeeklyExpenses = 0;
        for (int expense : weeklyExpenses2) {
            totalWeeklyExpenses += expense;
        }
        double averageWeeklyExpense = (double) totalWeeklyExpenses / weeklyExpenses2.length;
        System.out.println("Average weekly expense for the month: " + averageWeeklyExpense + " rubles");

        //4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0, j = reverseFullName.length - 1; i < j; i++, j--) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }
        System.out.println("Reversed full name: " + new String(reverseFullName));
    }
}
