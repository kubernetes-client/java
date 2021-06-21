package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1DaemonSetSpecFluent<A extends io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getMinReadySeconds();
    public A withMinReadySeconds(java.lang.Integer minReadySeconds);
    public java.lang.Boolean hasMinReadySeconds();
    public java.lang.Integer getRevisionHistoryLimit();
    public A withRevisionHistoryLimit(java.lang.Integer revisionHistoryLimit);
    public java.lang.Boolean hasRevisionHistoryLimit();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
    public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
    public java.lang.Boolean hasSelector();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A> withNewSelector();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A> editSelector();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A> editOrNewSelector();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
    public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
    public java.lang.Boolean hasTemplate();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A> withNewTemplate();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A> editTemplate();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplate();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildUpdateStrategy instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy getUpdateStrategy();
    public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy buildUpdateStrategy();
    public A withUpdateStrategy(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy updateStrategy);
    public java.lang.Boolean hasUpdateStrategy();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategy();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A> withNewUpdateStrategyLike(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy item);
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A> editUpdateStrategy();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategy();
    public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A> editOrNewUpdateStrategyLike(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy item);
    public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<N>> {

            public N and();
            public N endSelector();    }


    public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<N>> {

            public N and();
            public N endTemplate();    }


    public interface UpdateStrategyNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<N>> {

            public N and();
            public N endUpdateStrategy();    }


}
