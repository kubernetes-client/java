package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

public class V1CustomResourceDefinitionStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent<A> {

    private io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder acceptedNames;
    private java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder> conditions;
    private java.util.List<java.lang.String> storedVersions;

    public V1CustomResourceDefinitionStatusFluentImpl() {
    }

    public V1CustomResourceDefinitionStatusFluentImpl(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus instance) {
        this.withAcceptedNames(instance.getAcceptedNames());
        
        this.withConditions(instance.getConditions());
        
        this.withStoredVersions(instance.getStoredVersions());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAcceptedNames instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames getAcceptedNames() {
        return this.acceptedNames!=null?this.acceptedNames.build():null;
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames buildAcceptedNames() {
        return this.acceptedNames!=null?this.acceptedNames.build():null;
    }

    public A withAcceptedNames(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames acceptedNames) {
        _visitables.get("acceptedNames").remove(this.acceptedNames);
        if (acceptedNames!=null){ this.acceptedNames= new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder(acceptedNames); _visitables.get("acceptedNames").add(this.acceptedNames);} return (A) this;
    }

    public java.lang.Boolean hasAcceptedNames() {
        return this.acceptedNames != null;
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNames() {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluentImpl.AcceptedNamesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluentImpl.AcceptedNamesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editAcceptedNames() {
        return withNewAcceptedNamesLike(getAcceptedNames());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNames() {
        return withNewAcceptedNamesLike(getAcceptedNames() != null ? getAcceptedNames(): new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNamesLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item) {
        return withNewAcceptedNamesLike(getAcceptedNames() != null ? getAcceptedNames(): item);
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition> items) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item : items) {io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder = each.next();
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
        public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item) {
        return new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<conditions.size();i++) { 
        if (predicate.test(conditions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public A addToStoredVersions(int index,java.lang.String item) {
        if (this.storedVersions == null) {this.storedVersions = new java.util.ArrayList<java.lang.String>();}
        this.storedVersions.add(index, item);
        return (A)this;
    }

    public A setToStoredVersions(int index,java.lang.String item) {
        if (this.storedVersions == null) {this.storedVersions = new java.util.ArrayList<java.lang.String>();}
        this.storedVersions.set(index, item); return (A)this;
    }

    public A addToStoredVersions(java.lang.String... items) {
        if (this.storedVersions == null) {this.storedVersions = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.storedVersions.add(item);} return (A)this;
    }

    public A addAllToStoredVersions(java.util.Collection<java.lang.String> items) {
        if (this.storedVersions == null) {this.storedVersions = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.storedVersions.add(item);} return (A)this;
    }

    public A removeFromStoredVersions(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.storedVersions!= null){ this.storedVersions.remove(item);}} return (A)this;
    }

    public A removeAllFromStoredVersions(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.storedVersions!= null){ this.storedVersions.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getStoredVersions() {
        return this.storedVersions;
    }

    public java.lang.String getStoredVersion(int index) {
        return this.storedVersions.get(index);
    }

    public java.lang.String getFirstStoredVersion() {
        return this.storedVersions.get(0);
    }

    public java.lang.String getLastStoredVersion() {
        return this.storedVersions.get(storedVersions.size() - 1);
    }

    public java.lang.String getMatchingStoredVersion(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: storedVersions) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingStoredVersion(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: storedVersions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withStoredVersions(java.util.List<java.lang.String> storedVersions) {
        if (this.storedVersions != null) { _visitables.get("storedVersions").removeAll(this.storedVersions);}
        if (storedVersions != null) {this.storedVersions = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : storedVersions){this.addToStoredVersions(item);}} else { this.storedVersions = null;} return (A) this;
    }

    public A withStoredVersions(java.lang.String... storedVersions) {
        if (this.storedVersions != null) {this.storedVersions.clear();}
        if (storedVersions != null) {for (java.lang.String item :storedVersions){ this.addToStoredVersions(item);}} return (A) this;
    }

    public java.lang.Boolean hasStoredVersions() {
        return storedVersions != null && !storedVersions.isEmpty();
    }

    public A addNewStoredVersion(java.lang.String original) {
        return (A)addToStoredVersions(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1CustomResourceDefinitionStatusFluentImpl that = (V1CustomResourceDefinitionStatusFluentImpl) o;
        if (acceptedNames != null ? !acceptedNames.equals(that.acceptedNames) :that.acceptedNames != null) return false;
        if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
        if (storedVersions != null ? !storedVersions.equals(that.storedVersions) :that.storedVersions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(acceptedNames,  conditions,  storedVersions,  super.hashCode());
    }

    public class AcceptedNamesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder builder;

            AcceptedNamesNestedImpl(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames item) {
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder(this, item);
                        
            }

            AcceptedNamesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesBuilder(this);
                        
            }

            public N and() {
                return (N) V1CustomResourceDefinitionStatusFluentImpl.this.withAcceptedNames(builder.build());
            }

            public N endAcceptedNames() {
                return and();
            }
    }


    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionFluentImpl<io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1CustomResourceDefinitionStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


}
