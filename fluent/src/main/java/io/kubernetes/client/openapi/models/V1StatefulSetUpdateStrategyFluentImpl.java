package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1StatefulSetUpdateStrategyFluentImpl<A extends io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent<A> {

    private io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyBuilder rollingUpdate;
    private java.lang.String type;

    public V1StatefulSetUpdateStrategyFluentImpl() {
    }

    public V1StatefulSetUpdateStrategyFluentImpl(io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy instance) {
        this.withRollingUpdate(instance.getRollingUpdate());
        
        this.withType(instance.getType());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRollingUpdate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy getRollingUpdate() {
        return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy buildRollingUpdate() {
        return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy rollingUpdate) {
        _visitables.get("rollingUpdate").remove(this.rollingUpdate);
        if (rollingUpdate!=null){ this.rollingUpdate= new io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyBuilder(rollingUpdate); _visitables.get("rollingUpdate").add(this.rollingUpdate);} return (A) this;
    }

    public java.lang.Boolean hasRollingUpdate() {
        return this.rollingUpdate != null;
    }

    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate() {
        return new io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy item) {
        return new io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluentImpl.RollingUpdateNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate() {
        return withNewRollingUpdateLike(getRollingUpdate());
    }

    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate() {
        return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy item) {
        return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): item);
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
        V1StatefulSetUpdateStrategyFluentImpl that = (V1StatefulSetUpdateStrategyFluentImpl) o;
        if (rollingUpdate != null ? !rollingUpdate.equals(that.rollingUpdate) :that.rollingUpdate != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(rollingUpdate,  type,  super.hashCode());
    }

    public class RollingUpdateNestedImpl<N> extends io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyFluentImpl<io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>> implements io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluent.RollingUpdateNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyBuilder builder;

            RollingUpdateNestedImpl(io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy item) {
                this.builder = new io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyBuilder(this, item);
                        
            }

            RollingUpdateNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyBuilder(this);
                        
            }

            public N and() {
                return (N) V1StatefulSetUpdateStrategyFluentImpl.this.withRollingUpdate(builder.build());
            }

            public N endRollingUpdate() {
                return and();
            }
    }


}
