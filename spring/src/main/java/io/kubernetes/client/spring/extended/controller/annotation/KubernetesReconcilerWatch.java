package io.kubernetes.client.spring.extended.controller.annotation;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.controller.Controllers;
import io.kubernetes.client.extended.controller.reconciler.Request;
import io.kubernetes.client.openapi.models.V1Namespace;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.*;

/** The interface Kubernetes reconciler watch. */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconcilerWatch {

  /**
   * Kubernetes Api type class class. e.g.
   *
   * @return the class
   */
  Class<? extends KubernetesObject> apiTypeClass() default V1Namespace.class;

  /**
   * Work queue key func class maps the source resource of the watch event to a standard reconciler
   * request.
   *
   * @return the class
   */
  Class<? extends Function<?, Request>> workQueueKeyFunc() default DefaultReflectiveKeyFunc.class;

  /**
   * Resync period in milliseconds .
   *
   * @return the long
   */
  long resyncPeriodMillis() default 0;

  /** The type Default reflective key func which adapts default implementation. */
  class DefaultReflectiveKeyFunc implements Function<KubernetesObject, Request> {
    @Override
    public Request apply(KubernetesObject o) {
      return Controllers.defaultReflectiveKeyFunc().apply(o);
    }
  }
}
