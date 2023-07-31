import com.roboter5123.backendtemplate.TestApplication;
import com.roboter5123.backendtemplate.rest.PingResource;
import com.roboter5123.backendtemplate.rest.model.Ping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = TestApplication.class)
@DataJpaTest
@TestPropertySource(properties = {
    "spring.jpa.hibernate.ddl-auto=none", // Disable auto DDL generation
    "spring.datasource.url=" // Set an empty URL to disable the default data source
})
class PingResourceTest {

    @Autowired
    private PingResource pingResource;

    @Test
    void ping_shouldReturnCurrentTime() {

        OffsetDateTime beforePing = OffsetDateTime.now().minusSeconds(1);
        Ping result = pingResource.ping();

        assertTrue(result.getTime().isAfter(beforePing));
        assertTrue(result.getTime().isBefore(OffsetDateTime.now().plusSeconds(1)));
    }
}
