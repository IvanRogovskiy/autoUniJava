import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TestClass {

    public static void main(String[] args) {

        Date date = new Date();

        Playable video = new Video("irogovsk",date, "its my new video", MessageType.POST,120,"1280x1800");
        video.play();
    }

}
