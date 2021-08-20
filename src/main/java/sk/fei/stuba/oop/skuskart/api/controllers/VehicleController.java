package sk.fei.stuba.oop.skuskart.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sk.fei.stuba.oop.skuskart.api.servicelayer.ServiceLayer;
import sk.fei.stuba.oop.skuskart.vehicles.artillery.Artillery;
import sk.fei.stuba.oop.skuskart.vehicles.tanks.HeavyTank;
import sk.fei.stuba.oop.skuskart.vehicles.tanks.LightTank;

import java.util.Optional;

@Controller
public class VehicleController {
    private final ServiceLayer vehicleService;

    @Autowired
    public VehicleController(ServiceLayer vehicleService) {
        this.vehicleService = vehicleService;
    }
    @GetMapping("/")
    public String allVehicles(Model model){
        model.addAttribute("vehicles1",vehicleService.allArtillery());
        model.addAttribute("vehicles2",vehicleService.allLightTanks());
        model.addAttribute("vehicles3",vehicleService.allHeavyTanks());
        return "allvehicles";
    }

    @GetMapping("/vehicledetail/{id}")
    public String detailVehicle(@PathVariable int id, Model model){
        Optional<Artillery> ArtilleryByID = vehicleService.findArtilleryByID(id);
        if (ArtilleryByID.isPresent()) {
            Artillery vehicle = ArtilleryByID.get();
            model.addAttribute("vehicle", vehicle);
            return "vehicledetail";
        }
        Optional<LightTank> LightTankByID = vehicleService.findLightTankByID(id);
        if (LightTankByID.isPresent()) {
            LightTank vehicle = LightTankByID.get();
            model.addAttribute("vehicle", vehicle);
            return "vehicledetail";
        }
        Optional<HeavyTank> HeavyTankByID = vehicleService.findHeavyTankByID(id);
        if (HeavyTankByID.isPresent()) {
            HeavyTank vehicle = HeavyTankByID.get();
            model.addAttribute("vehicle", vehicle);
            return "vehicledetail";
        }
        return "allvehicles";
    }


}
