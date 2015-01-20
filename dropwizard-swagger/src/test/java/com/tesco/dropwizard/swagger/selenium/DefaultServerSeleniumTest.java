
package com.tesco.dropwizard.swagger.selenium;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;
import org.junit.runner.RunWith;
import com.tesco.swagger.app.PlatformApplication;

@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = PlatformApplication.class, yamlFile = "/test-default.yaml")
public class DefaultServerSeleniumTest extends SeleniumTest {

    @Override
    protected String getSwaggerUrl() {
        return "http://localhost:44444/swagger";
    }
}
