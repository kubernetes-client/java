package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

public interface V1CustomResourceConversionFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


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
     * This method has been deprecated, please use method buildWebhook instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1WebhookConversion getWebhook();
    public io.kubernetes.client.openapi.models.V1WebhookConversion buildWebhook();
    public A withWebhook(io.kubernetes.client.openapi.models.V1WebhookConversion webhook);
    public java.lang.Boolean hasWebhook();
    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhook();
    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item);
    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> editWebhook();
    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhook();
    public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item);
    public interface WebhookNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1WebhookConversionFluent<io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<N>> {

            public N and();
            public N endWebhook();    }


}
