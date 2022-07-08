package dolen.make.me.hungry.contents.b;

import dolen.make.me.hungry.contents.a.AContent;
import dolen.make.me.hungry.contents.a.AContentManager;

import java.util.function.Supplier;

public class BContentsManager<T extends AContent> extends AContentManager <T>  {
    public BContentsManager(Supplier<T> supplier) {
        super(supplier);
    }

    @Override
    public void print() {
        System.out.println("start B");
        super.print();
        System.out.println("end B");
    }
}
