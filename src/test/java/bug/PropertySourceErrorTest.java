package bug;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = ErrorConfiguration.class)
public class PropertySourceErrorTest extends AbstractTestNGSpringContextTests {
    @Test
    public void empty() {

    }
}
