package mk.ukim.finki.diseaseprediction.controllers;

import mk.ukim.finki.diseaseprediction.services.MainService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping("/predict")
    public boolean predictDisease(@RequestBody String requestBody) {
        return this.mainService.predictDisease(requestBody);
    }
}
