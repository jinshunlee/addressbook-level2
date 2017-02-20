package seedu.addressbook.data.person;

/**
 * An interface to help beautify objects to a nicer string representation.
 */
public interface Printable {

    /**
     * Returns a string of the object in the terms of Name, Phone, Email, Address
     * eg.  Name: John Smith, Phone: 12349862
     */
   String getPrintableString();
}
