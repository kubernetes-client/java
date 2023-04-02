package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class ApiextensionsV1WebhookClientConfigFluentImpl<A extends ApiextensionsV1WebhookClientConfigFluent<A>> extends BaseFluent<A> implements ApiextensionsV1WebhookClientConfigFluent<A>{
  public ApiextensionsV1WebhookClientConfigFluentImpl() {
  }
  public ApiextensionsV1WebhookClientConfigFluentImpl(ApiextensionsV1WebhookClientConfig instance) {
    this.withCaBundle(instance.getCaBundle());

    this.withService(instance.getService());

    this.withUrl(instance.getUrl());

  }
  private List<Byte> caBundle;
  private ApiextensionsV1ServiceReferenceBuilder service;
  private String url;
  public A withCaBundle(byte... caBundle) {
    if (this.caBundle != null) {this.caBundle.clear();}
    if (caBundle != null) {for (byte item :caBundle){ this.addToCaBundle(item);}} return (A) this;
  }
  public byte[] getCaBundle() {
    //This needs to work with primitives, so we use arrays.
int size = caBundle != null ? caBundle.size() : 0;
byte[] result = new byte[size];
if (size == 0) {
   return result;
}
int index = 0;
for (byte item : caBundle) {
    result[index++]=item;
}
return result;

  }
  public A addToCaBundle(Integer index,Byte item) {
    if (this.caBundle == null) {this.caBundle =  new ArrayList<Byte>();}
    this.caBundle.add(index, item);
    return (A)this;
  }
  public A setToCaBundle(Integer index,Byte item) {
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
    for (Byte item : items) {if (this.caBundle!= null){ this.caBundle.remove(item);}} return (A)this;
  }
  public A removeAllFromCaBundle(Collection<Byte> items) {
    for (Byte item : items) {if (this.caBundle!= null){ this.caBundle.remove(item);}} return (A)this;
  }
  public Boolean hasCaBundle() {
    return caBundle != null && !caBundle.isEmpty();
  }
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @Deprecated
  public ApiextensionsV1ServiceReference getService() {
    return this.service!=null ?this.service.build():null;
  }
  public ApiextensionsV1ServiceReference buildService() {
    return this.service!=null ?this.service.build():null;
  }
  public A withService(ApiextensionsV1ServiceReference service) {
    _visitables.get("service").remove(this.service);
    if (service!=null){ this.service= new ApiextensionsV1ServiceReferenceBuilder(service); _visitables.get("service").add(this.service);} else { this.service = null; _visitables.get("service").remove(this.service); } return (A) this;
  }
  public Boolean hasService() {
    return this.service != null;
  }
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewService() {
    return new ApiextensionsV1WebhookClientConfigFluentImpl.ServiceNestedImpl();
  }
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> withNewServiceLike(ApiextensionsV1ServiceReference item) {
    return new ApiextensionsV1WebhookClientConfigFluentImpl.ServiceNestedImpl(item);
  }
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editService() {
    return withNewServiceLike(getService());
  }
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewService() {
    return withNewServiceLike(getService() != null ? getService(): new ApiextensionsV1ServiceReferenceBuilder().build());
  }
  public ApiextensionsV1WebhookClientConfigFluent.ServiceNested<A> editOrNewServiceLike(ApiextensionsV1ServiceReference item) {
    return withNewServiceLike(getService() != null ? getService(): item);
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
    ApiextensionsV1WebhookClientConfigFluentImpl that = (ApiextensionsV1WebhookClientConfigFluentImpl) o;
    if (caBundle != null ? !caBundle.equals(that.caBundle) :that.caBundle != null) return false;
    if (service != null ? !service.equals(that.service) :that.service != null) return false;
    if (url != null ? !url.equals(that.url) :that.url != null) return false;
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
  class ServiceNestedImpl<N> extends ApiextensionsV1ServiceReferenceFluentImpl<ApiextensionsV1WebhookClientConfigFluent.ServiceNested<N>> implements ApiextensionsV1WebhookClientConfigFluent.ServiceNested<N>,Nested<N>{
    ServiceNestedImpl(ApiextensionsV1ServiceReference item) {
      this.builder = new ApiextensionsV1ServiceReferenceBuilder(this, item);
    }
    ServiceNestedImpl() {
      this.builder = new ApiextensionsV1ServiceReferenceBuilder(this);
    }
    ApiextensionsV1ServiceReferenceBuilder builder;
    public N and() {
      return (N) ApiextensionsV1WebhookClientConfigFluentImpl.this.withService(builder.build());
    }
    public N endService() {
      return and();
    }
    
  }
  
}