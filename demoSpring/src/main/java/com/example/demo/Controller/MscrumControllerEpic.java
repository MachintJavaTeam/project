package com.example.demo.Controller;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Epic;
//import com.example.mscrum.Entity.Project;
//import com.example.mscrum.Entity.Project;
//import com.example.mscrum.Service.MscrumService;
import com.example.demo.Services.MscrumServiceEpic;
 
@RestController
public class MscrumControllerEpic {
 
    @Autowired
    private MscrumServiceEpic mscrumServiceEpic;
    
    @PostMapping("/epic")
    public ResponseEntity<Epic> saveEpic(@RequestBody Epic epic) {
 
       Epic object1 = mscrumServiceEpic.addEpic(epic);
        return new ResponseEntity<>(object1, HttpStatus.OK);
    }
 
    @GetMapping("/get-epic")
    public ResponseEntity<List<Epic>> getAllEpics() {
 
        List<Epic> epic = mscrumServiceEpic.getAllEpics();
        return new ResponseEntity<>(epic, HttpStatus.OK);
    }
 
    
 
   /* @PutMapping("/epic")
    public ResponseEntity<Epic> updateEpic(@RequestBody Epic epic) {
 
       Epic object1 = mscrumServiceEpic.editEpic(epic);
        return new ResponseEntity<>(object1, HttpStatus.OK);
    }
 
    @DeleteMapping("/epic")
    public ResponseEntity<String> deleteEpic(@RequestParam(name = "epic_id") Integer epic_id) {
 
        mscrumServiceEpic.deleteEpic(epic_id);
        return new ResponseEntity<>("Epic with ID :" + epic_id + " deleted successfully", HttpStatus.OK);
    }*/
}