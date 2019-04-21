package io.satendra.cityservice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController
{
    @GetMapping("/city-names")
    public Collection<String> getAvailableCityNames()
    {
        return List.of("Mumbai", "Delhi", "Bangalore", "Hyderabad");
    }
}
