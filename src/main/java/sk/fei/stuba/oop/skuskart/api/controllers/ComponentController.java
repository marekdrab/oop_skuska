package sk.fei.stuba.oop.skuskart.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sk.fei.stuba.oop.skuskart.api.servicelayer.ServiceLayer;
import sk.fei.stuba.oop.skuskart.components.chassis.BeltChassis;
import sk.fei.stuba.oop.skuskart.components.chassis.WheelChassis;
import sk.fei.stuba.oop.skuskart.components.guns.HeavyGun;
import sk.fei.stuba.oop.skuskart.components.guns.LightGun;
import sk.fei.stuba.oop.skuskart.components.towers.HeavyTower;
import sk.fei.stuba.oop.skuskart.components.towers.LightTower;
import sk.fei.stuba.oop.skuskart.vehicles.artillery.Artillery;
import sk.fei.stuba.oop.skuskart.vehicles.tanks.HeavyTank;
import sk.fei.stuba.oop.skuskart.vehicles.tanks.LightTank;

import java.util.Optional;

@Controller
public class ComponentController {
    private final ServiceLayer componentService;

    public ComponentController(ServiceLayer componentService) {
        this.componentService = componentService;
    }

    @GetMapping("/allcomponents")
    public String allComponents(Model model){
        model.addAttribute("components1",componentService.allBeltChassis());
        model.addAttribute("components2",componentService.allWheelChassis());
        model.addAttribute("components3",componentService.allLightGuns());
        model.addAttribute("components4",componentService.allHeavyGuns());
        model.addAttribute("components5",componentService.allLightTowers());
        model.addAttribute("components6",componentService.allHeavyTowers());
        return "allcomponents";
    }
    @GetMapping("/componentdetail/{id}")
    public String detailVehicle(@PathVariable int id, Model model){
        Optional<BeltChassis> BeltChassisByID = componentService.findBeltChassisByID(id);
        if (BeltChassisByID.isPresent()) {
            BeltChassis component = BeltChassisByID.get();
            model.addAttribute("component", component);
            return "componentdetail";
        }
        Optional<WheelChassis> WheelChassisByID = componentService.findWheelChassisByID(id);
        if (WheelChassisByID.isPresent()) {
            WheelChassis component = WheelChassisByID.get();
            model.addAttribute("component", component);
            return "componentdetail";
        }
        Optional<LightGun> LightGunByID = componentService.findLightGunByID(id);
        if (LightGunByID.isPresent()) {
            LightGun component = LightGunByID.get();
            model.addAttribute("component", component);
            return "componentdetail";
        }
        Optional<HeavyGun> HeavyGunByID = componentService.findHeavyGunByID(id);
        if (HeavyGunByID.isPresent()) {
            HeavyGun component = HeavyGunByID.get();
            model.addAttribute("component", component);
            return "componentdetail";
        }
        Optional<LightTower> LightTowerByID = componentService.findLightTowerByID(id);
        if (LightTowerByID.isPresent()) {
            LightTower component = LightTowerByID.get();
            model.addAttribute("component", component);
            return "componentdetail";
        }
        Optional<HeavyTower> HeavyTowerByID = componentService.findHeavyTowerByID(id);
        if (HeavyTowerByID.isPresent()) {
            HeavyTower component = HeavyTowerByID.get();
            model.addAttribute("component", component);
            return "componentdetail";
        }
        return "allvehicles";
    }

}
