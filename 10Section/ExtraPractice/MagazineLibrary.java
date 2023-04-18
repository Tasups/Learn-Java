import java.util.ArrayList;

public class MagazineLibrary {
    
    private ArrayList<Magazine> magazines;
    
    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }
    
    public Magazine getMagazine(int index) {
        // make a copy of the magazine at the index to protext state of the magazine library
        Magazine magCopy = new Magazine(this.magazines.get(index));
        // return that magazine copy
        return magCopy;
    }
    
    public void setMagazine(int index, Magazine newMagazine) {
        // make a copy of the magazine to set or change
        Magazine magCopy = new Magazine(newMagazine);
        // set the magazine at the index with the new magazine
        this.magazines.set(index, magCopy);
    }
    
    public void addMagazine(Magazine newMagazine) {
        // make a copy of the magazine to add to protect the state of the magazine library
        Magazine magCopy = new Magazine(newMagazine);
        // add a copy of the magazine to the array
        this.magazines.add(magCopy);
    }
    
}