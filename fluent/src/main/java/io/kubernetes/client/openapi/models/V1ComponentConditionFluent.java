package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ComponentConditionFluent<A extends V1ComponentConditionFluent<A>> extends BaseFluent<A>{
  public V1ComponentConditionFluent() {
  }
  
  public V1ComponentConditionFluent(V1ComponentCondition instance) {
    this.copyInstance(instance);
  }
  private String error;
  private String message;
  private String status;
  private String type;
  
  protected void copyInstance(V1ComponentCondition instance) {
    instance = (instance != null ? instance : new V1ComponentCondition());
    if (instance != null) {
          this.withError(instance.getError());
          this.withMessage(instance.getMessage());
          this.withStatus(instance.getStatus());
          this.withType(instance.getType());
        }
  }
  
  public String getError() {
    return this.error;
  }
  
  public A withError(String error) {
    this.error = error;
    return (A) this;
  }
  
  public boolean hasError() {
    return this.error != null;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public A withMessage(String message) {
    this.message = message;
    return (A) this;
  }
  
  public boolean hasMessage() {
    return this.message != null;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public A withStatus(String status) {
    this.status = status;
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
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
    V1ComponentConditionFluent that = (V1ComponentConditionFluent) o;
    if (!java.util.Objects.equals(error, that.error)) return false;
    if (!java.util.Objects.equals(message, that.message)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    if (!java.util.Objects.equals(type, that.type)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(error,  message,  status,  type,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (error != null) { sb.append("error:"); sb.append(error + ","); }
    if (message != null) { sb.append("message:"); sb.append(message + ","); }
    if (status != null) { sb.append("status:"); sb.append(status + ","); }
    if (type != null) { sb.append("type:"); sb.append(type); }
    sb.append("}");
    return sb.toString();
  }
  

}