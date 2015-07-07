package be.vdab.domain;

/**
 * Created by jeansmits on 7/07/15.
 */
public class Merk {
    private String merk;
    private String adres;

    public Merk(String merk, String adres) {
        this.merk = merk;
        this.adres = adres;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
