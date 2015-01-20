
package com.tesco.dropwizard.swagger;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;

import org.junit.runner.RunWith;

import com.platform.swagger.app.PlatformApplication;


@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = PlatformApplication.class, yamlFile = "/test-default.yaml")
public class DefaultServerTest extends DropwizardTest {

    public DefaultServerTest() {
        super(44444, "/");
    }
}