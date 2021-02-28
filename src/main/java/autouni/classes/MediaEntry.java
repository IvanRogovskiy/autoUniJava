package autouni.classes;

import autouni.data.MessageType;

import java.util.Date;

public class MediaEntry extends BasicEntry {

    private final int size;

    public MediaEntry(String author, Date date, String message, MessageType messageType, int size) {
        super(author, date, message, messageType);
        this.size = size;
    }

    public void showEntrySize() {
        System.out.println("Entry size = " + size);
    }

    public int getSize() {
        return this.size;
    }

}
