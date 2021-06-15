package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1PodsMetricStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent<A> {

    private io.kubernetes.client.custom.Quantity currentAverageValue;
    private java.lang.String metricName;
    private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;

    public V2beta1PodsMetricStatusFluentImpl() {
    }

    public V2beta1PodsMetricStatusFluentImpl(io.kubernetes.client.openapi.models.V2beta1PodsMetricStatus instance) {
        this.withCurrentAverageValue(instance.getCurrentAverageValue());
        
        this.withMetricName(instance.getMetricName());
        
        this.withSelector(instance.getSelector());
    }

    public io.kubernetes.client.custom.Quantity getCurrentAverageValue() {
        return this.currentAverageValue;
    }

    public A withCurrentAverageValue(io.kubernetes.client.custom.Quantity currentAverageValue) {
        this.currentAverageValue=currentAverageValue; return (A) this;
    }

    public java.lang.Boolean hasCurrentAverageValue() {
        return this.currentAverageValue != null;
    }

    public A withNewCurrentAverageValue(java.lang.String value) {
        return (A)withCurrentAverageValue(new Quantity(value));
    }

    public java.lang.String getMetricName() {
        return this.metricName;
    }

    public A withMetricName(java.lang.String metricName) {
        this.metricName=metricName; return (A) this;
    }

    public java.lang.Boolean hasMetricName() {
        return this.metricName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMetricName instead.
     */
        public A withNewMetricName(java.lang.String original) {
        return (A)withMetricName(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
        return this.selector!=null?this.selector.build():null;
    }

    public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
        return this.selector!=null?this.selector.build():null;
    }

    public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
        _visitables.get("selector").remove(this.selector);
        if (selector!=null){ this.selector= new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} return (A) this;
    }

    public java.lang.Boolean hasSelector() {
        return this.selector != null;
    }

    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> withNewSelector() {
        return new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluentImpl.SelectorNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return new io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluentImpl.SelectorNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editSelector() {
        return withNewSelectorLike(getSelector());
    }

    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editOrNewSelector() {
        return withNewSelectorLike(getSelector() != null ? getSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2beta1PodsMetricStatusFluentImpl that = (V2beta1PodsMetricStatusFluentImpl) o;
        if (currentAverageValue != null ? !currentAverageValue.equals(that.currentAverageValue) :that.currentAverageValue != null) return false;
        if (metricName != null ? !metricName.equals(that.metricName) :that.metricName != null) return false;
        if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(currentAverageValue,  metricName,  selector,  super.hashCode());
    }

    public class SelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<N>> implements io.kubernetes.client.openapi.models.V2beta1PodsMetricStatusFluent.SelectorNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

            SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
                        
            }

            SelectorNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta1PodsMetricStatusFluentImpl.this.withSelector(builder.build());
            }

            public N endSelector() {
                return and();
            }
    }


}
