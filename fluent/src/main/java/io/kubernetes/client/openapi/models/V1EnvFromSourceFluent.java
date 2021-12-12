package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EnvFromSourceFluent<A extends io.kubernetes.client.openapi.models.V1EnvFromSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConfigMapRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ConfigMapEnvSource getConfigMapRef();
  public io.kubernetes.client.openapi.models.V1ConfigMapEnvSource buildConfigMapRef();
  public A withConfigMapRef(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource configMapRef);
  public java.lang.Boolean hasConfigMapRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRefLike(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource item);
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A> editConfigMapRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRefLike(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource item);
  public java.lang.String getPrefix();
  public A withPrefix(java.lang.String prefix);
  public java.lang.Boolean hasPrefix();
  
  /**
   * Method is deprecated. use withPrefix instead.
   */
  @java.lang.Deprecated
  public A withNewPrefix(java.lang.String original);
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretEnvSource getSecretRef();
  public io.kubernetes.client.openapi.models.V1SecretEnvSource buildSecretRef();
  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretEnvSource secretRef);
  public java.lang.Boolean hasSecretRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A> withNewSecretRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretEnvSource item);
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A> editSecretRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretEnvSource item);
  public interface ConfigMapRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceFluent<io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<N>>{
    public N and();
    public N endConfigMapRef();
    
  }
  public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1SecretEnvSourceFluent<io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}