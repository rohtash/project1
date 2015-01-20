package com.platform.swagger.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiModelProperty
{
  String value() default "";
  
  String allowableValues() default "";
  
  String access() default "";
  
  String notes() default "";
  
  String dataType() default "";
  
  boolean required() default false;
  
  int position() default 0;
}

