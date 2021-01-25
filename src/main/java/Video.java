public class Video extends MediaEntry {

    private String resolution;

    public Video(int size, String resolution) {
        super(size);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

}
