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
  public class V1ISCSIVolumeSourceFluentImpl<A extends V1ISCSIVolumeSourceFluent<A>> extends BaseFluent<A> implements V1ISCSIVolumeSourceFluent<A>{
  public V1ISCSIVolumeSourceFluentImpl() {
  }
  public V1ISCSIVolumeSourceFluentImpl(V1ISCSIVolumeSource instance) {
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
  public Boolean getChapAuthDiscovery() {
    return this.chapAuthDiscovery;
  }
  public A withChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery=chapAuthDiscovery; return (A) this;
  }
  public Boolean hasChapAuthDiscovery() {
    return this.chapAuthDiscovery != null;
  }
  public Boolean getChapAuthSession() {
    return this.chapAuthSession;
  }
  public A withChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession=chapAuthSession; return (A) this;
  }
  public Boolean hasChapAuthSession() {
    return this.chapAuthSession != null;
  }
  public String getFsType() {
    return this.fsType;
  }
  public A withFsType(String fsType) {
    this.fsType=fsType; return (A) this;
  }
  public Boolean hasFsType() {
    return this.fsType != null;
  }
  public String getInitiatorName() {
    return this.initiatorName;
  }
  public A withInitiatorName(String initiatorName) {
    this.initiatorName=initiatorName; return (A) this;
  }
  public Boolean hasInitiatorName() {
    return this.initiatorName != null;
  }
  public String getIqn() {
    return this.iqn;
  }
  public A withIqn(String iqn) {
    this.iqn=iqn; return (A) this;
  }
  public Boolean hasIqn() {
    return this.iqn != null;
  }
  public String getIscsiInterface() {
    return this.iscsiInterface;
  }
  public A withIscsiInterface(String iscsiInterface) {
    this.iscsiInterface=iscsiInterface; return (A) this;
  }
  public Boolean hasIscsiInterface() {
    return this.iscsiInterface != null;
  }
  public Integer getLun() {
    return this.lun;
  }
  public A withLun(Integer lun) {
    this.lun=lun; return (A) this;
  }
  public Boolean hasLun() {
    return this.lun != null;
  }
  public A addToPortals(Integer index,String item) {
    if (this.portals == null) {this.portals = new ArrayList<String>();}
    this.portals.add(index, item);
    return (A)this;
  }
  public A setToPortals(Integer index,String item) {
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
    for (String item : items) {if (this.portals!= null){ this.portals.remove(item);}} return (A)this;
  }
  public A removeAllFromPortals(Collection<String> items) {
    for (String item : items) {if (this.portals!= null){ this.portals.remove(item);}} return (A)this;
  }
  public List<String> getPortals() {
    return this.portals;
  }
  public String getPortal(Integer index) {
    return this.portals.get(index);
  }
  public String getFirstPortal() {
    return this.portals.get(0);
  }
  public String getLastPortal() {
    return this.portals.get(portals.size() - 1);
  }
  public String getMatchingPortal(Predicate<String> predicate) {
    for (String item: portals) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingPortal(Predicate<String> predicate) {
    for (String item: portals) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPortals(List<String> portals) {
    if (portals != null) {this.portals = new ArrayList(); for (String item : portals){this.addToPortals(item);}} else { this.portals = null;} return (A) this;
  }
  public A withPortals(java.lang.String... portals) {
    if (this.portals != null) {this.portals.clear();}
    if (portals != null) {for (String item :portals){ this.addToPortals(item);}} return (A) this;
  }
  public Boolean hasPortals() {
    return portals != null && !portals.isEmpty();
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
  public V1ISCSIVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1ISCSIVolumeSourceFluentImpl.SecretRefNestedImpl();
  }
  public V1ISCSIVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item) {
    return new V1ISCSIVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }
  public V1ISCSIVolumeSourceFluent.SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }
  public V1ISCSIVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new V1LocalObjectReferenceBuilder().build());
  }
  public V1ISCSIVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
  }
  public String getTargetPortal() {
    return this.targetPortal;
  }
  public A withTargetPortal(String targetPortal) {
    this.targetPortal=targetPortal; return (A) this;
  }
  public Boolean hasTargetPortal() {
    return this.targetPortal != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ISCSIVolumeSourceFluentImpl that = (V1ISCSIVolumeSourceFluentImpl) o;
    if (chapAuthDiscovery != null ? !chapAuthDiscovery.equals(that.chapAuthDiscovery) :that.chapAuthDiscovery != null) return false;
    if (chapAuthSession != null ? !chapAuthSession.equals(that.chapAuthSession) :that.chapAuthSession != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
    if (initiatorName != null ? !initiatorName.equals(that.initiatorName) :that.initiatorName != null) return false;
    if (iqn != null ? !iqn.equals(that.iqn) :that.iqn != null) return false;
    if (iscsiInterface != null ? !iscsiInterface.equals(that.iscsiInterface) :that.iscsiInterface != null) return false;
    if (lun != null ? !lun.equals(that.lun) :that.lun != null) return false;
    if (portals != null ? !portals.equals(that.portals) :that.portals != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
    if (targetPortal != null ? !targetPortal.equals(that.targetPortal) :that.targetPortal != null) return false;
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
  class SecretRefNestedImpl<N> extends V1LocalObjectReferenceFluentImpl<V1ISCSIVolumeSourceFluent.SecretRefNested<N>> implements V1ISCSIVolumeSourceFluent.SecretRefNested<N>,Nested<N>{
    SecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    SecretRefNestedImpl() {
      this.builder = new V1LocalObjectReferenceBuilder(this);
    }
    V1LocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1ISCSIVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef() {
      return and();
    }
    
  }
  
}