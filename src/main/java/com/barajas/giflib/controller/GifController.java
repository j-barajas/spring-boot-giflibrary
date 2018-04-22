package com.barajas.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jbara on 4/22/2018.
 */

    @Controller
    public class GifController {
        @RequestMapping(value="/")
        public String listGifs(){
            return "home";
        }

    @Controller
    public class GifInfo {
        @RequestMapping(value = "/gif")
        @ResponseBody
        public String listGifs() {
            return "GIF info page";
        }
    }
}
