package com.dev.hotelwebapp.Controllers;

import com.dev.hoteldb.Dao.Entity.Clients;
import com.dev.hoteldb.Main.DBTalker;
import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientsController {
    DBTalker dbTalker = new DBTalker();
    Clients currentClient = new Clients();
    boolean isUpdateMode = false;

    @ModelAttribute("clientRequestModel")
    public Clients construct() {
        return new Clients();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String client(Model model) {
        List<Clients> clients = dbTalker.getAllClients();

        model.addAttribute("clients", clients);

        if (isUpdateMode) {
            model.addAttribute("clientRequestModel", currentClient);

            model.addAttribute("methodName", "Update");
        } else {
            currentClient = new Clients();

            model.addAttribute("methodName", "Add");
        }

        isUpdateMode = false;

        return "clients";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String add(@ModelAttribute("clientRequestModel") Clients clientRequestModel) {

        if (clientRequestModel.getClientId() != null) {
            dbTalker.updateClient(clientRequestModel);
            isUpdateMode = false;
        } else {
            dbTalker.insertIntoClients(clientRequestModel);
        }

        return "redirect:/clients";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/update/{clientId}")
    public String update(@PathVariable Integer clientId, Model model) {

        currentClient = dbTalker.getClientById(clientId);

        isUpdateMode = true;

        return "redirect:/clients";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{clientId}")
    public String delete(@PathVariable Integer clientId, Model model) {
        try {
            dbTalker.deleteClient(clientId);
        } catch (Exception ex) {
            if (ex.getMessage().contains("foreign key constraint fails")) {
                model.addAttribute("foreignKeyException", "Bu istifadeçinin bağlı olduğu melumat mövcuddur. Silinə bilməz.");
            }
        }

//        foreign key constraint fails

        return "redirect:/clients";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/reset")
    public String reset() {

        currentClient = new Clients();

        return "redirect:/clients";
    }

}
