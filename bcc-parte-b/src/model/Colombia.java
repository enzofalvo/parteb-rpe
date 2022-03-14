package model;

public class Colombia extends Country {
    public Colombia(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        initializeBorderCountries();
        setPopulation(50882891L);
    }

    public Colombia() {
        setCountryName("Colombia");
        setIso("COL");
        setDimension(1142000L);
    }

    private void initializeBorderCountries() {
        getBorderCountries().add(new Brazil());
        getBorderCountries().add(new Ecuador());
        getBorderCountries().add(new Peru());
    }
}
