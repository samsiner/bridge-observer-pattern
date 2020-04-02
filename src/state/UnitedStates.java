package state;

import restriction.RestrictionLevel;

public class UnitedStates extends Country {
    protected final String president;

    public UnitedStates(String name, int population, RestrictionLevel restrictionLevel) {
        super(name, population, restrictionLevel);
        this.president = "Trump";
    }

    @Override
    public String describeCountryAndRestriction() {
        return "This is " + name + " and it is led by President " + president + ". It is on the following restriction: " + restrictionLevel.getRestriction() + ".";
    }
}
