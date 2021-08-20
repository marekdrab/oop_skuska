package sk.fei.stuba.oop.skuskart.components.chassis;

import lombok.Data;
import sk.fei.stuba.oop.skuskart.support.Pattern;

@Data
public abstract class Chassis extends Pattern {
    protected int carryingCapacity;
    protected int spinSpeed;
    protected int topSpeed;
}
