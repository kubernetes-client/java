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

/** Generated */
public interface V1TaintFluent<A extends io.kubernetes.client.openapi.models.V1TaintFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public io.kubernetes.client.openapi.models.V1Taint.EffectEnum getEffect();

  public A withEffect(io.kubernetes.client.openapi.models.V1Taint.EffectEnum effect);

  public java.lang.Boolean hasEffect();

  public java.lang.String getKey();

  public A withKey(java.lang.String key);

  public java.lang.Boolean hasKey();

  /** Method is deprecated. use withKey instead. */
  @java.lang.Deprecated
  public A withNewKey(java.lang.String original);

  public java.time.OffsetDateTime getTimeAdded();

  public A withTimeAdded(java.time.OffsetDateTime timeAdded);

  public java.lang.Boolean hasTimeAdded();

  public java.lang.String getValue();

  public A withValue(java.lang.String value);

  public java.lang.Boolean hasValue();

  /** Method is deprecated. use withValue instead. */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String original);
}
