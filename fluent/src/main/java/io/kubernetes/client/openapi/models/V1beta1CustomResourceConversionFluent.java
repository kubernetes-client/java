package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1beta1CustomResourceConversionFluent<A extends io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToConversionReviewVersions(int index,java.lang.String item);
    public A setToConversionReviewVersions(int index,java.lang.String item);
    public A addToConversionReviewVersions(java.lang.String... items);
    public A addAllToConversionReviewVersions(java.util.Collection<java.lang.String> items);
    public A removeFromConversionReviewVersions(java.lang.String... items);
    public A removeAllFromConversionReviewVersions(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getConversionReviewVersions();
    public java.lang.String getConversionReviewVersion(int index);
    public java.lang.String getFirstConversionReviewVersion();
    public java.lang.String getLastConversionReviewVersion();
    public java.lang.String getMatchingConversionReviewVersion(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingConversionReviewVersion(java.util.function.Predicate<java.lang.String> predicate);
    public A withConversionReviewVersions(java.util.List<java.lang.String> conversionReviewVersions);
    public A withConversionReviewVersions(java.lang.String... conversionReviewVersions);
    public java.lang.Boolean hasConversionReviewVersions();
    public A addNewConversionReviewVersion(java.lang.String original);
    public java.lang.String getStrategy();
    public A withStrategy(java.lang.String strategy);
    public java.lang.Boolean hasStrategy();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStrategy instead.
     */
        public A withNewStrategy(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildWebhookClientConfig instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig getWebhookClientConfig();
    public io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig buildWebhookClientConfig();
    public A withWebhookClientConfig(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig webhookClientConfig);
    public java.lang.Boolean hasWebhookClientConfig();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfig();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> withNewWebhookClientConfigLike(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig item);
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> editWebhookClientConfig();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfig();
    public io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<A> editOrNewWebhookClientConfigLike(io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfig item);
    public interface WebhookClientConfigNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.ApiextensionsV1beta1WebhookClientConfigFluent<io.kubernetes.client.openapi.models.V1beta1CustomResourceConversionFluent.WebhookClientConfigNested<N>> {

            public N and();
            public N endWebhookClientConfig();    }


}
