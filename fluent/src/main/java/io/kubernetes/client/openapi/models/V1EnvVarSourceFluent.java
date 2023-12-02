package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1EnvVarSourceFluent<A extends V1EnvVarSourceFluent<A>> extends BaseFluent<A>{
  public V1EnvVarSourceFluent() {
  }
  
  public V1EnvVarSourceFluent(V1EnvVarSource instance) {
    this.copyInstance(instance);
  }
  private V1ConfigMapKeySelectorBuilder configMapKeyRef;
  private V1ObjectFieldSelectorBuilder fieldRef;
  private V1ResourceFieldSelectorBuilder resourceFieldRef;
  private V1SecretKeySelectorBuilder secretKeyRef;
  
  protected void copyInstance(V1EnvVarSource instance) {
    instance = (instance != null ? instance : new V1EnvVarSource());
    if (instance != null) {
          this.withConfigMapKeyRef(instance.getConfigMapKeyRef());
          this.withFieldRef(instance.getFieldRef());
          this.withResourceFieldRef(instance.getResourceFieldRef());
          this.withSecretKeyRef(instance.getSecretKeyRef());
        }
  }
  
  public V1ConfigMapKeySelector buildConfigMapKeyRef() {
    return this.configMapKeyRef != null ? this.configMapKeyRef.build() : null;
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
  
  public boolean hasConfigMapKeyRef() {
    return this.configMapKeyRef != null;
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRef() {
    return new ConfigMapKeyRefNested(null);
  }
  
  public ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(V1ConfigMapKeySelector item) {
    return new ConfigMapKeyRefNested(item);
  }
  
  public ConfigMapKeyRefNested<A> editConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(null));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(new V1ConfigMapKeySelectorBuilder().build()));
  }
  
  public ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(V1ConfigMapKeySelector item) {
    return withNewConfigMapKeyRefLike(java.util.Optional.ofNullable(buildConfigMapKeyRef()).orElse(item));
  }
  
  public V1ObjectFieldSelector buildFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
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
  
  public boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  
  public FieldRefNested<A> withNewFieldRef() {
    return new FieldRefNested(null);
  }
  
  public FieldRefNested<A> withNewFieldRefLike(V1ObjectFieldSelector item) {
    return new FieldRefNested(item);
  }
  
  public FieldRefNested<A> editFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(null));
  }
  
  public FieldRefNested<A> editOrNewFieldRef() {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(new V1ObjectFieldSelectorBuilder().build()));
  }
  
  public FieldRefNested<A> editOrNewFieldRefLike(V1ObjectFieldSelector item) {
    return withNewFieldRefLike(java.util.Optional.ofNullable(buildFieldRef()).orElse(item));
  }
  
  public V1ResourceFieldSelector buildResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
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
  
  public boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRef() {
    return new ResourceFieldRefNested(null);
  }
  
  public ResourceFieldRefNested<A> withNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return new ResourceFieldRefNested(item);
  }
  
  public ResourceFieldRefNested<A> editResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(null));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(new V1ResourceFieldSelectorBuilder().build()));
  }
  
  public ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return withNewResourceFieldRefLike(java.util.Optional.ofNullable(buildResourceFieldRef()).orElse(item));
  }
  
  public V1SecretKeySelector buildSecretKeyRef() {
    return this.secretKeyRef != null ? this.secretKeyRef.build() : null;
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
  
  public boolean hasSecretKeyRef() {
    return this.secretKeyRef != null;
  }
  
  public SecretKeyRefNested<A> withNewSecretKeyRef() {
    return new SecretKeyRefNested(null);
  }
  
  public SecretKeyRefNested<A> withNewSecretKeyRefLike(V1SecretKeySelector item) {
    return new SecretKeyRefNested(item);
  }
  
  public SecretKeyRefNested<A> editSecretKeyRef() {
    return withNewSecretKeyRefLike(java.util.Optional.ofNullable(buildSecretKeyRef()).orElse(null));
  }
  
  public SecretKeyRefNested<A> editOrNewSecretKeyRef() {
    return withNewSecretKeyRefLike(java.util.Optional.ofNullable(buildSecretKeyRef()).orElse(new V1SecretKeySelectorBuilder().build()));
  }
  
  public SecretKeyRefNested<A> editOrNewSecretKeyRefLike(V1SecretKeySelector item) {
    return withNewSecretKeyRefLike(java.util.Optional.ofNullable(buildSecretKeyRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvVarSourceFluent that = (V1EnvVarSourceFluent) o;
    if (!java.util.Objects.equals(configMapKeyRef, that.configMapKeyRef)) return false;
    if (!java.util.Objects.equals(fieldRef, that.fieldRef)) return false;
    if (!java.util.Objects.equals(resourceFieldRef, that.resourceFieldRef)) return false;
    if (!java.util.Objects.equals(secretKeyRef, that.secretKeyRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMapKeyRef,  fieldRef,  resourceFieldRef,  secretKeyRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMapKeyRef != null) { sb.append("configMapKeyRef:"); sb.append(configMapKeyRef + ","); }
    if (fieldRef != null) { sb.append("fieldRef:"); sb.append(fieldRef + ","); }
    if (resourceFieldRef != null) { sb.append("resourceFieldRef:"); sb.append(resourceFieldRef + ","); }
    if (secretKeyRef != null) { sb.append("secretKeyRef:"); sb.append(secretKeyRef); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapKeyRefNested<N> extends V1ConfigMapKeySelectorFluent<ConfigMapKeyRefNested<N>> implements Nested<N>{
    ConfigMapKeyRefNested(V1ConfigMapKeySelector item) {
      this.builder = new V1ConfigMapKeySelectorBuilder(this, item);
    }
    V1ConfigMapKeySelectorBuilder builder;
    
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withConfigMapKeyRef(builder.build());
    }
    
    public N endConfigMapKeyRef() {
      return and();
    }
    
  
  }
  public class FieldRefNested<N> extends V1ObjectFieldSelectorFluent<FieldRefNested<N>> implements Nested<N>{
    FieldRefNested(V1ObjectFieldSelector item) {
      this.builder = new V1ObjectFieldSelectorBuilder(this, item);
    }
    V1ObjectFieldSelectorBuilder builder;
    
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withFieldRef(builder.build());
    }
    
    public N endFieldRef() {
      return and();
    }
    
  
  }
  public class ResourceFieldRefNested<N> extends V1ResourceFieldSelectorFluent<ResourceFieldRefNested<N>> implements Nested<N>{
    ResourceFieldRefNested(V1ResourceFieldSelector item) {
      this.builder = new V1ResourceFieldSelectorBuilder(this, item);
    }
    V1ResourceFieldSelectorBuilder builder;
    
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withResourceFieldRef(builder.build());
    }
    
    public N endResourceFieldRef() {
      return and();
    }
    
  
  }
  public class SecretKeyRefNested<N> extends V1SecretKeySelectorFluent<SecretKeyRefNested<N>> implements Nested<N>{
    SecretKeyRefNested(V1SecretKeySelector item) {
      this.builder = new V1SecretKeySelectorBuilder(this, item);
    }
    V1SecretKeySelectorBuilder builder;
    
    public N and() {
      return (N) V1EnvVarSourceFluent.this.withSecretKeyRef(builder.build());
    }
    
    public N endSecretKeyRef() {
      return and();
    }
    
  
  }

}