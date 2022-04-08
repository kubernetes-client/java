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
public class V1ManagedFieldsEntryFluentImpl<A extends V1ManagedFieldsEntryFluent<A>>
    extends BaseFluent<A> implements V1ManagedFieldsEntryFluent<A> {
  public V1ManagedFieldsEntryFluentImpl() {}

  public V1ManagedFieldsEntryFluentImpl(
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntry instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withFieldsType(instance.getFieldsType());

    this.withFieldsV1(instance.getFieldsV1());

    this.withManager(instance.getManager());

    this.withOperation(instance.getOperation());

    this.withSubresource(instance.getSubresource());

    this.withTime(instance.getTime());
  }

  private String apiVersion;
  private java.lang.String fieldsType;
  private Object fieldsV1;
  private java.lang.String manager;
  private java.lang.String operation;
  private java.lang.String subresource;
  private OffsetDateTime time;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public java.lang.String getFieldsType() {
    return this.fieldsType;
  }

  public A withFieldsType(java.lang.String fieldsType) {
    this.fieldsType = fieldsType;
    return (A) this;
  }

  public java.lang.Boolean hasFieldsType() {
    return this.fieldsType != null;
  }

  public java.lang.Object getFieldsV1() {
    return this.fieldsV1;
  }

  public A withFieldsV1(java.lang.Object fieldsV1) {
    this.fieldsV1 = fieldsV1;
    return (A) this;
  }

  public java.lang.Boolean hasFieldsV1() {
    return this.fieldsV1 != null;
  }

  public java.lang.String getManager() {
    return this.manager;
  }

  public A withManager(java.lang.String manager) {
    this.manager = manager;
    return (A) this;
  }

  public java.lang.Boolean hasManager() {
    return this.manager != null;
  }

  public java.lang.String getOperation() {
    return this.operation;
  }

  public A withOperation(java.lang.String operation) {
    this.operation = operation;
    return (A) this;
  }

  public java.lang.Boolean hasOperation() {
    return this.operation != null;
  }

  public java.lang.String getSubresource() {
    return this.subresource;
  }

  public A withSubresource(java.lang.String subresource) {
    this.subresource = subresource;
    return (A) this;
  }

  public java.lang.Boolean hasSubresource() {
    return this.subresource != null;
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ManagedFieldsEntryFluentImpl that = (V1ManagedFieldsEntryFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (fieldsType != null ? !fieldsType.equals(that.fieldsType) : that.fieldsType != null)
      return false;
    if (fieldsV1 != null ? !fieldsV1.equals(that.fieldsV1) : that.fieldsV1 != null) return false;
    if (manager != null ? !manager.equals(that.manager) : that.manager != null) return false;
    if (operation != null ? !operation.equals(that.operation) : that.operation != null)
      return false;
    if (subresource != null ? !subresource.equals(that.subresource) : that.subresource != null)
      return false;
    if (time != null ? !time.equals(that.time) : that.time != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (fieldsType != null) {
      sb.append("fieldsType:");
      sb.append(fieldsType + ",");
    }
    if (fieldsV1 != null) {
      sb.append("fieldsV1:");
      sb.append(fieldsV1 + ",");
    }
    if (manager != null) {
      sb.append("manager:");
      sb.append(manager + ",");
    }
    if (operation != null) {
      sb.append("operation:");
      sb.append(operation + ",");
    }
    if (subresource != null) {
      sb.append("subresource:");
      sb.append(subresource + ",");
    }
    if (time != null) {
      sb.append("time:");
      sb.append(time);
    }
    sb.append("}");
    return sb.toString();
  }
}
