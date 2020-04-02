package state;

import observer.Observer;

public interface Observable {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public String notifyObservers(int cases);
}
