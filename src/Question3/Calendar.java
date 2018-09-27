package Question3;

/**
 * A representation of a desktop date display with 4 wheels:
 * name of the day, month, day, year.
 */
public class Calendar
{
    private DateCounter date;
    private DayOfWeek   dayOfWeek;

    public Calendar()
    {
        this(1, 1, 2000);
    } // end default constructor

    public Calendar(int month, int day, int year)
    {
        date = new DateCounter(month, day, year);
        dayOfWeek = new DayOfWeek(month, day, year);
    } // end constructor

    public void reset()
    {
        date.reset();
        dayOfWeek.reset();
    }

    public void increase()
    {
        date.increase();
        dayOfWeek.increase();
    }

    public String toString()
    {
        return dayOfWeek.getValue()  + " "  +  // Sunday - Saturday
                date.getWheelValue(2) + " "  +  // month
                date.getWheelValue(1) + ", " +  // day
                date.getWheelValue(3);          // year
    } // end toString

    public static void main(String[] args)
    {
        // show the rollover from January to February during
        Calendar today = new Calendar(1, 1, 2017);
        for (int counter = 0; counter < 59; counter++)
        {
            System.out.println(today);
            today.increase();
        } // end for

        System.out.println();

        // show the rollover from December to January to February to March
        today = new Calendar(12, 1, 2018);
        for (int counter = 0; counter < 121; counter++)
        {
            System.out.println(today);
            today.increase();
        } // end for
    } // end main
} // end Calendar