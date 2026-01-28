package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Byte;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class ApiextensionsV1WebhookClientConfigFluent<A extends io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent<A>> extends BaseFluent<A>{

  private List<Byte> caBundle;
  private ApiextensionsV1ServiceReferenceBuilder service;
  private String url;

  public ApiextensionsV1WebhookClientConfigFluent() {
  }
  
  public ApiextensionsV1WebhookClientConfigFluent(ApiextensionsV1WebhookClientConfig instance) {
    this.copyInstance(instance);
  }

  public A addAllToCaBundle(Collection<Byte> items) {
    if (this.caBundle == null) {
      this.caBundle = new ArrayList();
    }
    for (Byte item : items) {
      this.caBundle.add(item);
    }
    return (A) this;
  }
  
  public A addToCaBundle(Byte... items) {
    if (this.caBundle == null) {
      this.caBundle = new ArrayList();
    }
    for (Byte item : items) {
      this.caBundle.add(item);
    }
    return (A) this;
  }
  
  public A addToCaBundle(int index,Byte item) {
    if (this.caBundle == null) {
      this.caBundle = new ArrayList();
    }
    this.caBundle.add(index, item);
    return (A) this;
  }
  
  public ApiextensionsV1ServiceReference buildService() {
    return this.service != null ? this.service.build() : null;
  }
  
  protected void copyInstance(ApiextensionsV1WebhookClientConfig instance) {
    instance = instance != null ? instance : new ApiextensionsV1WebhookClientConfig();
    if (instance != null) {
        this.withCaBundle(instance.getCaBundle());
        this.withService(instance.getService());
        this.withUrl(instance.getUrl());
    }
  }
  
  public ServiceNested<A> editOrNewService() {
    return this.withNewServiceLike(Optional.ofNullable(this.buildService()).orElse(new ApiextensionsV1ServiceReferenceBuilder().build()));
  }
  
  public ServiceNested<A> editOrNewServiceLike(ApiextensionsV1ServiceReference item) {
    return this.withNewServiceLike(Optional.ofNullable(this.buildService()).orElse(item));
  }
  
  public ServiceNested<A> editService() {
    return this.withNewServiceLike(Optional.ofNullable(this.buildService()).orElse(null));
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
    ApiextensionsV1WebhookClientConfigFluent that = (ApiextensionsV1WebhookClientConfigFluent) o;
    if (!(Objects.equals(caBundle, that.caBundle))) {
      return false;
    }
    if (!(Objects.equals(service, that.service))) {
      return false;
    }
    if (!(Objects.equals(url, that.url))) {
      return false;
    }
    return true;
  }
  
  public byte[] getCaBundle() {
    int size = caBundle != null ? caBundle.size() : 0;
    byte[] result = new byte[size];
    if (size == 0) {
      return result;
    }
    int index = 0;
    for (byte item : caBundle) {
      result[index++] = item;
    }
    return result;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public boolean hasCaBundle() {
    return this.caBundle != null && !(this.caBundle.isEmpty());
  }
  
  public boolean hasService() {
    return this.service != null;
  }
  
  public boolean hasUrl() {
    return this.url != null;
  }
  
  public int hashCode() {
    return Objects.hash(caBundle, service, url);
  }
  
  public A removeAllFromCaBundle(Collection<Byte> items) {
    if (this.caBundle == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.caBundle.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromCaBundle(Byte... items) {
    if (this.caBundle == null) {
      return (A) this;
    }
    for (Byte item : items) {
      this.caBundle.remove(item);
    }
    return (A) this;
  }
  
  public A setToCaBundle(int index,Byte item) {
    if (this.caBundle == null) {
      this.caBundle = new ArrayList();
    }
    this.caBundle.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(caBundle == null) && !(caBundle.isEmpty())) {
        sb.append("caBundle:");
        sb.append(caBundle);
        sb.append(",");
    }
    if (!(service == null)) {
        sb.append("service:");
        sb.append(service);
        sb.append(",");
    }
    if (!(url == null)) {
        sb.append("url:");
        sb.append(url);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCaBundle(byte... caBundle) {
    if (this.caBundle != null) {
        this.caBundle.clear();
        _visitables.remove("caBundle");
    }
    if (caBundle != null) {
      for (byte item : caBundle) {
        this.addToCaBundle(item);
      }
    }
    return (A) this;
  }
  
  public ServiceNested<A> withNewService() {
    return new ServiceNested(null);
  }
  
  public ServiceNested<A> withNewServiceLike(ApiextensionsV1ServiceReference item) {
    return new ServiceNested(item);
  }
  
  public A withService(ApiextensionsV1ServiceReference service) {
    this._visitables.remove("service");
    if (service != null) {
        this.service = new ApiextensionsV1ServiceReferenceBuilder(service);
        this._visitables.get("service").add(this.service);
    } else {
        this.service = null;
        this._visitables.get("service").remove(this.service);
    }
    return (A) this;
  }
  
  public A withUrl(String url) {
    this.url = url;
    return (A) this;
  }
  public class ServiceNested<N> extends ApiextensionsV1ServiceReferenceFluent<ServiceNested<N>> implements Nested<N>{
  
    ApiextensionsV1ServiceReferenceBuilder builder;
  
    ServiceNested(ApiextensionsV1ServiceReference item) {
      this.builder = new ApiextensionsV1ServiceReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) ApiextensionsV1WebhookClientConfigFluent.this.withService(builder.build());
    }
    
    public N endService() {
      return and();
    }
    
  }
}