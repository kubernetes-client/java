package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EnvVarSourceFluent<A extends io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<A>> extends BaseFluent<A>{

  private V1ConfigMapKeySelectorBuilder configMapKeyRef;
  private V1ObjectFieldSelectorBuilder fieldRef;
  private V1FileKeySelectorBuilder fileKeyRef;
  private V1ResourceFieldSelectorBuilder resourceFieldRef;
  private V1SecretKeySelectorBuilder secretKeyRef;

  public V1EnvVarSourceFluent() {
  }
  
  public V1EnvVarSourceFluent(V1EnvVarSource instance) {
    this.copyInstance(instance);
  }

  public V1ConfigMapKeySelector buildConfigMapKeyRef() {
    return this.configMapKeyRef != null ? this.configMapKeyRef.build() : null;
  }
  
  public V1ObjectFieldSelector buildFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }
  
  public V1FileKeySelector buildFileKeyRef() {
    return this.fileKeyRef != null ? this.fileKeyRef.build() : null;
  }
  
  public V1ResourceFieldSelector buildResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }
  
  public V1SecretKeySelector buildSecretKeyRef() {
    return this.secretKeyRef != null ? this.secretKeyRef.build() : null;
  }
  
  protected void copyInstance(V1EnvVarSource instance) {
    instance = instance != null ? instance : new V1EnvVarSource();
    if (instance != null) {
        this.withConfigMapKeyRef(instance.getConfigMapKeyRef());
        this.withFieldRef(instance.getFieldRef());
        this.withFileKeyRef(instance.getFileKeyRef());
        this.withResourceFieldRef(instance.getResourceFieldRef());
        this.withSecretKeyRef(instance.getSecretKeyRef());
    }
  }
  
  public ConfigMapKeyRefNested<A> editConfigMapKeyRef() {
    return this.withNewConfigMapKeyRefLike(Optional.ofNullable(this.buildConfigMapKeyRef()).orElse(null));
  }
  
  public FieldRefNested<A> editFieldRef() {
    return this.withNewFieldRefLike(Optional.ofNullable(this.buildFieldRef()).orElse(null));
  }
  
  public FileKeyRefNested<A> editFileKeyRef() {
    return this.withNewFileKeyRefLike(Optional.ofNullable(this.buildFileKeyRef()).orElse(null));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef() {
    return this.withNewConfigMapKeyRefLike(Optional.ofNullable(this.buildConfigMapKeyRef()).orElse(new V1ConfigMapKeySelectorBuilder().build()));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(V1ConfigMapKeySelector item) {
    return this.withNewConfigMapKeyRefLike(Optional.ofNullable(this.buildConfigMapKeyRef()).orElse(item));
  }
  
  public FieldRefNested<A> editOrNewFieldRef() {
    return this.withNewFieldRefLike(Optional.ofNullable(this.buildFieldRef()).orElse(new V1ObjectFieldSelectorBuilder().build()));
  }
  
  public FieldRefNested<A> editOrNewFieldRefLike(V1ObjectFieldSelector item) {
    return this.withNewFieldRefLike(Optional.ofNullable(this.buildFieldRef()).orElse(item));
  }
  
  public FileKeyRefNested<A> editOrNewFileKeyRef() {
    return this.withNewFileKeyRefLike(Optional.ofNullable(this.buildFileKeyRef()).orElse(new V1FileKeySelectorBuilder().build()));
  }
  
  public FileKeyRefNested<A> editOrNewFileKeyRefLike(V1FileKeySelector item) {
    return this.withNewFileKeyRefLike(Optional.ofNullable(this.buildFileKeyRef()).orElse(item));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRef() {
    return this.withNewResourceFieldRefLike(Optional.ofNullable(this.buildResourceFieldRef()).orElse(new V1ResourceFieldSelectorBuilder().build()));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return this.withNewResourceFieldRefLike(Optional.ofNullable(this.buildResourceFieldRef()).orElse(item));
  }
  
  public SecretKeyRefNested<A> editOrNewSecretKeyRef() {
    return this.withNewSecretKeyRefLike(Optional.ofNullable(this.buildSecretKeyRef()).orElse(new V1SecretKeySelectorBuilder().build()));
  }
  
  public SecretKeyRefNested<A> editOrNewSecretKeyRefLike(V1SecretKeySelector item) {
    return this.withNewSecretKeyRefLike(Optional.ofNullable(this.buildSecretKeyRef()).orElse(item));
  }
  
  public ResourceFieldRefNested<A> editResourceFieldRef() {
    return this.withNewResourceFieldRefLike(Optional.ofNullable(this.buildResourceFieldRef()).orElse(null));
  }
  
  public SecretKeyRefNested<A> editSecretKeyRef() {
    return this.withNewSecretKeyRefLike(Optional.ofNullable(this.buildSecretKeyRef()).orElse(null));
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
    V1EnvVarSourceFluent that = (V1EnvVarSourceFluent) o;
    if (!(Objects.equals(configMapKeyRef, that.configMapKeyRef))) {
      return false;
    }
    if (!(Objects.equals(fieldRef, that.fieldRef))) {
      return false;
    }
    if (!(Objects.equals(fileKeyRef, that.fileKeyRef))) {
      return false;
    }
    if (!(Objects.equals(resourceFieldRef, that.resourceFieldRef))) {
      return false;
    }
    if (!(Objects.equals(secretKeyRef, that.secretKeyRef))) {
      return false;
    }
    return true;
  }
  
  public boolean hasConfigMapKeyRef() {
    return this.configMapKeyRef != null;
  }
  
  public boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  
  public boolean hasFileKeyRef() {
    return this.fileKeyRef != null;
  }
  
  public boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }
  
  public boolean hasSecretKeyRef() {
    return this.secretKeyRef != null;
  }
  
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, fileKeyRef, resourceFieldRef, secretKeyRef);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(configMapKeyRef == null)) {
        sb.append("configMapKeyRef:");
        sb.append(configMapKeyRef);
        sb.append(",");
    }
    if (!(fieldRef == null)) {
        sb.append("fieldRef:");
        sb.append(fieldRef);
        sb.append(",");
    }
    if (!(fileKeyRef == null)) {
        sb.append("fileKeyRef:");
        sb.append(fileKeyRef);
        sb.append(",");
    }
    if (!(resourceFieldRef == null)) {
        sb.append("resourceFieldRef:");
        sb.append(resourceFieldRef);
        sb.append(",");
    }
    if (!(secretKeyRef == null)) {
        sb.append("secretKeyRef:");
        sb.append(secretKeyRef);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withConfigMapKeyRef(V1ConfigMapKeySelector configMapKeyRef) {
    this._visitables.remove("configMapKeyRef");
    if (configMapKeyRef != null) {
        this.configMapKeyRef = new V1ConfigMapKeySelectorBuilder(configMapKeyRef);
        this._visitables.get("configMapKeyRef").add(this.configMapKeyRef);
    } else {
        this.configMapKeyRef = null;
        this._visitables.get("configMapKeyRef").remove(this.configMapKeyRef);
    }
    return (A) this;
  }
  
  public A withFieldRef(V1ObjectFieldSelector fieldRef) {
    this._visitables.remove("fieldRef");
    if (fieldRef != null) {
        this.fieldRef = new V1ObjectFieldSelectorBuilder(fieldRef);
        this._visitables.get("fieldRef").add(this.fieldRef);
    } else {
        this.fieldRef = null;
        this._visitables.get("fieldRef").remove(this.fieldRef);
    }
    return (A) this;
  }
  
  public A withFileKeyRef(V1FileKeySelector fileKeyRef) {
    this._visitables.remove("fileKeyRef");
    if (fileKeyRef != null) {
        this.fileKeyRef = new V1FileKeySelectorBuilder(fileKeyRef);
        this._visitables.get("fileKeyRef").add(this.fileKeyRef);
    } else {
        this.fileKeyRef = null;
        this._visitables.get("fileKeyRef").remove(this.fileKeyRef);
    }
    return (A) this;
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRef() {
    return new ConfigMapKeyRefNested(null);
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(V1ConfigMapKeySelector item) {
    return new ConfigMapKeyRefNested(item);
  }
  
  public FieldRefNested<A> withNewFieldRef() {
    return new FieldRefNested(null);
  }
  
  public FieldRefNested<A> withNewFieldRefLike(V1ObjectFieldSelector item) {
    return new FieldRefNested(item);
  }
  
  public FileKeyRefNested<A> withNewFileKeyRef() {
    return new FileKeyRefNested(null);
  }
  
  public FileKeyRefNested<A> withNewFileKeyRefLike(V1FileKeySelector item) {
    return new FileKeyRefNested(item);
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRef() {
    return new ResourceFieldRefNested(null);
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return new ResourceFieldRefNested(item);
  }
  
  public SecretKeyRefNested<A> withNewSecretKeyRef() {
    return new SecretKeyRefNested(null);
  }
  
  public SecretKeyRefNested<A> withNewSecretKeyRefLike(V1SecretKeySelector item) {
    return new SecretKeyRefNested(item);
  }
  
  public A withResourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    this._visitables.remove("resourceFieldRef");
    if (resourceFieldRef != null) {
        this.resourceFieldRef = new V1ResourceFieldSelectorBuilder(resourceFieldRef);
        this._visitables.get("resourceFieldRef").add(this.resourceFieldRef);
    } else {
        this.resourceFieldRef = null;
        this._visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    }
    return (A) this;
  }
  
  public A withSecretKeyRef(V1SecretKeySelector secretKeyRef) {
    this._visitables.remove("secretKeyRef");
    if (secretKeyRef != null) {
        this.secretKeyRef = new V1SecretKeySelectorBuilder(secretKeyRef);
        this._visitables.get("secretKeyRef").add(this.secretKeyRef);
    } else {
        this.secretKeyRef = null;
        this._visitables.get("secretKeyRef").remove(this.secretKeyRef);
    }
    return (A) this;
  }
  public class ConfigMapKeyRefNested<N> extends V1ConfigMapKeySelectorFluent<ConfigMapKeyRefNested<N>> implements Nested<N>{
  
    V1ConfigMapKeySelectorBuilder builder;
  
    ConfigMapKeyRefNested(V1ConfigMapKeySelector item) {
      this.builder = new V1ConfigMapKeySelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withConfigMapKeyRef(builder.build());
    }
    
    public N endConfigMapKeyRef() {
      return and();
    }
    
  }
  public class FieldRefNested<N> extends V1ObjectFieldSelectorFluent<FieldRefNested<N>> implements Nested<N>{
  
    V1ObjectFieldSelectorBuilder builder;
  
    FieldRefNested(V1ObjectFieldSelector item) {
      this.builder = new V1ObjectFieldSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withFieldRef(builder.build());
    }
    
    public N endFieldRef() {
      return and();
    }
    
  }
  public class FileKeyRefNested<N> extends V1FileKeySelectorFluent<FileKeyRefNested<N>> implements Nested<N>{
  
    V1FileKeySelectorBuilder builder;
  
    FileKeyRefNested(V1FileKeySelector item) {
      this.builder = new V1FileKeySelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withFileKeyRef(builder.build());
    }
    
    public N endFileKeyRef() {
      return and();
    }
    
  }
  public class ResourceFieldRefNested<N> extends V1ResourceFieldSelectorFluent<ResourceFieldRefNested<N>> implements Nested<N>{
  
    V1ResourceFieldSelectorBuilder builder;
  
    ResourceFieldRefNested(V1ResourceFieldSelector item) {
      this.builder = new V1ResourceFieldSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withResourceFieldRef(builder.build());
    }
    
    public N endResourceFieldRef() {
      return and();
    }
    
  }
  public class SecretKeyRefNested<N> extends V1SecretKeySelectorFluent<SecretKeyRefNested<N>> implements Nested<N>{
  
    V1SecretKeySelectorBuilder builder;
  
    SecretKeyRefNested(V1SecretKeySelector item) {
      this.builder = new V1SecretKeySelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withSecretKeyRef(builder.build());
    }
    
    public N endSecretKeyRef() {
      return and();
    }
    
  }
}