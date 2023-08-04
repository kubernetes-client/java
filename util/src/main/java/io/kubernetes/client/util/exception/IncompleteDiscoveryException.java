package io.kubernetes.client.util.exception;

import io.kubernetes.client.Discovery.APIResource;
import io.kubernetes.client.openapi.ApiException;
import java.util.Set;

public class IncompleteDiscoveryException extends ApiException {

  private static final long serialVersionUID = 1L;

  private final transient Set<APIResource> discoveredResources;

  public IncompleteDiscoveryException(String message, ApiException cause, Set<APIResource> discoveredResources) {
    super(message, cause, cause.getCode(), cause.getResponseHeaders(), cause.getResponseBody());
    this.discoveredResources = discoveredResources;
  }

  public Set<APIResource> getDiscoveredResources() {
    return discoveredResources;
  }

}
