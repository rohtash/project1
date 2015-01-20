package com.tesco.swagger.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiParam
{
  String name() default "";
  
  String value() default "";
  
  String defaultValue() default "";
  
  String allowableValues() default "";
  
  boolean required() default false;
  
  String access() default "";
  
  boolean allowMultiple() default false;
}

