package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CustomResourceConversionFluentImpl<A extends V1CustomResourceConversionFluent<A>> extends BaseFluent<A> implements V1CustomResourceConversionFluent<A>{
  public V1CustomResourceConversionFluentImpl() {
  }
  public V1CustomResourceConversionFluentImpl(V1CustomResourceConversion instance) {
    this.withStrategy(instance.getStrategy());

    this.withWebhook(instance.getWebhook());

  }
  private String strategy;
  private V1WebhookConversionBuilder webhook;
  public String getStrategy() {
    return this.strategy;
  }
  public A withStrategy(String strategy) {
    this.strategy=strategy; return (A) this;
  }
  public Boolean hasStrategy() {
    return this.strategy != null;
  }
  
  /**
   * This method has been deprecated, please use method buildWebhook instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1WebhookConversion getWebhook() {
    return this.webhook!=null ?this.webhook.build():null;
  }
  public V1WebhookConversion buildWebhook() {
    return this.webhook!=null ?this.webhook.build():null;
  }
  public A withWebhook(V1WebhookConversion webhook) {
    _visitables.get("webhook").remove(this.webhook);
    if (webhook!=null){ this.webhook= new V1WebhookConversionBuilder(webhook); _visitables.get("webhook").add(this.webhook);} else { this.webhook = null; _visitables.get("webhook").remove(this.webhook); } return (A) this;
  }
  public Boolean hasWebhook() {
    return this.webhook != null;
  }
  public V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhook() {
    return new V1CustomResourceConversionFluentImpl.WebhookNestedImpl();
  }
  public V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhookLike(V1WebhookConversion item) {
    return new V1CustomResourceConversionFluentImpl.WebhookNestedImpl(item);
  }
  public V1CustomResourceConversionFluent.WebhookNested<A> editWebhook() {
    return withNewWebhookLike(getWebhook());
  }
  public V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhook() {
    return withNewWebhookLike(getWebhook() != null ? getWebhook(): new V1WebhookConversionBuilder().build());
  }
  public V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhookLike(V1WebhookConversion item) {
    return withNewWebhookLike(getWebhook() != null ? getWebhook(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceConversionFluentImpl that = (V1CustomResourceConversionFluentImpl) o;
    if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
    if (webhook != null ? !webhook.equals(that.webhook) :that.webhook != null) return false;
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
  class WebhookNestedImpl<N> extends V1WebhookConversionFluentImpl<V1CustomResourceConversionFluent.WebhookNested<N>> implements V1CustomResourceConversionFluent.WebhookNested<N>,Nested<N>{
    WebhookNestedImpl(V1WebhookConversion item) {
      this.builder = new V1WebhookConversionBuilder(this, item);
    }
    WebhookNestedImpl() {
      this.builder = new V1WebhookConversionBuilder(this);
    }
    V1WebhookConversionBuilder builder;
    public N and() {
      return (N) V1CustomResourceConversionFluentImpl.this.withWebhook(builder.build());
    }
    public N endWebhook() {
      return and();
    }
    
  }
  
}