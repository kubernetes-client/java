package io.kubernetes.client.spring.extended.controller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The ready func for Kubernetes reconciler. The reconciler won't be reconciling upon any events
 * unless all its registered ready funcs return true.
 *
 * <p>A ready func must have the signature as {@link java.util.function.Supplier<Boolean>}
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface KubernetesReconcilerReadyFunc {}
