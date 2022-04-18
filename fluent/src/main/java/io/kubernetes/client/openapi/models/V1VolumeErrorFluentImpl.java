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
public class V1VolumeErrorFluentImpl<A extends V1VolumeErrorFluent<A>> extends BaseFluent<A>
    implements V1VolumeErrorFluent<A> {
  public V1VolumeErrorFluentImpl() {}

  public V1VolumeErrorFluentImpl(io.kubernetes.client.openapi.models.V1VolumeError instance) {
    this.withMessage(instance.getMessage());

    this.withTime(instance.getTime());
  }

  private String message;
  private OffsetDateTime time;

  public java.lang.String getMessage() {
    return this.message;
  }

  public A withMessage(java.lang.String message) {
    this.message = message;
    return (A) this;
  }

  public Boolean hasMessage() {
    return this.message != null;
  }

  public java.time.OffsetDateTime getTime() {
    return this.time;
  }

  public A withTime(java.time.OffsetDateTime time) {
    this.time = time;
    return (A) this;
  }

  public java.lang.Boolean hasTime() {
    return this.time != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeErrorFluentImpl that = (V1VolumeErrorFluentImpl) o;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (time != null ? !time.equals(that.time) : that.time != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(message, time, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (message != null) {
      sb.append("message:");
      sb.append(message + ",");
    }
    if (time != null) {
      sb.append("time:");
      sb.append(time);
    }
    sb.append("}");
    return sb.toString();
  }
}
