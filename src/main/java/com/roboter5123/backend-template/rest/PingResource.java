package com.roboter5123.backend-template;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.roboter5123.template.rest.model.Ping;

@RestController
@RequestMapping("/ping")
public class PingResource {

    @GetMapping()
    @ResponseBody
    public Ping ping() {

        return new Ping();
    }

}
