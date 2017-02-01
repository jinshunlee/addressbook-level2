package seedu.addressbook.data.person;

/**
 * Creates a Unit
 */
public class Unit {
    private String unitNumber;

    /**
     * @param unitNumber the unit number of the person.
     */
    public Unit (String unitNumber) {
        this.unitNumber = unitNumber;
    }

    /**
     * returns a String containing Unit name.
     */
    public String getUnitNumber(){
        return this.unitNumber;
    }
}

