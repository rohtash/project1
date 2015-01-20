
package com.tesco.dropwizard.swagger.selenium;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;

import org.junit.runner.RunWith;

import com.tesco.dropwizard.swagger.TestApplicationWithPathSetProgramatically;

@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = TestApplicationWithPathSetProgramatically.class, yamlFile = "/test-default-2.yaml")
public class DefaultServerWithPathSetProgramaticallySeleniumTest extends SeleniumTest {

    @Override
    protected String getSwaggerUrl() {
        return "http://localhost:33333/api/swagger";
    }
}
