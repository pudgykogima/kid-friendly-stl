package com.egniebauer.controllers;

import com.egniebauer.models.BestTime;
import com.egniebauer.models.data.BestTimeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Elizabeth G Niebauer
 */

@Controller
@RequestMapping(value = "admin/times")
public class BestTimeController {

    @Autowired
    private BestTimeDao bestTimeDao;


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddTime(Model model) {
        model.addAttribute("h1", "Add Time");
        model.addAttribute("title", "Kid Friendly STL - Admin");

        model.addAttribute(new BestTime());
        return "bestTime/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddTime(@ModelAttribute @Valid BestTime newTime,
                                 Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("h1", "Add Time");
            model.addAttribute("title", "Kid Friendly STL - Admin");
            return "bestTime/add";
        }
        bestTimeDao.save(newTime);
        return "redirect:/admin";
    }
}
