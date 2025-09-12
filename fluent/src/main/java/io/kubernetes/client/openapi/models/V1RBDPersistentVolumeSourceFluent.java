package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
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
public class V1RBDPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1RBDPersistentVolumeSourceFluent() {
  }
  
  public V1RBDPersistentVolumeSourceFluent(V1RBDPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String fsType;
  private String image;
  private String keyring;
  private List<String> monitors;
  private String pool;
  private Boolean readOnly;
  private V1SecretReferenceBuilder secretRef;
  private String user;
  
  protected void copyInstance(V1RBDPersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1RBDPersistentVolumeSource();
    if (instance != null) {
        this.withFsType(instance.getFsType());
        this.withImage(instance.getImage());
        this.withKeyring(instance.getKeyring());
        this.withMonitors(instance.getMonitors());
        this.withPool(instance.getPool());
        this.withReadOnly(instance.getReadOnly());
        this.withSecretRef(instance.getSecretRef());
        this.withUser(instance.getUser());
    }
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
  
  public String getImage() {
    return this.image;
  }
  
  public A withImage(String image) {
    this.image = image;
    return (A) this;
  }
  
  public boolean hasImage() {
    return this.image != null;
  }
  
  public String getKeyring() {
    return this.keyring;
  }
  
  public A withKeyring(String keyring) {
    this.keyring = keyring;
    return (A) this;
  }
  
  public boolean hasKeyring() {
    return this.keyring != null;
  }
  
  public A addToMonitors(int index,String item) {
    if (this.monitors == null) {
      this.monitors = new ArrayList();
    }
    this.monitors.add(index, item);
    return (A) this;
  }
  
  public A setToMonitors(int index,String item) {
    if (this.monitors == null) {
      this.monitors = new ArrayList();
    }
    this.monitors.set(index, item);
    return (A) this;
  }
  
  public A addToMonitors(String... items) {
    if (this.monitors == null) {
      this.monitors = new ArrayList();
    }
    for (String item : items) {
      this.monitors.add(item);
    }
    return (A) this;
  }
  
  public A addAllToMonitors(Collection<String> items) {
    if (this.monitors == null) {
      this.monitors = new ArrayList();
    }
    for (String item : items) {
      this.monitors.add(item);
    }
    return (A) this;
  }
  
  public A removeFromMonitors(String... items) {
    if (this.monitors == null) {
      return (A) this;
    }
    for (String item : items) {
      this.monitors.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromMonitors(Collection<String> items) {
    if (this.monitors == null) {
      return (A) this;
    }
    for (String item : items) {
      this.monitors.remove(item);
    }
    return (A) this;
  }
  
  public List<String> getMonitors() {
    return this.monitors;
  }
  
  public String getMonitor(int index) {
    return this.monitors.get(index);
  }
  
  public String getFirstMonitor() {
    return this.monitors.get(0);
  }
  
  public String getLastMonitor() {
    return this.monitors.get(monitors.size() - 1);
  }
  
  public String getMatchingMonitor(Predicate<String> predicate) {
      for (String item : monitors) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingMonitor(Predicate<String> predicate) {
      for (String item : monitors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMonitors(List<String> monitors) {
    if (monitors != null) {
        this.monitors = new ArrayList();
        for (String item : monitors) {
          this.addToMonitors(item);
        }
    } else {
      this.monitors = null;
    }
    return (A) this;
  }
  
  public A withMonitors(String... monitors) {
    if (this.monitors != null) {
        this.monitors.clear();
        _visitables.remove("monitors");
    }
    if (monitors != null) {
      for (String item : monitors) {
        this.addToMonitors(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMonitors() {
    return this.monitors != null && !(this.monitors.isEmpty());
  }
  
  public String getPool() {
    return this.pool;
  }
  
  public A withPool(String pool) {
    this.pool = pool;
    return (A) this;
  }
  
  public boolean hasPool() {
    return this.pool != null;
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
  
  public String getUser() {
    return this.user;
  }
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  
  public boolean hasUser() {
    return this.user != null;
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
    V1RBDPersistentVolumeSourceFluent that = (V1RBDPersistentVolumeSourceFluent) o;
    if (!(Objects.equals(fsType, that.fsType))) {
      return false;
    }
    if (!(Objects.equals(image, that.image))) {
      return false;
    }
    if (!(Objects.equals(keyring, that.keyring))) {
      return false;
    }
    if (!(Objects.equals(monitors, that.monitors))) {
      return false;
    }
    if (!(Objects.equals(pool, that.pool))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretRef, that.secretRef))) {
      return false;
    }
    if (!(Objects.equals(user, that.user))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(fsType, image, keyring, monitors, pool, readOnly, secretRef, user);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(fsType == null)) {
        sb.append("fsType:");
        sb.append(fsType);
        sb.append(",");
    }
    if (!(image == null)) {
        sb.append("image:");
        sb.append(image);
        sb.append(",");
    }
    if (!(keyring == null)) {
        sb.append("keyring:");
        sb.append(keyring);
        sb.append(",");
    }
    if (!(monitors == null) && !(monitors.isEmpty())) {
        sb.append("monitors:");
        sb.append(monitors);
        sb.append(",");
    }
    if (!(pool == null)) {
        sb.append("pool:");
        sb.append(pool);
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
    if (!(user == null)) {
        sb.append("user:");
        sb.append(user);
    }
    sb.append("}");
    return sb.toString();
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
      return (N) V1RBDPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}