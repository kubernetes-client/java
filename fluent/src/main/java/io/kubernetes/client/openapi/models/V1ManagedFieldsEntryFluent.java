package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ManagedFieldsEntryFluent<A extends V1ManagedFieldsEntryFluent<A>> extends BaseFluent<A>{
  public V1ManagedFieldsEntryFluent() {
  }
  
  public V1ManagedFieldsEntryFluent(V1ManagedFieldsEntry instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String fieldsType;
  private Object fieldsV1;
  private String manager;
  private String operation;
  private String subresource;
  private OffsetDateTime time;
  
  protected void copyInstance(V1ManagedFieldsEntry instance) {
    instance = (instance != null ? instance : new V1ManagedFieldsEntry());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withFieldsType(instance.getFieldsType());
          this.withFieldsV1(instance.getFieldsV1());
          this.withManager(instance.getManager());
          this.withOperation(instance.getOperation());
          this.withSubresource(instance.getSubresource());
          this.withTime(instance.getTime());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public String getFieldsType() {
    return this.fieldsType;
  }
  
  public A withFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
    return (A) this;
  }
  
  public boolean hasFieldsType() {
    return this.fieldsType != null;
  }
  
  public Object getFieldsV1() {
    return this.fieldsV1;
  }
  
  public A withFieldsV1(Object fieldsV1) {
    this.fieldsV1 = fieldsV1;
    return (A) this;
  }
  
  public boolean hasFieldsV1() {
    return this.fieldsV1 != null;
  }
  
  public String getManager() {
    return this.manager;
  }
  
  public A withManager(String manager) {
    this.manager = manager;
    return (A) this;
  }
  
  public boolean hasManager() {
    return this.manager != null;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public A withOperation(String operation) {
    this.operation = operation;
    return (A) this;
  }
  
  public boolean hasOperation() {
    return this.operation != null;
  }
  
  public String getSubresource() {
    return this.subresource;
  }
  
  public A withSubresource(String subresource) {
    this.subresource = subresource;
    return (A) this;
  }
  
  public boolean hasSubresource() {
    return this.subresource != null;
  }
  
  public OffsetDateTime getTime() {
    return this.time;
  }
  
  public A withTime(OffsetDateTime time) {
    this.time = time;
    return (A) this;
  }
  
  public boolean hasTime() {
    return this.time != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ManagedFieldsEntryFluent that = (V1ManagedFieldsEntryFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(fieldsType, that.fieldsType)) return false;
    if (!java.util.Objects.equals(fieldsV1, that.fieldsV1)) return false;
    if (!java.util.Objects.equals(manager, that.manager)) return false;
    if (!java.util.Objects.equals(operation, that.operation)) return false;
    if (!java.util.Objects.equals(subresource, that.subresource)) return false;
    if (!java.util.Objects.equals(time, that.time)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  fieldsType,  fieldsV1,  manager,  operation,  subresource,  time,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (fieldsType != null) { sb.append("fieldsType:"); sb.append(fieldsType + ","); }
    if (fieldsV1 != null) { sb.append("fieldsV1:"); sb.append(fieldsV1 + ","); }
    if (manager != null) { sb.append("manager:"); sb.append(manager + ","); }
    if (operation != null) { sb.append("operation:"); sb.append(operation + ","); }
    if (subresource != null) { sb.append("subresource:"); sb.append(subresource + ","); }
    if (time != null) { sb.append("time:"); sb.append(time); }
    sb.append("}");
    return sb.toString();
  }
  

}