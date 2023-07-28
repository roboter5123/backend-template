import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingResource {

    @GetMapping()
    @ResponseBody
    public com.roboter5123.Ping ping() {

        return new com.roboter5123.Ping();
    }

}
