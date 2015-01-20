package com.tesco.swagger.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiOperation
{
  String value();
  
  String notes() default "";
  
  Class<?> response() default Void.class;
  
  String responseContainer() default "";
  
  String tags() default "";
  
  String httpMethod() default "";
  
  int position() default 0;
  
  String nickname() default "";
  
  String produces() default "";
  
  String consumes() default "";
  
  String protocols() default "";
  
  Authorization[] authorizations() default {@Authorization("")};
}
