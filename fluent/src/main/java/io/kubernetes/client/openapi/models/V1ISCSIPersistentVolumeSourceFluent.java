package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ISCSIPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1ISCSIPersistentVolumeSourceFluent() {
  }
  
  public V1ISCSIPersistentVolumeSourceFluent(V1ISCSIPersistentVolumeSource instance) {
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
  private V1SecretReferenceBuilder secretRef;
  private String targetPortal;
  
  protected void copyInstance(V1ISCSIPersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1ISCSIPersistentVolumeSource();
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
    if (this.portals == null) {
      this.portals = new ArrayList();
    }
    this.portals.add(index, item);
    return (A) this;
  }
  
  public A setToPortals(int index,String item) {
    if (this.portals == null) {
      this.portals = new ArrayList();
    }
    this.portals.set(index, item);
    return (A) this;
  }
  
  public A addToPortals(String... items) {
    if (this.portals == null) {
      this.portals = new ArrayList();
    }
    for (String item : items) {
      this.portals.add(item);
    }
    return (A) this;
  }
  
  public A addAllToPortals(Collection<String> items) {
    if (this.portals == null) {
      this.portals = new ArrayList();
    }
    for (String item : items) {
      this.portals.add(item);
    }
    return (A) this;
  }
  
  public A removeFromPortals(String... items) {
    if (this.portals == null) {
      return (A) this;
    }
    for (String item : items) {
      this.portals.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromPortals(Collection<String> items) {
    if (this.portals == null) {
      return (A) this;
    }
    for (String item : items) {
      this.portals.remove(item);
    }
    return (A) this;
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
  
  public A withPortals(String... portals) {
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
    return this.portals != null && !(this.portals.isEmpty());
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
  
  public V1SecretReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  public A withSecretRef(V1SecretReference secretRef) {
    this._visitables.remove("secretRef");
    if (secretRef != null) {
        this.secretRef = new V1SecretReferenceBuilder(secretRef);
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
  
  public SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new SecretRefNested(item);
  }
  
  public SecretRefNested<A> editSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(item));
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1ISCSIPersistentVolumeSourceFluent that = (V1ISCSIPersistentVolumeSourceFluent) o;
    if (!(Objects.equals(chapAuthDiscovery, that.chapAuthDiscovery))) {
      return false;
    }
    if (!(Objects.equals(chapAuthSession, that.chapAuthSession))) {
      return false;
    }
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(initiatorName, that.initiatorName))) {
      return false;
    }
    if (!(Objects.equals(iqn, that.iqn))) {
      return false;
    }
    if (!(Objects.equals(iscsiInterface, that.iscsiInterface))) {
      return false;
    }
    if (!(Objects.equals(lun, that.lun))) {
      return false;
    }
    if (!(Objects.equals(portals, that.portals))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretRef, that.secretRef))) {
      return false;
    }
    if (!(Objects.equals(targetPortal, that.targetPortal))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(chapAuthDiscovery, chapAuthSession, fsType, initiatorName, iqn, iscsiInterface, lun, portals, readOnly, secretRef, targetPortal);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(chapAuthDiscovery == null)) {
        sb.append("chapAuthDiscovery:");
        sb.append(chapAuthDiscovery);
        sb.append(",");
    }
    if (!(chapAuthSession == null)) {
        sb.append("chapAuthSession:");
        sb.append(chapAuthSession);
        sb.append(",");
    }
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(initiatorName == null)) {
        sb.append("initiatorName:");
        sb.append(initiatorName);
        sb.append(",");
    }
    if (!(iqn == null)) {
        sb.append("iqn:");
        sb.append(iqn);
        sb.append(",");
    }
    if (!(iscsiInterface == null)) {
        sb.append("iscsiInterface:");
        sb.append(iscsiInterface);
        sb.append(",");
    }
    if (!(lun == null)) {
        sb.append("lun:");
        sb.append(lun);
        sb.append(",");
    }
    if (!(portals == null) && !(portals.isEmpty())) {
        sb.append("portals:");
        sb.append(portals);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(secretRef == null)) {
        sb.append("secretRef:");
        sb.append(secretRef);
        sb.append(",");
    }
    if (!(targetPortal == null)) {
        sb.append("targetPortal:");
        sb.append(targetPortal);
    }
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
  public class SecretRefNested<N> extends V1SecretReferenceFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
    V1SecretReferenceBuilder builder;
    
    public N and() {
      return (N) V1ISCSIPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}