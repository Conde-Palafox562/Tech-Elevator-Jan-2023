package com.techelevator.reservations.controllers;


import com.techelevator.reservations.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable String name) {
        return "Hello  "+name+", this is a GET!";
    }

    @RequestMapping(path = "/helloperson", method = RequestMethod.POST)
    public String helloPerson (@RequestBody Person person) {
        return "Hello " + person.getFirstName() + " " + person.getLastName();
    }

    @RequestMapping(path = "/add/{val1}/{val2}")
    public int addTogether(@PathVariable int val1, @PathVariable int val2) {
        return val1 + val2;
    }

    @RequestMapping(path = "/hello", method = RequestMethod.POST)
    public String helloWorldPost() {
        return "Hello World, this is a POST!";
    }

    @RequestMapping(path = "/hello", method = RequestMethod.PUT)
    public String helloWorldPut() {
        return "Hello World, this is a PUT!";
    }

    @RequestMapping(path = "/hello", method = RequestMethod.DELETE)
    public String helloWorldDelete() {
        return "Hello World, this is a DELETE!";
    }

    @RequestMapping(path = "/greet", method = RequestMethod.GET)
    public String greetPeople(@RequestParam String person1, @RequestParam String person2) {

        String greeting = "Hello ";

        if (person1 != null) {
            greeting += person1;
        }
        if (person2 != null) {
            greeting += " and " + person2;
        }
        return greeting;
    }
}