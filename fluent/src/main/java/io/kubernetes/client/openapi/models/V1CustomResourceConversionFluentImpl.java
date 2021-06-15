package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1CustomResourceConversionFluentImpl<A extends io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<A> {

    private java.lang.String strategy;
    private io.kubernetes.client.openapi.models.V1WebhookConversionBuilder webhook;

    public V1CustomResourceConversionFluentImpl() {
    }

    public V1CustomResourceConversionFluentImpl(io.kubernetes.client.openapi.models.V1CustomResourceConversion instance) {
        this.withStrategy(instance.getStrategy());
        
        this.withWebhook(instance.getWebhook());
    }

    public java.lang.String getStrategy() {
        return this.strategy;
    }

    public A withStrategy(java.lang.String strategy) {
        this.strategy=strategy; return (A) this;
    }

    public java.lang.Boolean hasStrategy() {
        return this.strategy != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStrategy instead.
     */
        public A withNewStrategy(java.lang.String original) {
        return (A)withStrategy(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildWebhook instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1WebhookConversion getWebhook() {
        return this.webhook!=null?this.webhook.build():null;
    }

    public io.kubernetes.client.openapi.models.V1WebhookConversion buildWebhook() {
        return this.webhook!=null?this.webhook.build():null;
    }

    public A withWebhook(io.kubernetes.client.openapi.models.V1WebhookConversion webhook) {
        _visitables.get("webhook").remove(this.webhook);
        if (webhook!=null){ this.webhook= new io.kubernetes.client.openapi.models.V1WebhookConversionBuilder(webhook); _visitables.get("webhook").add(this.webhook);} return (A) this;
    }

    public java.lang.Boolean hasWebhook() {
        return this.webhook != null;
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhook() {
        return new io.kubernetes.client.openapi.models.V1CustomResourceConversionFluentImpl.WebhookNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceConversionFluentImpl.WebhookNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> editWebhook() {
        return withNewWebhookLike(getWebhook());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhook() {
        return withNewWebhookLike(getWebhook() != null ? getWebhook(): new io.kubernetes.client.openapi.models.V1WebhookConversionBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item) {
        return withNewWebhookLike(getWebhook() != null ? getWebhook(): item);
    }

    public boolean equals(java.lang.Object o) {
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

    public class WebhookNestedImpl<N> extends io.kubernetes.client.openapi.models.V1WebhookConversionFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<N>> implements io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1WebhookConversionBuilder builder;

            WebhookNestedImpl(io.kubernetes.client.openapi.models.V1WebhookConversion item) {
                this.builder = new io.kubernetes.client.openapi.models.V1WebhookConversionBuilder(this, item);
                        
            }

            WebhookNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1WebhookConversionBuilder(this);
                        
            }

            public N and() {
                return (N) V1CustomResourceConversionFluentImpl.this.withWebhook(builder.build());
            }

            public N endWebhook() {
                return and();
            }
    }


}
