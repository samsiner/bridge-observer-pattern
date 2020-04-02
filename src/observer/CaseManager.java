package observer;

import state.Country;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CaseManager implements Observer {

    private int cases;
    private Country country;

    public CaseManager(Country country){
        this.cases = 0;
        this.country = country;
    }

    @Override
    public void update(int cases) {
        this.cases += cases;
    }

    public double getCasesPerCapita(){
        double percapita = (double) cases / country.getPopulation() * 100;
        return new BigDecimal(percapita).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String getCaseDescription() {
        return "There are " + cases + " cases in " + country.getName() + " and " + getCasesPerCapita() + "% of the population is infected.";
    }
}
