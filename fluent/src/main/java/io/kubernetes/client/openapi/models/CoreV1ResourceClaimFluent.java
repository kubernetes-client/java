package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class CoreV1ResourceClaimFluent<A extends io.kubernetes.client.openapi.models.CoreV1ResourceClaimFluent<A>> extends BaseFluent<A>{
  public CoreV1ResourceClaimFluent() {
  }
  
  public CoreV1ResourceClaimFluent(CoreV1ResourceClaim instance) {
    this.copyInstance(instance);
  }
  private String name;
  private String request;
  
  protected void copyInstance(CoreV1ResourceClaim instance) {
    instance = instance != null ? instance : new CoreV1ResourceClaim();
    if (instance != null) {
        this.withName(instance.getName());
        this.withRequest(instance.getRequest());
    }
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
  
  public String getRequest() {
    return this.request;
  }
  
  public A withRequest(String request) {
    this.request = request;
    return (A) this;
  }
  
  public boolean hasRequest() {
    return this.request != null;
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
    CoreV1ResourceClaimFluent that = (CoreV1ResourceClaimFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(request, that.request))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(name, request);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(request == null)) {
        sb.append("request:");
        sb.append(request);
    }
    sb.append("}");
    return sb.toString();
  }
  

}