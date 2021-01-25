public class MediaEntry extends BasicEntry {

    private int size;

    public MediaEntry(int size) {
        this.size = size;
    }

    public void showEntrySize() {
        System.out.println("Entry size = " + size);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

}
