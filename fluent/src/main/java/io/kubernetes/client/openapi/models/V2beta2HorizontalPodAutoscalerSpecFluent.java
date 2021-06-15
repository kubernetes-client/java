package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.util.Collection;

public interface V2beta2HorizontalPodAutoscalerSpecFluent<A extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildBehavior instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior getBehavior();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior buildBehavior();
    public A withBehavior(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior behavior);
    public java.lang.Boolean hasBehavior();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehavior();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehaviorLike(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior item);
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editBehavior();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehavior();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehaviorLike(io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehavior item);
    public java.lang.Integer getMaxReplicas();
    public A withMaxReplicas(java.lang.Integer maxReplicas);
    public java.lang.Boolean hasMaxReplicas();
    public A addToMetrics(int index,io.kubernetes.client.openapi.models.V2beta2MetricSpec item);
    public A setToMetrics(int index,io.kubernetes.client.openapi.models.V2beta2MetricSpec item);
    public A addToMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items);
    public A addAllToMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2beta2MetricSpec> items);
    public A removeFromMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... items);
    public A removeAllFromMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2beta2MetricSpec> items);
    public A removeMatchingFromMetrics(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetrics instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> getMetrics();
    public java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> buildMetrics();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildMetric(int index);
    public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildFirstMetric();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildLastMetric();
    public io.kubernetes.client.openapi.models.V2beta2MetricSpec buildMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> predicate);
    public java.lang.Boolean hasMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> predicate);
    public A withMetrics(java.util.List<io.kubernetes.client.openapi.models.V2beta2MetricSpec> metrics);
    public A withMetrics(io.kubernetes.client.openapi.models.V2beta2MetricSpec... metrics);
    public java.lang.Boolean hasMetrics();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricSpec item);
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(int index,io.kubernetes.client.openapi.models.V2beta2MetricSpec item);
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(int index);
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta2MetricSpecBuilder> predicate);
    public java.lang.Integer getMinReplicas();
    public A withMinReplicas(java.lang.Integer minReplicas);
    public java.lang.Boolean hasMinReplicas();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScaleTargetRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference getScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference buildScaleTargetRef();
    public A withScaleTargetRef(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference scaleTargetRef);
    public java.lang.Boolean hasScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item);
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference item);
    public interface BehaviorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerBehaviorFluent<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.BehaviorNested<N>> {

            public N and();
            public N endBehavior();    }


    public interface MetricsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2MetricSpecFluent<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.MetricsNested<N>> {

            public N and();
            public N endMetric();    }


    public interface ScaleTargetRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReferenceFluent<io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> {

            public N and();
            public N endScaleTargetRef();    }


}
