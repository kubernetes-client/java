package io.kubernetes.client.extended.controller;

import io.kubernetes.client.informer.ResourceEventHandler;

/**
 * The interface Controller watch defines how a controller watches certain resources.
 *
 * @param <ApiType> the type parameter
 */
public interface ControllerWatch<ApiType> {
  /**
   * Gets the watching resource class.
   *
   * @return the resouce class
   */
  Class<ApiType> getResourceClass();

  /**
   * Gets the event handler on watch events from the resource.
   *
   * @return the resource event handler
   */
  ResourceEventHandler<ApiType> getResourceEventHandler();
}
