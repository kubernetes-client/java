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
  public class V1ExternalDocumentationFluentImpl<A extends V1ExternalDocumentationFluent<A>> extends BaseFluent<A> implements V1ExternalDocumentationFluent<A>{
  public V1ExternalDocumentationFluentImpl() {
  }
  public V1ExternalDocumentationFluentImpl(V1ExternalDocumentation instance) {
    this.withDescription(instance.getDescription());

    this.withUrl(instance.getUrl());

  }
  private String description;
  private String url;
  public String getDescription() {
    return this.description;
  }
  public A withDescription(String description) {
    this.description=description; return (A) this;
  }
  public Boolean hasDescription() {
    return this.description != null;
  }
  public String getUrl() {
    return this.url;
  }
  public A withUrl(String url) {
    this.url=url; return (A) this;
  }
  public Boolean hasUrl() {
    return this.url != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ExternalDocumentationFluentImpl that = (V1ExternalDocumentationFluentImpl) o;
    if (description != null ? !description.equals(that.description) :that.description != null) return false;
    if (url != null ? !url.equals(that.url) :that.url != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(description,  url,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (description != null) { sb.append("description:"); sb.append(description + ","); }
    if (url != null) { sb.append("url:"); sb.append(url); }
    sb.append("}");
    return sb.toString();
  }
  
}