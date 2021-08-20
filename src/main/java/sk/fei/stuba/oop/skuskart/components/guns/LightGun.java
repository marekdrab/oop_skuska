package sk.fei.stuba.oop.skuskart.components.guns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LightGun extends Gun {
    protected int magCapacity;
    @Override
    public String toString(){
        return "LightGun: "+getId()+" Name: "+getName()+
                " MagCapacity: "+getMagCapacity()+
                " Cadence: "+getCadence()+
                " Caliber: "+getCaliber()+
                " Spread: "+getSpread();
    }
}
