package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.lang.Byte;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1APIServiceSpecFluent<A extends V1APIServiceSpecFluent<A>> extends BaseFluent<A>{
  public V1APIServiceSpecFluent() {
  }
  
  public V1APIServiceSpecFluent(V1APIServiceSpec instance) {
    this.copyInstance(instance);
  }
  private List<Byte> caBundle;
  private String group;
  private Integer groupPriorityMinimum;
  private Boolean insecureSkipTLSVerify;
  private ApiregistrationV1ServiceReferenceBuilder service;
  private String version;
  private Integer versionPriority;
  
  protected void copyInstance(V1APIServiceSpec instance) {
    instance = (instance != null ? instance : new V1APIServiceSpec());
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
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public Integer getGroupPriorityMinimum() {
    return this.groupPriorityMinimum;
  }
  
  public A withGroupPriorityMinimum(Integer groupPriorityMinimum) {
    this.groupPriorityMinimum = groupPriorityMinimum;
    return (A) this;
  }
  
  public boolean hasGroupPriorityMinimum() {
    return this.groupPriorityMinimum != null;
  }
  
  public Boolean getInsecureSkipTLSVerify() {
    return this.insecureSkipTLSVerify;
  }
  
  public A withInsecureSkipTLSVerify(Boolean insecureSkipTLSVerify) {
    this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    return (A) this;
  }
  
  public boolean hasInsecureSkipTLSVerify() {
    return this.insecureSkipTLSVerify != null;
  }
  
  public ApiregistrationV1ServiceReference buildService() {
    return this.service != null ? this.service.build() : null;
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
  
  public boolean hasService() {
    return this.service != null;
  }
  
  public ServiceNested<A> withNewService() {
    return new ServiceNested(null);
  }
  
  public ServiceNested<A> withNewServiceLike(ApiregistrationV1ServiceReference item) {
    return new ServiceNested(item);
  }
  
  public ServiceNested<A> editService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(null));
  }
  
  public ServiceNested<A> editOrNewService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(new ApiregistrationV1ServiceReferenceBuilder().build()));
  }
  
  public ServiceNested<A> editOrNewServiceLike(ApiregistrationV1ServiceReference item) {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(item));
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public Integer getVersionPriority() {
    return this.versionPriority;
  }
  
  public A withVersionPriority(Integer versionPriority) {
    this.versionPriority = versionPriority;
    return (A) this;
  }
  
  public boolean hasVersionPriority() {
    return this.versionPriority != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1APIServiceSpecFluent that = (V1APIServiceSpecFluent) o;
    if (!java.util.Objects.equals(caBundle, that.caBundle)) return false;
    if (!java.util.Objects.equals(group, that.group)) return false;
    if (!java.util.Objects.equals(groupPriorityMinimum, that.groupPriorityMinimum)) return false;
    if (!java.util.Objects.equals(insecureSkipTLSVerify, that.insecureSkipTLSVerify)) return false;
    if (!java.util.Objects.equals(service, that.service)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    if (!java.util.Objects.equals(versionPriority, that.versionPriority)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(caBundle,  group,  groupPriorityMinimum,  insecureSkipTLSVerify,  service,  version,  versionPriority,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (caBundle != null && !caBundle.isEmpty()) { sb.append("caBundle:"); sb.append(caBundle + ","); }
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (groupPriorityMinimum != null) { sb.append("groupPriorityMinimum:"); sb.append(groupPriorityMinimum + ","); }
    if (insecureSkipTLSVerify != null) { sb.append("insecureSkipTLSVerify:"); sb.append(insecureSkipTLSVerify + ","); }
    if (service != null) { sb.append("service:"); sb.append(service + ","); }
    if (version != null) { sb.append("version:"); sb.append(version + ","); }
    if (versionPriority != null) { sb.append("versionPriority:"); sb.append(versionPriority); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withInsecureSkipTLSVerify() {
    return withInsecureSkipTLSVerify(true);
  }
  public class ServiceNested<N> extends ApiregistrationV1ServiceReferenceFluent<ServiceNested<N>> implements Nested<N>{
    ServiceNested(ApiregistrationV1ServiceReference item) {
      this.builder = new ApiregistrationV1ServiceReferenceBuilder(this, item);
    }
    ApiregistrationV1ServiceReferenceBuilder builder;
    
    public N and() {
      return (N) V1APIServiceSpecFluent.this.withService(builder.build());
    }
    
    public N endService() {
      return and();
    }
    
  
  }

}