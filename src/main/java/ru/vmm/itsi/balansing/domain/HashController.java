package ru.vmm.itsi.balansing.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hash")
public class HashController {

    @Autowired
    private CounterService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> increment(){
        service.incrementCount();
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @RequestMapping(value = "/stats", method = RequestMethod.GET, produces = "text/plain")
    public ResponseEntity<String> getCount(){
        return new ResponseEntity<>(String.valueOf(service.getCount()), HttpStatus.OK);
    }
}
