package sk.fei.stuba.oop.skuskart.components.chassis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeltChassis extends Chassis{
    protected int beltWidth;
    public String toString(){
        return "BeltChassis: ID: "+getId()+" Name: "+getName()+" CarryingCapacity: "+
                getCarryingCapacity()+" SpinSpeed: "+getSpinSpeed()+" TopSpeed: "+
                getTopSpeed()+" BeltWidth: "+getBeltWidth();
    }
}
