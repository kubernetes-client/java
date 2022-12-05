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
  public class V1VolumeProjectionFluentImpl<A extends V1VolumeProjectionFluent<A>> extends BaseFluent<A> implements V1VolumeProjectionFluent<A>{
  public V1VolumeProjectionFluentImpl() {
  }
  public V1VolumeProjectionFluentImpl(V1VolumeProjection instance) {
    this.withConfigMap(instance.getConfigMap());

    this.withDownwardAPI(instance.getDownwardAPI());

    this.withSecret(instance.getSecret());

    this.withServiceAccountToken(instance.getServiceAccountToken());

  }
  private V1ConfigMapProjectionBuilder configMap;
  private V1DownwardAPIProjectionBuilder downwardAPI;
  private V1SecretProjectionBuilder secret;
  private V1ServiceAccountTokenProjectionBuilder serviceAccountToken;
  
  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapProjection getConfigMap() {
    return this.configMap!=null ?this.configMap.build():null;
  }
  public V1ConfigMapProjection buildConfigMap() {
    return this.configMap!=null ?this.configMap.build():null;
  }
  public A withConfigMap(V1ConfigMapProjection configMap) {
    _visitables.get("configMap").remove(this.configMap);
    if (configMap!=null){ this.configMap= new V1ConfigMapProjectionBuilder(configMap); _visitables.get("configMap").add(this.configMap);} else { this.configMap = null; _visitables.get("configMap").remove(this.configMap); } return (A) this;
  }
  public Boolean hasConfigMap() {
    return this.configMap != null;
  }
  public V1VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMap() {
    return new V1VolumeProjectionFluentImpl.ConfigMapNestedImpl();
  }
  public V1VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapProjection item) {
    return new V1VolumeProjectionFluentImpl.ConfigMapNestedImpl(item);
  }
  public V1VolumeProjectionFluent.ConfigMapNested<A> editConfigMap() {
    return withNewConfigMapLike(getConfigMap());
  }
  public V1VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new V1ConfigMapProjectionBuilder().build());
  }
  public V1VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapProjection item) {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildDownwardAPI instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DownwardAPIProjection getDownwardAPI() {
    return this.downwardAPI!=null ?this.downwardAPI.build():null;
  }
  public V1DownwardAPIProjection buildDownwardAPI() {
    return this.downwardAPI!=null ?this.downwardAPI.build():null;
  }
  public A withDownwardAPI(V1DownwardAPIProjection downwardAPI) {
    _visitables.get("downwardAPI").remove(this.downwardAPI);
    if (downwardAPI!=null){ this.downwardAPI= new V1DownwardAPIProjectionBuilder(downwardAPI); _visitables.get("downwardAPI").add(this.downwardAPI);} else { this.downwardAPI = null; _visitables.get("downwardAPI").remove(this.downwardAPI); } return (A) this;
  }
  public Boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }
  public V1VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPI() {
    return new V1VolumeProjectionFluentImpl.DownwardAPINestedImpl();
  }
  public V1VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPILike(V1DownwardAPIProjection item) {
    return new V1VolumeProjectionFluentImpl.DownwardAPINestedImpl(item);
  }
  public V1VolumeProjectionFluent.DownwardAPINested<A> editDownwardAPI() {
    return withNewDownwardAPILike(getDownwardAPI());
  }
  public V1VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPI() {
    return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): new V1DownwardAPIProjectionBuilder().build());
  }
  public V1VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPILike(V1DownwardAPIProjection item) {
    return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSecret instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretProjection getSecret() {
    return this.secret!=null ?this.secret.build():null;
  }
  public V1SecretProjection buildSecret() {
    return this.secret!=null ?this.secret.build():null;
  }
  public A withSecret(V1SecretProjection secret) {
    _visitables.get("secret").remove(this.secret);
    if (secret!=null){ this.secret= new V1SecretProjectionBuilder(secret); _visitables.get("secret").add(this.secret);} else { this.secret = null; _visitables.get("secret").remove(this.secret); } return (A) this;
  }
  public Boolean hasSecret() {
    return this.secret != null;
  }
  public V1VolumeProjectionFluent.SecretNested<A> withNewSecret() {
    return new V1VolumeProjectionFluentImpl.SecretNestedImpl();
  }
  public V1VolumeProjectionFluent.SecretNested<A> withNewSecretLike(V1SecretProjection item) {
    return new V1VolumeProjectionFluentImpl.SecretNestedImpl(item);
  }
  public V1VolumeProjectionFluent.SecretNested<A> editSecret() {
    return withNewSecretLike(getSecret());
  }
  public V1VolumeProjectionFluent.SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(getSecret() != null ? getSecret(): new V1SecretProjectionBuilder().build());
  }
  public V1VolumeProjectionFluent.SecretNested<A> editOrNewSecretLike(V1SecretProjection item) {
    return withNewSecretLike(getSecret() != null ? getSecret(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildServiceAccountToken instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ServiceAccountTokenProjection getServiceAccountToken() {
    return this.serviceAccountToken!=null ?this.serviceAccountToken.build():null;
  }
  public V1ServiceAccountTokenProjection buildServiceAccountToken() {
    return this.serviceAccountToken!=null ?this.serviceAccountToken.build():null;
  }
  public A withServiceAccountToken(V1ServiceAccountTokenProjection serviceAccountToken) {
    _visitables.get("serviceAccountToken").remove(this.serviceAccountToken);
    if (serviceAccountToken!=null){ this.serviceAccountToken= new V1ServiceAccountTokenProjectionBuilder(serviceAccountToken); _visitables.get("serviceAccountToken").add(this.serviceAccountToken);} else { this.serviceAccountToken = null; _visitables.get("serviceAccountToken").remove(this.serviceAccountToken); } return (A) this;
  }
  public Boolean hasServiceAccountToken() {
    return this.serviceAccountToken != null;
  }
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountToken() {
    return new V1VolumeProjectionFluentImpl.ServiceAccountTokenNestedImpl();
  }
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountTokenLike(V1ServiceAccountTokenProjection item) {
    return new V1VolumeProjectionFluentImpl.ServiceAccountTokenNestedImpl(item);
  }
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editServiceAccountToken() {
    return withNewServiceAccountTokenLike(getServiceAccountToken());
  }
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountToken() {
    return withNewServiceAccountTokenLike(getServiceAccountToken() != null ? getServiceAccountToken(): new V1ServiceAccountTokenProjectionBuilder().build());
  }
  public V1VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountTokenLike(V1ServiceAccountTokenProjection item) {
    return withNewServiceAccountTokenLike(getServiceAccountToken() != null ? getServiceAccountToken(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeProjectionFluentImpl that = (V1VolumeProjectionFluentImpl) o;
    if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
    if (downwardAPI != null ? !downwardAPI.equals(that.downwardAPI) :that.downwardAPI != null) return false;
    if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
    if (serviceAccountToken != null ? !serviceAccountToken.equals(that.serviceAccountToken) :that.serviceAccountToken != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(configMap,  downwardAPI,  secret,  serviceAccountToken,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMap != null) { sb.append("configMap:"); sb.append(configMap + ","); }
    if (downwardAPI != null) { sb.append("downwardAPI:"); sb.append(downwardAPI + ","); }
    if (secret != null) { sb.append("secret:"); sb.append(secret + ","); }
    if (serviceAccountToken != null) { sb.append("serviceAccountToken:"); sb.append(serviceAccountToken); }
    sb.append("}");
    return sb.toString();
  }
  class ConfigMapNestedImpl<N> extends V1ConfigMapProjectionFluentImpl<V1VolumeProjectionFluent.ConfigMapNested<N>> implements V1VolumeProjectionFluent.ConfigMapNested<N>,Nested<N>{
    ConfigMapNestedImpl(V1ConfigMapProjection item) {
      this.builder = new V1ConfigMapProjectionBuilder(this, item);
    }
    ConfigMapNestedImpl() {
      this.builder = new V1ConfigMapProjectionBuilder(this);
    }
    V1ConfigMapProjectionBuilder builder;
    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap() {
      return and();
    }
    
  }
  class DownwardAPINestedImpl<N> extends V1DownwardAPIProjectionFluentImpl<V1VolumeProjectionFluent.DownwardAPINested<N>> implements V1VolumeProjectionFluent.DownwardAPINested<N>,Nested<N>{
    DownwardAPINestedImpl(V1DownwardAPIProjection item) {
      this.builder = new V1DownwardAPIProjectionBuilder(this, item);
    }
    DownwardAPINestedImpl() {
      this.builder = new V1DownwardAPIProjectionBuilder(this);
    }
    V1DownwardAPIProjectionBuilder builder;
    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withDownwardAPI(builder.build());
    }
    public N endDownwardAPI() {
      return and();
    }
    
  }
  class SecretNestedImpl<N> extends V1SecretProjectionFluentImpl<V1VolumeProjectionFluent.SecretNested<N>> implements V1VolumeProjectionFluent.SecretNested<N>,Nested<N>{
    SecretNestedImpl(V1SecretProjection item) {
      this.builder = new V1SecretProjectionBuilder(this, item);
    }
    SecretNestedImpl() {
      this.builder = new V1SecretProjectionBuilder(this);
    }
    V1SecretProjectionBuilder builder;
    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withSecret(builder.build());
    }
    public N endSecret() {
      return and();
    }
    
  }
  class ServiceAccountTokenNestedImpl<N> extends V1ServiceAccountTokenProjectionFluentImpl<V1VolumeProjectionFluent.ServiceAccountTokenNested<N>> implements V1VolumeProjectionFluent.ServiceAccountTokenNested<N>,Nested<N>{
    ServiceAccountTokenNestedImpl(V1ServiceAccountTokenProjection item) {
      this.builder = new V1ServiceAccountTokenProjectionBuilder(this, item);
    }
    ServiceAccountTokenNestedImpl() {
      this.builder = new V1ServiceAccountTokenProjectionBuilder(this);
    }
    V1ServiceAccountTokenProjectionBuilder builder;
    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withServiceAccountToken(builder.build());
    }
    public N endServiceAccountToken() {
      return and();
    }
    
  }
  
}