package seedu.addressbook.data.person;

/**
 * Parent Class of Phone, Email, Address.
 */

public abstract class Contact {
    public final String value;
    private boolean isPrivate;

    public Contact(String info, boolean isPrivate){
        String trimmedInfo = info.trim();
        this.isPrivate = isPrivate;
        this.value = trimmedInfo;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || other.getClass().isInstance(this) // instanceof handles nulls
                && this.value.equals(this.getClass().cast(other).value); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
