/**
 * @author Mahsa Alikhani m-58
 */
public class MyDate {

    enum Month {
        FARVARDIN, ORDIBEHESHT, KHORDAD, TIR, MORDAD, SHAHRIVAR,
        MEHR, ABAN, AZAR, DEY, BAHMAN, ESFAND;
    }

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
