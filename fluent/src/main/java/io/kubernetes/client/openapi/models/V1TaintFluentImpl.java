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

import io.kubernetes.client.fluent.BaseFluent;
import java.time.OffsetDateTime;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1TaintFluentImpl<A extends V1TaintFluent<A>> extends BaseFluent<A>
    implements V1TaintFluent<A> {
  public V1TaintFluentImpl() {}

  public V1TaintFluentImpl(io.kubernetes.client.openapi.models.V1Taint instance) {
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withTimeAdded(instance.getTimeAdded());

    this.withValue(instance.getValue());
  }

  private String effect;
  private java.lang.String key;
  private OffsetDateTime timeAdded;
  private java.lang.String value;

  public java.lang.String getEffect() {
    return this.effect;
  }

  public A withEffect(java.lang.String effect) {
    this.effect = effect;
    return (A) this;
  }

  public Boolean hasEffect() {
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

  public java.time.OffsetDateTime getTimeAdded() {
    return this.timeAdded;
  }

  public A withTimeAdded(java.time.OffsetDateTime timeAdded) {
    this.timeAdded = timeAdded;
    return (A) this;
  }

  public java.lang.Boolean hasTimeAdded() {
    return this.timeAdded != null;
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TaintFluentImpl that = (V1TaintFluentImpl) o;
    if (effect != null ? !effect.equals(that.effect) : that.effect != null) return false;
    if (key != null ? !key.equals(that.key) : that.key != null) return false;
    if (timeAdded != null ? !timeAdded.equals(that.timeAdded) : that.timeAdded != null)
      return false;
    if (value != null ? !value.equals(that.value) : that.value != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(effect, key, timeAdded, value, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (effect != null) {
      sb.append("effect:");
      sb.append(effect + ",");
    }
    if (key != null) {
      sb.append("key:");
      sb.append(key + ",");
    }
    if (timeAdded != null) {
      sb.append("timeAdded:");
      sb.append(timeAdded + ",");
    }
    if (value != null) {
      sb.append("value:");
      sb.append(value);
    }
    sb.append("}");
    return sb.toString();
  }
}
