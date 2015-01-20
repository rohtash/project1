
package com.tesco.dropwizard.swagger;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;
import org.junit.runner.RunWith;

@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = TestApplicationWithPathSetProgramatically.class, yamlFile = "/test-default-2.yaml")
public class DefaultServerWithPathSetProgramaticallyTest extends DropwizardTest {

    public DefaultServerWithPathSetProgramaticallyTest() {
        super(33333, "/api");
    }
}