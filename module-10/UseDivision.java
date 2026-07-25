/**
 * Name: Sebastian Siqueiros
 * Course: CSD-402
 * Module: 10.2
 * Purpose: Creates division objects and displays them.
 */

public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision international1 =
                new InternationalDivision(
                        "Europe Sales",
                        1001,
                        "Germany",
                        "German");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Asia Operations",
                        1002,
                        "Japan",
                        "Japanese");

        DomesticDivision domestic1 =
                new DomesticDivision(
                        "West Coast",
                        2001,
                        "California");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "Southwest",
                        2002,
                        "Arizona");

        international1.display();
        international2.display();

        domestic1.display();
        domestic2.display();
    }
}