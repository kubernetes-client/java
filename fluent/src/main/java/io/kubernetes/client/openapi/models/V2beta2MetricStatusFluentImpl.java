package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

public class V2beta2MetricStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent<A> {

    private io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder containerResource;
    private io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusBuilder external;
    private io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder _object;
    private io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder pods;
    private io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder resource;
    private java.lang.String type;

    public V2beta2MetricStatusFluentImpl() {
    }

    public V2beta2MetricStatusFluentImpl(io.kubernetes.client.openapi.models.V2beta2MetricStatus instance) {
        this.withContainerResource(instance.getContainerResource());
        
        this.withExternal(instance.getExternal());
        
        this.withObject(instance.getObject());
        
        this.withPods(instance.getPods());
        
        this.withResource(instance.getResource());
        
        this.withType(instance.getType());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildContainerResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus getContainerResource() {
        return this.containerResource!=null?this.containerResource.build():null;
    }

    public io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus buildContainerResource() {
        return this.containerResource!=null?this.containerResource.build():null;
    }

    public A withContainerResource(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus containerResource) {
        _visitables.get("containerResource").remove(this.containerResource);
        if (containerResource!=null){ this.containerResource= new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder(containerResource); _visitables.get("containerResource").add(this.containerResource);} return (A) this;
    }

    public java.lang.Boolean hasContainerResource() {
        return this.containerResource != null;
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResource() {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ContainerResourceNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> withNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus item) {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ContainerResourceNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> editContainerResource() {
        return withNewContainerResourceLike(getContainerResource());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResource() {
        return withNewContainerResourceLike(getContainerResource() != null ? getContainerResource(): new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<A> editOrNewContainerResourceLike(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus item) {
        return withNewContainerResourceLike(getContainerResource() != null ? getContainerResource(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildExternal instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus getExternal() {
        return this.external!=null?this.external.build():null;
    }

    public io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus buildExternal() {
        return this.external!=null?this.external.build():null;
    }

    public A withExternal(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus external) {
        _visitables.get("external").remove(this.external);
        if (external!=null){ this.external= new io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusBuilder(external); _visitables.get("external").add(this.external);} return (A) this;
    }

    public java.lang.Boolean hasExternal() {
        return this.external != null;
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> withNewExternal() {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ExternalNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> withNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus item) {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ExternalNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> editExternal() {
        return withNewExternalLike(getExternal());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> editOrNewExternal() {
        return withNewExternalLike(getExternal() != null ? getExternal(): new io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<A> editOrNewExternalLike(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus item) {
        return withNewExternalLike(getExternal() != null ? getExternal(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildObject instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus getObject() {
        return this._object!=null?this._object.build():null;
    }

    public io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus buildObject() {
        return this._object!=null?this._object.build():null;
    }

    public A withObject(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus _object) {
        _visitables.get("_object").remove(this._object);
        if (_object!=null){ this._object= new io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder(_object); _visitables.get("_object").add(this._object);} return (A) this;
    }

    public java.lang.Boolean hasObject() {
        return this._object != null;
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> withNewObject() {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ObjectNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> withNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus item) {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ObjectNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> editObject() {
        return withNewObjectLike(getObject());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> editOrNewObject() {
        return withNewObjectLike(getObject() != null ? getObject(): new io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<A> editOrNewObjectLike(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus item) {
        return withNewObjectLike(getObject() != null ? getObject(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPods instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus getPods() {
        return this.pods!=null?this.pods.build():null;
    }

    public io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus buildPods() {
        return this.pods!=null?this.pods.build():null;
    }

    public A withPods(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus pods) {
        _visitables.get("pods").remove(this.pods);
        if (pods!=null){ this.pods= new io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder(pods); _visitables.get("pods").add(this.pods);} return (A) this;
    }

    public java.lang.Boolean hasPods() {
        return this.pods != null;
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> withNewPods() {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.PodsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> withNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus item) {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.PodsNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> editPods() {
        return withNewPodsLike(getPods());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> editOrNewPods() {
        return withNewPodsLike(getPods() != null ? getPods(): new io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<A> editOrNewPodsLike(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus item) {
        return withNewPodsLike(getPods() != null ? getPods(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResource instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus getResource() {
        return this.resource!=null?this.resource.build():null;
    }

    public io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus buildResource() {
        return this.resource!=null?this.resource.build():null;
    }

    public A withResource(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus resource) {
        _visitables.get("resource").remove(this.resource);
        if (resource!=null){ this.resource= new io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder(resource); _visitables.get("resource").add(this.resource);} return (A) this;
    }

    public java.lang.Boolean hasResource() {
        return this.resource != null;
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> withNewResource() {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ResourceNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> withNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus item) {
        return new io.kubernetes.client.openapi.models.V2beta2MetricStatusFluentImpl.ResourceNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> editResource() {
        return withNewResourceLike(getResource());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> editOrNewResource() {
        return withNewResourceLike(getResource() != null ? getResource(): new io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<A> editOrNewResourceLike(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus item) {
        return withNewResourceLike(getResource() != null ? getResource(): item);
    }

    public java.lang.String getType() {
        return this.type;
    }

    public A withType(java.lang.String type) {
        this.type=type; return (A) this;
    }

    public java.lang.Boolean hasType() {
        return this.type != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withType instead.
     */
        public A withNewType(java.lang.String original) {
        return (A)withType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2beta2MetricStatusFluentImpl that = (V2beta2MetricStatusFluentImpl) o;
        if (containerResource != null ? !containerResource.equals(that.containerResource) :that.containerResource != null) return false;
        if (external != null ? !external.equals(that.external) :that.external != null) return false;
        if (_object != null ? !_object.equals(that._object) :that._object != null) return false;
        if (pods != null ? !pods.equals(that.pods) :that.pods != null) return false;
        if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(containerResource,  external,  _object,  pods,  resource,  type,  super.hashCode());
    }

    public class ContainerResourceNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<N>> implements io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ContainerResourceNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder builder;

            ContainerResourceNestedImpl(io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder(this, item);
                        
            }

            ContainerResourceNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ContainerResourceMetricStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta2MetricStatusFluentImpl.this.withContainerResource(builder.build());
            }

            public N endContainerResource() {
                return and();
            }
    }


    public class ExternalNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<N>> implements io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ExternalNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusBuilder builder;

            ExternalNestedImpl(io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusBuilder(this, item);
                        
            }

            ExternalNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ExternalMetricStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta2MetricStatusFluentImpl.this.withExternal(builder.build());
            }

            public N endExternal() {
                return and();
            }
    }


    public class ObjectNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<N>> implements io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ObjectNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder builder;

            ObjectNestedImpl(io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder(this, item);
                        
            }

            ObjectNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ObjectMetricStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta2MetricStatusFluentImpl.this.withObject(builder.build());
            }

            public N endObject() {
                return and();
            }
    }


    public class PodsNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<N>> implements io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.PodsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder builder;

            PodsNestedImpl(io.kubernetes.client.openapi.models.V2beta2PodsMetricStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder(this, item);
                        
            }

            PodsNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2PodsMetricStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta2MetricStatusFluentImpl.this.withPods(builder.build());
            }

            public N endPods() {
                return and();
            }
    }


    public class ResourceNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<N>> implements io.kubernetes.client.openapi.models.V2beta2MetricStatusFluent.ResourceNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder builder;

            ResourceNestedImpl(io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatus item) {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder(this, item);
                        
            }

            ResourceNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V2beta2ResourceMetricStatusBuilder(this);
                        
            }

            public N and() {
                return (N) V2beta2MetricStatusFluentImpl.this.withResource(builder.build());
            }

            public N endResource() {
                return and();
            }
    }


}
