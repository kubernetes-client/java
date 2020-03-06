package io.kubernetes.client.spring.extended.controller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.Supplier;

/** The interface Kubernetes reconciler ready funcs. */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconcilerReadyFuncs {
  /**
   * A list of ready-function which blocks the reconciler from actual running.
   *
   * @return the class [ ]
   */
  Class<? extends Supplier<Boolean>>[] value() default {};
}
