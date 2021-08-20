package sk.fei.stuba.oop.skuskart.components.chassis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WheelChassis extends Chassis{
    protected int wheels;
    public String toString(){
        return "WheelChassis: "+getId()+" Name: "+getName()+" CarryingCapacity: "+
                getCarryingCapacity()+" SpinSpeed: "+getSpinSpeed()+" TopSpeed: "+
                getTopSpeed()+" Wheels: "+getWheels();
    }
}
