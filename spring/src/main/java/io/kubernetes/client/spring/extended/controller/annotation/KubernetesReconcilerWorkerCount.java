package io.kubernetes.client.spring.extended.controller.annotation;

import io.kubernetes.client.extended.controller.builder.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Overrides the reconciler worker count. */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconcilerWorkerCount {
  /**
   * The number of workers.
   *
   * @return the int
   */
  int value() default Constants.DEFAULT_WORKER_COUNT;
}
