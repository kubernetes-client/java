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
public interface V1ResourceQuotaStatusFluent<A extends V1ResourceQuotaStatusFluent<A>>
    extends Fluent<A> {
  public A addToHard(String key, Quantity value);

  public A addToHard(Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromHard(java.lang.String key);

  public A removeFromHard(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getHard();

  public <K, V> A withHard(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> hard);

  public Boolean hasHard();

  public A addToUsed(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToUsed(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromUsed(java.lang.String key);

  public A removeFromUsed(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getUsed();

  public <K, V> A withUsed(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> used);

  public java.lang.Boolean hasUsed();
}
