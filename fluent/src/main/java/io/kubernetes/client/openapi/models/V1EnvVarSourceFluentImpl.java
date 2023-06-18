package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1EnvVarSourceFluentImpl<A extends V1EnvVarSourceFluent<A>> extends BaseFluent<A> implements V1EnvVarSourceFluent<A>{
  public V1EnvVarSourceFluentImpl() {
  }
  public V1EnvVarSourceFluentImpl(V1EnvVarSource instance) {
    if (instance != null) {
      this.withConfigMapKeyRef(instance.getConfigMapKeyRef());
      this.withFieldRef(instance.getFieldRef());
      this.withResourceFieldRef(instance.getResourceFieldRef());
      this.withSecretKeyRef(instance.getSecretKeyRef());
    }
  }
  private V1ConfigMapKeySelectorBuilder configMapKeyRef;
  private V1ObjectFieldSelectorBuilder fieldRef;
  private V1ResourceFieldSelectorBuilder resourceFieldRef;
  private V1SecretKeySelectorBuilder secretKeyRef;
  
  /**
   * This method has been deprecated, please use method buildConfigMapKeyRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapKeySelector getConfigMapKeyRef() {
    return this.configMapKeyRef!=null ?this.configMapKeyRef.build():null;
  }
  public V1ConfigMapKeySelector buildConfigMapKeyRef() {
    return this.configMapKeyRef!=null ?this.configMapKeyRef.build():null;
  }
  public A withConfigMapKeyRef(V1ConfigMapKeySelector configMapKeyRef) {
    _visitables.get("configMapKeyRef").remove(this.configMapKeyRef);
    if (configMapKeyRef!=null){ this.configMapKeyRef= new V1ConfigMapKeySelectorBuilder(configMapKeyRef); _visitables.get("configMapKeyRef").add(this.configMapKeyRef);} else { this.configMapKeyRef = null; _visitables.get("configMapKeyRef").remove(this.configMapKeyRef); } return (A) this;
  }
  public Boolean hasConfigMapKeyRef() {
    return this.configMapKeyRef != null;
  }
  public V1EnvVarSourceFluentImpl.ConfigMapKeyRefNested<A> withNewConfigMapKeyRef() {
    return new V1EnvVarSourceFluentImpl.ConfigMapKeyRefNestedImpl();
  }
  public V1EnvVarSourceFluentImpl.ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(V1ConfigMapKeySelector item) {
    return new V1EnvVarSourceFluentImpl.ConfigMapKeyRefNestedImpl(item);
  }
  public V1EnvVarSourceFluentImpl.ConfigMapKeyRefNested<A> editConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(getConfigMapKeyRef());
  }
  public V1EnvVarSourceFluentImpl.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(getConfigMapKeyRef() != null ? getConfigMapKeyRef(): new V1ConfigMapKeySelectorBuilder().build());
  }
  public V1EnvVarSourceFluentImpl.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(V1ConfigMapKeySelector item) {
    return withNewConfigMapKeyRefLike(getConfigMapKeyRef() != null ? getConfigMapKeyRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectFieldSelector getFieldRef() {
    return this.fieldRef!=null ?this.fieldRef.build():null;
  }
  public V1ObjectFieldSelector buildFieldRef() {
    return this.fieldRef!=null ?this.fieldRef.build():null;
  }
  public A withFieldRef(V1ObjectFieldSelector fieldRef) {
    _visitables.get("fieldRef").remove(this.fieldRef);
    if (fieldRef!=null){ this.fieldRef= new V1ObjectFieldSelectorBuilder(fieldRef); _visitables.get("fieldRef").add(this.fieldRef);} else { this.fieldRef = null; _visitables.get("fieldRef").remove(this.fieldRef); } return (A) this;
  }
  public Boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  public V1EnvVarSourceFluentImpl.FieldRefNested<A> withNewFieldRef() {
    return new V1EnvVarSourceFluentImpl.FieldRefNestedImpl();
  }
  public V1EnvVarSourceFluentImpl.FieldRefNested<A> withNewFieldRefLike(V1ObjectFieldSelector item) {
    return new V1EnvVarSourceFluentImpl.FieldRefNestedImpl(item);
  }
  public V1EnvVarSourceFluentImpl.FieldRefNested<A> editFieldRef() {
    return withNewFieldRefLike(getFieldRef());
  }
  public V1EnvVarSourceFluentImpl.FieldRefNested<A> editOrNewFieldRef() {
    return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): new V1ObjectFieldSelectorBuilder().build());
  }
  public V1EnvVarSourceFluentImpl.FieldRefNested<A> editOrNewFieldRefLike(V1ObjectFieldSelector item) {
    return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceFieldSelector getResourceFieldRef() {
    return this.resourceFieldRef!=null ?this.resourceFieldRef.build():null;
  }
  public V1ResourceFieldSelector buildResourceFieldRef() {
    return this.resourceFieldRef!=null ?this.resourceFieldRef.build():null;
  }
  public A withResourceFieldRef(V1ResourceFieldSelector resourceFieldRef) {
    _visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    if (resourceFieldRef!=null){ this.resourceFieldRef= new V1ResourceFieldSelectorBuilder(resourceFieldRef); _visitables.get("resourceFieldRef").add(this.resourceFieldRef);} else { this.resourceFieldRef = null; _visitables.get("resourceFieldRef").remove(this.resourceFieldRef); } return (A) this;
  }
  public Boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }
  public V1EnvVarSourceFluentImpl.ResourceFieldRefNested<A> withNewResourceFieldRef() {
    return new V1EnvVarSourceFluentImpl.ResourceFieldRefNestedImpl();
  }
  public V1EnvVarSourceFluentImpl.ResourceFieldRefNested<A> withNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return new V1EnvVarSourceFluentImpl.ResourceFieldRefNestedImpl(item);
  }
  public V1EnvVarSourceFluentImpl.ResourceFieldRefNested<A> editResourceFieldRef() {
    return withNewResourceFieldRefLike(getResourceFieldRef());
  }
  public V1EnvVarSourceFluentImpl.ResourceFieldRefNested<A> editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): new V1ResourceFieldSelectorBuilder().build());
  }
  public V1EnvVarSourceFluentImpl.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(V1ResourceFieldSelector item) {
    return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSecretKeyRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretKeySelector getSecretKeyRef() {
    return this.secretKeyRef!=null ?this.secretKeyRef.build():null;
  }
  public V1SecretKeySelector buildSecretKeyRef() {
    return this.secretKeyRef!=null ?this.secretKeyRef.build():null;
  }
  public A withSecretKeyRef(V1SecretKeySelector secretKeyRef) {
    _visitables.get("secretKeyRef").remove(this.secretKeyRef);
    if (secretKeyRef!=null){ this.secretKeyRef= new V1SecretKeySelectorBuilder(secretKeyRef); _visitables.get("secretKeyRef").add(this.secretKeyRef);} else { this.secretKeyRef = null; _visitables.get("secretKeyRef").remove(this.secretKeyRef); } return (A) this;
  }
  public Boolean hasSecretKeyRef() {
    return this.secretKeyRef != null;
  }
  public V1EnvVarSourceFluentImpl.SecretKeyRefNested<A> withNewSecretKeyRef() {
    return new V1EnvVarSourceFluentImpl.SecretKeyRefNestedImpl();
  }
  public V1EnvVarSourceFluentImpl.SecretKeyRefNested<A> withNewSecretKeyRefLike(V1SecretKeySelector item) {
    return new V1EnvVarSourceFluentImpl.SecretKeyRefNestedImpl(item);
  }
  public V1EnvVarSourceFluentImpl.SecretKeyRefNested<A> editSecretKeyRef() {
    return withNewSecretKeyRefLike(getSecretKeyRef());
  }
  public V1EnvVarSourceFluentImpl.SecretKeyRefNested<A> editOrNewSecretKeyRef() {
    return withNewSecretKeyRefLike(getSecretKeyRef() != null ? getSecretKeyRef(): new V1SecretKeySelectorBuilder().build());
  }
  public V1EnvVarSourceFluentImpl.SecretKeyRefNested<A> editOrNewSecretKeyRefLike(V1SecretKeySelector item) {
    return withNewSecretKeyRefLike(getSecretKeyRef() != null ? getSecretKeyRef(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EnvVarSourceFluentImpl that = (V1EnvVarSourceFluentImpl) o;
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
  class ConfigMapKeyRefNestedImpl<N> extends V1ConfigMapKeySelectorFluentImpl<V1EnvVarSourceFluentImpl.ConfigMapKeyRefNested<N>> implements V1EnvVarSourceFluentImpl.ConfigMapKeyRefNested<N>,Nested<N>{
    ConfigMapKeyRefNestedImpl(V1ConfigMapKeySelector item) {
      this.builder = new V1ConfigMapKeySelectorBuilder(this, item);
    }
    ConfigMapKeyRefNestedImpl() {
      this.builder = new V1ConfigMapKeySelectorBuilder(this);
    }
    V1ConfigMapKeySelectorBuilder builder;
    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withConfigMapKeyRef(builder.build());
    }
    public N endConfigMapKeyRef() {
      return and();
    }
    
  }
  class FieldRefNestedImpl<N> extends V1ObjectFieldSelectorFluentImpl<V1EnvVarSourceFluentImpl.FieldRefNested<N>> implements V1EnvVarSourceFluentImpl.FieldRefNested<N>,Nested<N>{
    FieldRefNestedImpl(V1ObjectFieldSelector item) {
      this.builder = new V1ObjectFieldSelectorBuilder(this, item);
    }
    FieldRefNestedImpl() {
      this.builder = new V1ObjectFieldSelectorBuilder(this);
    }
    V1ObjectFieldSelectorBuilder builder;
    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withFieldRef(builder.build());
    }
    public N endFieldRef() {
      return and();
    }
    
  }
  class ResourceFieldRefNestedImpl<N> extends V1ResourceFieldSelectorFluentImpl<V1EnvVarSourceFluentImpl.ResourceFieldRefNested<N>> implements V1EnvVarSourceFluentImpl.ResourceFieldRefNested<N>,Nested<N>{
    ResourceFieldRefNestedImpl(V1ResourceFieldSelector item) {
      this.builder = new V1ResourceFieldSelectorBuilder(this, item);
    }
    ResourceFieldRefNestedImpl() {
      this.builder = new V1ResourceFieldSelectorBuilder(this);
    }
    V1ResourceFieldSelectorBuilder builder;
    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withResourceFieldRef(builder.build());
    }
    public N endResourceFieldRef() {
      return and();
    }
    
  }
  class SecretKeyRefNestedImpl<N> extends V1SecretKeySelectorFluentImpl<V1EnvVarSourceFluentImpl.SecretKeyRefNested<N>> implements V1EnvVarSourceFluentImpl.SecretKeyRefNested<N>,Nested<N>{
    SecretKeyRefNestedImpl(V1SecretKeySelector item) {
      this.builder = new V1SecretKeySelectorBuilder(this, item);
    }
    SecretKeyRefNestedImpl() {
      this.builder = new V1SecretKeySelectorBuilder(this);
    }
    V1SecretKeySelectorBuilder builder;
    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withSecretKeyRef(builder.build());
    }
    public N endSecretKeyRef() {
      return and();
    }
    
  }
  
}