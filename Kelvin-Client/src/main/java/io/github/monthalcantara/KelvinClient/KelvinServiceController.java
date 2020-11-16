package io.github.monthalcantara.KelvinClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KelvinServiceController {

    @RequestMapping("/kelvin/{temp}")
    public Double convertCelciusToKelvin(@PathVariable("temp") Double temp) {
        Double kelvin = temp  + 273.15;
        return kelvin;
    }
}