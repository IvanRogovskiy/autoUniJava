import autouni.classes.Song;
import autouni.classes.Video;
import autouni.data.MessageType;
import autouni.interfaces.Playable;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TestClass {

    public static void main(String[] args) {

        Date date = new Date();

        Playable video = new Video("irogovsk",date, "its my new video", MessageType.POST,120,"1280x1800");
        video.play();

        Set<Song> set = new TreeSet<Song>(Comparator.comparingInt(Song::getSize));

    }

}
