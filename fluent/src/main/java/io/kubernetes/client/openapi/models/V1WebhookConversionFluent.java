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

public interface V1WebhookConversionFluent<A extends io.kubernetes.client.openapi.models.V1WebhookConversionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildClientConfig instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig getClientConfig();
    public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig buildClientConfig();
    public A withClientConfig(io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig clientConfig);
    public java.lang.Boolean hasClientConfig();
    public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfig();
    public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfigLike(io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig item);
    public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A> editClientConfig();
    public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfig();
    public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfigLike(io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig item);
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
    public interface ClientConfigNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent<io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<N>> {

            public N and();
            public N endClientConfig();    }


}
