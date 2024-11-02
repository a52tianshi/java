package design_pattern.chapter_4_factory_method;

public class IDCard extends Product {
    private final String owner;
    private final int serial;

    //why not public?
    //because we want to restrict the creation of IDCard to IDCardFactory
    protected IDCard(String owner, int serial) {
        System.out.println("制作 " + owner + " 的 ID 卡。");
        this.owner = owner;
        this.serial = serial;
    }

    public void use() {
        System.out.println("使用 " + owner + " 的 ID 卡。");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
