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
public class V1CephFSVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1CephFSVolumeSourceFluent() {
  }
  
  public V1CephFSVolumeSourceFluent(V1CephFSVolumeSource instance) {
    this.copyInstance(instance);
  }
  private List<String> monitors;
  private String path;
  private Boolean readOnly;
  private String secretFile;
  private V1LocalObjectReferenceBuilder secretRef;
  private String user;
  
  protected void copyInstance(V1CephFSVolumeSource instance) {
    instance = instance != null ? instance : new V1CephFSVolumeSource();
    if (instance != null) {
        this.withMonitors(instance.getMonitors());
        this.withPath(instance.getPath());
        this.withReadOnly(instance.getReadOnly());
        this.withSecretFile(instance.getSecretFile());
        this.withSecretRef(instance.getSecretRef());
        this.withUser(instance.getUser());
    }
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
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
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
  
  public String getSecretFile() {
    return this.secretFile;
  }
  
  public A withSecretFile(String secretFile) {
    this.secretFile = secretFile;
    return (A) this;
  }
  
  public boolean hasSecretFile() {
    return this.secretFile != null;
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
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return this.withNewSecretRefLike(Optional.ofNullable(this.buildSecretRef()).orElse(new V1LocalObjectReferenceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item) {
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
    V1CephFSVolumeSourceFluent that = (V1CephFSVolumeSourceFluent) o;
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
  
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
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
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  public class SecretRefNested<N> extends V1LocalObjectReferenceFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }
    V1LocalObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1CephFSVolumeSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}