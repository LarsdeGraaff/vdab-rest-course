package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by jeansmits on 7/07/15.
 */
@Entity
public class Merk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public String merk;
    public String adres;
    public String garage;

    public Merk(String merk, String adres,String garage) {
        this.merk = merk;
        this.adres = adres;
        this.garage=garage;
    }

    public Merk() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Merk{" +
                "id=" + id +
                ", merk='" + merk + '\'' +
                ", adres='" + adres + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}
