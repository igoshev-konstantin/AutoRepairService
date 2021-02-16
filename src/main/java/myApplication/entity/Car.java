package myApplication.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carLabel_id", nullable = false)
    private CarLabel carLabel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carColor_id", nullable = false)
    private CarColor carColor;

    @Column(name = "modelName")
    private String modelName;
    @Column(name = "turboCharged")
    private boolean turboCharged;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarLabel getCarLabel() {
        return carLabel;
    }

    public void setCarLabel(CarLabel carLabel) {
        this.carLabel = carLabel;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isTurboCharged() {
        return turboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        this.turboCharged = turboCharged;
    }

    public Car() {
    }
}
