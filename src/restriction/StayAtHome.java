package restriction;

public class StayAtHome implements RestrictionLevel {
    @Override
    public String getRestriction() {
        return "Stay-at-Home";
    }

    @Override
    public String getRestrictionLongDescription() {
        return "People should not leave their house except for essential needs. This is enforced by peer pressure.";
    }
}
