/**
 * Name: Sebastian Siqueiros
 * Course: CSD-402
 * Module: 10.2
 * Purpose: Domestic division subclass.
 */

public class DomesticDivision extends Division {

    private String state;

    public DomesticDivision(String divisionName,
                            int accountNumber,
                            String state) {

        super(divisionName, accountNumber);

        this.state = state;
    }

    @Override
    public void display() {

        System.out.println("Domestic Division");
        System.out.println("-----------------");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}