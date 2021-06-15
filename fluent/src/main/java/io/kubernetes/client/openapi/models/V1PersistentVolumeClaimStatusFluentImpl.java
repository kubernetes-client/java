package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class V1PersistentVolumeClaimStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent<A> {

    private java.util.List<java.lang.String> accessModes;
    private java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> capacity;
    private java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> conditions;
    private java.lang.String phase;

    public V1PersistentVolumeClaimStatusFluentImpl() {
    }

    public V1PersistentVolumeClaimStatusFluentImpl(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus instance) {
        this.withAccessModes(instance.getAccessModes());
        
        this.withCapacity(instance.getCapacity());
        
        this.withConditions(instance.getConditions());
        
        this.withPhase(instance.getPhase());
    }

    public A addToAccessModes(int index,java.lang.String item) {
        if (this.accessModes == null) {this.accessModes = new java.util.ArrayList<java.lang.String>();}
        this.accessModes.add(index, item);
        return (A)this;
    }

    public A setToAccessModes(int index,java.lang.String item) {
        if (this.accessModes == null) {this.accessModes = new java.util.ArrayList<java.lang.String>();}
        this.accessModes.set(index, item); return (A)this;
    }

    public A addToAccessModes(java.lang.String... items) {
        if (this.accessModes == null) {this.accessModes = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A addAllToAccessModes(java.util.Collection<java.lang.String> items) {
        if (this.accessModes == null) {this.accessModes = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.accessModes.add(item);} return (A)this;
    }

    public A removeFromAccessModes(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getAccessModes() {
        return this.accessModes;
    }

    public java.lang.String getAccessMode(int index) {
        return this.accessModes.get(index);
    }

    public java.lang.String getFirstAccessMode() {
        return this.accessModes.get(0);
    }

    public java.lang.String getLastAccessMode() {
        return this.accessModes.get(accessModes.size() - 1);
    }

    public java.lang.String getMatchingAccessMode(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: accessModes) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingAccessMode(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: accessModes) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withAccessModes(java.util.List<java.lang.String> accessModes) {
        if (this.accessModes != null) { _visitables.get("accessModes").removeAll(this.accessModes);}
        if (accessModes != null) {this.accessModes = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : accessModes){this.addToAccessModes(item);}} else { this.accessModes = null;} return (A) this;
    }

    public A withAccessModes(java.lang.String... accessModes) {
        if (this.accessModes != null) {this.accessModes.clear();}
        if (accessModes != null) {for (java.lang.String item :accessModes){ this.addToAccessModes(item);}} return (A) this;
    }

    public java.lang.Boolean hasAccessModes() {
        return accessModes != null && !accessModes.isEmpty();
    }

    public A addNewAccessMode(java.lang.String original) {
        return (A)addToAccessModes(new String(original));
    }

    public A addToCapacity(java.lang.String key,io.kubernetes.client.custom.Quantity value) {
        if(this.capacity == null && key != null && value != null) { this.capacity = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(); }
        if(key != null && value != null) {this.capacity.put(key, value);} return (A)this;
    }

    public A addToCapacity(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
        if(this.capacity == null && map != null) { this.capacity = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(); }
        if(map != null) { this.capacity.putAll(map);} return (A)this;
    }

    public A removeFromCapacity(java.lang.String key) {
        if(this.capacity == null) { return (A) this; }
        if(key != null && this.capacity != null) {this.capacity.remove(key);} return (A)this;
    }

    public A removeFromCapacity(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
        if(this.capacity == null) { return (A) this; }
        if(map != null) { for(Object key : map.keySet()) {if (this.capacity != null){this.capacity.remove(key);}}} return (A)this;
    }

    public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getCapacity() {
        return this.capacity;
    }

    public <K,V>A withCapacity(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> capacity) {
        if (capacity == null) { this.capacity =  null;} else {this.capacity = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(capacity);} return (A) this;
    }

    public java.lang.Boolean hasCapacity() {
        return this.capacity != null;
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... items) {
        for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> items) {
        for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : items) {io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
        return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
        return new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<conditions.size();i++) { 
        if (predicate.test(conditions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public java.lang.String getPhase() {
        return this.phase;
    }

    public A withPhase(java.lang.String phase) {
        this.phase=phase; return (A) this;
    }

    public java.lang.Boolean hasPhase() {
        return this.phase != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPhase instead.
     */
        public A withNewPhase(java.lang.String original) {
        return (A)withPhase(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1PersistentVolumeClaimStatusFluentImpl that = (V1PersistentVolumeClaimStatusFluentImpl) o;
        if (accessModes != null ? !accessModes.equals(that.accessModes) :that.accessModes != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) :that.capacity != null) return false;
        if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
        if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(accessModes,  capacity,  conditions,  phase,  super.hashCode());
    }

    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluentImpl<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1PersistentVolumeClaimStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


}
