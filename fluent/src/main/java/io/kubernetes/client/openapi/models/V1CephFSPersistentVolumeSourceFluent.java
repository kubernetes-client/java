package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CephFSPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{

  private List<String> monitors;
  private String path;
  private Boolean readOnly;
  private String secretFile;
  private V1SecretReferenceBuilder secretRef;
  private String user;

  public V1CephFSPersistentVolumeSourceFluent() {
  }
  
  public V1CephFSPersistentVolumeSourceFluent(V1CephFSPersistentVolumeSource instance) {
    this.copyInstance(instance);
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
  
  public A addToMonitors(String... items) {
    if (this.monitors == null) {
      this.monitors = new ArrayList();
    }
    for (String item : items) {
      this.monitors.add(item);
    }
    return (A) this;
  }
  
  public A addToMonitors(int index,String item) {
    if (this.monitors == null) {
      this.monitors = new ArrayList();
    }
    this.monitors.add(index, item);
    return (A) this;
  }
  
  public V1SecretReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  protected void copyInstance(V1CephFSPersistentVolumeSource instance) {
    instance = instance != null ? instance : new V1CephFSPersistentVolumeSource();
    if (instance != null) {
        this.withMonitors(instance.getMonitors());
        this.withPath(instance.getPath());
        this.withReadOnly(instance.getReadOnly());
        this.withSecretFile(instance.getSecretFile());
        this.withSecretRef(instance.getSecretRef());
        this.withUser(instance.getUser());
    }
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(new V1SecretReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item) {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(item));
  }
  
  public SecretRefNested<A> editSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(null));
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
    V1CephFSPersistentVolumeSourceFluent that = (V1CephFSPersistentVolumeSourceFluent) o;
    if (!(Objects.equals(monitors, that.monitors))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(readOnly, that.readOnly))) {
      return false;
    }
    if (!(Objects.equals(secretFile, that.secretFile))) {
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
  
  public String getMonitor(int index) {
    return this.monitors.get(index);
  }
  
  public List<String> getMonitors() {
    return this.monitors;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public String getSecretFile() {
    return this.secretFile;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public boolean hasMatchingMonitor(Predicate<String> predicate) {
      for (String item : monitors) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMonitors() {
    return this.monitors != null && !(this.monitors.isEmpty());
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean hasSecretFile() {
    return this.secretFile != null;
  }
  
  public boolean hasSecretRef() {
    return this.secretRef != null;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
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
  
  public A removeFromMonitors(String... items) {
    if (this.monitors == null) {
      return (A) this;
    }
    for (String item : items) {
      this.monitors.remove(item);
    }
    return (A) this;
  }
  
  public A setToMonitors(int index,String item) {
    if (this.monitors == null) {
      this.monitors = new ArrayList();
    }
    this.monitors.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(monitors == null) && !(monitors.isEmpty())) {
        sb.append("monitors:");
        sb.append(monitors);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(readOnly == null)) {
        sb.append("readOnly:");
        sb.append(readOnly);
        sb.append(",");
    }
    if (!(secretFile == null)) {
        sb.append("secretFile:");
        sb.append(secretFile);
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
  
  public SecretRefNested<A> withNewSecretRef() {
    return new SecretRefNested(null);
  }
  
  public SecretRefNested<A> withNewSecretRefLike(V1SecretReference item) {
    return new SecretRefNested(item);
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public A withSecretFile(String secretFile) {
    this.secretFile = secretFile;
    return (A) this;
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
  
  public A withUser(String user) {
    this.user = user;
    return (A) this;
  }
  public class SecretRefNested<N> extends V1SecretReferenceFluent<SecretRefNested<N>> implements Nested<N>{
  
    V1SecretReferenceBuilder builder;
  
    SecretRefNested(V1SecretReference item) {
      this.builder = new V1SecretReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CephFSPersistentVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  }
}