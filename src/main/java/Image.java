public class Image extends MediaEntry {

    private int resolution;

    public Image(int size, int resolution) {
        super(size);
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

}
