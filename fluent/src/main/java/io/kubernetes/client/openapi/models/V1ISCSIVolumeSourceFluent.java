package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ISCSIVolumeSourceFluent<A extends V1ISCSIVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1ISCSIVolumeSourceFluent() {
  }
  
  public V1ISCSIVolumeSourceFluent(V1ISCSIVolumeSource instance) {
    this.copyInstance(instance);
  }
  private Boolean chapAuthDiscovery;
  private Boolean chapAuthSession;
  private String fsType;
  private String initiatorName;
  private String iqn;
  private String iscsiInterface;
  private Integer lun;
  private List<String> portals;
  private Boolean readOnly;
  private V1LocalObjectReferenceBuilder secretRef;
  private String targetPortal;
  
  protected void copyInstance(V1ISCSIVolumeSource instance) {
    instance = (instance != null ? instance : new V1ISCSIVolumeSource());
    if (instance != null) {
          this.withChapAuthDiscovery(instance.getChapAuthDiscovery());
          this.withChapAuthSession(instance.getChapAuthSession());
          this.withFsType(instance.getFsType());
          this.withInitiatorName(instance.getInitiatorName());
          this.withIqn(instance.getIqn());
          this.withIscsiInterface(instance.getIscsiInterface());
          this.withLun(instance.getLun());
          this.withPortals(instance.getPortals());
          this.withReadOnly(instance.getReadOnly());
          this.withSecretRef(instance.getSecretRef());
          this.withTargetPortal(instance.getTargetPortal());
        }
  }
  
  public Boolean getChapAuthDiscovery() {
    return this.chapAuthDiscovery;
  }
  
  public A withChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
    return (A) this;
  }
  
  public boolean hasChapAuthDiscovery() {
    return this.chapAuthDiscovery != null;
  }
  
  public Boolean getChapAuthSession() {
    return this.chapAuthSession;
  }
  
  public A withChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
    return (A) this;
  }
  
  public boolean hasChapAuthSession() {
    return this.chapAuthSession != null;
  }
  
  public String getFsType() {
    return this.fsType;
  }
  
  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }
  
  public boolean hasFsType() {
    return this.fsType != null;
  }
  
  public String getInitiatorName() {
    return this.initiatorName;
  }
  
  public A withInitiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
    return (A) this;
  }
  
  public boolean hasInitiatorName() {
    return this.initiatorName != null;
  }
  
  public String getIqn() {
    return this.iqn;
  }
  
  public A withIqn(String iqn) {
    this.iqn = iqn;
    return (A) this;
  }
  
  public boolean hasIqn() {
    return this.iqn != null;
  }
  
  public String getIscsiInterface() {
    return this.iscsiInterface;
  }
  
  public A withIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return (A) this;
  }
  
  public boolean hasIscsiInterface() {
    return this.iscsiInterface != null;
  }
  
  public Integer getLun() {
    return this.lun;
  }
  
  public A withLun(Integer lun) {
    this.lun = lun;
    return (A) this;
  }
  
  public boolean hasLun() {
    return this.lun != null;
  }
  
  public A addToPortals(int index,String item) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    this.portals.add(index, item);
    return (A)this;
  }
  
  public A setToPortals(int index,String item) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    this.portals.set(index, item); return (A)this;
  }
  
  public A addToPortals(java.lang.String... items) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    for (String item : items) {this.portals.add(item);} return (A)this;
  }
  
  public A addAllToPortals(Collection<String> items) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    for (String item : items) {this.portals.add(item);} return (A)this;
  }
  
  public A removeFromPortals(java.lang.String... items) {
    if (this.portals == null) return (A)this;
    for (String item : items) { this.portals.remove(item);} return (A)this;
  }
  
  public A removeAllFromPortals(Collection<String> items) {
    if (this.portals == null) return (A)this;
    for (String item : items) { this.portals.remove(item);} return (A)this;
  }
  
  public List<String> getPortals() {
    return this.portals;
  }
  
  public String getPortal(int index) {
    return this.portals.get(index);
  }
  
  public String getFirstPortal() {
    return this.portals.get(0);
  }
  
  public String getLastPortal() {
    return this.portals.get(portals.size() - 1);
  }
  
  public String getMatchingPortal(Predicate<String> predicate) {
      for (String item : portals) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPortal(Predicate<String> predicate) {
      for (String item : portals) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPortals(List<String> portals) {
    if (portals != null) {
        this.portals = new ArrayList();
        for (String item : portals) {
          this.addToPortals(item);
        }
    } else {
      this.portals = null;
    }
    return (A) this;
  }
  
  public A withPortals(java.lang.String... portals) {
    if (this.portals != null) {
        this.portals.clear();
        _visitables.remove("portals");
    }
    if (portals != null) {
      for (String item : portals) {
        this.addToPortals(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPortals() {
    return this.portals != null && !this.portals.isEmpty();
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public V1LocalObjectReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  public A withSecretRef(V1LocalObjectReference secretRef) {
    this._visitables.remove("secretRef");
    if (secretRef != null) {
        this.secretRef = new V1LocalObjectReferenceBuilder(secretRef);
        this._visitables.get("secretRef").add(this.secretRef);
    } else {
        this.secretRef = null;
        this._visitables.get("secretRef").remove(this.secretRef);
    }
    return (A) this;
  }
  
  public boolean hasSecretRef() {
    return this.secretRef != null;
  }
  
  public SecretRefNested<A> withNewSecretRef() {
    return new SecretRefNested(null);
  }
  
  public SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item) {
    return new SecretRefNested(item);
  }
  
  public SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(new V1LocalObjectReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item) {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(item));
  }
  
  public String getTargetPortal() {
    return this.targetPortal;
  }
  
  public A withTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
    return (A) this;
  }
  
  public boolean hasTargetPortal() {
    return this.targetPortal != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ISCSIVolumeSourceFluent that = (V1ISCSIVolumeSourceFluent) o;
    if (!java.util.Objects.equals(chapAuthDiscovery, that.chapAuthDiscovery)) return false;
    if (!java.util.Objects.equals(chapAuthSession, that.chapAuthSession)) return false;
    if (!java.util.Objects.equals(fsType, that.fsType)) return false;
    if (!java.util.Objects.equals(initiatorName, that.initiatorName)) return false;
    if (!java.util.Objects.equals(iqn, that.iqn)) return false;
    if (!java.util.Objects.equals(iscsiInterface, that.iscsiInterface)) return false;
    if (!java.util.Objects.equals(lun, that.lun)) return false;
    if (!java.util.Objects.equals(portals, that.portals)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;
    if (!java.util.Objects.equals(targetPortal, that.targetPortal)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(chapAuthDiscovery,  chapAuthSession,  fsType,  initiatorName,  iqn,  iscsiInterface,  lun,  portals,  readOnly,  secretRef,  targetPortal,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (chapAuthDiscovery != null) { sb.append("chapAuthDiscovery:"); sb.append(chapAuthDiscovery + ","); }
    if (chapAuthSession != null) { sb.append("chapAuthSession:"); sb.append(chapAuthSession + ","); }
    if (fsType != null) { sb.append("fsType:"); sb.append(fsType + ","); }
    if (initiatorName != null) { sb.append("initiatorName:"); sb.append(initiatorName + ","); }
    if (iqn != null) { sb.append("iqn:"); sb.append(iqn + ","); }
    if (iscsiInterface != null) { sb.append("iscsiInterface:"); sb.append(iscsiInterface + ","); }
    if (lun != null) { sb.append("lun:"); sb.append(lun + ","); }
    if (portals != null && !portals.isEmpty()) { sb.append("portals:"); sb.append(portals + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef + ","); }
    if (targetPortal != null) { sb.append("targetPortal:"); sb.append(targetPortal); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withChapAuthDiscovery() {
    return withChapAuthDiscovery(true);
  }
  
  public A withChapAuthSession() {
    return withChapAuthSession(true);
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  public class SecretRefNested<N> extends V1LocalObjectReferenceFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    V1LocalObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1ISCSIVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}