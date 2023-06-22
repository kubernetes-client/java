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
  public class V1ClaimSourceFluentImpl<A extends V1ClaimSourceFluent<A>> extends BaseFluent<A> implements V1ClaimSourceFluent<A>{
  public V1ClaimSourceFluentImpl() {
  }
  public V1ClaimSourceFluentImpl(V1ClaimSource instance) {
    if (instance != null) {
      this.withResourceClaimName(instance.getResourceClaimName());
      this.withResourceClaimTemplateName(instance.getResourceClaimTemplateName());
    }
  }
  private String resourceClaimName;
  private String resourceClaimTemplateName;
  public String getResourceClaimName() {
    return this.resourceClaimName;
  }
  public A withResourceClaimName(String resourceClaimName) {
    this.resourceClaimName=resourceClaimName; return (A) this;
  }
  public Boolean hasResourceClaimName() {
    return this.resourceClaimName != null;
  }
  public String getResourceClaimTemplateName() {
    return this.resourceClaimTemplateName;
  }
  public A withResourceClaimTemplateName(String resourceClaimTemplateName) {
    this.resourceClaimTemplateName=resourceClaimTemplateName; return (A) this;
  }
  public Boolean hasResourceClaimTemplateName() {
    return this.resourceClaimTemplateName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ClaimSourceFluentImpl that = (V1ClaimSourceFluentImpl) o;
    if (!java.util.Objects.equals(resourceClaimName, that.resourceClaimName)) return false;

    if (!java.util.Objects.equals(resourceClaimTemplateName, that.resourceClaimTemplateName)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(resourceClaimName,  resourceClaimTemplateName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (resourceClaimName != null) { sb.append("resourceClaimName:"); sb.append(resourceClaimName + ","); }
    if (resourceClaimTemplateName != null) { sb.append("resourceClaimTemplateName:"); sb.append(resourceClaimTemplateName); }
    sb.append("}");
    return sb.toString();
  }
  
}