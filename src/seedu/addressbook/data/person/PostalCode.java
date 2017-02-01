package seedu.addressbook.data.person;


public class PostalCode {
    private String postalCodeNumber;

    /**
     * @param postalCode the postal code of the person.
     */
    public PostalCode (String postalCode) {
        this.postalCodeNumber = postalCode;
    }

    /**
     * returns a String containing PostalCode name.
     */
    public String getPostalCodeName(){
        return this.postalCodeNumber;
    }
}

