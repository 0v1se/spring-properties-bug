package bug;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@IncludeApp1Properties
@PropertySource("app2.properties")
public class ErrorConfiguration {
    @Value("${intValue1}")
    private int value1;
    @Value("${intValue2}")
    private int value2;
}
