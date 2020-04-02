package client;

import observer.CaseManager;
import observer.Observer;
import restriction.SocialDistancing;
import restriction.StayAtHome;
import restriction.TotalLockdown;
import state.Country;
import state.Germany;
import state.Italy;
import state.UnitedStates;

public class Main {
    public static void main(String[] args) {
        //Countries
        Country usa = new UnitedStates("USA", 327000000, new SocialDistancing());
        Country germany = new Germany("Germany", 82000000, new StayAtHome());
        Country italy = new Italy("Italy", 60000000, new TotalLockdown());

        System.out.println(usa.describeCountryAndRestriction());
        System.out.println(germany.describeCountryAndRestriction());
        System.out.println(italy.describeCountryAndRestriction());
        System.out.println();

        //Create managers for cases
        Observer caseManagerUsa = new CaseManager(usa);
        Observer caseManagerGermany = new CaseManager(germany);
        Observer caseManagerItaly = new CaseManager(italy);

        System.out.println(caseManagerUsa.getCaseDescription());
        usa.addObserver(caseManagerUsa);
        System.out.println(usa.notifyObservers(500000));
        System.out.println(caseManagerUsa.getCaseDescription());
        System.out.println(usa.notifyObservers(10000000));
        System.out.println(caseManagerUsa.getCaseDescription());
        System.out.println();

        System.out.println(caseManagerGermany.getCaseDescription());
        germany.addObserver(caseManagerGermany);
        System.out.println(germany.notifyObservers(300000));
        System.out.println(caseManagerGermany.getCaseDescription());
        System.out.println(usa.notifyObservers(3000000));
        System.out.println(caseManagerUsa.getCaseDescription());
        System.out.println();

        System.out.println(caseManagerItaly.getCaseDescription());
        italy.addObserver(caseManagerItaly);
        System.out.println(italy.notifyObservers(600000));
        System.out.println(caseManagerItaly.getCaseDescription());
        System.out.println(italy.notifyObservers(6000000));
        System.out.println(caseManagerItaly.getCaseDescription());
    }
}
