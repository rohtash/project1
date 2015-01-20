
package com.tesco.dropwizard.swagger;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;

import org.junit.runner.RunWith;

import com.platform.swagger.app.PlatformApplication;

@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = PlatformApplication.class, yamlFile = "/test-simple-root-path.yaml")
public class SimpleServerTest extends DropwizardTest {

    public SimpleServerTest() {
        super(55668, "/");
    }
}
