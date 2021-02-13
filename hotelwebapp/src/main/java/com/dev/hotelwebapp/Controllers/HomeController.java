package com.dev.hotelwebapp.Controllers;

import com.dev.hoteldb.Dao.Entity.Reservation;
import com.dev.hoteldb.Main.DBTalker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/home")
public class HomeController {
    private DBTalker dbTalker = new DBTalker();

    @ModelAttribute("addrequestmodel")
    public AddRequestModel construct() {
        return new AddRequestModel();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String index() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/payment")
    public String payment() {
        return "payment";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/reservations")
    public String reservations(Model model) {

        List<Reservation> reservationList = dbTalker.getAllReservations();

        model.addAttribute("reservationList", reservationList);

        return "reservations";
    }

    // add get reservation request model
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String Add() {

        System.out.println("add get");

        return "addorupdate";
    }

    //update get reservation request model
    @RequestMapping(value = "/update/{clientId}", method = RequestMethod.GET)
    public String Update(@PathVariable Integer clientId, Model model) {

        if (clientId != 0) {

            System.out.println("Client id(update) : " + clientId);

            AddRequestModel addRequestModel = new AddRequestModel();

            model.addAttribute("addrequestmodel", addRequestModel);

            return "addorupdate";
        }

        return "redirect:reservations";
    }


    //add or update  post reservation request model
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String Add(@ModelAttribute("addrequestmodel") AddRequestModel addRequestModel) {

        if (addRequestModel.getClientId() != null && addRequestModel.getClientId() != 0) {
            //update operation
            System.out.println("Client id(update) : " + addRequestModel.getClientId());
        } else if (addRequestModel.getClientId() != null) {

            dbTalker.insertIntoReservation(addRequestModel);
            System.out.println("Client id(add) : " + addRequestModel.getClientId());
        }
        //dbTalker.getRequestModel(addRequestModel);

        return "redirect:reservations";
    }


    //delete  reservation request model
    @RequestMapping(method = RequestMethod.GET, value = "/delete/{clientId}")
    public String Delete(@PathVariable int clientId) {

        if (clientId != 0) {
            //delete operation
            System.out.println("Client id(delete) : " + clientId);
        }

        System.out.println("delete get method");

        return "redirect:reservations";
    }


}

