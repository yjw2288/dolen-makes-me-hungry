package dolen.make.me.hungry.contents.b;

import dolen.make.me.hungry.contents.a.AContent;

public class BContent extends AContent {
    private String tail;

    public BContent(String title, String tail) {
        super(title);
        this.tail = tail;
    }

    public String getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "BContent{" +
                "head='" + getHead() + '\'' +
                "tail='" + tail + '\'' +
                '}';
    }
}
