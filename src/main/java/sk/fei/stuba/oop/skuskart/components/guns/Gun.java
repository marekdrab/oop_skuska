package sk.fei.stuba.oop.skuskart.components.guns;

import lombok.Data;
import sk.fei.stuba.oop.skuskart.support.Pattern;

@Data
public abstract class Gun extends Pattern {
    protected int caliber;
    protected int cadence;
    protected int spread;
}
