package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1HorizontalPodAutoscalerSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<A> {

    private java.lang.Integer maxReplicas;
    private java.lang.Integer minReplicas;
    private io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder scaleTargetRef;
    private java.lang.Integer targetCPUUtilizationPercentage;

    public V1HorizontalPodAutoscalerSpecFluentImpl() {
    }

    public V1HorizontalPodAutoscalerSpecFluentImpl(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance) {
        this.withMaxReplicas(instance.getMaxReplicas());
        
        this.withMinReplicas(instance.getMinReplicas());
        
        this.withScaleTargetRef(instance.getScaleTargetRef());
        
        this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());
    }

    public java.lang.Integer getMaxReplicas() {
        return this.maxReplicas;
    }

    public A withMaxReplicas(java.lang.Integer maxReplicas) {
        this.maxReplicas=maxReplicas; return (A) this;
    }

    public java.lang.Boolean hasMaxReplicas() {
        return this.maxReplicas != null;
    }

    public java.lang.Integer getMinReplicas() {
        return this.minReplicas;
    }

    public A withMinReplicas(java.lang.Integer minReplicas) {
        this.minReplicas=minReplicas; return (A) this;
    }

    public java.lang.Boolean hasMinReplicas() {
        return this.minReplicas != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScaleTargetRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference getScaleTargetRef() {
        return this.scaleTargetRef!=null?this.scaleTargetRef.build():null;
    }

    public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference buildScaleTargetRef() {
        return this.scaleTargetRef!=null?this.scaleTargetRef.build():null;
    }

    public A withScaleTargetRef(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference scaleTargetRef) {
        _visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
        if (scaleTargetRef!=null){ this.scaleTargetRef= new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder(scaleTargetRef); _visitables.get("scaleTargetRef").add(this.scaleTargetRef);} return (A) this;
    }

    public java.lang.Boolean hasScaleTargetRef() {
        return this.scaleTargetRef != null;
    }

    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef() {
        return new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluentImpl.ScaleTargetRefNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item) {
        return new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluentImpl.ScaleTargetRefNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef() {
        return withNewScaleTargetRefLike(getScaleTargetRef());
    }

    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef() {
        return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item) {
        return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): item);
    }

    public java.lang.Integer getTargetCPUUtilizationPercentage() {
        return this.targetCPUUtilizationPercentage;
    }

    public A withTargetCPUUtilizationPercentage(java.lang.Integer targetCPUUtilizationPercentage) {
        this.targetCPUUtilizationPercentage=targetCPUUtilizationPercentage; return (A) this;
    }

    public java.lang.Boolean hasTargetCPUUtilizationPercentage() {
        return this.targetCPUUtilizationPercentage != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1HorizontalPodAutoscalerSpecFluentImpl that = (V1HorizontalPodAutoscalerSpecFluentImpl) o;
        if (maxReplicas != null ? !maxReplicas.equals(that.maxReplicas) :that.maxReplicas != null) return false;
        if (minReplicas != null ? !minReplicas.equals(that.minReplicas) :that.minReplicas != null) return false;
        if (scaleTargetRef != null ? !scaleTargetRef.equals(that.scaleTargetRef) :that.scaleTargetRef != null) return false;
        if (targetCPUUtilizationPercentage != null ? !targetCPUUtilizationPercentage.equals(that.targetCPUUtilizationPercentage) :that.targetCPUUtilizationPercentage != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(maxReplicas,  minReplicas,  scaleTargetRef,  targetCPUUtilizationPercentage,  super.hashCode());
    }

    public class ScaleTargetRefNestedImpl<N> extends io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> implements io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder builder;

            ScaleTargetRefNestedImpl(io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item) {
                this.builder = new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder(this, item);
                        
            }

            ScaleTargetRefNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) V1HorizontalPodAutoscalerSpecFluentImpl.this.withScaleTargetRef(builder.build());
            }

            public N endScaleTargetRef() {
                return and();
            }
    }


}
