package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1WebhookConversionFluent<A extends io.kubernetes.client.openapi.models.V1WebhookConversionFluent<A>> extends BaseFluent<A>{

  private ApiextensionsV1WebhookClientConfigBuilder clientConfig;
  private List<String> conversionReviewVersions;

  public V1WebhookConversionFluent() {
  }
  
  public V1WebhookConversionFluent(V1WebhookConversion instance) {
    this.copyInstance(instance);
  }

  public A addAllToConversionReviewVersions(Collection<String> items) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList();
    }
    for (String item : items) {
      this.conversionReviewVersions.add(item);
    }
    return (A) this;
  }
  
  public A addToConversionReviewVersions(String... items) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList();
    }
    for (String item : items) {
      this.conversionReviewVersions.add(item);
    }
    return (A) this;
  }
  
  public A addToConversionReviewVersions(int index,String item) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList();
    }
    this.conversionReviewVersions.add(index, item);
    return (A) this;
  }
  
  public ApiextensionsV1WebhookClientConfig buildClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }
  
  protected void copyInstance(V1WebhookConversion instance) {
    instance = instance != null ? instance : new V1WebhookConversion();
    if (instance != null) {
        this.withClientConfig(instance.getClientConfig());
        this.withConversionReviewVersions(instance.getConversionReviewVersions());
    }
  }
  
  public ClientConfigNested<A> editClientConfig() {
    return this.withNewClientConfigLike(Optional.ofNullable(this.buildClientConfig()).orElse(null));
  }
  
  public ClientConfigNested<A> editOrNewClientConfig() {
    return this.withNewClientConfigLike(Optional.ofNullable(this.buildClientConfig()).orElse(new ApiextensionsV1WebhookClientConfigBuilder().build()));
  }
  
  public ClientConfigNested<A> editOrNewClientConfigLike(ApiextensionsV1WebhookClientConfig item) {
    return this.withNewClientConfigLike(Optional.ofNullable(this.buildClientConfig()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1WebhookConversionFluent that = (V1WebhookConversionFluent) o;
    if (!(Objects.equals(clientConfig, that.clientConfig))) {
      return false;
    }
    if (!(Objects.equals(conversionReviewVersions, that.conversionReviewVersions))) {
      return false;
    }
    return true;
  }
  
  public String getConversionReviewVersion(int index) {
    return this.conversionReviewVersions.get(index);
  }
  
  public List<String> getConversionReviewVersions() {
    return this.conversionReviewVersions;
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
  
  public boolean hasClientConfig() {
    return this.clientConfig != null;
  }
  
  public boolean hasConversionReviewVersions() {
    return this.conversionReviewVersions != null && !(this.conversionReviewVersions.isEmpty());
  }
  
  public boolean hasMatchingConversionReviewVersion(Predicate<String> predicate) {
      for (String item : conversionReviewVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(clientConfig, conversionReviewVersions);
  }
  
  public A removeAllFromConversionReviewVersions(Collection<String> items) {
    if (this.conversionReviewVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.conversionReviewVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromConversionReviewVersions(String... items) {
    if (this.conversionReviewVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.conversionReviewVersions.remove(item);
    }
    return (A) this;
  }
  
  public A setToConversionReviewVersions(int index,String item) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new ArrayList();
    }
    this.conversionReviewVersions.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(clientConfig == null)) {
        sb.append("clientConfig:");
        sb.append(clientConfig);
        sb.append(",");
    }
    if (!(conversionReviewVersions == null) && !(conversionReviewVersions.isEmpty())) {
        sb.append("conversionReviewVersions:");
        sb.append(conversionReviewVersions);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withConversionReviewVersions(String... conversionReviewVersions) {
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
  
  public ClientConfigNested<A> withNewClientConfig() {
    return new ClientConfigNested(null);
  }
  
  public ClientConfigNested<A> withNewClientConfigLike(ApiextensionsV1WebhookClientConfig item) {
    return new ClientConfigNested(item);
  }
  public class ClientConfigNested<N> extends ApiextensionsV1WebhookClientConfigFluent<ClientConfigNested<N>> implements Nested<N>{
  
    ApiextensionsV1WebhookClientConfigBuilder builder;
  
    ClientConfigNested(ApiextensionsV1WebhookClientConfig item) {
      this.builder = new ApiextensionsV1WebhookClientConfigBuilder(this, item);
    }
  
    public N and() {
      return (N) V1WebhookConversionFluent.this.withClientConfig(builder.build());
    }
    
    public N endClientConfig() {
      return and();
    }
    
  }
}