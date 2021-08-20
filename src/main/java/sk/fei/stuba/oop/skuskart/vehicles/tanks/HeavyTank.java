package sk.fei.stuba.oop.skuskart.vehicles.tanks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.fei.stuba.oop.skuskart.components.towers.Tower;
import sk.fei.stuba.oop.skuskart.components.chassis.BeltChassis;
import sk.fei.stuba.oop.skuskart.vehicles.VehicleType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeavyTank extends VehicleType {
    protected BeltChassis beltChassis;
    protected Tower tower;
    @Override
    public String toString(){
        String newLine = System.getProperty("line.separator");
        return "HeavyTank: "+getId()+" Name: "+getName()+
                " Nationality: "+getNationality()+
                " Price: "+getPrice()+
                " "+getBeltChassis()+
                " "+getTower();
    }
}
