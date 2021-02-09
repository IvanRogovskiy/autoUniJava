import java.util.Date;

public class Image extends MediaEntry {

    private final int resolution;

    public Image(String author, Date date, String message, MessageType messageType, int size, int resolution) {
        super(author, date, message, messageType, size);
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

}
