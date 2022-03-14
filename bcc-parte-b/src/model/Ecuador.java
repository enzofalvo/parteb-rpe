package model;

public class Ecuador extends Country {
    public Ecuador(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        initializeBorderCountries();
        setPopulation(17643054L);
    }

    public Ecuador() {
        setCountryName("Ecuador");
        setIso("ECU");
        setDimension(283560L);
    }

    private void initializeBorderCountries() {
        getBorderCountries().add(new Colombia());
        getBorderCountries().add(new Peru());
    }
}
