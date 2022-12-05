package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EnvVarSourceFluent<A extends V1EnvVarSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConfigMapKeyRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapKeySelector getConfigMapKeyRef();
  public V1ConfigMapKeySelector buildConfigMapKeyRef();
  public A withConfigMapKeyRef(V1ConfigMapKeySelector configMapKeyRef);
  public Boolean hasConfigMapKeyRef();
  public V1EnvVarSourceFluent.ConfigMapKeyRefNested<A> withNewConfigMapKeyRef();
  public V1EnvVarSourceFluent.ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(V1ConfigMapKeySelector item);
  public V1EnvVarSourceFluent.ConfigMapKeyRefNested<A> editConfigMapKeyRef();
  public V1EnvVarSourceFluent.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef();
  public V1EnvVarSourceFluent.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(V1ConfigMapKeySelector item);
  
  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectFieldSelector getFieldRef();
  public V1ObjectFieldSelector buildFieldRef();
  public A withFieldRef(V1ObjectFieldSelector fieldRef);
  public Boolean hasFieldRef();
  public V1EnvVarSourceFluent.FieldRefNested<A> withNewFieldRef();
  public V1EnvVarSourceFluent.FieldRefNested<A> withNewFieldRefLike(V1ObjectFieldSelector item);
  public V1EnvVarSourceFluent.FieldRefNested<A> editFieldRef();
  public V1EnvVarSourceFluent.FieldRefNested<A> editOrNewFieldRef();
  public V1EnvVarSourceFluent.FieldRefNested<A> editOrNewFieldRefLike(V1ObjectFieldSelector item);
  
  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceFieldSelector getResourceFieldRef();
  public V1ResourceFieldSelector buildResourceFieldRef();
  public A withResourceFieldRef(V1ResourceFieldSelector resourceFieldRef);
  public Boolean hasResourceFieldRef();
  public V1EnvVarSourceFluent.ResourceFieldRefNested<A> withNewResourceFieldRef();
  public V1EnvVarSourceFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(V1ResourceFieldSelector item);
  public V1EnvVarSourceFluent.ResourceFieldRefNested<A> editResourceFieldRef();
  public V1EnvVarSourceFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef();
  public V1EnvVarSourceFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(V1ResourceFieldSelector item);
  
  /**
   * This method has been deprecated, please use method buildSecretKeyRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretKeySelector getSecretKeyRef();
  public V1SecretKeySelector buildSecretKeyRef();
  public A withSecretKeyRef(V1SecretKeySelector secretKeyRef);
  public Boolean hasSecretKeyRef();
  public V1EnvVarSourceFluent.SecretKeyRefNested<A> withNewSecretKeyRef();
  public V1EnvVarSourceFluent.SecretKeyRefNested<A> withNewSecretKeyRefLike(V1SecretKeySelector item);
  public V1EnvVarSourceFluent.SecretKeyRefNested<A> editSecretKeyRef();
  public V1EnvVarSourceFluent.SecretKeyRefNested<A> editOrNewSecretKeyRef();
  public V1EnvVarSourceFluent.SecretKeyRefNested<A> editOrNewSecretKeyRefLike(V1SecretKeySelector item);
  public interface ConfigMapKeyRefNested<N> extends Nested<N>,V1ConfigMapKeySelectorFluent<V1EnvVarSourceFluent.ConfigMapKeyRefNested<N>>{
    public N and();
    public N endConfigMapKeyRef();
    
  }
  public interface FieldRefNested<N> extends Nested<N>,V1ObjectFieldSelectorFluent<V1EnvVarSourceFluent.FieldRefNested<N>>{
    public N and();
    public N endFieldRef();
    
  }
  public interface ResourceFieldRefNested<N> extends Nested<N>,V1ResourceFieldSelectorFluent<V1EnvVarSourceFluent.ResourceFieldRefNested<N>>{
    public N and();
    public N endResourceFieldRef();
    
  }
  public interface SecretKeyRefNested<N> extends Nested<N>,V1SecretKeySelectorFluent<V1EnvVarSourceFluent.SecretKeyRefNested<N>>{
    public N and();
    public N endSecretKeyRef();
    
  }
  
}