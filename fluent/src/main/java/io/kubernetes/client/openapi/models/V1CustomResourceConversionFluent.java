package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceConversionFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<A>> extends BaseFluent<A>{

  private String strategy;
  private V1WebhookConversionBuilder webhook;

  public V1CustomResourceConversionFluent() {
  }
  
  public V1CustomResourceConversionFluent(V1CustomResourceConversion instance) {
    this.copyInstance(instance);
  }

  public V1WebhookConversion buildWebhook() {
    return this.webhook != null ? this.webhook.build() : null;
  }
  
  protected void copyInstance(V1CustomResourceConversion instance) {
    instance = instance != null ? instance : new V1CustomResourceConversion();
    if (instance != null) {
        this.withStrategy(instance.getStrategy());
        this.withWebhook(instance.getWebhook());
    }
  }
  
  public WebhookNested<A> editOrNewWebhook() {
    return this.withNewWebhookLike(Optional.ofNullable(this.buildWebhook()).orElse(new V1WebhookConversionBuilder().build()));
  }
  
  public WebhookNested<A> editOrNewWebhookLike(V1WebhookConversion item) {
    return this.withNewWebhookLike(Optional.ofNullable(this.buildWebhook()).orElse(item));
  }
  
  public WebhookNested<A> editWebhook() {
    return this.withNewWebhookLike(Optional.ofNullable(this.buildWebhook()).orElse(null));
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
    V1CustomResourceConversionFluent that = (V1CustomResourceConversionFluent) o;
    if (!(Objects.equals(strategy, that.strategy))) {
      return false;
    }
    if (!(Objects.equals(webhook, that.webhook))) {
      return false;
    }
    return true;
  }
  
  public String getStrategy() {
    return this.strategy;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public boolean hasWebhook() {
    return this.webhook != null;
  }
  
  public int hashCode() {
    return Objects.hash(strategy, webhook);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(strategy == null)) {
        sb.append("strategy:");
        sb.append(strategy);
        sb.append(",");
    }
    if (!(webhook == null)) {
        sb.append("webhook:");
        sb.append(webhook);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public WebhookNested<A> withNewWebhook() {
    return new WebhookNested(null);
  }
  
  public WebhookNested<A> withNewWebhookLike(V1WebhookConversion item) {
    return new WebhookNested(item);
  }
  
  public A withStrategy(String strategy) {
    this.strategy = strategy;
    return (A) this;
  }
  
  public A withWebhook(V1WebhookConversion webhook) {
    this._visitables.remove("webhook");
    if (webhook != null) {
        this.webhook = new V1WebhookConversionBuilder(webhook);
        this._visitables.get("webhook").add(this.webhook);
    } else {
        this.webhook = null;
        this._visitables.get("webhook").remove(this.webhook);
    }
    return (A) this;
  }
  public class WebhookNested<N> extends V1WebhookConversionFluent<WebhookNested<N>> implements Nested<N>{
  
    V1WebhookConversionBuilder builder;
  
    WebhookNested(V1WebhookConversion item) {
      this.builder = new V1WebhookConversionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CustomResourceConversionFluent.this.withWebhook(builder.build());
    }
    
    public N endWebhook() {
      return and();
    }
    
  }
}