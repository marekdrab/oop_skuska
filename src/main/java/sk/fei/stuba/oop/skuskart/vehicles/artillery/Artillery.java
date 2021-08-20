package sk.fei.stuba.oop.skuskart.vehicles.artillery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sk.fei.stuba.oop.skuskart.components.chassis.BeltChassis;
import sk.fei.stuba.oop.skuskart.components.guns.HeavyGun;
import sk.fei.stuba.oop.skuskart.vehicles.VehicleType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artillery extends VehicleType {
   protected BeltChassis beltChassis;
   protected HeavyGun heavyGun;
   @Override
   public String toString(){
      return "Artillery: "+getId()+"\n"+getName()+"\n"+getNationality()+"\n"+getPrice()+"\n"+getBeltChassis()+"\n"+getHeavyGun();
   }
}
