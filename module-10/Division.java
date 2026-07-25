/**
 * Name: Sebastian Siqueiros
 * Course: CSD-402
 * Module: 10.2
 * Purpose: Abstract Division class.
 */

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}