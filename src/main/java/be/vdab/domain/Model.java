package be.vdab.domain;

/**
 * Created by jeansmits on 7/07/15.
 */
public abstract class Model {

    private String model;
    private Integer engine;

    public Model() {
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
