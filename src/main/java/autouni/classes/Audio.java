package autouni.classes;

import autouni.data.MessageType;
import autouni.interfaces.Playable;

import java.util.Date;

public class Audio extends MediaEntry implements Playable {

    private final String singer;
    private final String title;
    private final int size;

    public Audio(int size, String singer, String title, String author, Date date, String message, MessageType messageType, int size1) {
        super(author, date, message, messageType, size);
        this.singer = singer;
        this.title = title;
        this.size = size1;
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
