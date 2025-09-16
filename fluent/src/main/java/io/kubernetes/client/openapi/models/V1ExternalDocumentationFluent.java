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
public class V1ExternalDocumentationFluent<A extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A>> extends BaseFluent<A>{
  public V1ExternalDocumentationFluent() {
  }
  
  public V1ExternalDocumentationFluent(V1ExternalDocumentation instance) {
    this.copyInstance(instance);
  }
  private String description;
  private String url;
  
  protected void copyInstance(V1ExternalDocumentation instance) {
    instance = instance != null ? instance : new V1ExternalDocumentation();
    if (instance != null) {
        this.withDescription(instance.getDescription());
        this.withUrl(instance.getUrl());
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
  
  public String getUrl() {
    return this.url;
  }
  
  public A withUrl(String url) {
    this.url = url;
    return (A) this;
  }
  
  public boolean hasUrl() {
    return this.url != null;
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
    V1ExternalDocumentationFluent that = (V1ExternalDocumentationFluent) o;
    if (!(Objects.equals(description, that.description))) {
      return false;
    }
    if (!(Objects.equals(url, that.url))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(description, url);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(description == null)) {
        sb.append("description:");
        sb.append(description);
        sb.append(",");
    }
    if (!(url == null)) {
        sb.append("url:");
        sb.append(url);
    }
    sb.append("}");
    return sb.toString();
  }
  

}