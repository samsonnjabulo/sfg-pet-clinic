package za.co.fnb.nav.is.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.co.fnb.nav.is.sfgpetclinic.services.VetService;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index"})
    public ModelAndView listVets() {
        ModelAndView model = new ModelAndView();
        model.setViewName("vets/index");
        model.addObject("vetList", vetService.findAll());
        return model;
    }
}
