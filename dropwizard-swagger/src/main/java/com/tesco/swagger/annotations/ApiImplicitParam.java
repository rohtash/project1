package com.tesco.swagger.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiImplicitParam
{
  String name() default "";
  
  String value() default "";
  
  String defaultValue() default "";
  
  String allowableValues() default "";
  
  boolean required() default false;
  
  String access() default "";
  
  boolean allowMultiple() default false;
  
  String dataType() default "";
  
  String paramType() default "";
}

