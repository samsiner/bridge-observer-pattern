package restriction;

public class SocialDistancing implements RestrictionLevel {
    @Override
    public String getRestriction() {
        return "Social Distancing";
    }

    @Override
    public String getRestrictionLongDescription() {
        return "People can leave their houses but should stay at least 6 feet away from each other.";
    }
}
