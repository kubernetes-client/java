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
public class V1ComponentConditionFluentImpl<A extends V1ComponentConditionFluent<A>>
    extends BaseFluent<A> implements V1ComponentConditionFluent<A> {
  public V1ComponentConditionFluentImpl() {}

  public V1ComponentConditionFluentImpl(
      io.kubernetes.client.openapi.models.V1ComponentCondition instance) {
    this.withError(instance.getError());

    this.withMessage(instance.getMessage());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());
  }

  private String error;
  private java.lang.String message;
  private java.lang.String status;
  private java.lang.String type;

  public java.lang.String getError() {
    return this.error;
  }

  public A withError(java.lang.String error) {
    this.error = error;
    return (A) this;
  }

  public Boolean hasError() {
    return this.error != null;
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

  public java.lang.String getStatus() {
    return this.status;
  }

  public A withStatus(java.lang.String status) {
    this.status = status;
    return (A) this;
  }

  public java.lang.Boolean hasStatus() {
    return this.status != null;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ComponentConditionFluentImpl that = (V1ComponentConditionFluentImpl) o;
    if (error != null ? !error.equals(that.error) : that.error != null) return false;
    if (message != null ? !message.equals(that.message) : that.message != null) return false;
    if (status != null ? !status.equals(that.status) : that.status != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(error, message, status, type, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (error != null) {
      sb.append("error:");
      sb.append(error + ",");
    }
    if (message != null) {
      sb.append("message:");
      sb.append(message + ",");
    }
    if (status != null) {
      sb.append("status:");
      sb.append(status + ",");
    }
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
}
