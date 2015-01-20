
package com.tesco.dropwizard.swagger;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;

import org.junit.runner.RunWith;

import com.platform.swagger.app.PlatformApplication;

@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = PlatformApplication.class, yamlFile = "/test-simple-with-path.yaml")
public class SimpleServerWithPathTest extends DropwizardTest {

    public SimpleServerWithPathTest() {
        super(55667, "/api");
    }
}
