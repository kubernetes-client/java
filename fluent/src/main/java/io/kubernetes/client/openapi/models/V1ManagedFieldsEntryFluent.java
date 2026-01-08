package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ManagedFieldsEntryFluent<A extends io.kubernetes.client.openapi.models.V1ManagedFieldsEntryFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String fieldsType;
  private Object fieldsV1;
  private String manager;
  private String operation;
  private String subresource;
  private OffsetDateTime time;

  public V1ManagedFieldsEntryFluent() {
  }
  
  public V1ManagedFieldsEntryFluent(V1ManagedFieldsEntry instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ManagedFieldsEntry instance) {
    instance = instance != null ? instance : new V1ManagedFieldsEntry();
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
    V1ManagedFieldsEntryFluent that = (V1ManagedFieldsEntryFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(fieldsType, that.fieldsType))) {
      return false;
    }
    if (!(Objects.equals(fieldsV1, that.fieldsV1))) {
      return false;
    }
    if (!(Objects.equals(manager, that.manager))) {
      return false;
    }
    if (!(Objects.equals(operation, that.operation))) {
      return false;
    }
    if (!(Objects.equals(subresource, that.subresource))) {
      return false;
    }
    if (!(Objects.equals(time, that.time))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getFieldsType() {
    return this.fieldsType;
  }
  
  public Object getFieldsV1() {
    return this.fieldsV1;
  }
  
  public String getManager() {
    return this.manager;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public String getSubresource() {
    return this.subresource;
  }
  
  public OffsetDateTime getTime() {
    return this.time;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasFieldsType() {
    return this.fieldsType != null;
  }
  
  public boolean hasFieldsV1() {
    return this.fieldsV1 != null;
  }
  
  public boolean hasManager() {
    return this.manager != null;
  }
  
  public boolean hasOperation() {
    return this.operation != null;
  }
  
  public boolean hasSubresource() {
    return this.subresource != null;
  }
  
  public boolean hasTime() {
    return this.time != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(fieldsType == null)) {
        sb.append("fieldsType:");
        sb.append(fieldsType);
        sb.append(",");
    }
    if (!(fieldsV1 == null)) {
        sb.append("fieldsV1:");
        sb.append(fieldsV1);
        sb.append(",");
    }
    if (!(manager == null)) {
        sb.append("manager:");
        sb.append(manager);
        sb.append(",");
    }
    if (!(operation == null)) {
        sb.append("operation:");
        sb.append(operation);
        sb.append(",");
    }
    if (!(subresource == null)) {
        sb.append("subresource:");
        sb.append(subresource);
        sb.append(",");
    }
    if (!(time == null)) {
        sb.append("time:");
        sb.append(time);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
    return (A) this;
  }
  
  public A withFieldsV1(Object fieldsV1) {
    this.fieldsV1 = fieldsV1;
    return (A) this;
  }
  
  public A withManager(String manager) {
    this.manager = manager;
    return (A) this;
  }
  
  public A withOperation(String operation) {
    this.operation = operation;
    return (A) this;
  }
  
  public A withSubresource(String subresource) {
    this.subresource = subresource;
    return (A) this;
  }
  
  public A withTime(OffsetDateTime time) {
    this.time = time;
    return (A) this;
  }
  
}