package observable;

import observer.Observer;
import restriction.RestrictionLevel;

import java.util.ArrayList;

public abstract class Country implements Observable {
    protected final String name;
    protected final int population;
    protected RestrictionLevel restrictionLevel;
    protected ArrayList<Observer> observers = new ArrayList<>();

    protected Country(String name, int population, RestrictionLevel restrictionLevel){
        this.name = name;
        this.population = population;
        this.restrictionLevel = restrictionLevel;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public String notifyObservers(int newcases) {
        for (Observer o: observers){
            o.update(newcases);
        }
        return "---->AHH!! There are now " + newcases + " new cases in " + name + "!";
    }

    public abstract String describeCountryAndRestriction();

    public void addCoronaCases(int newcases){
        notifyObservers(newcases);
    }

    public int getPopulation(){ return population; }

    public String getName(){ return name; }
}
