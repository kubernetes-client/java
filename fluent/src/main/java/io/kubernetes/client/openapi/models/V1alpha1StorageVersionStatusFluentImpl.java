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

public class V1alpha1StorageVersionStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent<A> {

    private java.lang.String commonEncodingVersion;
    private java.util.List<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> conditions;
    private java.util.List<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder> storageVersions;

    public V1alpha1StorageVersionStatusFluentImpl() {
    }

    public V1alpha1StorageVersionStatusFluentImpl(io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus instance) {
        this.withCommonEncodingVersion(instance.getCommonEncodingVersion());
        
        this.withConditions(instance.getConditions());
        
        this.withStorageVersions(instance.getStorageVersions());
    }

    public java.lang.String getCommonEncodingVersion() {
        return this.commonEncodingVersion;
    }

    public A withCommonEncodingVersion(java.lang.String commonEncodingVersion) {
        this.commonEncodingVersion=commonEncodingVersion; return (A) this;
    }

    public java.lang.Boolean hasCommonEncodingVersion() {
        return this.commonEncodingVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withCommonEncodingVersion instead.
     */
        public A withNewCommonEncodingVersion(java.lang.String original) {
        return (A)withCommonEncodingVersion(new String(original));
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item : items) {io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item : items) {io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items) {
        for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item : items) {io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition> items) {
        for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item : items) {io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder = each.next();
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
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item) {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item) {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<conditions.size();i++) { 
        if (predicate.test(conditions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public A addToStorageVersions(int index,io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item) {
        if (this.storageVersions == null) {this.storageVersions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").add(index >= 0 ? index : _visitables.get("storageVersions").size(), builder);this.storageVersions.add(index >= 0 ? index : storageVersions.size(), builder); return (A)this;
    }

    public A setToStorageVersions(int index,io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item) {
        if (this.storageVersions == null) {this.storageVersions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(item);
        if (index < 0 || index >= _visitables.get("storageVersions").size()) { _visitables.get("storageVersions").add(builder); } else { _visitables.get("storageVersions").set(index, builder);}
        if (index < 0 || index >= storageVersions.size()) { storageVersions.add(builder); } else { storageVersions.set(index, builder);}
         return (A)this;
    }

    public A addToStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items) {
        if (this.storageVersions == null) {this.storageVersions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item : items) {io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").add(builder);this.storageVersions.add(builder);} return (A)this;
    }

    public A addAllToStorageVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion> items) {
        if (this.storageVersions == null) {this.storageVersions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item : items) {io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").add(builder);this.storageVersions.add(builder);} return (A)this;
    }

    public A removeFromStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items) {
        for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item : items) {io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").remove(builder);if (this.storageVersions != null) {this.storageVersions.remove(builder);}} return (A)this;
    }

    public A removeAllFromStorageVersions(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion> items) {
        for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item : items) {io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").remove(builder);if (this.storageVersions != null) {this.storageVersions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromStorageVersions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder> predicate) {
        if (storageVersions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder> each = storageVersions.iterator();
        final List visitables = _visitables.get("storageVersions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStorageVersions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion> getStorageVersions() {
        return build(storageVersions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion> buildStorageVersions() {
        return build(storageVersions);
    }

    public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion buildStorageVersion(int index) {
        return this.storageVersions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion buildFirstStorageVersion() {
        return this.storageVersions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion buildLastStorageVersion() {
        return this.storageVersions.get(storageVersions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion buildMatchingStorageVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder item: storageVersions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingStorageVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder item: storageVersions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withStorageVersions(java.util.List<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion> storageVersions) {
        if (this.storageVersions != null) { _visitables.get("storageVersions").removeAll(this.storageVersions);}
        if (storageVersions != null) {this.storageVersions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder>(); for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item : storageVersions){this.addToStorageVersions(item);}} else { this.storageVersions = null;} return (A) this;
    }

    public A withStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... storageVersions) {
        if (this.storageVersions != null) {this.storageVersions.clear();}
        if (storageVersions != null) {for (io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item :storageVersions){ this.addToStorageVersions(item);}} return (A) this;
    }

    public java.lang.Boolean hasStorageVersions() {
        return storageVersions != null && !storageVersions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> addNewStorageVersion() {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl.StorageVersionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> addNewStorageVersionLike(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item) {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl.StorageVersionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> setNewStorageVersionLike(int index,io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item) {
        return new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluentImpl.StorageVersionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editStorageVersion(int index) {
        if (storageVersions.size() <= index) throw new RuntimeException("Can't edit storageVersions. Index exceeds size.");
        return setNewStorageVersionLike(index, buildStorageVersion(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editFirstStorageVersion() {
        if (storageVersions.size() == 0) throw new RuntimeException("Can't edit first storageVersions. The list is empty.");
        return setNewStorageVersionLike(0, buildStorageVersion(0));
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editLastStorageVersion() {
        int index = storageVersions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last storageVersions. The list is empty.");
        return setNewStorageVersionLike(index, buildStorageVersion(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editMatchingStorageVersion(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<storageVersions.size();i++) { 
        if (predicate.test(storageVersions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching storageVersions. No match found.");
        return setNewStorageVersionLike(index, buildStorageVersion(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1alpha1StorageVersionStatusFluentImpl that = (V1alpha1StorageVersionStatusFluentImpl) o;
        if (commonEncodingVersion != null ? !commonEncodingVersion.equals(that.commonEncodingVersion) :that.commonEncodingVersion != null) return false;
        if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
        if (storageVersions != null ? !storageVersions.equals(that.storageVersions) :that.storageVersions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(commonEncodingVersion,  conditions,  storageVersions,  super.hashCode());
    }

    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionFluentImpl<io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1StorageVersionConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1StorageVersionStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


    public class StorageVersionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionFluentImpl<io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatusFluent.StorageVersionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder builder;
        private final int index;

            StorageVersionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(this, item);
                        
            }

            StorageVersionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersionBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1StorageVersionStatusFluentImpl.this.setToStorageVersions(index,builder.build());
            }

            public N endStorageVersion() {
                return and();
            }
    }


}
