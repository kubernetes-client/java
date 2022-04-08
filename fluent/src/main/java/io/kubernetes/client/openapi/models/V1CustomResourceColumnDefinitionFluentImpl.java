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
public class V1CustomResourceColumnDefinitionFluentImpl<
        A extends V1CustomResourceColumnDefinitionFluent<A>>
    extends BaseFluent<A> implements V1CustomResourceColumnDefinitionFluent<A> {
  public V1CustomResourceColumnDefinitionFluentImpl() {}

  public V1CustomResourceColumnDefinitionFluentImpl(
      io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition instance) {
    this.withDescription(instance.getDescription());

    this.withFormat(instance.getFormat());

    this.withJsonPath(instance.getJsonPath());

    this.withName(instance.getName());

    this.withPriority(instance.getPriority());

    this.withType(instance.getType());
  }

  private String description;
  private java.lang.String format;
  private java.lang.String jsonPath;
  private java.lang.String name;
  private Integer priority;
  private java.lang.String type;

  public java.lang.String getDescription() {
    return this.description;
  }

  public A withDescription(java.lang.String description) {
    this.description = description;
    return (A) this;
  }

  public Boolean hasDescription() {
    return this.description != null;
  }

  public java.lang.String getFormat() {
    return this.format;
  }

  public A withFormat(java.lang.String format) {
    this.format = format;
    return (A) this;
  }

  public java.lang.Boolean hasFormat() {
    return this.format != null;
  }

  public java.lang.String getJsonPath() {
    return this.jsonPath;
  }

  public A withJsonPath(java.lang.String jsonPath) {
    this.jsonPath = jsonPath;
    return (A) this;
  }

  public java.lang.Boolean hasJsonPath() {
    return this.jsonPath != null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  public java.lang.Integer getPriority() {
    return this.priority;
  }

  public A withPriority(java.lang.Integer priority) {
    this.priority = priority;
    return (A) this;
  }

  public java.lang.Boolean hasPriority() {
    return this.priority != null;
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
    V1CustomResourceColumnDefinitionFluentImpl that =
        (V1CustomResourceColumnDefinitionFluentImpl) o;
    if (description != null ? !description.equals(that.description) : that.description != null)
      return false;
    if (format != null ? !format.equals(that.format) : that.format != null) return false;
    if (jsonPath != null ? !jsonPath.equals(that.jsonPath) : that.jsonPath != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        description, format, jsonPath, name, priority, type, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (description != null) {
      sb.append("description:");
      sb.append(description + ",");
    }
    if (format != null) {
      sb.append("format:");
      sb.append(format + ",");
    }
    if (jsonPath != null) {
      sb.append("jsonPath:");
      sb.append(jsonPath + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (priority != null) {
      sb.append("priority:");
      sb.append(priority + ",");
    }
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
}
