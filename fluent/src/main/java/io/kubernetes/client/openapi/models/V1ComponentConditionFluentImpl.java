package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ComponentConditionFluentImpl<A extends V1ComponentConditionFluent<A>> extends BaseFluent<A> implements V1ComponentConditionFluent<A>{
  public V1ComponentConditionFluentImpl() {
  }
  public V1ComponentConditionFluentImpl(V1ComponentCondition instance) {
    this.withError(instance.getError());

    this.withMessage(instance.getMessage());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

  }
  private String error;
  private String message;
  private String status;
  private String type;
  public String getError() {
    return this.error;
  }
  public A withError(String error) {
    this.error=error; return (A) this;
  }
  public Boolean hasError() {
    return this.error != null;
  }
  public String getMessage() {
    return this.message;
  }
  public A withMessage(String message) {
    this.message=message; return (A) this;
  }
  public Boolean hasMessage() {
    return this.message != null;
  }
  public String getStatus() {
    return this.status;
  }
  public A withStatus(String status) {
    this.status=status; return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
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
    V1ComponentConditionFluentImpl that = (V1ComponentConditionFluentImpl) o;
    if (error != null ? !error.equals(that.error) :that.error != null) return false;
    if (message != null ? !message.equals(that.message) :that.message != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
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