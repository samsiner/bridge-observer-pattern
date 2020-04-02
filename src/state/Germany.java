package state;

import restriction.RestrictionLevel;

public class Germany extends Country {
    protected final String chancellor;

    public Germany(String name, int population, RestrictionLevel restrictionLevel) {
        super(name, population, restrictionLevel);
        this.chancellor = "Merkel";
    }

    @Override
    public String describeCountryAndRestriction() {
        return "This is " + name + " and it is led by Chancellor " + chancellor + ". It is on the following restriction: " + restrictionLevel.getRestriction() + ".";}
}
