package sk.fei.stuba.oop.skuskart.vehicles;

import lombok.Data;
import sk.fei.stuba.oop.skuskart.support.Nationality;
import sk.fei.stuba.oop.skuskart.support.Pattern;

@Data
public abstract class VehicleType extends Pattern {
    protected Nationality nationality;
    protected int price;
}
