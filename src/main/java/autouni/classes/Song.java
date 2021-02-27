package autouni.classes;

public class Song {

    private final String title;
    private final int size;

    public Song(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public int compare(Object o1, Object o2) {
        return 0;
    }
}

