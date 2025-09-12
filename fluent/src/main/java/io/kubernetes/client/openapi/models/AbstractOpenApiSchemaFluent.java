package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class AbstractOpenApiSchemaFluent<A extends io.kubernetes.client.openapi.models.AbstractOpenApiSchemaFluent<A>> extends BaseFluent<A>{
  public AbstractOpenApiSchemaFluent() {
  }
  
  public AbstractOpenApiSchemaFluent(AbstractOpenApiSchema instance) {
    this.copyInstance(instance);
  }
  private Boolean isNullable;
  private String schemaType;
  
  protected void copyInstance(AbstractOpenApiSchema instance) {
    if (instance != null) {
      this.withSchemaType(instance.getSchemaType());
    }
  }
  
  public Boolean getIsNullable() {
    return this.isNullable;
  }
  
  public A withIsNullable(Boolean isNullable) {
    this.isNullable = isNullable;
    return (A) this;
  }
  
  public boolean hasIsNullable() {
    return this.isNullable != null;
  }
  
  public String getSchemaType() {
    return this.schemaType;
  }
  
  public A withSchemaType(String schemaType) {
    this.schemaType = schemaType;
    return (A) this;
  }
  
  public boolean hasSchemaType() {
    return this.schemaType != null;
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
  

}