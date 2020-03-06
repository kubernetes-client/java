package io.kubernetes.client.spring.extended.controller.annotation;

import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface Kubernetes informer specifies the arguments for injecting an informer into the
 * informer-factory. The default argument list works for instantiating an informer list-watching
 * namespace resources.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesInformer {

  /**
   * Kubernetes api type class class e.g. V1Namespace.
   *
   * @return the class
   */
  Class apiTypeClass() default V1Namespace.class;

  /**
   * Kubernetes api list type class class. e.g. V1NamespaceList.
   *
   * @return the class
   */
  Class apiListTypeClass() default V1NamespaceList.class;

  /**
   * Group-version-resource is a tuple for constructing legal Kubernetes api path. e.g. {"batch",
   * "v1", "jobs"}
   *
   * @return the group version resource
   */
  GroupVersionResource groupVersionResource();

  /**
   * Resync period millis long.
   *
   * @return the long
   */
  long resyncPeriodMillis() default 0;
}
