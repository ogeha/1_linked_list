package пакетик;

import java.util.Observable;
import java.util.Observer;
public class Main {

    Editor editor = new Editor();
    EmailAlertListener alertListener = new EmailAlertListener();
    LoggingListener loggingListener = new LoggingListener();



    public static void main(String[] args){
        MyList<Integer> list1 = new MyList<>();
        MyNode<Integer> el1 = new MyNode<Integer>(3);
        list1.add(el1);
        MyNode<Integer> el2 = new MyNode<Integer>(5);
        list1.add(el2);
        MyNode<Integer> el3 = new MyNode<Integer>(1);
        list1.add(el3);
        MyNode<Integer> el4 = new MyNode<Integer>(2);
        list1.add(el4);

        System.out.println(list1.getSize());
        System.out.println(el1.getNext());
        System.out.println(el2.getNext());
        System.out.println(el3.getNext());
        System.out.println(el4.getNext());
        System.out.println(el1.getValue());
        System.out.println(el2.getValue());
        System.out.println(el3.getValue());
        System.out.println(el4.getValue());

    }
}
