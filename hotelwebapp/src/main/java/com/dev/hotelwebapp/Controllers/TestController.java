package com.dev.hotelwebapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class TestController {

    @ModelAttribute("test")
    public Test construct() {
        return new Test();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
        System.out.println("Girdim get test e");
//        Test test =new Test(100,true,false,false);
        return "test";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/test")
    public String test(@ModelAttribute("test") Test test) {
        System.out.println("Girdim post test e ");

        System.out.println(test.getClientId());

        ArrayList<String> checkedOnes = new ArrayList<>();

//        test.isCheese() ? checkedOnes.add("cheese"):null;

        if (test.isCheese()) {
            checkedOnes.add("cheese");
        }
        if (test.isBacon()) {
            checkedOnes.add("bacon");
        }
        if (test.isJaccuzi()) {
            checkedOnes.add("jacuzzi");
        }

        for (int i = 0; i<= checkedOnes.size()-1; i++){

            System.out.println("this is checked: "+checkedOnes.get(i));
        }

        return "test";
    }


    public void addToList() {

    }

}
