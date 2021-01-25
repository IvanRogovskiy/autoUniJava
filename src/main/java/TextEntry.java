public class TextEntry extends BasicEntry {

    private int numberOfSymbols;

    public TextEntry(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }

    public void showEntrySize() {
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public void setNumberOfSymbols(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }

}
