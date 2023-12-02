package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class AdmissionregistrationV1WebhookClientConfigFluent<A extends AdmissionregistrationV1WebhookClientConfigFluent<A>> extends BaseFluent<A>{
  public AdmissionregistrationV1WebhookClientConfigFluent() {
  }
  
  public AdmissionregistrationV1WebhookClientConfigFluent(AdmissionregistrationV1WebhookClientConfig instance) {
    this.copyInstance(instance);
  }
  private List<Byte> caBundle;
  private AdmissionregistrationV1ServiceReferenceBuilder service;
  private String url;
  
  protected void copyInstance(AdmissionregistrationV1WebhookClientConfig instance) {
    instance = (instance != null ? instance : new AdmissionregistrationV1WebhookClientConfig());
    if (instance != null) {
          this.withCaBundle(instance.getCaBundle());
          this.withService(instance.getService());
          this.withUrl(instance.getUrl());
        }
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
  
  public byte[] getCaBundle() {
    int size = caBundle != null ? caBundle.size() : 0;;
    byte[] result = new byte[size];;
    if (size == 0) {
      return result;
    }
    int index = 0;;
    for (byte item : caBundle) {
      result[index++] = item;
    }
    return result;
  }
  
  public A addToCaBundle(int index,Byte item) {
    if (this.caBundle == null) {this.caBundle =  new ArrayList<Byte>();}
    this.caBundle.add(index, item);
    return (A)this;
  }
  
  public A setToCaBundle(int index,Byte item) {
    if (this.caBundle == null) {this.caBundle =  new ArrayList<Byte>();}
    this.caBundle.set(index, item); return (A)this;
  }
  
  public A addToCaBundle(java.lang.Byte... items) {
    if (this.caBundle == null) {this.caBundle =  new ArrayList<Byte>();}
    for (Byte item : items) {this.caBundle.add(item);} return (A)this;
  }
  
  public A addAllToCaBundle(Collection<Byte> items) {
    if (this.caBundle == null) {this.caBundle =  new ArrayList<Byte>();}
    for (Byte item : items) {this.caBundle.add(item);} return (A)this;
  }
  
  public A removeFromCaBundle(java.lang.Byte... items) {
    if (this.caBundle == null) return (A)this;
    for (Byte item : items) { this.caBundle.remove(item);} return (A)this;
  }
  
  public A removeAllFromCaBundle(Collection<Byte> items) {
    if (this.caBundle == null) return (A)this;
    for (Byte item : items) { this.caBundle.remove(item);} return (A)this;
  }
  
  public boolean hasCaBundle() {
    return this.caBundle != null && !this.caBundle.isEmpty();
  }
  
  public AdmissionregistrationV1ServiceReference buildService() {
    return this.service != null ? this.service.build() : null;
  }
  
  public A withService(AdmissionregistrationV1ServiceReference service) {
    this._visitables.remove("service");
    if (service != null) {
        this.service = new AdmissionregistrationV1ServiceReferenceBuilder(service);
        this._visitables.get("service").add(this.service);
    } else {
        this.service = null;
        this._visitables.get("service").remove(this.service);
    }
    return (A) this;
  }
  
  public boolean hasService() {
    return this.service != null;
  }
  
  public ServiceNested<A> withNewService() {
    return new ServiceNested(null);
  }
  
  public ServiceNested<A> withNewServiceLike(AdmissionregistrationV1ServiceReference item) {
    return new ServiceNested(item);
  }
  
  public ServiceNested<A> editService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(null));
  }
  
  public ServiceNested<A> editOrNewService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(new AdmissionregistrationV1ServiceReferenceBuilder().build()));
  }
  
  public ServiceNested<A> editOrNewServiceLike(AdmissionregistrationV1ServiceReference item) {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(item));
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    AdmissionregistrationV1WebhookClientConfigFluent that = (AdmissionregistrationV1WebhookClientConfigFluent) o;
    if (!java.util.Objects.equals(caBundle, that.caBundle)) return false;
    if (!java.util.Objects.equals(service, that.service)) return false;
    if (!java.util.Objects.equals(url, that.url)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(caBundle,  service,  url,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (caBundle != null && !caBundle.isEmpty()) { sb.append("caBundle:"); sb.append(caBundle + ","); }
    if (service != null) { sb.append("service:"); sb.append(service + ","); }
    if (url != null) { sb.append("url:"); sb.append(url); }
    sb.append("}");
    return sb.toString();
  }
  public class ServiceNested<N> extends AdmissionregistrationV1ServiceReferenceFluent<ServiceNested<N>> implements Nested<N>{
    ServiceNested(AdmissionregistrationV1ServiceReference item) {
      this.builder = new AdmissionregistrationV1ServiceReferenceBuilder(this, item);
    }
    AdmissionregistrationV1ServiceReferenceBuilder builder;
    
    public N and() {
      return (N) AdmissionregistrationV1WebhookClientConfigFluent.this.withService(builder.build());
    }
    
    public N endService() {
      return and();
    }
    
  
  }

}