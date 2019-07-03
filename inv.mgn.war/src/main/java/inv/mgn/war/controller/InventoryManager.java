package inv.mgn.war.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryManager {

    @GetMapping("/getAllInventory")
    public String getAllInventory(){
        return "Hello World!";
    }
}
