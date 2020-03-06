package io.kubernetes.client.spring.extended.controller.annotation;

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
  Class apiTypeClass() default V1Namespace.class;

  /**
   * Add filter class whichs filters "ADD" watch-events from watching resources.
   *
   * @return the class
   */
  Class<? extends Predicate> addFilter() default NoopPredicate.class;

  /**
   * Add filter class whichs filters "UPDATE" watch-events from watching resources. The first
   * parameter of the predicate is the previous state of resource which the watch-event happened
   * upon. The second parameter of the predicate is the latest state of that resource.
   *
   * @return the class
   */
  Class<? extends BiPredicate> updateFilter() default NoopBiPredicate.class;

  /**
   * Delete filter class whichs filters "DELETE" watch-events from watching resources.
   *
   * <p>The first parameter of the predicate is the before-deletion-state of resource which the
   * watch-event happened upon. The second parameter indicates whether the resource's state in the
   * cache is unknown/uncertain.
   *
   * @return the class
   */
  Class<? extends BiPredicate> deleteFilter() default NoopBiPredicate.class;

  /**
   * Work queue key func class maps the source resource of the watch event to a standard reconciler
   * request.
   *
   * @return the class
   */
  Class<? extends Function<?, Request>> workQueueKeyFunc() default DefaultReflectiveKeyFunc.class;

  /** The type Default reflective key func which adapts default implementation. */
  class DefaultReflectiveKeyFunc implements Function<Object, Request> {
    @Override
    public Request apply(Object o) {
      return Controllers.defaultReflectiveKeyFunc().apply(o);
    }
  }

  /** The type Noop predicate always returns true. */
  class NoopPredicate implements Predicate {
    @Override
    public boolean test(Object o) {
      return true;
    }
  }

  /** The type Noop bi predicate always returns true. */
  class NoopBiPredicate implements BiPredicate {
    @Override
    public boolean test(Object o, Object o2) {
      return true;
    }
  }
}
