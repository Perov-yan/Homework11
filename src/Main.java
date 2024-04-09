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
            public static void main(String[] args) {
                //Task 1
            int year = 2019;
            printIsLeapYear(year);
            }

        }