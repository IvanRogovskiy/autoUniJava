package autouni.classes;

import autouni.data.MessageType;
import autouni.interfaces.Printable;

import java.util.Date;

public class TextEntry extends BasicEntry implements Printable {

    private final int numberOfSymbols;

    public TextEntry(int numberOfSymbols, String author, Date date, String message, MessageType messageType) {
        super(author, date, message, messageType);
        this.numberOfSymbols = numberOfSymbols;
    }

    public void showEntrySize() {
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    @Override
    public void print() {
        System.out.println("Printing the message: " + getMessage());
    }
}
