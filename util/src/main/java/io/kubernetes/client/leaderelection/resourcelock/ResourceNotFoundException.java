package io.kubernetes.client.leaderelection.resourcelock;

import io.kubernetes.client.ApiException;


public class ResourceNotFoundException extends ApiException {

  public ResourceNotFoundException() {

  }

  public ResourceNotFoundException(String message) {
    super(message);
  }
}
