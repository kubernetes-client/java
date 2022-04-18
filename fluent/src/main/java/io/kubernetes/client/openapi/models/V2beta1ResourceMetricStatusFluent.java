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

/** Generated */
public interface V2beta1ResourceMetricStatusFluent<A extends V2beta1ResourceMetricStatusFluent<A>>
    extends Fluent<A> {
  public Integer getCurrentAverageUtilization();

  public A withCurrentAverageUtilization(java.lang.Integer currentAverageUtilization);

  public Boolean hasCurrentAverageUtilization();

  public Quantity getCurrentAverageValue();

  public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue);

  public java.lang.Boolean hasCurrentAverageValue();

  public A withNewCurrentAverageValue(String value);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();
}
