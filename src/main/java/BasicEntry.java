import java.util.Date;

public abstract class BasicEntry {

    private final String author;
    private final Date date;
    private final String message;
    private final MessageType messageType;

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

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

}

