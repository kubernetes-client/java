package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Integer;
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
public class V1APIServiceSpecFluent<A extends io.kubernetes.client.openapi.models.V1APIServiceSpecFluent<A>> extends BaseFluent<A>{

  private List<Byte> caBundle;
  private String group;
  private Integer groupPriorityMinimum;
  private Boolean insecureSkipTLSVerify;
  private ApiregistrationV1ServiceReferenceBuilder service;
  private String version;
  private Integer versionPriority;

  public V1APIServiceSpecFluent() {
  }
  
  public V1APIServiceSpecFluent(V1APIServiceSpec instance) {
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
  
  public ApiregistrationV1ServiceReference buildService() {
    return this.service != null ? this.service.build() : null;
  }
  
  protected void copyInstance(V1APIServiceSpec instance) {
    instance = instance != null ? instance : new V1APIServiceSpec();
    if (instance != null) {
        this.withCaBundle(instance.getCaBundle());
        this.withGroup(instance.getGroup());
        this.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());
        this.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());
        this.withService(instance.getService());
        this.withVersion(instance.getVersion());
        this.withVersionPriority(instance.getVersionPriority());
    }
  }
  
  public ServiceNested<A> editOrNewService() {
    return this.withNewServiceLike(Optional.ofNullable(this.buildService()).orElse(new ApiregistrationV1ServiceReferenceBuilder().build()));
  }
  
  public ServiceNested<A> editOrNewServiceLike(ApiregistrationV1ServiceReference item) {
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
    V1APIServiceSpecFluent that = (V1APIServiceSpecFluent) o;
    if (!(Objects.equals(caBundle, that.caBundle))) {
      return false;
    }
    if (!(Objects.equals(group, that.group))) {
      return false;
    }
    if (!(Objects.equals(groupPriorityMinimum, that.groupPriorityMinimum))) {
      return false;
    }
    if (!(Objects.equals(insecureSkipTLSVerify, that.insecureSkipTLSVerify))) {
      return false;
    }
    if (!(Objects.equals(service, that.service))) {
      return false;
    }
    if (!(Objects.equals(version, that.version))) {
      return false;
    }
    if (!(Objects.equals(versionPriority, that.versionPriority))) {
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
  
  public String getGroup() {
    return this.group;
  }
  
  public Integer getGroupPriorityMinimum() {
    return this.groupPriorityMinimum;
  }
  
  public Boolean getInsecureSkipTLSVerify() {
    return this.insecureSkipTLSVerify;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public Integer getVersionPriority() {
    return this.versionPriority;
  }
  
  public boolean hasCaBundle() {
    return this.caBundle != null && !(this.caBundle.isEmpty());
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public boolean hasGroupPriorityMinimum() {
    return this.groupPriorityMinimum != null;
  }
  
  public boolean hasInsecureSkipTLSVerify() {
    return this.insecureSkipTLSVerify != null;
  }
  
  public boolean hasService() {
    return this.service != null;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean hasVersionPriority() {
    return this.versionPriority != null;
  }
  
  public int hashCode() {
    return Objects.hash(caBundle, group, groupPriorityMinimum, insecureSkipTLSVerify, service, version, versionPriority);
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
    if (!(group == null)) {
        sb.append("group:");
        sb.append(group);
        sb.append(",");
    }
    if (!(groupPriorityMinimum == null)) {
        sb.append("groupPriorityMinimum:");
        sb.append(groupPriorityMinimum);
        sb.append(",");
    }
    if (!(insecureSkipTLSVerify == null)) {
        sb.append("insecureSkipTLSVerify:");
        sb.append(insecureSkipTLSVerify);
        sb.append(",");
    }
    if (!(service == null)) {
        sb.append("service:");
        sb.append(service);
        sb.append(",");
    }
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
        sb.append(",");
    }
    if (!(versionPriority == null)) {
        sb.append("versionPriority:");
        sb.append(versionPriority);
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
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public A withGroupPriorityMinimum(Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
    return (A) this;
  }
  
  public A withInsecureSkipTLSVerify() {
    return withInsecureSkipTLSVerify(true);
  }
  
  public A withInsecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    return (A) this;
  }
  
  public ServiceNested<A> withNewService() {
    return new ServiceNested(null);
  }
  
  public ServiceNested<A> withNewServiceLike(ApiregistrationV1ServiceReference item) {
    return new ServiceNested(item);
  }
  
  public A withService(ApiregistrationV1ServiceReference service) {
    this._visitables.remove("service");
    if (service != null) {
        this.service = new ApiregistrationV1ServiceReferenceBuilder(service);
        this._visitables.get("service").add(this.service);
    } else {
        this.service = null;
        this._visitables.get("service").remove(this.service);
    }
    return (A) this;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public A withVersionPriority(Integer versionPriority) {
    this.versionPriority = versionPriority;
    return (A) this;
  }
  public class ServiceNested<N> extends ApiregistrationV1ServiceReferenceFluent<ServiceNested<N>> implements Nested<N>{
  
    ApiregistrationV1ServiceReferenceBuilder builder;
  
    ServiceNested(ApiregistrationV1ServiceReference item) {
      this.builder = new ApiregistrationV1ServiceReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1APIServiceSpecFluent.this.withService(builder.build());
    }
    
    public N endService() {
      return and();
    }
    
  }
}