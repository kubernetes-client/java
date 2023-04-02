/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.spring.extended.network.endpoints;

import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.models.V1Endpoints;

public class InformerEndpointsGetter implements EndpointsGetter {

  private final Lister<V1Endpoints> endpointsLister;

  public InformerEndpointsGetter(Lister<V1Endpoints> lister) {
    this.endpointsLister = lister;
  }

  @Override
  public V1Endpoints get(String namespace, String name) {
    return this.endpointsLister.namespace(namespace).get(name);
  }
}
