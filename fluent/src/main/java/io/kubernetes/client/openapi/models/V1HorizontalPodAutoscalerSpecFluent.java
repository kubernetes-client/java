package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1HorizontalPodAutoscalerSpecFluent<A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getMaxReplicas();
    public A withMaxReplicas(java.lang.Integer maxReplicas);
    public java.lang.Boolean hasMaxReplicas();
    public java.lang.Integer getMinReplicas();
    public A withMinReplicas(java.lang.Integer minReplicas);
    public java.lang.Boolean hasMinReplicas();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScaleTargetRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference getScaleTargetRef();
    public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference buildScaleTargetRef();
    public A withScaleTargetRef(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference scaleTargetRef);
    public java.lang.Boolean hasScaleTargetRef();
    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item);
    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item);
    public java.lang.Integer getTargetCPUUtilizationPercentage();
    public A withTargetCPUUtilizationPercentage(java.lang.Integer targetCPUUtilizationPercentage);
    public java.lang.Boolean hasTargetCPUUtilizationPercentage();
    public interface ScaleTargetRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluent<io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> {

            public N and();
            public N endScaleTargetRef();    }


}
