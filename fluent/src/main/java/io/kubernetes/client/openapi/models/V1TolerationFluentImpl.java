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
public class V1TolerationFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1TolerationFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1TolerationFluent<A> {
  public V1TolerationFluentImpl() {}

  public V1TolerationFluentImpl(io.kubernetes.client.openapi.models.V1Toleration instance) {
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withTolerationSeconds(instance.getTolerationSeconds());

    this.withValue(instance.getValue());
  }

  private io.kubernetes.client.openapi.models.V1Toleration.EffectEnum effect;
  private java.lang.String key;
  private io.kubernetes.client.openapi.models.V1Toleration.OperatorEnum operator;
  private java.lang.Long tolerationSeconds;
  private java.lang.String value;

  public io.kubernetes.client.openapi.models.V1Toleration.EffectEnum getEffect() {
    return this.effect;
  }

  public A withEffect(io.kubernetes.client.openapi.models.V1Toleration.EffectEnum effect) {
    this.effect = effect;
    return (A) this;
  }

  public java.lang.Boolean hasEffect() {
    return this.effect != null;
  }

  public java.lang.String getKey() {
    return this.key;
  }

  public A withKey(java.lang.String key) {
    this.key = key;
    return (A) this;
  }

  public java.lang.Boolean hasKey() {
    return this.key != null;
  }

  /** Method is deprecated. use withKey instead. */
  @java.lang.Deprecated
  public A withNewKey(java.lang.String original) {
    return (A) withKey(new String(original));
  }

  public io.kubernetes.client.openapi.models.V1Toleration.OperatorEnum getOperator() {
    return this.operator;
  }

  public A withOperator(io.kubernetes.client.openapi.models.V1Toleration.OperatorEnum operator) {
    this.operator = operator;
    return (A) this;
  }

  public java.lang.Boolean hasOperator() {
    return this.operator != null;
  }

  public java.lang.Long getTolerationSeconds() {
    return this.tolerationSeconds;
  }

  public A withTolerationSeconds(java.lang.Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasTolerationSeconds() {
    return this.tolerationSeconds != null;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public A withValue(java.lang.String value) {
    this.value = value;
    return (A) this;
  }

  public java.lang.Boolean hasValue() {
    return this.value != null;
  }

  /** Method is deprecated. use withValue instead. */
  @java.lang.Deprecated
  public A withNewValue(java.lang.String original) {
    return (A) withValue(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TolerationFluentImpl that = (V1TolerationFluentImpl) o;
    if (effect != null ? !effect.equals(that.effect) : that.effect != null) return false;
    if (key != null ? !key.equals(that.key) : that.key != null) return false;
    if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
    if (tolerationSeconds != null
        ? !tolerationSeconds.equals(that.tolerationSeconds)
        : that.tolerationSeconds != null) return false;
    if (value != null ? !value.equals(that.value) : that.value != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        effect, key, operator, tolerationSeconds, value, super.hashCode());
  }
}
