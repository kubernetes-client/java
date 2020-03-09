package io.kubernetes.client.spring.extended.controller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be applied to a bean method which returns a SharedInformerFactory bean
 * instance. It indicates injecting the list of informers to the SharedInformerFactory automatically
 * by {@link io.kubernetes.client.spring.extended.controller.KubernetesInformerFactoryProcessor}.
 *
 * <p>This annotation is specifically used for joining a list of {@link
 * io.kubernetes.client.spring.extended.controller.annotation.KubernetesInformer} onto one bean
 * method.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesInformers {

  /**
   * Value kubernetes informer [ ].
   *
   * @return the kubernetes informer [ ]
   */
  KubernetesInformer[] value() default {};
}
