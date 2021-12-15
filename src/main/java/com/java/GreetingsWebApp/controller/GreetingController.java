/*
 * Enterprise Java Development - Final Test
 * Due December 15th 2021       
 * Authors: Camila Barbosa 192622796
 */
package com.java.GreetingsWebApp.controller;

import com.java.GreetingsWebApp.model.Greeting;
import com.java.GreetingsWebApp.repository.GreetingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author camilabarbosa
 */

@Controller
public class GreetingController {
    @Autowired
    GreetingRepository greetingRepository;
    
    @RequestMapping({"/main_page", "/"})
     public String main_Page (Model model){
         System.out.println("***********Entrou no main_page");
         
        List <Greeting> greetingkList = greetingRepository.findAll();
        
        model.addAttribute("greetingkList", greetingkList);
        return "mainPage";
         
     }
     
      @RequestMapping ({"/add_Greeting"})
    public String add_Greeting(){        
        return "addGreeting";
        
    }
    
    @RequestMapping (value="/save_Greeting", method= RequestMethod.POST )
    public String save_Greeting(@ModelAttribute Greeting greeting){   
      
      greetingRepository.save(greeting);
        return "forward:main_page";
        
    }
     
}

