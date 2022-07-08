package dolen.make.me.hungry.contents.a;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class AContentManager<T extends AContent> {
    private List<T> list;
    private Supplier<T> supplier;

    public AContentManager(Supplier<T> supplier) {
        list = new ArrayList<>();
        this.supplier = supplier;
    }

    public void createNew() {
        list.add(supplier.get());
    }

    public void print() {
        for (AContent aContent : list) {
            System.out.println("head : " + aContent);
        }
    }
}
