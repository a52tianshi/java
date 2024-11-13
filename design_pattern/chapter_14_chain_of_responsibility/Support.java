package design_pattern.chapter_14_chain_of_responsibility;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
//        if (resolve(trouble)) {
//            done(trouble);
//        } else if (next != null) {
//            next.support(trouble);
//        } else {
//            fail(trouble);
//        }
        //this is the same as above
        Support current = this;
        while (true) {
            if (current.resolve(trouble)) {
                current.done(trouble);
                break;
            } else if (current.next != null) {
                current = current.next;
            } else {
                current.fail(trouble);
                break;
            }
        }
    }

    //why protected?
    //because this method is called by support() method
    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }

    public String toString() {
        return "[" + name + "]";
    }
}
