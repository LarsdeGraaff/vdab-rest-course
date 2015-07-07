package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by jeansmits on 7/07/15.
 */
@Entity
public class Model {
    @Id
    @GeneratedValue
    private int id;

    public String model;
    public Integer engine;

    @OneToOne
    private Merk merk;

    public Model() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public Merk getMerk() {
        return merk;
    }

    public void setMerk(Merk merk) {
        this.merk = merk;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
