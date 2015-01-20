
package com.tesco.dropwizard.swagger.selenium;
import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;

import org.junit.runner.RunWith;

import com.platform.swagger.app.PlatformApplication;
@DropwizardTestConfig(applicationClass = PlatformApplication.class, yamlFile = "/test-simple-root-path.yaml")
@RunWith(DropwizardJunitRunner.class)
public class SimpleServerSeleniumTest extends SeleniumTest {

    @Override
    protected String getSwaggerUrl() {
        return "http://localhost:55668/swagger";
    }
}
