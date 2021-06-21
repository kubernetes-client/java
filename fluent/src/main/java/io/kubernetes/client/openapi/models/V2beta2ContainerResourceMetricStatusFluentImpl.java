package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta2ContainerResourceMetricStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent<A> {

    private java.lang.String container;
    private io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder current;
    private java.lang.String name;

    public V2beta2ContainerResourceMetricStatusFluentImpl() {
    }

    public V2beta2ContainerResourceMetricStatusFluentImpl(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus instance) {
        this.withContainer(instance.getContainer());
        
        this.withCurrent(instance.getCurrent());
        
        this.withName(instance.getName());
    }

    public java.lang.String getContainer() {
        return this.container;
    }

    public A withContainer(java.lang.String container) {
        this.container=container; return (A) this;
    }

    public java.lang.Boolean hasContainer() {
        return this.container != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContainer instead.
     */
        public A withNewContainer(java.lang.String original) {
        return (A)withContainer(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildCurrent instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus getCurrent() {
        return this.current!=null?this.current.build():null;
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricValueStatus buildCurrent() {
        return this.current!=null?this.current.build():null;
    }

    public A withCurrent(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus current) {
        _visitables.get("current").remove(this.current);
        if (current!=null){ this.current= new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(current); _visitables.get("current").add(this.current);} return (A) this;
    }

    public java.lang.Boolean hasCurrent() {
        return this.current != null;
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrent() {
        return new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluentImpl.CurrentNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> withNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
        return new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluentImpl.CurrentNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editCurrent() {
        return withNewCurrentLike(getCurrent());
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrent() {
        return withNewCurrentLike(getCurrent() != null ? getCurrent(): new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<A> editOrNewCurrentLike(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
        return withNewCurrentLike(getCurrent() != null ? getCurrent(): item);
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2beta2ContainerResourceMetricStatusFluentImpl that = (V2beta2ContainerResourceMetricStatusFluentImpl) o;
        if (container != null ? !container.equals(that.container) :that.container != null) return false;
        if (current != null ? !current.equals(that.current) :that.current != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(container,  current,  name,  super.hashCode());
    }

    public class CurrentNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2MetricValueStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<N>> implements io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluent.CurrentNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder builder;

            CurrentNestedImpl(io.kubernetes.client.openapi.models.V2beta2MetricValueStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(this, item);
                        
            }

            CurrentNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricValueStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta2ContainerResourceMetricStatusFluentImpl.this.withCurrent(builder.build());
            }

            public N endCurrent() {
                return and();
            }
    }


}
