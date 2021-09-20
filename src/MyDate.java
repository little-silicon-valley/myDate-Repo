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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate nextDay() {
        if (this.getMonth() >= 1 && this.getMonth() <= 6) {
            if (this.getDay() >= 1 && this.getDay() <= 30) {
                this.setDay(this.getDay() + 1);
                return this;
            } else if (this.getDay() == 31) {
                this.setDay(1);
                this.setMonth(this.getMonth() + 1);
                return this;
            }
        } else if (this.getMonth() >= 7 && this.getMonth() <= 12) {
            if (this.getDay() >= 1 && this.getDay() <= 29) {
                this.setDay(this.getDay() + 1);
                return this;
            } else if (this.getDay() == 30) {
                if (this.getMonth() != 12) {
                    this.setDay(1);
                    this.setMonth(this.getMonth() + 1);
                    return this;
                } else if (this.getMonth() == 12) {
                    this.setDay(1);
                    this.setMonth(1);
                    this.setYear(this.getYear() + 1);
                    return this;
                }
            }
        }
        return this;
    }

    @Override
    public String toString() {
        Month month = null;
        return this.getDay() + " " + month.values()[this.getMonth() - 1] + " " + this.getYear();
    }
}
