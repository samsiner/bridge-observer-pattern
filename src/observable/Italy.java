package observable;

import restriction.RestrictionLevel;

public class Italy extends Country {
    protected final String president;

    public Italy(String name, int population, RestrictionLevel restrictionLevel) {
        super(name, population, restrictionLevel);
        this.president = "Mattarella";
    }

    @Override
    public String describeCountryAndRestriction() {
        return "This is " + name + " and it is led by President " + president + ". It is on the following restriction: " + restrictionLevel.getRestriction() + ".";
    }
}
