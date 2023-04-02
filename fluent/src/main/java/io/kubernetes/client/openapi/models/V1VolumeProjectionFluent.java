package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeProjectionFluent<A extends V1VolumeProjectionFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapProjection getConfigMap();
  public V1ConfigMapProjection buildConfigMap();
  public A withConfigMap(V1ConfigMapProjection configMap);
  public Boolean hasConfigMap();
  public V1VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMap();
  public V1VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapProjection item);
  public V1VolumeProjectionFluent.ConfigMapNested<A> editConfigMap();
  public V1VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMap();
  public V1VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapProjection item);
  
  /**
   * This method has been deprecated, please use method buildDownwardAPI instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DownwardAPIProjection getDownwardAPI();
  public V1DownwardAPIProjection buildDownwardAPI();
  public A withDownwardAPI(V1DownwardAPIProjection downwardAPI);
  public Boolean hasDownwardAPI();
  public V1VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPI();
  public V1VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPILike(V1DownwardAPIProjection item);
  public V1VolumeProjectionFluent.DownwardAPINested<A> editDownwardAPI();
  public V1VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPI();
  public V1VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPILike(V1DownwardAPIProjection item);
  
  /**
   * This method has been deprecated, please use method buildSecret instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretProjection getSecret();
  public V1SecretProjection buildSecret();
  public A withSecret(V1SecretProjection secret);
  public Boolean hasSecret();
  public V1VolumeProjectionFluent.SecretNested<A> withNewSecret();
  public V1VolumeProjectionFluent.SecretNested<A> withNewSecretLike(V1SecretProjection item);
  public V1VolumeProjectionFluent.SecretNested<A> editSecret();
  public V1VolumeProjectionFluent.SecretNested<A> editOrNewSecret();
  public V1VolumeProjectionFluent.SecretNested<A> editOrNewSecretLike(V1SecretProjection item);
  
  /**
   * This method has been deprecated, please use method buildServiceAccountToken instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceAccountTokenProjection getServiceAccountToken();
  public V1ServiceAccountTokenProjection buildServiceAccountToken();
  public A withServiceAccountToken(V1ServiceAccountTokenProjection serviceAccountToken);
  public Boolean hasServiceAccountToken();
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountToken();
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountTokenLike(V1ServiceAccountTokenProjection item);
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editServiceAccountToken();
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountToken();
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountTokenLike(V1ServiceAccountTokenProjection item);
  public interface ConfigMapNested<N> extends Nested<N>,V1ConfigMapProjectionFluent<V1VolumeProjectionFluent.ConfigMapNested<N>>{
    public N and();
    public N endConfigMap();
    
  }
  public interface DownwardAPINested<N> extends Nested<N>,V1DownwardAPIProjectionFluent<V1VolumeProjectionFluent.DownwardAPINested<N>>{
    public N and();
    public N endDownwardAPI();
    
  }
  public interface SecretNested<N> extends Nested<N>,V1SecretProjectionFluent<V1VolumeProjectionFluent.SecretNested<N>>{
    public N and();
    public N endSecret();
    
  }
  public interface ServiceAccountTokenNested<N> extends Nested<N>,V1ServiceAccountTokenProjectionFluent<V1VolumeProjectionFluent.ServiceAccountTokenNested<N>>{
    public N and();
    public N endServiceAccountToken();
    
  }
  
}