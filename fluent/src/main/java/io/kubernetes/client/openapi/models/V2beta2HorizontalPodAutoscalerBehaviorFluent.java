package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta2HorizontalPodAutoscalerBehaviorFluent<A extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScaleDown instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules getScaleDown();
    public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules buildScaleDown();
    public A withScaleDown(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules scaleDown);
    public java.lang.Boolean hasScaleDown();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDown();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> withNewScaleDownLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item);
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editScaleDown();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDown();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<A> editOrNewScaleDownLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScaleUp instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules getScaleUp();
    public io.kubernetes.client.openapi.models.V2beta2HPAScalingRules buildScaleUp();
    public A withScaleUp(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules scaleUp);
    public java.lang.Boolean hasScaleUp();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUp();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> withNewScaleUpLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item);
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editScaleUp();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUp();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<A> editOrNewScaleUpLike(io.kubernetes.client.openapi.models.V2beta2HPAScalingRules item);
    public interface ScaleDownNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleDownNested<N>> {

            public N and();
            public N endScaleDown();    }


    public interface ScaleUpNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2HPAScalingRulesFluent<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<N>> {

            public N and();
            public N endScaleUp();    }


}
