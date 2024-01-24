package struts.inventorio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import struts.inventorio.serviceLayer.beveragesServiceLayer;

@Controller
public class InventorioController {
    private beveragesServiceLayer BeveragesServiceLayer;

    @Autowired
    public InventorioController(beveragesServiceLayer BeveragesServiceLayer) {
        this.BeveragesServiceLayer = BeveragesServiceLayer;
    }

    @GetMapping("/")
    public String mainPage(){
        return "main-page";
    }

}
