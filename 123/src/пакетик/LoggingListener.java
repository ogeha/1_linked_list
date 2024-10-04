package пакетик;

import java.util.Observable;
import java.util.Observer;


public class LoggingListener implements EventListeners {


    public void update(Observable o, Object arg) {
        System.out.println("сообщение в LOG" + arg);
    }

    @Override
    public void update(String event) {

    }
}
