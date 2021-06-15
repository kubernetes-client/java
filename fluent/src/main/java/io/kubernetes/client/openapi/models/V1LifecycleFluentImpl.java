package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1LifecycleFluentImpl<A extends io.kubernetes.client.openapi.models.V1LifecycleFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1LifecycleFluent<A> {

    private io.kubernetes.client.openapi.models.V1HandlerBuilder postStart;
    private io.kubernetes.client.openapi.models.V1HandlerBuilder preStop;

    public V1LifecycleFluentImpl() {
    }

    public V1LifecycleFluentImpl(io.kubernetes.client.openapi.models.V1Lifecycle instance) {
        this.withPostStart(instance.getPostStart());
        
        this.withPreStop(instance.getPreStop());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPostStart instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1Handler getPostStart() {
        return this.postStart!=null?this.postStart.build():null;
    }

    public io.kubernetes.client.openapi.models.V1Handler buildPostStart() {
        return this.postStart!=null?this.postStart.build():null;
    }

    public A withPostStart(io.kubernetes.client.openapi.models.V1Handler postStart) {
        _visitables.get("postStart").remove(this.postStart);
        if (postStart!=null){ this.postStart= new io.kubernetes.client.openapi.models.V1HandlerBuilder(postStart); _visitables.get("postStart").add(this.postStart);} return (A) this;
    }

    public java.lang.Boolean hasPostStart() {
        return this.postStart != null;
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> withNewPostStart() {
        return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PostStartNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> withNewPostStartLike(io.kubernetes.client.openapi.models.V1Handler item) {
        return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PostStartNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editPostStart() {
        return withNewPostStartLike(getPostStart());
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editOrNewPostStart() {
        return withNewPostStartLike(getPostStart() != null ? getPostStart(): new io.kubernetes.client.openapi.models.V1HandlerBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<A> editOrNewPostStartLike(io.kubernetes.client.openapi.models.V1Handler item) {
        return withNewPostStartLike(getPostStart() != null ? getPostStart(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildPreStop instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1Handler getPreStop() {
        return this.preStop!=null?this.preStop.build():null;
    }

    public io.kubernetes.client.openapi.models.V1Handler buildPreStop() {
        return this.preStop!=null?this.preStop.build():null;
    }

    public A withPreStop(io.kubernetes.client.openapi.models.V1Handler preStop) {
        _visitables.get("preStop").remove(this.preStop);
        if (preStop!=null){ this.preStop= new io.kubernetes.client.openapi.models.V1HandlerBuilder(preStop); _visitables.get("preStop").add(this.preStop);} return (A) this;
    }

    public java.lang.Boolean hasPreStop() {
        return this.preStop != null;
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> withNewPreStop() {
        return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PreStopNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> withNewPreStopLike(io.kubernetes.client.openapi.models.V1Handler item) {
        return new io.kubernetes.client.openapi.models.V1LifecycleFluentImpl.PreStopNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editPreStop() {
        return withNewPreStopLike(getPreStop());
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editOrNewPreStop() {
        return withNewPreStopLike(getPreStop() != null ? getPreStop(): new io.kubernetes.client.openapi.models.V1HandlerBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<A> editOrNewPreStopLike(io.kubernetes.client.openapi.models.V1Handler item) {
        return withNewPreStopLike(getPreStop() != null ? getPreStop(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1LifecycleFluentImpl that = (V1LifecycleFluentImpl) o;
        if (postStart != null ? !postStart.equals(that.postStart) :that.postStart != null) return false;
        if (preStop != null ? !preStop.equals(that.preStop) :that.preStop != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(postStart,  preStop,  super.hashCode());
    }

    public class PostStartNestedImpl<N> extends io.kubernetes.client.openapi.models.V1HandlerFluentImpl<io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<N>> implements io.kubernetes.client.openapi.models.V1LifecycleFluent.PostStartNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1HandlerBuilder builder;

            PostStartNestedImpl(io.kubernetes.client.openapi.models.V1Handler item) {
                this.builder = new io.kubernetes.client.openapi.models.V1HandlerBuilder(this, item);
                        
            }

            PostStartNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1HandlerBuilder(this);
                        
            }

            public N and() {
                return (N) V1LifecycleFluentImpl.this.withPostStart(builder.build());
            }

            public N endPostStart() {
                return and();
            }
    }


    public class PreStopNestedImpl<N> extends io.kubernetes.client.openapi.models.V1HandlerFluentImpl<io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<N>> implements io.kubernetes.client.openapi.models.V1LifecycleFluent.PreStopNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1HandlerBuilder builder;

            PreStopNestedImpl(io.kubernetes.client.openapi.models.V1Handler item) {
                this.builder = new io.kubernetes.client.openapi.models.V1HandlerBuilder(this, item);
                        
            }

            PreStopNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1HandlerBuilder(this);
                        
            }

            public N and() {
                return (N) V1LifecycleFluentImpl.this.withPreStop(builder.build());
            }

            public N endPreStop() {
                return and();
            }
    }


}
