package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1ReplicaSetSpecFluent<A extends io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getMinReadySeconds();
    public A withMinReadySeconds(java.lang.Integer minReadySeconds);
    public java.lang.Boolean hasMinReadySeconds();
    public java.lang.Integer getReplicas();
    public A withReplicas(java.lang.Integer replicas);
    public java.lang.Boolean hasReplicas();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
    public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
    public java.lang.Boolean hasSelector();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelector();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> editSelector();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelector();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
    public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
    public java.lang.Boolean hasTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> editTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.SelectorNested<N>> {

            public N and();
            public N endSelector();    }


    public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<io.kubernetes.client.openapi.models.V1ReplicaSetSpecFluent.TemplateNested<N>> {

            public N and();
            public N endTemplate();    }


}
