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

import io.kubernetes.client.fluent.Fluent;

/** Generated */
public interface V1TolerationFluent<A extends V1TolerationFluent<A>> extends Fluent<A> {
  public String getEffect();

  public A withEffect(java.lang.String effect);

  public Boolean hasEffect();

  public java.lang.String getKey();

  public A withKey(java.lang.String key);

  public java.lang.Boolean hasKey();

  public java.lang.String getOperator();

  public A withOperator(java.lang.String operator);

  public java.lang.Boolean hasOperator();

  public Long getTolerationSeconds();

  public A withTolerationSeconds(java.lang.Long tolerationSeconds);

  public java.lang.Boolean hasTolerationSeconds();

  public java.lang.String getValue();

  public A withValue(java.lang.String value);

  public java.lang.Boolean hasValue();
}
