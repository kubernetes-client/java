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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1StatusCauseFluentImpl<A extends V1StatusCauseFluent<A>> extends BaseFluent<A>
    implements V1StatusCauseFluent<A> {
  public V1StatusCauseFluentImpl() {}

  public V1StatusCauseFluentImpl(io.kubernetes.client.openapi.models.V1StatusCause instance) {
    this.withField(instance.getField());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());
  }

  private String field;
  private java.lang.String message;
  private java.lang.String reason;

  public java.lang.String getField() {
    return this.field;
  }

  public A withField(java.lang.String field) {
    this.field = field;
    return (A) this;
  }

  public Boolean hasField() {
    return this.field != null;
  }

  public java.lang.String getMessage() {
    return this.message;
  }

  public A withMessage(java.lang.String message) {
    this.message = message;
    return (A) this;
  }

  public java.lang.Boolean hasMessage() {
    return this.message != null;
  }

  public java.lang.String getReason() {
    return this.reason;
  }

  public A withReason(java.lang.String reason) {
    this.reason = reason;
    return (A) this;
  }

  public java.lang.Boolean hasReason() {
    return this.reason != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatusCauseFluentImpl that = (V1StatusCauseFluentImpl) o;
    if (field != null ? !field.equals(that.field) : that.field != null) return false;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(field, message, reason, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (field != null) {
      sb.append("field:");
      sb.append(field + ",");
    }
    if (message != null) {
      sb.append("message:");
      sb.append(message + ",");
    }
    if (reason != null) {
      sb.append("reason:");
      sb.append(reason);
    }
    sb.append("}");
    return sb.toString();
  }
}
