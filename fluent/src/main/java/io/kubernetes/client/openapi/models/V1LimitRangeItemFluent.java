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

  public A addToDefault(Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromDefault(java.lang.String key);

  public A removeFromDefault(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getDefault();

  public <K, V> A withDefault(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> _default);

  public Boolean hasDefault();

  public A addToDefaultRequest(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToDefaultRequest(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromDefaultRequest(java.lang.String key);

  public A removeFromDefaultRequest(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getDefaultRequest();

  public <K, V> A withDefaultRequest(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> defaultRequest);

  public java.lang.Boolean hasDefaultRequest();

  public A addToMax(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToMax(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromMax(java.lang.String key);

  public A removeFromMax(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getMax();

  public <K, V> A withMax(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> max);

  public java.lang.Boolean hasMax();

  public A addToMaxLimitRequestRatio(
      java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToMaxLimitRequestRatio(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromMaxLimitRequestRatio(java.lang.String key);

  public A removeFromMaxLimitRequestRatio(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity>
      getMaxLimitRequestRatio();

  public <K, V> A withMaxLimitRequestRatio(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> maxLimitRequestRatio);

  public java.lang.Boolean hasMaxLimitRequestRatio();

  public A addToMin(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToMin(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromMin(java.lang.String key);

  public A removeFromMin(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getMin();

  public <K, V> A withMin(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> min);

  public java.lang.Boolean hasMin();

  public java.lang.String getType();

  public A withType(java.lang.String type);

  public java.lang.Boolean hasType();
}
