package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;
import java.util.Map;

public interface V1ReplicationControllerSpecFluent<A extends io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getMinReadySeconds();
    public A withMinReadySeconds(java.lang.Integer minReadySeconds);
    public java.lang.Boolean hasMinReadySeconds();
    public java.lang.Integer getReplicas();
    public A withReplicas(java.lang.Integer replicas);
    public java.lang.Boolean hasReplicas();
    public A addToSelector(java.lang.String key,java.lang.String value);
    public A addToSelector(java.util.Map<java.lang.String,java.lang.String> map);
    public A removeFromSelector(java.lang.String key);
    public A removeFromSelector(java.util.Map<java.lang.String,java.lang.String> map);
    public java.util.Map<java.lang.String,java.lang.String> getSelector();
    public <K,V>A withSelector(java.util.Map<java.lang.String,java.lang.String> selector);
    public java.lang.Boolean hasSelector();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
    public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
    public java.lang.Boolean hasTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> editTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplate();
    public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<N>> {

            public N and();
            public N endTemplate();    }


}
