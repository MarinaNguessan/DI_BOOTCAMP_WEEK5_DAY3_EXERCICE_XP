package adaci.bootcamp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MathController {
    @GetMapping("/somme/{nb1}/{nb2}")
    public String addition(@PathVariable("nb1") double nb1, @PathVariable("nb2") double nb2) {
        return "La somme est: " + (nb1 + nb2);
    }
    
}
