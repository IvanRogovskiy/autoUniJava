import java.util.Date;

public class Audio extends MediaEntry implements Playable {

    private final String singer;
    private final String title;

    public Audio(int size, String singer, String title, String author, Date date, String message, MessageType messageType) {
        super(author, date, message, messageType, size);
        this.singer = singer;
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        System.out.println("I am playing song: " + title + "-" + singer);
    }

}
