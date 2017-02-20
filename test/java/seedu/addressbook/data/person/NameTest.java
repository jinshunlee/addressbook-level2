package seedu.addressbook.data.person;

import org.junit.Before;
import org.junit.Test;
import seedu.addressbook.data.exception.IllegalValueException;

import static org.junit.Assert.assertTrue;

public class NameTest {

    private Name name;

    @Before
    public void initialiseTest() throws IllegalValueException {
        this.name = new Name("JSLEE");
    }
    @Test
    public void isNameSimilar() {
        assertTrue(name.isSimilar(name));
    }


}
