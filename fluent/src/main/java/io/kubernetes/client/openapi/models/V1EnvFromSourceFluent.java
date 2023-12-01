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
public class V1EnvFromSourceFluent<A extends V1EnvFromSourceFluent<A>> extends BaseFluent<A>{
  public V1EnvFromSourceFluent() {
  }
  
  public V1EnvFromSourceFluent(V1EnvFromSource instance) {
    this.copyInstance(instance);
  }
  private V1ConfigMapEnvSourceBuilder configMapRef;
  private String prefix;
  private V1SecretEnvSourceBuilder secretRef;
  
  protected void copyInstance(V1EnvFromSource instance) {
    instance = (instance != null ? instance : new V1EnvFromSource());
    if (instance != null) {
          this.withConfigMapRef(instance.getConfigMapRef());
          this.withPrefix(instance.getPrefix());
          this.withSecretRef(instance.getSecretRef());
        }
  }
  
  public V1ConfigMapEnvSource buildConfigMapRef() {
    return this.configMapRef != null ? this.configMapRef.build() : null;
  }
  
  public A withConfigMapRef(V1ConfigMapEnvSource configMapRef) {
    this._visitables.remove("configMapRef");
    if (configMapRef != null) {
        this.configMapRef = new V1ConfigMapEnvSourceBuilder(configMapRef);
        this._visitables.get("configMapRef").add(this.configMapRef);
    } else {
        this.configMapRef = null;
        this._visitables.get("configMapRef").remove(this.configMapRef);
    }
    return (A) this;
  }
  
  public boolean hasConfigMapRef() {
    return this.configMapRef != null;
  }
  
  public ConfigMapRefNested<A> withNewConfigMapRef() {
    return new ConfigMapRefNested(null);
  }
  
  public ConfigMapRefNested<A> withNewConfigMapRefLike(V1ConfigMapEnvSource item) {
    return new ConfigMapRefNested(item);
  }
  
  public ConfigMapRefNested<A> editConfigMapRef() {
    return withNewConfigMapRefLike(java.util.Optional.ofNullable(buildConfigMapRef()).orElse(null));
  }
  
  public ConfigMapRefNested<A> editOrNewConfigMapRef() {
    return withNewConfigMapRefLike(java.util.Optional.ofNullable(buildConfigMapRef()).orElse(new V1ConfigMapEnvSourceBuilder().build()));
  }
  
  public ConfigMapRefNested<A> editOrNewConfigMapRefLike(V1ConfigMapEnvSource item) {
    return withNewConfigMapRefLike(java.util.Optional.ofNullable(buildConfigMapRef()).orElse(item));
  }
  
  public String getPrefix() {
    return this.prefix;
  }
  
  public A withPrefix(String prefix) {
    this.prefix = prefix;
    return (A) this;
  }
  
  public boolean hasPrefix() {
    return this.prefix != null;
  }
  
  public V1SecretEnvSource buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }
  
  public A withSecretRef(V1SecretEnvSource secretRef) {
    this._visitables.remove("secretRef");
    if (secretRef != null) {
        this.secretRef = new V1SecretEnvSourceBuilder(secretRef);
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
  
  public SecretRefNested<A> withNewSecretRefLike(V1SecretEnvSource item) {
    return new SecretRefNested(item);
  }
  
  public SecretRefNested<A> editSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(null));
  }
  
  public SecretRefNested<A> editOrNewSecretRef() {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(new V1SecretEnvSourceBuilder().build()));
  }
  
  public SecretRefNested<A> editOrNewSecretRefLike(V1SecretEnvSource item) {
    return withNewSecretRefLike(java.util.Optional.ofNullable(buildSecretRef()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvFromSourceFluent that = (V1EnvFromSourceFluent) o;
    if (!java.util.Objects.equals(configMapRef, that.configMapRef)) return false;
    if (!java.util.Objects.equals(prefix, that.prefix)) return false;
    if (!java.util.Objects.equals(secretRef, that.secretRef)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(configMapRef,  prefix,  secretRef,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMapRef != null) { sb.append("configMapRef:"); sb.append(configMapRef + ","); }
    if (prefix != null) { sb.append("prefix:"); sb.append(prefix + ","); }
    if (secretRef != null) { sb.append("secretRef:"); sb.append(secretRef); }
    sb.append("}");
    return sb.toString();
  }
  public class ConfigMapRefNested<N> extends V1ConfigMapEnvSourceFluent<ConfigMapRefNested<N>> implements Nested<N>{
    ConfigMapRefNested(V1ConfigMapEnvSource item) {
      this.builder = new V1ConfigMapEnvSourceBuilder(this, item);
    }
    V1ConfigMapEnvSourceBuilder builder;
    
    public N and() {
      return (N) V1EnvFromSourceFluent.this.withConfigMapRef(builder.build());
    }
    
    public N endConfigMapRef() {
      return and();
    }
    
  
  }
  public class SecretRefNested<N> extends V1SecretEnvSourceFluent<SecretRefNested<N>> implements Nested<N>{
    SecretRefNested(V1SecretEnvSource item) {
      this.builder = new V1SecretEnvSourceBuilder(this, item);
    }
    V1SecretEnvSourceBuilder builder;
    
    public N and() {
      return (N) V1EnvFromSourceFluent.this.withSecretRef(builder.build());
    }
    
    public N endSecretRef() {
      return and();
    }
    
  
  }

}