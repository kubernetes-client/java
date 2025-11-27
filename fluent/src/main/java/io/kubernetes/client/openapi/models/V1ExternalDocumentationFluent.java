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
public class V1ExternalDocumentationFluent<A extends io.kubernetes.client.openapi.models.V1ExternalDocumentationFluent<A>> extends BaseFluent<A>{

  private String description;
  private String url;

  public V1ExternalDocumentationFluent() {
  }
  
  public V1ExternalDocumentationFluent(V1ExternalDocumentation instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ExternalDocumentation instance) {
    instance = instance != null ? instance : new V1ExternalDocumentation();
    if (instance != null) {
        this.withDescription(instance.getDescription());
        this.withUrl(instance.getUrl());
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
    V1ExternalDocumentationFluent that = (V1ExternalDocumentationFluent) o;
    if (!(Objects.equals(description, that.description))) {
      return false;
    }
    if (!(Objects.equals(url, that.url))) {
      return false;
    }
    return true;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public boolean hasDescription() {
    return this.description != null;
  }
  
  public boolean hasUrl() {
    return this.url != null;
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
  
  public A withDescription(String description) {
    this.description = description;
    return (A) this;
  }
  
  public A withUrl(String url) {
    this.url = url;
    return (A) this;
  }
  
}