package com.platform.swagger.app;

import com.platform.swagger.config.SwaggerDropwizard;
import com.platform.swagger.resources.JavaRestResourceUtil;
import com.platform.swagger.resources.PersonResources;
import com.platform.swagger.resources.PetResource;
import com.platform.swagger.resources.TestResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PlatformApplication extends Application<TestConfiguration> {

    private final SwaggerDropwizard swaggerDropwizard = new SwaggerDropwizard();
    public static void main(String...args) throws Exception {
        new PlatformApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<TestConfiguration> bootstrap) {
        swaggerDropwizard.onInitialize(bootstrap);
    }

    @Override
    public void run(TestConfiguration configuration, Environment environment) throws Exception {
     
        environment.jersey().register(new TestResource());
        environment.jersey().register(new PersonResources());
        environment.jersey().register(new PetResource());
        environment.jersey().register(new JavaRestResourceUtil());
        swaggerDropwizard.onRun(configuration, environment, "localhost");
    }
}
