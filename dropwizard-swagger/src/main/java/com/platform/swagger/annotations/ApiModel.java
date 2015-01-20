package com.platform.swagger.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiModel
{
  String value() default "";
  
  String description() default "";
  
  Class<?> parent() default Void.class;
  
  String discriminator() default "";
  
  Class<?>[] subTypes() default {};
}

