package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1WebhookConversionFluent<A extends V1WebhookConversionFluent<A>> extends BaseFluent<A>{
  public V1WebhookConversionFluent() {
  }
  
  public V1WebhookConversionFluent(V1WebhookConversion instance) {
    this.copyInstance(instance);
  }
  private ApiextensionsV1WebhookClientConfigBuilder clientConfig;
  private List<String> conversionReviewVersions;
  
  protected void copyInstance(V1WebhookConversion instance) {
    instance = (instance != null ? instance : new V1WebhookConversion());
    if (instance != null) {
          this.withClientConfig(instance.getClientConfig());
          this.withConversionReviewVersions(instance.getConversionReviewVersions());
        }
  }
  
  public ApiextensionsV1WebhookClientConfig buildClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }
  
  public A withClientConfig(ApiextensionsV1WebhookClientConfig clientConfig) {
    this._visitables.remove("clientConfig");
    if (clientConfig != null) {
        this.clientConfig = new ApiextensionsV1WebhookClientConfigBuilder(clientConfig);
        this._visitables.get("clientConfig").add(this.clientConfig);
    } else {
        this.clientConfig = null;
        this._visitables.get("clientConfig").remove(this.clientConfig);
    }
    return (A) this;
  }
  
  public boolean hasClientConfig() {
    return this.clientConfig != null;
  }
  
  public ClientConfigNested<A> withNewClientConfig() {
    return new ClientConfigNested(null);
  }
  
  public ClientConfigNested<A> withNewClientConfigLike(ApiextensionsV1WebhookClientConfig item) {
    return new ClientConfigNested(item);
  }
  
  public ClientConfigNested<A> editClientConfig() {
    return withNewClientConfigLike(java.util.Optional.ofNullable(buildClientConfig()).orElse(null));
  }
  
  public ClientConfigNested<A> editOrNewClientConfig() {
    return withNewClientConfigLike(java.util.Optional.ofNullable(buildClientConfig()).orElse(new ApiextensionsV1WebhookClientConfigBuilder().build()));
  }
  
  public ClientConfigNested<A> editOrNewClientConfigLike(ApiextensionsV1WebhookClientConfig item) {
    return withNewClientConfigLike(java.util.Optional.ofNullable(buildClientConfig()).orElse(item));
  }
  
  public A addToConversionReviewVersions(int index,String item) {
    if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new ArrayList<String>();}
    this.conversionReviewVersions.add(index, item);
    return (A)this;
  }
  
  public A setToConversionReviewVersions(int index,String item) {
    if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new ArrayList<String>();}
    this.conversionReviewVersions.set(index, item); return (A)this;
  }
  
  public A addToConversionReviewVersions(java.lang.String... items) {
    if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new ArrayList<String>();}
    for (String item : items) {this.conversionReviewVersions.add(item);} return (A)this;
  }
  
  public A addAllToConversionReviewVersions(Collection<String> items) {
    if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new ArrayList<String>();}
    for (String item : items) {this.conversionReviewVersions.add(item);} return (A)this;
  }
  
  public A removeFromConversionReviewVersions(java.lang.String... items) {
    if (this.conversionReviewVersions == null) return (A)this;
    for (String item : items) { this.conversionReviewVersions.remove(item);} return (A)this;
  }
  
  public A removeAllFromConversionReviewVersions(Collection<String> items) {
    if (this.conversionReviewVersions == null) return (A)this;
    for (String item : items) { this.conversionReviewVersions.remove(item);} return (A)this;
  }
  
  public List<String> getConversionReviewVersions() {
    return this.conversionReviewVersions;
  }
  
  public String getConversionReviewVersion(int index) {
    return this.conversionReviewVersions.get(index);
  }
  
  public String getFirstConversionReviewVersion() {
    return this.conversionReviewVersions.get(0);
  }
  
  public String getLastConversionReviewVersion() {
    return this.conversionReviewVersions.get(conversionReviewVersions.size() - 1);
  }
  
  public String getMatchingConversionReviewVersion(Predicate<String> predicate) {
      for (String item : conversionReviewVersions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingConversionReviewVersion(Predicate<String> predicate) {
      for (String item : conversionReviewVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConversionReviewVersions(List<String> conversionReviewVersions) {
    if (conversionReviewVersions != null) {
        this.conversionReviewVersions = new ArrayList();
        for (String item : conversionReviewVersions) {
          this.addToConversionReviewVersions(item);
        }
    } else {
      this.conversionReviewVersions = null;
    }
    return (A) this;
  }
  
  public A withConversionReviewVersions(java.lang.String... conversionReviewVersions) {
    if (this.conversionReviewVersions != null) {
        this.conversionReviewVersions.clear();
        _visitables.remove("conversionReviewVersions");
    }
    if (conversionReviewVersions != null) {
      for (String item : conversionReviewVersions) {
        this.addToConversionReviewVersions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConversionReviewVersions() {
    return this.conversionReviewVersions != null && !this.conversionReviewVersions.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1WebhookConversionFluent that = (V1WebhookConversionFluent) o;
    if (!java.util.Objects.equals(clientConfig, that.clientConfig)) return false;
    if (!java.util.Objects.equals(conversionReviewVersions, that.conversionReviewVersions)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(clientConfig,  conversionReviewVersions,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (clientConfig != null) { sb.append("clientConfig:"); sb.append(clientConfig + ","); }
    if (conversionReviewVersions != null && !conversionReviewVersions.isEmpty()) { sb.append("conversionReviewVersions:"); sb.append(conversionReviewVersions); }
    sb.append("}");
    return sb.toString();
  }
  public class ClientConfigNested<N> extends ApiextensionsV1WebhookClientConfigFluent<ClientConfigNested<N>> implements Nested<N>{
    ClientConfigNested(ApiextensionsV1WebhookClientConfig item) {
      this.builder = new ApiextensionsV1WebhookClientConfigBuilder(this, item);
    }
    ApiextensionsV1WebhookClientConfigBuilder builder;
    
    public N and() {
      return (N) V1WebhookConversionFluent.this.withClientConfig(builder.build());
    }
    
    public N endClientConfig() {
      return and();
    }
    
  
  }

}