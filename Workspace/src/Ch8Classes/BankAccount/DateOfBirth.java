package Ch8Classes.BankAccount;

public class DateOfBirth {
    int year, month, day;

    //Constructors
    public DateOfBirth(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Getters

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    //toString
    @Override
    public String toString() {
        return month+"/"+day+"/"+year;
    }
}
