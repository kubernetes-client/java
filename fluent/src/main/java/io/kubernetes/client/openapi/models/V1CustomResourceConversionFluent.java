package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceConversionFluent<A extends V1CustomResourceConversionFluent<A>> extends BaseFluent<A>{
  public V1CustomResourceConversionFluent() {
  }
  
  public V1CustomResourceConversionFluent(V1CustomResourceConversion instance) {
    this.copyInstance(instance);
  }
  private String strategy;
  private V1WebhookConversionBuilder webhook;
  
  protected void copyInstance(V1CustomResourceConversion instance) {
    instance = (instance != null ? instance : new V1CustomResourceConversion());
    if (instance != null) {
          this.withStrategy(instance.getStrategy());
          this.withWebhook(instance.getWebhook());
        }
  }
  
  public String getStrategy() {
    return this.strategy;
  }
  
  public A withStrategy(String strategy) {
    this.strategy = strategy;
    return (A) this;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public V1WebhookConversion buildWebhook() {
    return this.webhook != null ? this.webhook.build() : null;
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
  
  public boolean hasWebhook() {
    return this.webhook != null;
  }
  
  public WebhookNested<A> withNewWebhook() {
    return new WebhookNested(null);
  }
  
  public WebhookNested<A> withNewWebhookLike(V1WebhookConversion item) {
    return new WebhookNested(item);
  }
  
  public WebhookNested<A> editWebhook() {
    return withNewWebhookLike(java.util.Optional.ofNullable(buildWebhook()).orElse(null));
  }
  
  public WebhookNested<A> editOrNewWebhook() {
    return withNewWebhookLike(java.util.Optional.ofNullable(buildWebhook()).orElse(new V1WebhookConversionBuilder().build()));
  }
  
  public WebhookNested<A> editOrNewWebhookLike(V1WebhookConversion item) {
    return withNewWebhookLike(java.util.Optional.ofNullable(buildWebhook()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceConversionFluent that = (V1CustomResourceConversionFluent) o;
    if (!java.util.Objects.equals(strategy, that.strategy)) return false;
    if (!java.util.Objects.equals(webhook, that.webhook)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(strategy,  webhook,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (strategy != null) { sb.append("strategy:"); sb.append(strategy + ","); }
    if (webhook != null) { sb.append("webhook:"); sb.append(webhook); }
    sb.append("}");
    return sb.toString();
  }
  public class WebhookNested<N> extends V1WebhookConversionFluent<WebhookNested<N>> implements Nested<N>{
    WebhookNested(V1WebhookConversion item) {
      this.builder = new V1WebhookConversionBuilder(this, item);
    }
    V1WebhookConversionBuilder builder;
    
    public N and() {
      return (N) V1CustomResourceConversionFluent.this.withWebhook(builder.build());
    }
    
    public N endWebhook() {
      return and();
    }
    
  
  }

}