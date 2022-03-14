package model;

public class Paraguay extends Country {
    public Paraguay(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        initializeBorderCountries();
        setPopulation(7132538L);
    }

    public Paraguay() {
        setCountryName("Paraguay");
        setIso("PRY");
        setDimension(8516000L);
    }

    private void initializeBorderCountries() {
        getBorderCountries().add(new Argentina());
        getBorderCountries().add(new Brazil());
    }
}
