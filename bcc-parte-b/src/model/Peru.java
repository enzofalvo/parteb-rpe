package model;

public class Peru extends Country {
    public Peru(String countryName, String iso, Long dimension) {
        super(countryName, iso, dimension);
        initializeBorderCountries();
        setPopulation(32971854L);
    }

    public Peru() {
        setCountryName("Peru");
        setIso("PER");
        setDimension(1285000L);
    }

    private void initializeBorderCountries() {
        getBorderCountries().add(new Brazil());
        getBorderCountries().add(new Colombia());
        getBorderCountries().add(new Ecuador());
    }
}
