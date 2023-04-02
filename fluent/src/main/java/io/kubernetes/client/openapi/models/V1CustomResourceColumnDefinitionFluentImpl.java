package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CustomResourceColumnDefinitionFluentImpl<A extends V1CustomResourceColumnDefinitionFluent<A>> extends BaseFluent<A> implements V1CustomResourceColumnDefinitionFluent<A>{
  public V1CustomResourceColumnDefinitionFluentImpl() {
  }
  public V1CustomResourceColumnDefinitionFluentImpl(V1CustomResourceColumnDefinition instance) {
    this.withDescription(instance.getDescription());

    this.withFormat(instance.getFormat());

    this.withJsonPath(instance.getJsonPath());

    this.withName(instance.getName());

    this.withPriority(instance.getPriority());

    this.withType(instance.getType());

  }
  private String description;
  private String format;
  private String jsonPath;
  private String name;
  private Integer priority;
  private String type;
  public String getDescription() {
    return this.description;
  }
  public A withDescription(String description) {
    this.description=description; return (A) this;
  }
  public Boolean hasDescription() {
    return this.description != null;
  }
  public String getFormat() {
    return this.format;
  }
  public A withFormat(String format) {
    this.format=format; return (A) this;
  }
  public Boolean hasFormat() {
    return this.format != null;
  }
  public String getJsonPath() {
    return this.jsonPath;
  }
  public A withJsonPath(String jsonPath) {
    this.jsonPath=jsonPath; return (A) this;
  }
  public Boolean hasJsonPath() {
    return this.jsonPath != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public Integer getPriority() {
    return this.priority;
  }
  public A withPriority(Integer priority) {
    this.priority=priority; return (A) this;
  }
  public Boolean hasPriority() {
    return this.priority != null;
  }
  public String getType() {
    return this.type;
  }
  public A withType(String type) {
    this.type=type; return (A) this;
  }
  public Boolean hasType() {
    return this.type != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceColumnDefinitionFluentImpl that = (V1CustomResourceColumnDefinitionFluentImpl) o;
    if (description != null ? !description.equals(that.description) :that.description != null) return false;
    if (format != null ? !format.equals(that.format) :that.format != null) return false;
    if (jsonPath != null ? !jsonPath.equals(that.jsonPath) :that.jsonPath != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (priority != null ? !priority.equals(that.priority) :that.priority != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
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