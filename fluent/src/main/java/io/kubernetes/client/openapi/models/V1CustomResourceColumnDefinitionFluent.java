package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceColumnDefinitionFluent<A extends V1CustomResourceColumnDefinitionFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceColumnDefinitionFluent() {
  }
  
  public V1CustomResourceColumnDefinitionFluent(V1CustomResourceColumnDefinition instance) {
    this.copyInstance(instance);
  }
  private String description;
  private String format;
  private String jsonPath;
  private String name;
  private Integer priority;
  private String type;
  
  protected void copyInstance(V1CustomResourceColumnDefinition instance) {
    instance = (instance != null ? instance : new V1CustomResourceColumnDefinition());
    if (instance != null) {
          this.withDescription(instance.getDescription());
          this.withFormat(instance.getFormat());
          this.withJsonPath(instance.getJsonPath());
          this.withName(instance.getName());
          this.withPriority(instance.getPriority());
          this.withType(instance.getType());
        }
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public boolean hasDescription() {
    return this.description != null;
  }
  
  public String getFormat() {
    return this.format;
  }
  
  public A withFormat(String format) {
    this.format = format;
    return (A) this;
  }
  
  public boolean hasFormat() {
    return this.format != null;
  }
  
  public String getJsonPath() {
    return this.jsonPath;
  }
  
  public A withJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return (A) this;
  }
  
  public boolean hasJsonPath() {
    return this.jsonPath != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Integer getPriority() {
    return this.priority;
  }
  
  public A withPriority(Integer priority) {
    this.priority = priority;
    return (A) this;
  }
  
  public boolean hasPriority() {
    return this.priority != null;
  }
  
  public String getType() {
    return this.type;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceColumnDefinitionFluent that = (V1CustomResourceColumnDefinitionFluent) o;
    if (!java.util.Objects.equals(description, that.description)) return false;
    if (!java.util.Objects.equals(format, that.format)) return false;
    if (!java.util.Objects.equals(jsonPath, that.jsonPath)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(priority, that.priority)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(description,  format,  jsonPath,  name,  priority,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (format != null) { sb.append("format:"); sb.append(format + ","); }
    if (jsonPath != null) { sb.append("jsonPath:"); sb.append(jsonPath + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (priority != null) { sb.append("priority:"); sb.append(priority + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}