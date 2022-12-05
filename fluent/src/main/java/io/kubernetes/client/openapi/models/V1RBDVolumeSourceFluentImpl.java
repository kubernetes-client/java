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
  public class V1RBDVolumeSourceFluentImpl<A extends V1RBDVolumeSourceFluent<A>> extends BaseFluent<A> implements V1RBDVolumeSourceFluent<A>{
  public V1RBDVolumeSourceFluentImpl() {
  }
  public V1RBDVolumeSourceFluentImpl(V1RBDVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withImage(instance.getImage());

    this.withKeyring(instance.getKeyring());

    this.withMonitors(instance.getMonitors());

    this.withPool(instance.getPool());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());

  }
  private String fsType;
  private String image;
  private String keyring;
  private List<String> monitors;
  private String pool;
  private Boolean readOnly;
  private V1LocalObjectReferenceBuilder secretRef;
  private String user;
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getImage() {
    return this.image;
  }
  public A withImage(String image) {
    this.image=image; return (A) this;
  }
  public Boolean hasImage() {
    return this.image != null;
  }
  public String getKeyring() {
    return this.keyring;
  }
  public A withKeyring(String keyring) {
    this.keyring=keyring; return (A) this;
  }
  public Boolean hasKeyring() {
    return this.keyring != null;
  }
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
  public String getPool() {
    return this.pool;
  }
  public A withPool(String pool) {
    this.pool=pool; return (A) this;
  }
  public Boolean hasPool() {
    return this.pool != null;
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
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public V1LocalObjectReference buildSecretRef() {
    return this.secretRef!=null ?this.secretRef.build():null;
  }
  public A withSecretRef(V1LocalObjectReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef!=null){ this.secretRef= new V1LocalObjectReferenceBuilder(secretRef); _visitables.get("secretRef").add(this.secretRef);} else { this.secretRef = null; _visitables.get("secretRef").remove(this.secretRef); } return (A) this;
  }
  public Boolean hasSecretRef() {
    return this.secretRef != null;
  }
  public V1RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1RBDVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item) {
    return new V1RBDVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1RBDVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1LocalObjectReferenceBuilder().build());
  }
  public V1RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item) {
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
    V1RBDVolumeSourceFluentImpl that = (V1RBDVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (image != null ? !image.equals(that.image) :that.image != null) return false;
    if (keyring != null ? !keyring.equals(that.keyring) :that.keyring != null) return false;
    if (monitors != null ? !monitors.equals(that.monitors) :that.monitors != null) return false;
    if (pool != null ? !pool.equals(that.pool) :that.pool != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
    if (user != null ? !user.equals(that.user) :that.user != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fsType,  image,  keyring,  monitors,  pool,  readOnly,  secretRef,  user,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (image != null) { sb.append("image:"); sb.append(image + ","); }
    if (keyring != null) { sb.append("keyring:"); sb.append(keyring + ","); }
    if (monitors != null && !monitors.isEmpty()) { sb.append("monitors:"); sb.append(monitors + ","); }
    if (pool != null) { sb.append("pool:"); sb.append(pool + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  public A withReadOnly() {
    return withReadOnly(true);
  }
  class SecretRefNestedImpl<N> extends V1LocalObjectReferenceFluentImpl<V1RBDVolumeSourceFluent.SecretRefNested<N>> implements V1RBDVolumeSourceFluent.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }
    V1LocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1RBDVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}