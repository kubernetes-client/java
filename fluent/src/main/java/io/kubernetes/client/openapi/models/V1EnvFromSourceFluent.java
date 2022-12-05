package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EnvFromSourceFluent<A extends V1EnvFromSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConfigMapRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapEnvSource getConfigMapRef();
  public V1ConfigMapEnvSource buildConfigMapRef();
  public A withConfigMapRef(V1ConfigMapEnvSource configMapRef);
  public Boolean hasConfigMapRef();
  public V1EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRef();
  public V1EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRefLike(V1ConfigMapEnvSource item);
  public V1EnvFromSourceFluent.ConfigMapRefNested<A> editConfigMapRef();
  public V1EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRef();
  public V1EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRefLike(V1ConfigMapEnvSource item);
  public String getPrefix();
  public A withPrefix(String prefix);
  public Boolean hasPrefix();
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretEnvSource getSecretRef();
  public V1SecretEnvSource buildSecretRef();
  public A withSecretRef(V1SecretEnvSource secretRef);
  public Boolean hasSecretRef();
  public V1EnvFromSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1EnvFromSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1SecretEnvSource item);
  public V1EnvFromSourceFluent.SecretRefNested<A> editSecretRef();
  public V1EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1SecretEnvSource item);
  public interface ConfigMapRefNested<N> extends Nested<N>,V1ConfigMapEnvSourceFluent<V1EnvFromSourceFluent.ConfigMapRefNested<N>>{
    public N and();
    public N endConfigMapRef();
    
  }
  public interface SecretRefNested<N> extends Nested<N>,V1SecretEnvSourceFluent<V1EnvFromSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}