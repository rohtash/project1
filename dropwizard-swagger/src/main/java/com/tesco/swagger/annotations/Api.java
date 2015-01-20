package com.tesco.swagger.annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Api
{
  String value();
  
  String description() default "";
  
  String basePath() default "";
  
  int position() default 0;
  
  String produces() default "";
  
  String consumes() default "";
  
  String protocols() default "";
  
  Authorization[] authorizations() default {@Authorization("")};
}

