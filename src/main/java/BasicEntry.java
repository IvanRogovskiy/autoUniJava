import java.util.Date;

public abstract class BasicEntry {

    private String author;
    private Date date;
    private String message;
    private String messageType;

    public abstract void showEntrySize();

    void getEntry() {
        System.out.println("author: " + author);
        System.out.println("date: " + date);
        System.out.println("message: " + message);
        System.out.println("messageType: " + messageType);
    }

}

