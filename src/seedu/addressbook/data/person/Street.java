package seedu.addressbook.data.person;


public class Street {
    private String streetNumber;

    /**
     * @param street the street of the person.
     */
    public Street (String street) {
        this.streetNumber = street;
    }

    /**
     * returns a String containing Street name.
     */
    public String getStreetName(){
        return this.streetNumber;
    }
}
