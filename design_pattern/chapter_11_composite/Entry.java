package design_pattern.chapter_11_composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    //cq added
    protected Entry parent;
    public String getFullPathName() {
        if (parent == null) {
            return "/" + getName();
        } else {
            return parent.getFullPathName() + "/" + getName();
        }
    }
}
