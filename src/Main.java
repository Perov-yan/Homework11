import java.time.LocalDate;
public class Main {
                //Task 1
            public static void isLeapYear(int year) {
                boolean yearIsLeap = isLeap(year);
                printIsLeapYearResult(year, yearIsLeap);
            }
            public static boolean isLeap(int year) {
                return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
            }
            public static void printIsLeapYearResult(int year, boolean yearIsLeap) {
                if (yearIsLeap) {
                    System.out.println(year + " год — високосный год");
                } else {
                    System.out.println(year + " год — невисокосный год");
                }
            }
            public static void main(String[] args) {
                //Task 1
            int year = 2016;
            isLeapYear(year);
            }

        }