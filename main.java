import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2021);
        checkAppVersion(0, 2014);
        calculateDeliveryDays(95);
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String message = "Установите обычную версию приложения";

        if (clientDeviceYear < 2015) {
            message = osType == 0
                    ? "Установите облегченную версию приложения для iOS по ссылке"
                    : "Установите облегченную версию приложения для Android по ссылке";
        }
        System.out.println(message);
    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставка недоступна");
            return;
        }
        System.out.println("Потребуется дней: " + days);
    }
}