package inv.mgn.war.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for Inventory Manager
 */
@Controller
public class InventoryManagerController {

    @GetMapping("/getAllInventory")
    public String getAllInventory(){
        return "Hello World!";
    }
}
