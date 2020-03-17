package io.kubernetes.client.spring.extended.controller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the method is a filter for {@link io.kubernetes.client.informer.EventType#DELETED}
 * from watches.
 *
 * <p>A delete-event filter must have the signature as {@link
 * java.util.function.BiPredicate<ApiType,ApiType>} where the 1st parameter is the old state of the
 * resource and the 2nd is the new state.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DeleteWatchEventFilter {}
