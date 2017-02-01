package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street,23 ,234";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses should have block, postal code, street and unit";
    public static final String LIST_OF_4_CONSTRAINT_REGEX = "([a-zA-Z0-9#  -]+)(,[a-zA-Z0-9#  -]+){3}";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final int BLOCK_INDEX = 1;
    public static final int POSTALCODE_INDEX = 2;
    public static final int STREET_INDEX = 0;
    public static final int UNIT_INDEX = 3;

    public final String value;
    private boolean isPrivate;
    private Block block;
    private PostalCode postalCode;
    private Street street;
    private Unit unit;

    /**
     * @param address the address of the person.
     *
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid or 4 valid Strings for Street,Block,Unit,Postal Code.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();

        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        } else if(!trimmedAddress.matches(LIST_OF_4_CONSTRAINT_REGEX)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }

        String [] addressArr = trimmedAddress.split(",");
        street =  new Street(addressArr[STREET_INDEX]);
        block =  new Block(addressArr[BLOCK_INDEX]);
        unit =  new Unit(addressArr[UNIT_INDEX]);
        postalCode =  new PostalCode(addressArr[POSTALCODE_INDEX]);
        this.isPrivate = isPrivate;
        this.value = trimmedAddress;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
