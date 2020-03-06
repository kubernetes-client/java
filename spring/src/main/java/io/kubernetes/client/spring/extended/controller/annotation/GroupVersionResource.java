package io.kubernetes.client.spring.extended.controller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** The standard Kubernetes group-version-resource. */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface GroupVersionResource {

  /**
   * Api group string. e.g. "batch"
   *
   * @return the string
   */
  String apiGroup() default "";

  /**
   * Api version string. e.g. "v1"
   *
   * @return the string
   */
  String apiVersion() default "v1";

  /**
   * Resource plural string. e.g. "jobs"
   *
   * @return the string
   */
  String resourcePlural() default "namespaces";
}
