package restriction;

public class TotalLockdown implements RestrictionLevel {
    @Override
    public String getRestriction() {
        return "Total Lockdown";
    }

    @Override
    public String getRestrictionLongDescription() {
        return "Nobody is allowed to leave the house for any reason. This is enforced by the police.";
    }
}
