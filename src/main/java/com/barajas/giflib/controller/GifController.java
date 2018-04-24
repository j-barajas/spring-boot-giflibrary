package com.barajas.giflib.controller;

import com.barajas.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

/**
 * Created by jbara on 4/22/2018.
 */

@Controller
public class GifController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot",LocalDate.of(2018,04,23),"Jorge",true);
        modelMap.put("gif", gif);
        return "gif-details";
    }

}

