public class Day {


    private Week day;


    public Day(Week day) {
        this.day = day;
    }

    public Day(Week[] values) {

    }

    public Week getDay() {
        return day;
    }

    public void setDay(Week day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Days{" +
                "day=" + day +
                '}';
    }
}
