package sk.fei.stuba.oop.skuskart.components.towers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.fei.stuba.oop.skuskart.components.guns.HeavyGun;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeavyTower extends Tower{
    protected HeavyGun heavyGun;
    @Override
    public String toString(){
        return "HeavyTower: "+getId()+" Name: "+getName()+
                " LineOfSight: "+getLineOfSight()+
                " RotateSpeed: "+getRotateSpeed()+
                " "+getHeavyGun();
    }
}
