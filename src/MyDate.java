public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int month) {
        this.month = month;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public boolean isValidDate(int year, int month, int day) {
        if (year > 0 && year <= 9999 && month > 0 && month <= 12) {
            if (month > 0 && month < 7 && day > 0 && day <=31) {
                return true;
            } else if (month > 7 && month < 12 && day > 0 && day <= 30) {
                return true;
            } else if (month == 12 && day > 0 && day <= 29) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
