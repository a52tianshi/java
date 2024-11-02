package design_pattern.chapter_4_factory_method;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    private static int serial = 100;
    private Map<Integer, String> serialToOwner = new HashMap<Integer, String>();

    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
        serialToOwner.put(((IDCard)product).getSerial(), ((IDCard)product).getOwner());
    }
    public List getOwners() {
        return owners;
    }
}
