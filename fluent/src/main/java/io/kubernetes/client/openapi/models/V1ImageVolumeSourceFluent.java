package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ImageVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ImageVolumeSourceFluent<A>> extends BaseFluent<A>{

  private String pullPolicy;
  private String reference;

  public V1ImageVolumeSourceFluent() {
  }
  
  public V1ImageVolumeSourceFluent(V1ImageVolumeSource instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ImageVolumeSource instance) {
    instance = instance != null ? instance : new V1ImageVolumeSource();
    if (instance != null) {
        this.withPullPolicy(instance.getPullPolicy());
        this.withReference(instance.getReference());
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
    V1ImageVolumeSourceFluent that = (V1ImageVolumeSourceFluent) o;
    if (!(Objects.equals(pullPolicy, that.pullPolicy))) {
      return false;
    }
    if (!(Objects.equals(reference, that.reference))) {
      return false;
    }
    return true;
  }
  
  public String getPullPolicy() {
    return this.pullPolicy;
  }
  
  public String getReference() {
    return this.reference;
  }
  
  public boolean hasPullPolicy() {
    return this.pullPolicy != null;
  }
  
  public boolean hasReference() {
    return this.reference != null;
  }
  
  public int hashCode() {
    return Objects.hash(pullPolicy, reference);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(pullPolicy == null)) {
        sb.append("pullPolicy:");
        sb.append(pullPolicy);
        sb.append(",");
    }
    if (!(reference == null)) {
        sb.append("reference:");
        sb.append(reference);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPullPolicy(String pullPolicy) {
    this.pullPolicy = pullPolicy;
    return (A) this;
  }
  
  public A withReference(String reference) {
    this.reference = reference;
    return (A) this;
  }
  
}