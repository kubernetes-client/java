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
public interface V1LimitRangeItemFluent<A extends V1LimitRangeItemFluent<A>> extends Fluent<A> {
  public A addToDefault(String key, Quantity value);

  public A addToDefault(Map<String, Quantity> map);

  public A removeFromDefault(String key);

  public A removeFromDefault(Map<String, Quantity> map);

  public Map<String, Quantity> getDefault();

  public <K, V> A withDefault(Map<String, Quantity> _default);

  public Boolean hasDefault();

  public A addToDefaultRequest(String key, Quantity value);

  public A addToDefaultRequest(Map<String, Quantity> map);

  public A removeFromDefaultRequest(String key);

  public A removeFromDefaultRequest(Map<String, Quantity> map);

  public Map<String, Quantity> getDefaultRequest();

  public <K, V> A withDefaultRequest(Map<String, Quantity> defaultRequest);

  public Boolean hasDefaultRequest();

  public A addToMax(String key, Quantity value);

  public A addToMax(Map<String, Quantity> map);

  public A removeFromMax(String key);

  public A removeFromMax(Map<String, Quantity> map);

  public Map<String, Quantity> getMax();

  public <K, V> A withMax(Map<String, Quantity> max);

  public Boolean hasMax();

  public A addToMaxLimitRequestRatio(String key, Quantity value);

  public A addToMaxLimitRequestRatio(Map<String, Quantity> map);

  public A removeFromMaxLimitRequestRatio(String key);

  public A removeFromMaxLimitRequestRatio(Map<String, Quantity> map);

  public Map<String, Quantity> getMaxLimitRequestRatio();

  public <K, V> A withMaxLimitRequestRatio(Map<String, Quantity> maxLimitRequestRatio);

  public Boolean hasMaxLimitRequestRatio();

  public A addToMin(String key, Quantity value);

  public A addToMin(Map<String, Quantity> map);

  public A removeFromMin(String key);

  public A removeFromMin(Map<String, Quantity> map);

  public Map<String, Quantity> getMin();

  public <K, V> A withMin(Map<String, Quantity> min);

  public Boolean hasMin();

  public String getType();

  public A withType(String type);

  public Boolean hasType();
}
