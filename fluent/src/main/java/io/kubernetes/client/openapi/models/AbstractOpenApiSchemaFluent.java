/*
Copyright 2020 The Kubernetes Authors.
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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class AbstractOpenApiSchemaFluent<A extends io.kubernetes.client.openapi.models.AbstractOpenApiSchemaFluent<A>> extends BaseFluent<A>{

  private Boolean isNullable;
  private String schemaType;

  public AbstractOpenApiSchemaFluent() {
  }
  
  public AbstractOpenApiSchemaFluent(AbstractOpenApiSchema instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(AbstractOpenApiSchema instance) {
    if (instance != null) {
      this.withSchemaType(instance.getSchemaType());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    AbstractOpenApiSchemaFluent that = (AbstractOpenApiSchemaFluent) o;
    if (!(Objects.equals(isNullable, that.isNullable))) {
      return false;
    }
    if (!(Objects.equals(schemaType, that.schemaType))) {
      return false;
    }
    return true;
  }
  
  public Boolean getIsNullable() {
    return this.isNullable;
  }
  
  public String getSchemaType() {
    return this.schemaType;
  }
  
  public boolean hasIsNullable() {
    return this.isNullable != null;
  }
  
  public boolean hasSchemaType() {
    return this.schemaType != null;
  }
  
  public int hashCode() {
    return Objects.hash(isNullable, schemaType);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(isNullable == null)) {
        sb.append("isNullable:");
        sb.append(isNullable);
        sb.append(",");
    }
    if (!(schemaType == null)) {
        sb.append("schemaType:");
        sb.append(schemaType);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withIsNullable() {
    return withIsNullable(true);
  }
  
  public A withIsNullable(Boolean isNullable) {
    this.isNullable = isNullable;
    return (A) this;
  }
  
  public A withSchemaType(String schemaType) {
    this.schemaType = schemaType;
    return (A) this;
  }
  
}