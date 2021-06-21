package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1ValidatingWebhookBuilder extends io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookFluentImpl<io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1ValidatingWebhook,io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookBuilder> {

    io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1ValidatingWebhookBuilder() {
        this(true);
    }

    public V1beta1ValidatingWebhookBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1ValidatingWebhook(), validationEnabled);
    }

    public V1beta1ValidatingWebhookBuilder(io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1ValidatingWebhookBuilder(io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1ValidatingWebhook(), validationEnabled);
    }

    public V1beta1ValidatingWebhookBuilder(io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ValidatingWebhook instance) {
        this(fluent, instance, true);
    }

    public V1beta1ValidatingWebhookBuilder(io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ValidatingWebhook instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());
        
        fluent.withClientConfig(instance.getClientConfig());
        
        fluent.withFailurePolicy(instance.getFailurePolicy());
        
        fluent.withMatchPolicy(instance.getMatchPolicy());
        
        fluent.withName(instance.getName());
        
        fluent.withNamespaceSelector(instance.getNamespaceSelector());
        
        fluent.withObjectSelector(instance.getObjectSelector());
        
        fluent.withRules(instance.getRules());
        
        fluent.withSideEffects(instance.getSideEffects());
        
        fluent.withTimeoutSeconds(instance.getTimeoutSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1ValidatingWebhookBuilder(io.kubernetes.client.openapi.models.V1beta1ValidatingWebhook instance) {
        this(instance,true);
    }

    public V1beta1ValidatingWebhookBuilder(io.kubernetes.client.openapi.models.V1beta1ValidatingWebhook instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());
        
        this.withClientConfig(instance.getClientConfig());
        
        this.withFailurePolicy(instance.getFailurePolicy());
        
        this.withMatchPolicy(instance.getMatchPolicy());
        
        this.withName(instance.getName());
        
        this.withNamespaceSelector(instance.getNamespaceSelector());
        
        this.withObjectSelector(instance.getObjectSelector());
        
        this.withRules(instance.getRules());
        
        this.withSideEffects(instance.getSideEffects());
        
        this.withTimeoutSeconds(instance.getTimeoutSeconds());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1ValidatingWebhook build() {
        V1beta1ValidatingWebhook buildable = new V1beta1ValidatingWebhook();
        buildable.setAdmissionReviewVersions(fluent.getAdmissionReviewVersions());
        buildable.setClientConfig(fluent.getClientConfig());
        buildable.setFailurePolicy(fluent.getFailurePolicy());
        buildable.setMatchPolicy(fluent.getMatchPolicy());
        buildable.setName(fluent.getName());
        buildable.setNamespaceSelector(fluent.getNamespaceSelector());
        buildable.setObjectSelector(fluent.getObjectSelector());
        buildable.setRules(fluent.getRules());
        buildable.setSideEffects(fluent.getSideEffects());
        buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1ValidatingWebhookBuilder that = (V1beta1ValidatingWebhookBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
