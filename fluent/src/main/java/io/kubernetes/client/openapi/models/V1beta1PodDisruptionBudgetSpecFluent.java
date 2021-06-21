package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1beta1PodDisruptionBudgetSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public io.kubernetes.client.custom.IntOrString getMaxUnavailable();
    public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable);
    public java.lang.Boolean hasMaxUnavailable();
    public A withNewMaxUnavailable(int value);
    public A withNewMaxUnavailable(java.lang.String value);
    public io.kubernetes.client.custom.IntOrString getMinAvailable();
    public A withMinAvailable(io.kubernetes.client.custom.IntOrString minAvailable);
    public java.lang.Boolean hasMinAvailable();
    public A withNewMinAvailable(int value);
    public A withNewMinAvailable(java.lang.String value);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
    public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
    public java.lang.Boolean hasSelector();
    public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector();
    public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> editSelector();
    public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelector();
    public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent.SelectorNested<N>> {

            public N and();
            public N endSelector();    }


}
