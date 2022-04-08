/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.Fluent;
import java.util.Map;

/** Generated */
public interface V1OverheadFluent<A extends V1OverheadFluent<A>> extends Fluent<A> {
  public A addToPodFixed(String key, Quantity value);

  public A addToPodFixed(Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromPodFixed(java.lang.String key);

  public A removeFromPodFixed(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getPodFixed();

  public <K, V> A withPodFixed(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> podFixed);

  public Boolean hasPodFixed();
}
