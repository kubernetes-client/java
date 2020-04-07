package io.kubernetes.client.spring.extended.controller.annotation;

import io.kubernetes.client.extended.controller.builder.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The declaring class is a kubernetes reconciler which implements {@link
 * io.kubernetes.client.extended.controller.reconciler.Reconciler}.
 *
 * <p>Indicates that we're creating a Controller into the spring context with the name as the {@link
 * KubernetesReconciler#value()} specifies.
 *
 * <p>Note that the automatically created controller is not started by default.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconciler {

  /**
   * The name of the Kubernetes Reconciler.
   *
   * @return the string
   */
  String value();

  /**
   * Watches kubernetes resources.
   *
   * @return the kubernetes reconciler watches
   */
  KubernetesReconcilerWatches watches();

  /**
   * The number of workers.
   *
   * @return the int
   */
  int workerCount() default Constants.DEFAULT_WORKER_COUNT;
}
