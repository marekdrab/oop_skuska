package sk.fei.stuba.oop.skuskart.components.towers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.fei.stuba.oop.skuskart.support.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Tower extends Pattern {
    protected int rotateSpeed;
    protected int lineOfSight;
}
