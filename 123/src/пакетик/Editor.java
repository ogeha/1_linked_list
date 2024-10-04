package пакетик;

import java.util.Observable;

public class Editor extends Observable {
    private EventManager eventManager
    public Editor(){


    }
    public void openFile(){
        setChanged();
        notifyObservers();
    }

    public void saveFile(){
        setChanged();
        notifyObservers();
    }
}
