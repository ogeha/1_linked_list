package пакетик;

public class MyList<T> {
    private MyNode<T> head;
    private int size;

    public MyList() {
    }

    public void add(MyNode element) {
        if (head == null) {
            head = element;
            head.setNext(null);
            size += 1;
            return;
        }
        if (head.getNext() == null) {
            head.setNext(element);
            size += 1;
            return;
        }
        if (size >= 2) {
            MyNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(element);
            current = current.getNext();
            current.setNext(null);
            size += 1;
        }
    }

    public int getSize() {
        return size;
    }
    public MyNode<T> getHead() {
        return head;
    }
}



