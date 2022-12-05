package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CephFSPersistentVolumeSourceFluentImpl<A extends V1CephFSPersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1CephFSPersistentVolumeSourceFluent<A>{
  public V1CephFSPersistentVolumeSourceFluentImpl() {
  }
  public V1CephFSPersistentVolumeSourceFluentImpl(V1CephFSPersistentVolumeSource instance) {
    this.withMonitors(instance.getMonitors());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretFile(instance.getSecretFile());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());

  }
  private List<String> monitors;
  private String path;
  private Boolean readOnly;
  private String secretFile;
  private V1SecretReferenceBuilder secretRef;
  private String user;
  public A addToMonitors(Integer index,String item) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    this.monitors.add(index, item);
    return (A)this;
  }
  public A setToMonitors(Integer index,String item) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    this.monitors.set(index, item); return (A)this;
  }
  public A addToMonitors(java.lang.String... items) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    for (String item : items) {this.monitors.add(item);} return (A)this;
  }
  public A addAllToMonitors(Collection<String> items) {
    if (this.monitors == null) {this.monitors = new ArrayList<String>();}
    for (String item : items) {this.monitors.add(item);} return (A)this;
  }
  public A removeFromMonitors(java.lang.String... items) {
    for (String item : items) {if (this.monitors!= null){ this.monitors.remove(item);}} return (A)this;
  }
  public A removeAllFromMonitors(Collection<String> items) {
    for (String item : items) {if (this.monitors!= null){ this.monitors.remove(item);}} return (A)this;
  }
  public List<String> getMonitors() {
    return this.monitors;
  }
  public String getMonitor(Integer index) {
    return this.monitors.get(index);
  }
  public String getFirstMonitor() {
    return this.monitors.get(0);
  }
  public String getLastMonitor() {
    return this.monitors.get(monitors.size() - 1);
  }
  public String getMatchingMonitor(Predicate<String> predicate) {
    for (String item: monitors) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingMonitor(Predicate<String> predicate) {
    for (String item: monitors) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMonitors(List<String> monitors) {
    if (monitors != null) {this.monitors = new ArrayList(); for (String item : monitors){this.addToMonitors(item);}} else { this.monitors = null;} return (A) this;
  }
  public A withMonitors(java.lang.String... monitors) {
    if (this.monitors != null) {this.monitors.clear();}
    if (monitors != null) {for (String item :monitors){ this.addToMonitors(item);}} return (A) this;
  }
  public Boolean hasMonitors() {
    return monitors != null && !monitors.isEmpty();
  }
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public String getSecretFile() {
    return this.secretFile;
  }
  public A withSecretFile(String secretFile) {
    this.secretFile=secretFile; return (A) this;
  }
  public Boolean hasSecretFile() {
    return this.secretFile != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public V1SecretReference buildSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public A withSecretRef(V1SecretReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef!=null){ this.secretRef= new V1SecretReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} else { this.secretRef = null; _visitables.get("secretRef").remove(this.secretRef); } return (A) this;
  }
  public Boolean hasSecretRef() {
    return this.secretRef != null;
  }
  public V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1CephFSPersistentVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new V1CephFSPersistentVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1SecretReferenceBuilder().build());
  }
  public V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public String getUser() {
    return this.user;
  }
  public A withUser(String user) {
    this.user=user; return (A) this;
  }
  public Boolean hasUser() {
    return this.user != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CephFSPersistentVolumeSourceFluentImpl that = (V1CephFSPersistentVolumeSourceFluentImpl) o;
    if (monitors != null ? !monitors.equals(that.monitors) :that.monitors != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretFile != null ? !secretFile.equals(that.secretFile) :that.secretFile != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
    if (user != null ? !user.equals(that.user) :that.user != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(monitors,  path,  readOnly,  secretFile,  secretRef,  user,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (monitors != null && !monitors.isEmpty()) { sb.append("monitors:"); sb.append(monitors + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretFile != null) { sb.append("secretFile:"); sb.append(secretFile + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  class SecretRefNestedImpl<N> extends V1SecretReferenceFluentImpl<V1CephFSPersistentVolumeSourceFluent.SecretRefNested<N>> implements V1CephFSPersistentVolumeSourceFluent.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1SecretReferenceBuilder(this);
    }
    V1SecretReferenceBuilder builder;
    public N and() {
      return (N) V1CephFSPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}