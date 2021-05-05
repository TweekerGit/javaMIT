package org.obrii.mit.dp2021.restServices.Domain;

import java.util.List;
import org.obrii.mit.dp2021.restServices.controller.Embedded;
import org.obrii.mit.dp2021.restServices.controller.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class MessageController {

    private final String URL = "http://localhost:3000/RubanMargoLab1/Lab7service/student";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getMessage")
    public String getFormData(Model model) {

        Embedded messageEntity = restTemplate.getForObject(URL, Embedded.class);
        
        List<Student> list = messageEntity.getListOfStudents().getStudentList();        
        
        model.addAttribute("students", list);

        return "index";
    }

    @PostMapping("/update")
    public String updateData(@RequestParam(name = "name") String name,
            @RequestParam(name = "email") String email,
            @RequestParam(name = "url") String url,
            Model model) {

        restTemplate.put(url, new Student(name,email));

        Embedded messageEntity = restTemplate.getForObject(URL, Embedded.class);
        
        List<Student> list = messageEntity.getListOfStudents().getStudentList();        
        
        model.addAttribute("students", list);

        return "index";
    }
   @PostMapping("/del")
    public String delData(
            @RequestParam(name = "url") String url,
            Model model) {

        restTemplate.delete(url);

        return getFormData(model);
    }
    
    @PostMapping("/post")
    public String postData(@RequestParam(name = "name") String name,
            @RequestParam(name = "email") String email,
            
            Model model) {

        restTemplate.postForObject(URL, new Student(name,email), Student.class);

        return getFormData(model);
    }
    
}