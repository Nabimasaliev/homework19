import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Week day1 = Week.MONDAY;
        Week day2 = Week.TUESDAY;
        Week day3 = Week.WEDNESDAY;
        Week day4 = Week.THURSDAY;
        Week day5 = Week.FRIDAY;
        Week day6 = Week.SATURDAY;
        Week day7 = Week.SUNDAY;


        System.out.println("You are welcome! \nWrite day:");

        switch (scanner.nextLine()){
            case "Monday":
                System.out.println(day1.getInformation());
                break;
            case "Tuesday":
                System.out.println(day2.getInformation());
                break;
            case "Wednesday":
                System.out.println(day3.getInformation());
                break;
            case "Thursday":
                System.out.println(day4.getInformation());
                break;
            case "Friday":
                System.out.println(day5.getInformation());
                break;
            case "Saturday":
                System.out.println(day6.getInformation());
                break;
            case "Sunday":
                System.out.println(day7.getInformation());
                break;
            default:
                System.out.println("Write with capital letter or value day!!!");
        }
    }

}