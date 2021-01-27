import java.util.Date;

public abstract class BasicEntry {

    final String author;
    final Date date;
    final String message;
    final MessageType messageType;

    public BasicEntry(String author, Date date, String message, MessageType messageType) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.messageType = messageType;
    }

    public abstract void showEntrySize();

    void getEntry() {
        System.out.println("author: " + author);
        System.out.println("date: " + date);
        System.out.println("message: " + message);
        System.out.println("messageType: " + messageType);
    }

}

