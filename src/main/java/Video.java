import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Video extends MediaEntry implements Playable {

    private final String resolution;

    public Video(String author, Date date, String message, MessageType messageType, int size, String resolution) {
        super(author, date, message, messageType, size);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void play() {
        final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("I play video added by " + getAuthor() + ", recorded: " + sdf.format(getDate()) );
    }

}
