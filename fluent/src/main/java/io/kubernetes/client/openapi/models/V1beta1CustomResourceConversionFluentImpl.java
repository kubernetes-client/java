package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1beta1CustomResourceConversionFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<A> {

    private java.util.List<java.lang.String> conversionReviewVersions;
    private java.lang.String strategy;
    private io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder webhookClientConfig;

    public V1beta1CustomResourceConversionFluentImpl() {
    }

    public V1beta1CustomResourceConversionFluentImpl(io.kubernetes.client.openapi.models.V1beta1CustomResourceConversion instance) {
        this.withConversionReviewVersions(instance.getConversionReviewVersions());
        
        this.withStrategy(instance.getStrategy());
        
        this.withWebhookClientConfig(instance.getWebhookClientConfig());
    }

    public A addToConversionReviewVersions(int index,java.lang.String item) {
        if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        this.conversionReviewVersions.add(index, item);
        return (A)this;
    }

    public A setToConversionReviewVersions(int index,java.lang.String item) {
        if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        this.conversionReviewVersions.set(index, item); return (A)this;
    }

    public A addToConversionReviewVersions(java.lang.String... items) {
        if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.conversionReviewVersions.add(item);} return (A)this;
    }

    public A addAllToConversionReviewVersions(java.util.Collection<java.lang.String> items) {
        if (this.conversionReviewVersions == null) {this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.conversionReviewVersions.add(item);} return (A)this;
    }

    public A removeFromConversionReviewVersions(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.conversionReviewVersions!= null){ this.conversionReviewVersions.remove(item);}} return (A)this;
    }

    public A removeAllFromConversionReviewVersions(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.conversionReviewVersions!= null){ this.conversionReviewVersions.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getConversionReviewVersions() {
        return this.conversionReviewVersions;
    }

    public java.lang.String getConversionReviewVersion(int index) {
        return this.conversionReviewVersions.get(index);
    }

    public java.lang.String getFirstConversionReviewVersion() {
        return this.conversionReviewVersions.get(0);
    }

    public java.lang.String getLastConversionReviewVersion() {
        return this.conversionReviewVersions.get(conversionReviewVersions.size() - 1);
    }

    public java.lang.String getMatchingConversionReviewVersion(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: conversionReviewVersions) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingConversionReviewVersion(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: conversionReviewVersions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConversionReviewVersions(java.util.List<java.lang.String> conversionReviewVersions) {
        if (this.conversionReviewVersions != null) { _visitables.get("conversionReviewVersions").removeAll(this.conversionReviewVersions);}
        if (conversionReviewVersions != null) {this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : conversionReviewVersions){this.addToConversionReviewVersions(item);}} else { this.conversionReviewVersions = null;} return (A) this;
    }

    public A withConversionReviewVersions(java.lang.String... conversionReviewVersions) {
        if (this.conversionReviewVersions != null) {this.conversionReviewVersions.clear();}
        if (conversionReviewVersions != null) {for (java.lang.String item :conversionReviewVersions){ this.addToConversionReviewVersions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConversionReviewVersions() {
        return conversionReviewVersions != null && !conversionReviewVersions.isEmpty();
    }

    public A addNewConversionReviewVersion(java.lang.String original) {
        return (A)addToConversionReviewVersions(new String(original));
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
     * This method has been deprecated, please use method buildWebhookClientConfig instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig getWebhookClientConfig() {
        return this.webhookClientConfig!=null?this.webhookClientConfig.build():null;
    }

    public io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig buildWebhookClientConfig() {
        return this.webhookClientConfig!=null?this.webhookClientConfig.build():null;
    }

    public A withWebhookClientConfig(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig webhookClientConfig) {
        _visitables.get("webhookClientConfig").remove(this.webhookClientConfig);
        if (webhookClientConfig!=null){ this.webhookClientConfig= new io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder(webhookClientConfig); _visitables.get("webhookClientConfig").add(this.webhookClientConfig);} return (A) this;
    }

    public java.lang.Boolean hasWebhookClientConfig() {
        return this.webhookClientConfig != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfig() {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluentImpl.WebhookClientConfigNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfigLike(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig item) {
        return new io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluentImpl.WebhookClientConfigNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> editWebhookClientConfig() {
        return withNewWebhookClientConfigLike(getWebhookClientConfig());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfig() {
        return withNewWebhookClientConfigLike(getWebhookClientConfig() != null ? getWebhookClientConfig(): new io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfigLike(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig item) {
        return withNewWebhookClientConfigLike(getWebhookClientConfig() != null ? getWebhookClientConfig(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CustomResourceConversionFluentImpl that = (V1beta1CustomResourceConversionFluentImpl) o;
        if (conversionReviewVersions != null ? !conversionReviewVersions.equals(that.conversionReviewVersions) :that.conversionReviewVersions != null) return false;
        if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
        if (webhookClientConfig != null ? !webhookClientConfig.equals(that.webhookClientConfig) :that.webhookClientConfig != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(conversionReviewVersions,  strategy,  webhookClientConfig,  super.hashCode());
    }

    public class WebhookClientConfigNestedImpl<N> extends io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder builder;

            WebhookClientConfigNestedImpl(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig item) {
                this.builder = new io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder(this, item);
                        
            }

            WebhookClientConfigNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CustomResourceConversionFluentImpl.this.withWebhookClientConfig(builder.build());
            }

            public N endWebhookClientConfig() {
                return and();
            }
    }


}
