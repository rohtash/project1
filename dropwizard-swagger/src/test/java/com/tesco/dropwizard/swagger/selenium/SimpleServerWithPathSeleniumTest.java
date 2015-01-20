
package com.tesco.dropwizard.swagger.selenium;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;
import org.junit.runner.RunWith;
import com.tesco.swagger.app.PlatformApplication;

@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = PlatformApplication.class, yamlFile = "/test-simple-with-path.yaml")
public class SimpleServerWithPathSeleniumTest extends SeleniumTest {

    @Override
    protected String getSwaggerUrl() {
        return "http://localhost:55667/api/swagger";
    }
}
