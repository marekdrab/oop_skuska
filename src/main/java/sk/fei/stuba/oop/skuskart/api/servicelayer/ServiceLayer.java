package sk.fei.stuba.oop.skuskart.api.servicelayer;

import org.springframework.stereotype.Service;
import sk.fei.stuba.oop.skuskart.components.chassis.BeltChassis;
import sk.fei.stuba.oop.skuskart.components.chassis.WheelChassis;
import sk.fei.stuba.oop.skuskart.components.guns.HeavyGun;
import sk.fei.stuba.oop.skuskart.components.guns.LightGun;
import sk.fei.stuba.oop.skuskart.components.towers.HeavyTower;
import sk.fei.stuba.oop.skuskart.components.towers.LightTower;
import sk.fei.stuba.oop.skuskart.vehicles.artillery.Artillery;
import sk.fei.stuba.oop.skuskart.vehicles.tanks.HeavyTank;
import sk.fei.stuba.oop.skuskart.vehicles.tanks.LightTank;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class ServiceLayer {
    private final Map<Integer, Artillery> artilleryMap;
    private final Map<Integer, LightTank> lightTankMap;
    private final Map<Integer, HeavyTank> heavyTankMap;
    private final Map<Integer, LightGun>  lightGunMap;
    private final Map<Integer, HeavyGun> heavyGunMap;
    private final Map<Integer, LightTower> lightTowerMap;
    private final Map<Integer, HeavyTower> heavyTowerMap;
    private final Map<Integer, BeltChassis> beltChassisMap;
    private final Map<Integer, WheelChassis> wheelChassisMap;

    public ServiceLayer() {
        this.artilleryMap = new HashMap<>();
        this.lightTankMap = new HashMap<>();
        this.heavyTankMap = new HashMap<>();
        this.lightGunMap = new HashMap<>();
        this.heavyGunMap = new HashMap<>();
        this.lightTowerMap = new HashMap<>();
        this.heavyTowerMap = new HashMap<>();
        this.beltChassisMap = new HashMap<>();
        this.wheelChassisMap = new HashMap<>();
    }

    public Map<Integer, Artillery> allArtillery(){
        return this.artilleryMap;
    }
    public Map<Integer,LightTank> allLightTanks(){
        return this.lightTankMap;
    }
    public Map<Integer,HeavyTank> allHeavyTanks(){
        return this.heavyTankMap;
    }
    public Map<Integer,LightGun> allLightGuns(){
        return this.lightGunMap;
    }
    public Map<Integer,HeavyGun> allHeavyGuns(){
        return this.heavyGunMap;
    }
    public Map<Integer,LightTower> allLightTowers(){
        return this.lightTowerMap;
    }
    public Map<Integer,HeavyTower> allHeavyTowers(){
        return this.heavyTowerMap;
    }
    public Map<Integer,BeltChassis> allBeltChassis(){
        return this.beltChassisMap;
    }
    public Map<Integer,WheelChassis> allWheelChassis(){
        return this.wheelChassisMap;
    }

    public  Optional<Artillery> findArtilleryByID(int id) {
        return Optional.ofNullable(artilleryMap.get(id));
    }
    public  Optional<LightTank> findLightTankByID(int id) {
        return Optional.ofNullable(lightTankMap.get(id));
    }
    public  Optional<HeavyTank> findHeavyTankByID(int id) {
        return Optional.ofNullable(heavyTankMap.get(id));
    }

    public Optional<BeltChassis> findBeltChassisByID(int id) {
        return Optional.ofNullable(beltChassisMap.get(id));
    }
    public Optional<WheelChassis> findWheelChassisByID(int id) {
        return Optional.ofNullable(wheelChassisMap.get(id));
    }

    public Optional<LightGun> findLightGunByID(int id) {
        return Optional.ofNullable(lightGunMap.get(id));
    }
    public Optional<HeavyGun> findHeavyGunByID(int id) {
        return Optional.ofNullable(heavyGunMap.get(id));
    }

    public Optional<LightTower> findLightTowerByID(int id) {
        return Optional.ofNullable(lightTowerMap.get(id));
    }
    public Optional<HeavyTower> findHeavyTowerByID(int id) {
        return Optional.ofNullable(heavyTowerMap.get(id));
    }

    public void addArtillery(Artillery artillery){
        this.artilleryMap.put(artillery.getId(),artillery);
    }
    public void addLightTank(LightTank lightTank){
        this.lightTankMap.put(lightTank.getId(),lightTank);
    }
    public void addHeavyTank(HeavyTank heavyTank){
        this.heavyTankMap.put(heavyTank.getId(),heavyTank);
    }

    public void addBeltChassis(BeltChassis beltChassis){
        this.beltChassisMap.put(beltChassis.getId(),beltChassis);
    }
    public void addWheelChassis(WheelChassis wheelChassis){ this.wheelChassisMap.put(wheelChassis.getId(),wheelChassis);}

    public void addLightGun(LightGun lightGun){ this.lightGunMap.put(lightGun.getId(),lightGun);}
    public void addHeavyGun(HeavyGun heavyGun){ this.heavyGunMap.put(heavyGun.getId(),heavyGun);}

    public void addLightTower(LightTower lightTower){ this.lightTowerMap.put(lightTower.getId(),lightTower);}
    public void addHeavyTower(HeavyTower heavyTower){ this.heavyTowerMap.put(heavyTower.getId(),heavyTower);}


}