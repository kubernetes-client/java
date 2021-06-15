package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1TopologySpreadConstraintFluentImpl<A extends io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<A> {

    private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder labelSelector;
    private java.lang.Integer maxSkew;
    private java.lang.String topologyKey;
    private java.lang.String whenUnsatisfiable;

    public V1TopologySpreadConstraintFluentImpl() {
    }

    public V1TopologySpreadConstraintFluentImpl(io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance) {
        this.withLabelSelector(instance.getLabelSelector());
        
        this.withMaxSkew(instance.getMaxSkew());
        
        this.withTopologyKey(instance.getTopologyKey());
        
        this.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildLabelSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector() {
        return this.labelSelector!=null?this.labelSelector.build():null;
    }

    public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector() {
        return this.labelSelector!=null?this.labelSelector.build():null;
    }

    public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector) {
        _visitables.get("labelSelector").remove(this.labelSelector);
        if (labelSelector!=null){ this.labelSelector= new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(labelSelector); _visitables.get("labelSelector").add(this.labelSelector);} return (A) this;
    }

    public java.lang.Boolean hasLabelSelector() {
        return this.labelSelector != null;
    }

    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelector() {
        return new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluentImpl.LabelSelectorNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return new io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluentImpl.LabelSelectorNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editLabelSelector() {
        return withNewLabelSelectorLike(getLabelSelector());
    }

    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelector() {
        return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A> editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector(): item);
    }

    public java.lang.Integer getMaxSkew() {
        return this.maxSkew;
    }

    public A withMaxSkew(java.lang.Integer maxSkew) {
        this.maxSkew=maxSkew; return (A) this;
    }

    public java.lang.Boolean hasMaxSkew() {
        return this.maxSkew != null;
    }

    public java.lang.String getTopologyKey() {
        return this.topologyKey;
    }

    public A withTopologyKey(java.lang.String topologyKey) {
        this.topologyKey=topologyKey; return (A) this;
    }

    public java.lang.Boolean hasTopologyKey() {
        return this.topologyKey != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withTopologyKey instead.
     */
        public A withNewTopologyKey(java.lang.String original) {
        return (A)withTopologyKey(new String(original));
    }

    public java.lang.String getWhenUnsatisfiable() {
        return this.whenUnsatisfiable;
    }

    public A withWhenUnsatisfiable(java.lang.String whenUnsatisfiable) {
        this.whenUnsatisfiable=whenUnsatisfiable; return (A) this;
    }

    public java.lang.Boolean hasWhenUnsatisfiable() {
        return this.whenUnsatisfiable != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withWhenUnsatisfiable instead.
     */
        public A withNewWhenUnsatisfiable(java.lang.String original) {
        return (A)withWhenUnsatisfiable(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1TopologySpreadConstraintFluentImpl that = (V1TopologySpreadConstraintFluentImpl) o;
        if (labelSelector != null ? !labelSelector.equals(that.labelSelector) :that.labelSelector != null) return false;
        if (maxSkew != null ? !maxSkew.equals(that.maxSkew) :that.maxSkew != null) return false;
        if (topologyKey != null ? !topologyKey.equals(that.topologyKey) :that.topologyKey != null) return false;
        if (whenUnsatisfiable != null ? !whenUnsatisfiable.equals(that.whenUnsatisfiable) :that.whenUnsatisfiable != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(labelSelector,  maxSkew,  topologyKey,  whenUnsatisfiable,  super.hashCode());
    }

    public class LabelSelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<N>> implements io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

            LabelSelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
                        
            }

            LabelSelectorNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V1TopologySpreadConstraintFluentImpl.this.withLabelSelector(builder.build());
            }

            public N endLabelSelector() {
                return and();
            }
    }


}
