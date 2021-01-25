public class Audio extends MediaEntry {

    private String singer;
    private String title;

    public Audio(int size, String singer, String title) {
        super(size);
        this.singer = singer;
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
