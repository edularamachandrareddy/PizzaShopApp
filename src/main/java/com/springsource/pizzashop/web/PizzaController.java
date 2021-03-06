package com.springsource.pizzashop.web;
import com.springsource.pizzashop.domain.Pizza;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Pizza.class)
@Controller
@RequestMapping("/pizzas")
@RooWebScaffold(path = "pizzas", formBackingObject = Pizza.class)
public class PizzaController {
}
