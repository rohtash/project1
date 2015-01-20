
package com.tesco.dropwizard.swagger;

import com.tesco.swagger.app.TestConfiguration;
import com.tesco.swagger.config.SwaggerDropwizard;
import com.tesco.swagger.resources.TestResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TestApplicationWithPathSetProgramatically extends Application<TestConfiguration> {

    private final SwaggerDropwizard swaggerDropwizard = new SwaggerDropwizard();

    @Override
    public void initialize(Bootstrap<TestConfiguration> bootstrap) {
        swaggerDropwizard.onInitialize(bootstrap);
    }

    @Override
    public void run(TestConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().setUrlPattern("/api/*");
        environment.jersey().register(new TestResource());
        swaggerDropwizard.onRun(configuration, environment, "localhost");
    }
}
