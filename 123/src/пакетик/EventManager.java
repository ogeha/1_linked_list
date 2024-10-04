package пакетик;

import java.util.List;

public class EventManager {

    private List<EventListeners> listeners;

    public void subscribe(EventListeners eventListeners){
        listeners.add(eventListeners);
    }

    public void unsubscribe(EventListeners eventListeners){
        listeners.remove(eventListeners);
    }
    public void notifyAll(String event){
        listeners.forEach(eventListeners -> eventListeners.update(event));

    }
}
