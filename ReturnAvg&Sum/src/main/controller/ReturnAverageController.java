package main.controller;

import main.service.Calculate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*TODO: Features to be implemented...
        1.Handle CORS issue per : https://medium.com/@baphemot/understanding-cors-18ad6b478e2b
        2.Perform input validation
        3. Create a Web UI Application Component that does the following:
            a. displays a web form tht allows users to input a max of 10 entries
            b. creates a button that has the reset form functionality
            c. creates a button that will submit the form to the RESTful service asynchronously
            d. displays the calculated result on the screen from the above call
*/

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
