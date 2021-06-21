package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1beta1CSINodeDriverFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent<A> {

    private io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder allocatable;
    private java.lang.String name;
    private java.lang.String nodeID;
    private java.util.List<java.lang.String> topologyKeys;

    public V1beta1CSINodeDriverFluentImpl() {
    }

    public V1beta1CSINodeDriverFluentImpl(io.kubernetes.client.openapi.models.V1beta1CSINodeDriver instance) {
        this.withAllocatable(instance.getAllocatable());
        
        this.withName(instance.getName());
        
        this.withNodeID(instance.getNodeID());
        
        this.withTopologyKeys(instance.getTopologyKeys());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAllocatable instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources getAllocatable() {
        return this.allocatable!=null?this.allocatable.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources buildAllocatable() {
        return this.allocatable!=null?this.allocatable.build():null;
    }

    public A withAllocatable(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources allocatable) {
        _visitables.get("allocatable").remove(this.allocatable);
        if (allocatable!=null){ this.allocatable= new io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder(allocatable); _visitables.get("allocatable").add(this.allocatable);} return (A) this;
    }

    public java.lang.Boolean hasAllocatable() {
        return this.allocatable != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatable() {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluentImpl.AllocatableNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent.AllocatableNested<A> withNewAllocatableLike(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources item) {
        return new io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluentImpl.AllocatableNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent.AllocatableNested<A> editAllocatable() {
        return withNewAllocatableLike(getAllocatable());
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatable() {
        return withNewAllocatableLike(getAllocatable() != null ? getAllocatable(): new io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent.AllocatableNested<A> editOrNewAllocatableLike(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources item) {
        return withNewAllocatableLike(getAllocatable() != null ? getAllocatable(): item);
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

    public java.lang.String getNodeID() {
        return this.nodeID;
    }

    public A withNodeID(java.lang.String nodeID) {
        this.nodeID=nodeID; return (A) this;
    }

    public java.lang.Boolean hasNodeID() {
        return this.nodeID != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withNodeID instead.
     */
        public A withNewNodeID(java.lang.String original) {
        return (A)withNodeID(new String(original));
    }

    public A addToTopologyKeys(int index,java.lang.String item) {
        if (this.topologyKeys == null) {this.topologyKeys = new java.util.ArrayList<java.lang.String>();}
        this.topologyKeys.add(index, item);
        return (A)this;
    }

    public A setToTopologyKeys(int index,java.lang.String item) {
        if (this.topologyKeys == null) {this.topologyKeys = new java.util.ArrayList<java.lang.String>();}
        this.topologyKeys.set(index, item); return (A)this;
    }

    public A addToTopologyKeys(java.lang.String... items) {
        if (this.topologyKeys == null) {this.topologyKeys = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.topologyKeys.add(item);} return (A)this;
    }

    public A addAllToTopologyKeys(java.util.Collection<java.lang.String> items) {
        if (this.topologyKeys == null) {this.topologyKeys = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.topologyKeys.add(item);} return (A)this;
    }

    public A removeFromTopologyKeys(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.topologyKeys!= null){ this.topologyKeys.remove(item);}} return (A)this;
    }

    public A removeAllFromTopologyKeys(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.topologyKeys!= null){ this.topologyKeys.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getTopologyKeys() {
        return this.topologyKeys;
    }

    public java.lang.String getTopologyKey(int index) {
        return this.topologyKeys.get(index);
    }

    public java.lang.String getFirstTopologyKey() {
        return this.topologyKeys.get(0);
    }

    public java.lang.String getLastTopologyKey() {
        return this.topologyKeys.get(topologyKeys.size() - 1);
    }

    public java.lang.String getMatchingTopologyKey(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: topologyKeys) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingTopologyKey(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: topologyKeys) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withTopologyKeys(java.util.List<java.lang.String> topologyKeys) {
        if (this.topologyKeys != null) { _visitables.get("topologyKeys").removeAll(this.topologyKeys);}
        if (topologyKeys != null) {this.topologyKeys = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : topologyKeys){this.addToTopologyKeys(item);}} else { this.topologyKeys = null;} return (A) this;
    }

    public A withTopologyKeys(java.lang.String... topologyKeys) {
        if (this.topologyKeys != null) {this.topologyKeys.clear();}
        if (topologyKeys != null) {for (java.lang.String item :topologyKeys){ this.addToTopologyKeys(item);}} return (A) this;
    }

    public java.lang.Boolean hasTopologyKeys() {
        return topologyKeys != null && !topologyKeys.isEmpty();
    }

    public A addNewTopologyKey(java.lang.String original) {
        return (A)addToTopologyKeys(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1CSINodeDriverFluentImpl that = (V1beta1CSINodeDriverFluentImpl) o;
        if (allocatable != null ? !allocatable.equals(that.allocatable) :that.allocatable != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (nodeID != null ? !nodeID.equals(that.nodeID) :that.nodeID != null) return false;
        if (topologyKeys != null ? !topologyKeys.equals(that.topologyKeys) :that.topologyKeys != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(allocatable,  name,  nodeID,  topologyKeys,  super.hashCode());
    }

    public class AllocatableNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesFluentImpl<io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent.AllocatableNested<N>> implements io.kubernetes.client.openapi.models.V1beta1CSINodeDriverFluent.AllocatableNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder builder;

            AllocatableNestedImpl(io.kubernetes.client.openapi.models.V1beta1VolumeNodeResources item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder(this, item);
                        
            }

            AllocatableNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1VolumeNodeResourcesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1CSINodeDriverFluentImpl.this.withAllocatable(builder.build());
            }

            public N endAllocatable() {
                return and();
            }
    }


}
