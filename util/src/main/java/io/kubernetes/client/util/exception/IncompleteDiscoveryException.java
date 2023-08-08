/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
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
