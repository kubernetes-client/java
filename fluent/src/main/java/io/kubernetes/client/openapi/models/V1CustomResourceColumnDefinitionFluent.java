package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceColumnDefinitionFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<A>> extends BaseFluent<A>{

  private String description;
  private String format;
  private String jsonPath;
  private String name;
  private Integer priority;
  private String type;

  public V1CustomResourceColumnDefinitionFluent() {
  }
  
  public V1CustomResourceColumnDefinitionFluent(V1CustomResourceColumnDefinition instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1CustomResourceColumnDefinition instance) {
    instance = instance != null ? instance : new V1CustomResourceColumnDefinition();
    if (instance != null) {
        this.withDescription(instance.getDescription());
        this.withFormat(instance.getFormat());
        this.withJsonPath(instance.getJsonPath());
        this.withName(instance.getName());
        this.withPriority(instance.getPriority());
        this.withType(instance.getType());
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
    V1CustomResourceColumnDefinitionFluent that = (V1CustomResourceColumnDefinitionFluent) o;
    if (!(Objects.equals(description, that.description))) {
      return false;
    }
    if (!(Objects.equals(format, that.format))) {
      return false;
    }
    if (!(Objects.equals(jsonPath, that.jsonPath))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(priority, that.priority))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public String getJsonPath() {
    return this.jsonPath;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Integer getPriority() {
    return this.priority;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasDescription() {
    return this.description != null;
  }
  
  public boolean hasFormat() {
    return this.format != null;
  }
  
  public boolean hasJsonPath() {
    return this.jsonPath != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasPriority() {
    return this.priority != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(description, format, jsonPath, name, priority, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(description == null)) {
        sb.append("description:");
        sb.append(description);
        sb.append(",");
    }
    if (!(format == null)) {
        sb.append("format:");
        sb.append(format);
        sb.append(",");
    }
    if (!(jsonPath == null)) {
        sb.append("jsonPath:");
        sb.append(jsonPath);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(priority == null)) {
        sb.append("priority:");
        sb.append(priority);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public A withFormat(String format) {
    this.format = format;
    return (A) this;
  }
  
  public A withJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withPriority(Integer priority) {
    this.priority = priority;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}