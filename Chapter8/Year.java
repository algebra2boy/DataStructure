public class Year {
    private int daysInMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private int year, month, day;

    // ================ constructors ==========================
    public Year() {
        this(0, 0, 0);
    }

    public Year(int year, int month, int day) {
        setDate(year, month, day);
    }

    // ================= gets =========================
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
    // ================ helper methods ==========================

    public void setDate(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void addDays(int daysToAdd) {
        for (int i = 1; i <= daysToAdd - 1; i++) {
            if (this.isLeapYear()) { // when it is a leap year February
                daysInMonth[2] = 29; // changed to 29 days
            }else{
                daysInMonth[2] = 28;
            }
            this.day++;
            if (month == 12 && day > 31) {
                year++;
                month = 1;
                day = 1;
            }
            if (day > daysInMonth[month]) {
                month++;
                day = 1;
            }
        }
    } // addDays

    public void addWeeks(int weeks) {
        addDays(weeks * 7);
    }

    // ==========================================*/
    public String toString() {
        return "(" + year + ", " + month + ", " + day + ")";
    }

} // Date
