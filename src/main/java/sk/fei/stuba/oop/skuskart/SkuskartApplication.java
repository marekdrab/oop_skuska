package sk.fei.stuba.oop.skuskart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.fei.stuba.oop.skuskart.api.servicelayer.ServiceLayer;
import sk.fei.stuba.oop.skuskart.components.chassis.BeltChassis;
import sk.fei.stuba.oop.skuskart.components.guns.HeavyGun;
import sk.fei.stuba.oop.skuskart.components.towers.HeavyTower;
import sk.fei.stuba.oop.skuskart.support.IdGeneratorComponents;
import sk.fei.stuba.oop.skuskart.support.IdGeneratorVehicles;
import sk.fei.stuba.oop.skuskart.support.Nationality;
import sk.fei.stuba.oop.skuskart.vehicles.tanks.HeavyTank;

@SpringBootApplication
public class SkuskartApplication implements CommandLineRunner {
    private ServiceLayer serviceLayer;

    public SkuskartApplication(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    public static void main(String[] args) {
        SpringApplication.run(SkuskartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        BeltChassis beltChassis = new BeltChassis(20);
        beltChassis.setId(IdGeneratorComponents.newId());
        beltChassis.setName("IS-3M");
        beltChassis.setCarryingCapacity(500);
        beltChassis.setSpinSpeed(15);
        beltChassis.setTopSpeed(50);
        serviceLayer.addBeltChassis(beltChassis);

        HeavyGun heavyGun = new HeavyGun(8);
        heavyGun.setId(IdGeneratorComponents.newId());
        heavyGun.setName("BL-9");
        heavyGun.setCadence(50);
        heavyGun.setCaliber(122);
        heavyGun.setSpread(120);
        serviceLayer.addHeavyGun(heavyGun);

        HeavyTower heavyTower = new HeavyTower(heavyGun);
        heavyTower.setId(IdGeneratorComponents.newId());
        heavyTower.setName("IS-3");
        heavyTower.setLineOfSight(85);
        heavyTower.setRotateSpeed(40);
        serviceLayer.addHeavyTower(heavyTower);

        HeavyTank heavyTank = new HeavyTank(beltChassis,heavyTower);
        heavyTank.setId(IdGeneratorVehicles.newId());
        heavyTank.setName("IS-3");
        heavyTank.setNationality(Nationality.USA);
        heavyTank.setPrice(8888);
        serviceLayer.addHeavyTank(heavyTank);
    }

}
