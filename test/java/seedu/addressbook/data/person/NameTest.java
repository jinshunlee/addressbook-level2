package seedu.addressbook.data.person;

import org.junit.Before;
import org.junit.Test;
import seedu.addressbook.data.exception.IllegalValueException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameTest {

    private Name nameA, nameB;

    @Before
    public void initialiseTest() throws IllegalValueException {
        this.nameA = new Name("JSLEE");
        this.nameB = new Name("jslee");

    }
    @Test
    public void isNameSimilar() {
        assertTrue(nameA.isSimilar(nameA));
        assertFalse(nameA.isSimilar(nameB));
        assertFalse(nameA.isSimilar(null));
    }




}
