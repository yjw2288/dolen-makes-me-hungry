package dolen.make.me.hungry;

import dolen.make.me.hungry.contents.a.AContent;
import dolen.make.me.hungry.contents.a.AContentManager;
import dolen.make.me.hungry.contents.b.BContent;
import dolen.make.me.hungry.contents.b.BContentsManager;

public class Main {
    public static void main(String[] args) {
        AContentManager<AContent> aContentManager
                 = new AContentManager<>(
                () -> {
                    return new AContent("head");
                }
        );

        BContentsManager<BContent> bContentsManager
                = new BContentsManager<>(
                () -> {
                    return new BContent("head", "tail");
                }
        );

        aContentManager.createNew();
        aContentManager.print();

        System.out.println("-----------");

        bContentsManager.createNew();
        bContentsManager.print();
    }
}
