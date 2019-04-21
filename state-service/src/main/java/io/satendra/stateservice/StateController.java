package io.satendra.stateservice;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class StateController
{
    @Autowired
    private StateDao stateDao;

    @Value("${default.value:not specified}")
    private String environemnt;

    @GetMapping("/state-names")
    public Collection<StateEntity> getAllAvailableStates(){

        return stateDao.findAll();
        //return Arrays.asList("Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh");
    }

    @GetMapping("/env")
    public String getCurrentEnvironment(){

        return environemnt;
    }
}
