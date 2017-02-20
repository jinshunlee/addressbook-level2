package seedu.addressbook.data;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;


/**
 * Shows the additions and deletions of tags on a person
 */
public class Tagging {

    public enum TYPE {
        ADD, DELETE
    }

    public Person getTaggedPerson() {
        return taggedPerson;
    }

    public Tag getPersonTag() {
        return personTag;
    }

    public TYPE getType() {
        return type;
    }

    private final Person taggedPerson;
    private final Tag personTag;
    private final TYPE type;

    public Tagging(TYPE type, Tag personTag, Person taggedPerson) {
        this.taggedPerson = taggedPerson;
        this.personTag = personTag;
        this.type = type;
    }

    @Override
    public String toString() {
        String type = "";
        if (type .equals(TYPE.ADD)){
            type = "ADD";
        } else {
            type = "DELETE";
        }
        return type + " " + taggedPerson.getName().toString() + " " + getPersonTag().toString();
    }
}
