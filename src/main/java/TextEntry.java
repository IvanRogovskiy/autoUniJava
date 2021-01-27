import java.util.Date;

public class TextEntry extends BasicEntry {

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

}
