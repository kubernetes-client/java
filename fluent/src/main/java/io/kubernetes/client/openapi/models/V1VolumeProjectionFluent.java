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
public class V1VolumeProjectionFluent<A extends V1VolumeProjectionFluent<A>> extends BaseFluent<A>{
  public V1VolumeProjectionFluent() {
  }
  
  public V1VolumeProjectionFluent(V1VolumeProjection instance) {
    this.copyInstance(instance);
  }
  private V1ClusterTrustBundleProjectionBuilder clusterTrustBundle;
  private V1ConfigMapProjectionBuilder configMap;
  private V1DownwardAPIProjectionBuilder downwardAPI;
  private V1SecretProjectionBuilder secret;
  private V1ServiceAccountTokenProjectionBuilder serviceAccountToken;
  
  protected void copyInstance(V1VolumeProjection instance) {
    instance = (instance != null ? instance : new V1VolumeProjection());
    if (instance != null) {
          this.withClusterTrustBundle(instance.getClusterTrustBundle());
          this.withConfigMap(instance.getConfigMap());
          this.withDownwardAPI(instance.getDownwardAPI());
          this.withSecret(instance.getSecret());
          this.withServiceAccountToken(instance.getServiceAccountToken());
        }
  }
  
  public V1ClusterTrustBundleProjection buildClusterTrustBundle() {
    return this.clusterTrustBundle != null ? this.clusterTrustBundle.build() : null;
  }
  
  public A withClusterTrustBundle(V1ClusterTrustBundleProjection clusterTrustBundle) {
    this._visitables.remove("clusterTrustBundle");
    if (clusterTrustBundle != null) {
        this.clusterTrustBundle = new V1ClusterTrustBundleProjectionBuilder(clusterTrustBundle);
        this._visitables.get("clusterTrustBundle").add(this.clusterTrustBundle);
    } else {
        this.clusterTrustBundle = null;
        this._visitables.get("clusterTrustBundle").remove(this.clusterTrustBundle);
    }
    return (A) this;
  }
  
  public boolean hasClusterTrustBundle() {
    return this.clusterTrustBundle != null;
  }
  
  public ClusterTrustBundleNested<A> withNewClusterTrustBundle() {
    return new ClusterTrustBundleNested(null);
  }
  
  public ClusterTrustBundleNested<A> withNewClusterTrustBundleLike(V1ClusterTrustBundleProjection item) {
    return new ClusterTrustBundleNested(item);
  }
  
  public ClusterTrustBundleNested<A> editClusterTrustBundle() {
    return withNewClusterTrustBundleLike(java.util.Optional.ofNullable(buildClusterTrustBundle()).orElse(null));
  }
  
  public ClusterTrustBundleNested<A> editOrNewClusterTrustBundle() {
    return withNewClusterTrustBundleLike(java.util.Optional.ofNullable(buildClusterTrustBundle()).orElse(new V1ClusterTrustBundleProjectionBuilder().build()));
  }
  
  public ClusterTrustBundleNested<A> editOrNewClusterTrustBundleLike(V1ClusterTrustBundleProjection item) {
    return withNewClusterTrustBundleLike(java.util.Optional.ofNullable(buildClusterTrustBundle()).orElse(item));
  }
  
  public V1ConfigMapProjection buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }
  
  public A withConfigMap(V1ConfigMapProjection configMap) {
    this._visitables.remove("configMap");
    if (configMap != null) {
        this.configMap = new V1ConfigMapProjectionBuilder(configMap);
        this._visitables.get("configMap").add(this.configMap);
    } else {
        this.configMap = null;
        this._visitables.get("configMap").remove(this.configMap);
    }
    return (A) this;
  }
  
  public boolean hasConfigMap() {
    return this.configMap != null;
  }
  
  public ConfigMapNested<A> withNewConfigMap() {
    return new ConfigMapNested(null);
  }
  
  public ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapProjection item) {
    return new ConfigMapNested(item);
  }
  
  public ConfigMapNested<A> editConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(null));
  }
  
  public ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(new V1ConfigMapProjectionBuilder().build()));
  }
  
  public ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapProjection item) {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(item));
  }
  
  public V1DownwardAPIProjection buildDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }
  
  public A withDownwardAPI(V1DownwardAPIProjection downwardAPI) {
    this._visitables.remove("downwardAPI");
    if (downwardAPI != null) {
        this.downwardAPI = new V1DownwardAPIProjectionBuilder(downwardAPI);
        this._visitables.get("downwardAPI").add(this.downwardAPI);
    } else {
        this.downwardAPI = null;
        this._visitables.get("downwardAPI").remove(this.downwardAPI);
    }
    return (A) this;
  }
  
  public boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }
  
  public DownwardAPINested<A> withNewDownwardAPI() {
    return new DownwardAPINested(null);
  }
  
  public DownwardAPINested<A> withNewDownwardAPILike(V1DownwardAPIProjection item) {
    return new DownwardAPINested(item);
  }
  
  public DownwardAPINested<A> editDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(null));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(new V1DownwardAPIProjectionBuilder().build()));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPILike(V1DownwardAPIProjection item) {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(item));
  }
  
  public V1SecretProjection buildSecret() {
    return this.secret != null ? this.secret.build() : null;
  }
  
  public A withSecret(V1SecretProjection secret) {
    this._visitables.remove("secret");
    if (secret != null) {
        this.secret = new V1SecretProjectionBuilder(secret);
        this._visitables.get("secret").add(this.secret);
    } else {
        this.secret = null;
        this._visitables.get("secret").remove(this.secret);
    }
    return (A) this;
  }
  
  public boolean hasSecret() {
    return this.secret != null;
  }
  
  public SecretNested<A> withNewSecret() {
    return new SecretNested(null);
  }
  
  public SecretNested<A> withNewSecretLike(V1SecretProjection item) {
    return new SecretNested(item);
  }
  
  public SecretNested<A> editSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(null));
  }
  
  public SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(new V1SecretProjectionBuilder().build()));
  }
  
  public SecretNested<A> editOrNewSecretLike(V1SecretProjection item) {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(item));
  }
  
  public V1ServiceAccountTokenProjection buildServiceAccountToken() {
    return this.serviceAccountToken != null ? this.serviceAccountToken.build() : null;
  }
  
  public A withServiceAccountToken(V1ServiceAccountTokenProjection serviceAccountToken) {
    this._visitables.remove("serviceAccountToken");
    if (serviceAccountToken != null) {
        this.serviceAccountToken = new V1ServiceAccountTokenProjectionBuilder(serviceAccountToken);
        this._visitables.get("serviceAccountToken").add(this.serviceAccountToken);
    } else {
        this.serviceAccountToken = null;
        this._visitables.get("serviceAccountToken").remove(this.serviceAccountToken);
    }
    return (A) this;
  }
  
  public boolean hasServiceAccountToken() {
    return this.serviceAccountToken != null;
  }
  
  public ServiceAccountTokenNested<A> withNewServiceAccountToken() {
    return new ServiceAccountTokenNested(null);
  }
  
  public ServiceAccountTokenNested<A> withNewServiceAccountTokenLike(V1ServiceAccountTokenProjection item) {
    return new ServiceAccountTokenNested(item);
  }
  
  public ServiceAccountTokenNested<A> editServiceAccountToken() {
    return withNewServiceAccountTokenLike(java.util.Optional.ofNullable(buildServiceAccountToken()).orElse(null));
  }
  
  public ServiceAccountTokenNested<A> editOrNewServiceAccountToken() {
    return withNewServiceAccountTokenLike(java.util.Optional.ofNullable(buildServiceAccountToken()).orElse(new V1ServiceAccountTokenProjectionBuilder().build()));
  }
  
  public ServiceAccountTokenNested<A> editOrNewServiceAccountTokenLike(V1ServiceAccountTokenProjection item) {
    return withNewServiceAccountTokenLike(java.util.Optional.ofNullable(buildServiceAccountToken()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeProjectionFluent that = (V1VolumeProjectionFluent) o;
    if (!java.util.Objects.equals(clusterTrustBundle, that.clusterTrustBundle)) return false;
    if (!java.util.Objects.equals(configMap, that.configMap)) return false;
    if (!java.util.Objects.equals(downwardAPI, that.downwardAPI)) return false;
    if (!java.util.Objects.equals(secret, that.secret)) return false;
    if (!java.util.Objects.equals(serviceAccountToken, that.serviceAccountToken)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(clusterTrustBundle,  configMap,  downwardAPI,  secret,  serviceAccountToken,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clusterTrustBundle != null) { sb.append("clusterTrustBundle:"); sb.append(clusterTrustBundle + ","); }
    if (configMap != null) { sb.append("configMap:"); sb.append(configMap + ","); }
    if (downwardAPI != null) { sb.append("downwardAPI:"); sb.append(downwardAPI + ","); }
    if (secret != null) { sb.append("secret:"); sb.append(secret + ","); }
    if (serviceAccountToken != null) { sb.append("serviceAccountToken:"); sb.append(serviceAccountToken); }
    sb.append("}");
    return sb.toString();
  }
  public class ClusterTrustBundleNested<N> extends V1ClusterTrustBundleProjectionFluent<ClusterTrustBundleNested<N>> implements Nested<N>{
    ClusterTrustBundleNested(V1ClusterTrustBundleProjection item) {
      this.builder = new V1ClusterTrustBundleProjectionBuilder(this, item);
    }
    V1ClusterTrustBundleProjectionBuilder builder;
    
    public N and() {
      return (N) V1VolumeProjectionFluent.this.withClusterTrustBundle(builder.build());
    }
    
    public N endClusterTrustBundle() {
      return and();
    }
    
  
  }
  public class ConfigMapNested<N> extends V1ConfigMapProjectionFluent<ConfigMapNested<N>> implements Nested<N>{
    ConfigMapNested(V1ConfigMapProjection item) {
      this.builder = new V1ConfigMapProjectionBuilder(this, item);
    }
    V1ConfigMapProjectionBuilder builder;
    
    public N and() {
      return (N) V1VolumeProjectionFluent.this.withConfigMap(builder.build());
    }
    
    public N endConfigMap() {
      return and();
    }
    
  
  }
  public class DownwardAPINested<N> extends V1DownwardAPIProjectionFluent<DownwardAPINested<N>> implements Nested<N>{
    DownwardAPINested(V1DownwardAPIProjection item) {
      this.builder = new V1DownwardAPIProjectionBuilder(this, item);
    }
    V1DownwardAPIProjectionBuilder builder;
    
    public N and() {
      return (N) V1VolumeProjectionFluent.this.withDownwardAPI(builder.build());
    }
    
    public N endDownwardAPI() {
      return and();
    }
    
  
  }
  public class SecretNested<N> extends V1SecretProjectionFluent<SecretNested<N>> implements Nested<N>{
    SecretNested(V1SecretProjection item) {
      this.builder = new V1SecretProjectionBuilder(this, item);
    }
    V1SecretProjectionBuilder builder;
    
    public N and() {
      return (N) V1VolumeProjectionFluent.this.withSecret(builder.build());
    }
    
    public N endSecret() {
      return and();
    }
    
  
  }
  public class ServiceAccountTokenNested<N> extends V1ServiceAccountTokenProjectionFluent<ServiceAccountTokenNested<N>> implements Nested<N>{
    ServiceAccountTokenNested(V1ServiceAccountTokenProjection item) {
      this.builder = new V1ServiceAccountTokenProjectionBuilder(this, item);
    }
    V1ServiceAccountTokenProjectionBuilder builder;
    
    public N and() {
      return (N) V1VolumeProjectionFluent.this.withServiceAccountToken(builder.build());
    }
    
    public N endServiceAccountToken() {
      return and();
    }
    
  
  }

}