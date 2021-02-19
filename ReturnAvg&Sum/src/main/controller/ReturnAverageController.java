package main.controller;

import main.service.Calculate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Find")
public class ReturnAverageController {
    Calculate calculateService = new Calculate();

    @RequestMapping("/sum")
    public int calculateSum(@RequestParam List<Number> numbersList) {
        return calculateService.calculateSum(numbersList);
    }

    @RequestMapping("/average")
    public int calculateAverage(@RequestParam List<Number> numbersList) {
        return calculateService.calculateAverage(numbersList);
    }

    @RequestMapping("/status")
    public String returnStatus() {
        return "If you're seeing this message, the application is working as expected...";
    }


}
