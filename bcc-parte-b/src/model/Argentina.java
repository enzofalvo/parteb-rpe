package model;

public class Argentina extends Country {
    public Argentina(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        initializeBorderCountries();
        setPopulation(45195774L);
    }

    public Argentina() {
        setCountryName("Argentina");
        setIso("ARG");
        setDimension(2780000L);
    }

    private void initializeBorderCountries() {
        getBorderCountries().add(brazil);
        getBorderCountries().add(new Paraguay());
        getBorderCountries().add(new Uruguay());
    }
}