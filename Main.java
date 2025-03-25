// PARTNER NAME: Lizzie Cooper
// PARTNER NAME: 
// CS111 SECTION #: Lab 09
// DATE: 3/2/25

public class Main{
    public static void main(String[] args){
        //DECLARATION & INITIALIZATION SECTION
        int month = 0, day = 0, year = 0;
        int jdnDate = 0;
        
        //CALCULATION SECTION #1
        month = 03;
        day = 03;
        year = 2020;
        jdnDate = Main.calcJulianDate(month, day, year);
        //OUTPUT SECTION  #1
        System.out.println("The claculated Julian date for March 03, 2020 is: " + jdnDate);

        //CALCULATION SECTION #2
        month = 03;
        day = 03;
        year = 2025;
        jdnDate = Main.calcJulianDate(month, day, year);
        //OUTPUT SECTION  #2
        System.out.println("The claculated Julian date March 03, 2025 is: " + jdnDate);

        //CALCULATION SECTION #3
        month = 03;
        day = 25;
        year = 2025;
        jdnDate = Main.calcJulianDate(month, day, year);
        //OUTPUT SECTION #3
        System.out.println("The claculated Julian date for today is: " + jdnDate);

        //CALCULATION SECTION #4
        month = 03;
        day = 05;
        year = 2005;
        jdnDate = Main.calcJulianDate(month, day, year);
        //OUTPUT SECTION #4
        System.out.println("The claculated Julian date for my birthday is: " + jdnDate);
    }

    public static int calcJulianDate(int month, int day, int year){
        int a = 0, m = 0, y = 0;
        int jdn = 0;

        a = (14-month) / 12;
        m = month + 12 * a - 3;
        y = year + 4800 - a;
        jdn = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
        return(jdn);
    }
}