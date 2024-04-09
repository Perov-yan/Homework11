public class Main {
    //Task 1
    public static void printIsLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //Task 2
    public static void recommendAppVersion(int clientOS, int deviceYear) {
        System.out.print("Установите ");
        if (deviceYear <= 2015) {
            System.out.print("облегченную ");
        }
        System.out.print("версию приложения для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }

    //Task 3
    public static int sumDeliveryDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60) {
            day++;
        }
        if (deliveryDistance > 100) {
            day = -1;
        }
        return day;
    }

    public static void main(String[] args) {
        //Task 1
        int year = 2010;
        printIsLeapYear(year);
        System.out.println(" ");
        //Task 2
        int clientOS = 0;
        recommendAppVersion(clientOS, year);
        System.out.println(" ");
        //Task 3
        int deliveryDistance = 95;
        int deliveryTime = sumDeliveryDays(deliveryDistance);
        if (deliveryTime < 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }

    }
}