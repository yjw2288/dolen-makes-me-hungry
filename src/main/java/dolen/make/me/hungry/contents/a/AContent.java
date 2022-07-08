package dolen.make.me.hungry.contents.a;

public class AContent {
    private String head;

    public AContent(String head) {
        this.head = head;
    }

    public String getHead() {
        return head;
    }

    @Override
    public String toString() {
        return "AContent{" +
                "head='" + head + '\'' +
                '}';
    }
}
