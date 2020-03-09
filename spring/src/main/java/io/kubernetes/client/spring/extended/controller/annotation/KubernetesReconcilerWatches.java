package io.kubernetes.client.spring.extended.controller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Indicates details on setting up resource watches for reconciler. */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconcilerWatches {
  /**
   * Value kubernetes reconciler watch [ ].
   *
   * @return the kubernetes reconciler watch [ ]
   */
  KubernetesReconcilerWatch[] value() default {};
}
