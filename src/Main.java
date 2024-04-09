import java.time.LocalDate;
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
            public static void main(String[] args) {
                //Task 1
            int year = 2010;
            printIsLeapYear(year);
            System.out.println(" ");
                //Task 2
            int clientOS = 0;
            recommendAppVersion(clientOS,year);

            }

        }