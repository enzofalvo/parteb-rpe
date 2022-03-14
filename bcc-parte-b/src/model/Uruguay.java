package model;

public class Uruguay extends Country {
    public Uruguay(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        initializeBorderCountries();
        setPopulation(3473730L);
    }

    public Uruguay() {
        setCountryName("Uruguay");
        setIso("URY");
        setDimension(176215L);
    }

    private void initializeBorderCountries() {
        getBorderCountries().add(new Argentina());
        getBorderCountries().add(new Brazil());
    }
}
