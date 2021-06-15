package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1beta1MutatingWebhookConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public A addToWebhooks(int index,io.kubernetes.client.openapi.models.V1beta1MutatingWebhook item);
    public A setToWebhooks(int index,io.kubernetes.client.openapi.models.V1beta1MutatingWebhook item);
    public A addToWebhooks(io.kubernetes.client.openapi.models.V1beta1MutatingWebhook... items);
    public A addAllToWebhooks(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1MutatingWebhook> items);
    public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1beta1MutatingWebhook... items);
    public A removeAllFromWebhooks(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1MutatingWebhook> items);
    public A removeMatchingFromWebhooks(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildWebhooks instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1MutatingWebhook> getWebhooks();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1MutatingWebhook> buildWebhooks();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhook buildWebhook(int index);
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhook buildFirstWebhook();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhook buildLastWebhook();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhook buildMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookBuilder> predicate);
    public java.lang.Boolean hasMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookBuilder> predicate);
    public A withWebhooks(java.util.List<io.kubernetes.client.openapi.models.V1beta1MutatingWebhook> webhooks);
    public A withWebhooks(io.kubernetes.client.openapi.models.V1beta1MutatingWebhook... webhooks);
    public java.lang.Boolean hasWebhooks();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhookLike(io.kubernetes.client.openapi.models.V1beta1MutatingWebhook item);
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<A> setNewWebhookLike(int index,io.kubernetes.client.openapi.models.V1beta1MutatingWebhook item);
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<A> editWebhook(int index);
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<A> editFirstWebhook();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<A> editLastWebhook();
    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<A> editMatchingWebhook(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookBuilder> predicate);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface WebhooksNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationFluent.WebhooksNested<N>> {

            public N and();
            public N endWebhook();    }


}
