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

  public A addToHard(Map<String, Quantity> map);

  public A removeFromHard(String key);

  public A removeFromHard(Map<String, Quantity> map);

  public Map<String, Quantity> getHard();

  public <K, V> A withHard(Map<String, Quantity> hard);

  public Boolean hasHard();

  public A addToUsed(String key, Quantity value);

  public A addToUsed(Map<String, Quantity> map);

  public A removeFromUsed(String key);

  public A removeFromUsed(Map<String, Quantity> map);

  public Map<String, Quantity> getUsed();

  public <K, V> A withUsed(Map<String, Quantity> used);

  public Boolean hasUsed();
}
