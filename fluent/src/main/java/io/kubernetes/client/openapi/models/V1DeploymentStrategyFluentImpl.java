package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1DeploymentStrategyFluentImpl<A extends io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<A> {

    private io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder rollingUpdate;
    private java.lang.String type;

    public V1DeploymentStrategyFluentImpl() {
    }

    public V1DeploymentStrategyFluentImpl(io.kubernetes.client.openapi.models.V1DeploymentStrategy instance) {
        this.withRollingUpdate(instance.getRollingUpdate());
        
        this.withType(instance.getType());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRollingUpdate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment getRollingUpdate() {
        return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public io.kubernetes.client.openapi.models.V1RollingUpdateDeployment buildRollingUpdate() {
        return this.rollingUpdate!=null?this.rollingUpdate.build():null;
    }

    public A withRollingUpdate(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment rollingUpdate) {
        _visitables.get("rollingUpdate").remove(this.rollingUpdate);
        if (rollingUpdate!=null){ this.rollingUpdate= new io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder(rollingUpdate); _visitables.get("rollingUpdate").add(this.rollingUpdate);} return (A) this;
    }

    public java.lang.Boolean hasRollingUpdate() {
        return this.rollingUpdate != null;
    }

    public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate() {
        return new io.kubernetes.client.openapi.models.V1DeploymentStrategyFluentImpl.RollingUpdateNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item) {
        return new io.kubernetes.client.openapi.models.V1DeploymentStrategyFluentImpl.RollingUpdateNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editRollingUpdate() {
        return withNewRollingUpdateLike(getRollingUpdate());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate() {
        return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate(): new io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item) {
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
        V1DeploymentStrategyFluentImpl that = (V1DeploymentStrategyFluentImpl) o;
        if (rollingUpdate != null ? !rollingUpdate.equals(that.rollingUpdate) :that.rollingUpdate != null) return false;
        if (type != null ? !type.equals(that.type) :that.type != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(rollingUpdate,  type,  super.hashCode());
    }

    public class RollingUpdateNestedImpl<N> extends io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentFluentImpl<io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<N>> implements io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent.RollingUpdateNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder builder;

            RollingUpdateNestedImpl(io.kubernetes.client.openapi.models.V1RollingUpdateDeployment item) {
                this.builder = new io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder(this, item);
                        
            }

            RollingUpdateNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1RollingUpdateDeploymentBuilder(this);
                        
            }

            public N and() {
                return (N) V1DeploymentStrategyFluentImpl.this.withRollingUpdate(builder.build());
            }

            public N endRollingUpdate() {
                return and();
            }
    }


}
