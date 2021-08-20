package sk.fei.stuba.oop.skuskart.components.towers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.fei.stuba.oop.skuskart.components.guns.LightGun;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LightTower extends Tower{
    protected LightGun lightGun;
    @Override
    public String toString(){
        return "LightTower: "+getId()+" Name: "+getName()+
                " LineOfSight: "+getLineOfSight()+
                " RotateSpeed: "+getRotateSpeed()+
                " "+getLightGun();
    }
}
