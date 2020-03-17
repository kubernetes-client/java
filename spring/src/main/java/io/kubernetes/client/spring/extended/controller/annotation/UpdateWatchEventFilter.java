package io.kubernetes.client.spring.extended.controller.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the method is a filter for {@link
 * io.kubernetes.client.informer.EventType#MODIFIED} from watches.
 *
 * <p>A update-event filter must have the signature as {@link
 * java.util.function.BiPredicate<ApiType, Boolean>} where the 1st parameter is the
 * "before-deletion" state of the resource and the 2nd indicates whether the cache entry for the
 * resource is stale.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UpdateWatchEventFilter {}
