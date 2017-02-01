package seedu.addressbook.data.person;


public class Block {
    private String blockNumber;

    /**
     * @param block the block of the person.
     */
    public Block (String block) {
        this.blockNumber = block;
    }

    /**
     * returns a String containing block name.
     */
    public String getBlockName(){
        return this.blockNumber;
    }
}



