package za.co.fnb.nav.is.sfgpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import za.co.fnb.nav.is.sfgpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index"})
    public ModelAndView listOwners() {
        ModelAndView model = new ModelAndView();
        model.setViewName("owners/index");
        model.addObject("ownerlist", ownerService.findAll());
        return model;
    }
}

