package io.github.monthalcantara.ConverClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {

    private RestTemplate restTemplate;

    public ApiController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/conver/{temp}")
    public String convert(@PathVariable("temp") Double temp) {
        Double fahrenheit = restTemplate.getForObject("http://fahrenheit-service/farenheit/{temp}", Double.class, temp);
        Double kelvin = restTemplate.getForObject("http://kelvin-service/kelvin/{temp}", Double.class, temp);
        return "Fahrenheit: " + fahrenheit +  " Kelvin : " + kelvin;
    }
}
