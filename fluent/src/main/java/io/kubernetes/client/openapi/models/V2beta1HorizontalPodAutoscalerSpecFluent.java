package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V2beta1HorizontalPodAutoscalerSpecFluent<A extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getMaxReplicas();
    public A withMaxReplicas(java.lang.Integer maxReplicas);
    public java.lang.Boolean hasMaxReplicas();
    public A addToMetrics(int index,io.kubernetes.client.openapi.models.V2beta1MetricSpec item);
    public A setToMetrics(int index,io.kubernetes.client.openapi.models.V2beta1MetricSpec item);
    public A addToMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... items);
    public A addAllToMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricSpec> items);
    public A removeFromMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... items);
    public A removeAllFromMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2beta1MetricSpec> items);
    public A removeMatchingFromMetrics(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetrics instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> getMetrics();
    public java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> buildMetrics();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildMetric(int index);
    public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildFirstMetric();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildLastMetric();
    public io.kubernetes.client.openapi.models.V2beta1MetricSpec buildMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> predicate);
    public java.lang.Boolean hasMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> predicate);
    public A withMetrics(java.util.List<io.kubernetes.client.openapi.models.V2beta1MetricSpec> metrics);
    public A withMetrics(io.kubernetes.client.openapi.models.V2beta1MetricSpec... metrics);
    public java.lang.Boolean hasMetrics();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(io.kubernetes.client.openapi.models.V2beta1MetricSpec item);
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(int index,io.kubernetes.client.openapi.models.V2beta1MetricSpec item);
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(int index);
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2beta1MetricSpecBuilder> predicate);
    public java.lang.Integer getMinReplicas();
    public A withMinReplicas(java.lang.Integer minReplicas);
    public java.lang.Boolean hasMinReplicas();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScaleTargetRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference getScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference buildScaleTargetRef();
    public A withScaleTargetRef(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference scaleTargetRef);
    public java.lang.Boolean hasScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReference item);
    public interface MetricsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1MetricSpecFluent<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.MetricsNested<N>> {

            public N and();
            public N endMetric();    }


    public interface ScaleTargetRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1CrossVersionObjectReferenceFluent<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> {

            public N and();
            public N endScaleTargetRef();    }


}
