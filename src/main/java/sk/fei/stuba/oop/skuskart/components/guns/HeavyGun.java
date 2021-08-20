package sk.fei.stuba.oop.skuskart.components.guns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeavyGun extends Gun{
    protected int explosionRadius;
    @Override
    public String toString(){
        return "HeavyGun: "+getId()+" Name: "+getName()+
                " ExplosionRadius: "+getExplosionRadius()+
                " Cadence: "+getCadence()+
                " Caliber: "+getCaliber()+
                " Spread: "+getSpread();
    }
}
