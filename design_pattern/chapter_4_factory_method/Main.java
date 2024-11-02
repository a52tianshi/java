package design_pattern.chapter_4_factory_method;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Alice");
        Product card2 = factory.create("Bob");
        Product card3 = factory.create("Charlie");
        card1.use();
        System.out.println(((IDCard)card1).getSerial());
        card2.use();
        System.out.println(((IDCard)card2).getSerial());
        card3.use();
        System.out.println(((IDCard)card3).getSerial());
        IDCardFactory idCardFactory = (IDCardFactory)factory;
        System.out.println(idCardFactory.getOwners());
    }
}
