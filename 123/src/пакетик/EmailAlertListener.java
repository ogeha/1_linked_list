package пакетик;

import java.util.Observable;
import java.util.Observer;

public class EmailAlertListener implements EventListeners {

    public void update(Observable o, Object arg) {
        System.out.println("сообщение на email" + arg);
    }

    @Override
    public void update(String event) {

    }
}
