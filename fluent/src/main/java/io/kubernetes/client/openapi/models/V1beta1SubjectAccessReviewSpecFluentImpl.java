package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public class V1beta1SubjectAccessReviewSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent<A> {

    private java.util.Map<java.lang.String,java.util.List<java.lang.String>> extra;
    private java.util.List<java.lang.String> group;
    private io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder nonResourceAttributes;
    private io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder resourceAttributes;
    private java.lang.String uid;
    private java.lang.String user;

    public V1beta1SubjectAccessReviewSpecFluentImpl() {
    }

    public V1beta1SubjectAccessReviewSpecFluentImpl(io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpec instance) {
        this.withExtra(instance.getExtra());
        
        this.withGroup(instance.getGroup());
        
        this.withNonResourceAttributes(instance.getNonResourceAttributes());
        
        this.withResourceAttributes(instance.getResourceAttributes());
        
        this.withUid(instance.getUid());
        
        this.withUser(instance.getUser());
    }

    public A addToExtra(java.lang.String key,java.util.List<java.lang.String> value) {
        if(this.extra == null && key != null && value != null) { this.extra = new java.util.LinkedHashMap<java.lang.String,java.util.List<java.lang.String>>(); }
        if(key != null && value != null) {this.extra.put(key, value);} return (A)this;
    }

    public A addToExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map) {
        if(this.extra == null && map != null) { this.extra = new java.util.LinkedHashMap<java.lang.String,java.util.List<java.lang.String>>(); }
        if(map != null) { this.extra.putAll(map);} return (A)this;
    }

    public A removeFromExtra(java.lang.String key) {
        if(this.extra == null) { return (A) this; }
        if(key != null && this.extra != null) {this.extra.remove(key);} return (A)this;
    }

    public A removeFromExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> map) {
        if(this.extra == null) { return (A) this; }
        if(map != null) { for(Object key : map.keySet()) {if (this.extra != null){this.extra.remove(key);}}} return (A)this;
    }

    public java.util.Map<java.lang.String,java.util.List<java.lang.String>> getExtra() {
        return this.extra;
    }

    public <K,V>A withExtra(java.util.Map<java.lang.String,java.util.List<java.lang.String>> extra) {
        if (extra == null) { this.extra =  null;} else {this.extra = new java.util.LinkedHashMap<java.lang.String,java.util.List<java.lang.String>>(extra);} return (A) this;
    }

    public java.lang.Boolean hasExtra() {
        return this.extra != null;
    }

    public A addToGroup(int index,java.lang.String item) {
        if (this.group == null) {this.group = new java.util.ArrayList<java.lang.String>();}
        this.group.add(index, item);
        return (A)this;
    }

    public A setToGroup(int index,java.lang.String item) {
        if (this.group == null) {this.group = new java.util.ArrayList<java.lang.String>();}
        this.group.set(index, item); return (A)this;
    }

    public A addToGroup(java.lang.String... items) {
        if (this.group == null) {this.group = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.group.add(item);} return (A)this;
    }

    public A addAllToGroup(java.util.Collection<java.lang.String> items) {
        if (this.group == null) {this.group = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.group.add(item);} return (A)this;
    }

    public A removeFromGroup(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.group!= null){ this.group.remove(item);}} return (A)this;
    }

    public A removeAllFromGroup(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.group!= null){ this.group.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getGroup() {
        return this.group;
    }

    public java.lang.String getGroup(int index) {
        return this.group.get(index);
    }

    public java.lang.String getFirstGroup() {
        return this.group.get(0);
    }

    public java.lang.String getLastGroup() {
        return this.group.get(group.size() - 1);
    }

    public java.lang.String getMatchingGroup(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: group) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingGroup(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: group) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withGroup(java.util.List<java.lang.String> group) {
        if (this.group != null) { _visitables.get("group").removeAll(this.group);}
        if (group != null) {this.group = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : group){this.addToGroup(item);}} else { this.group = null;} return (A) this;
    }

    public A withGroup(java.lang.String... group) {
        if (this.group != null) {this.group.clear();}
        if (group != null) {for (java.lang.String item :group){ this.addToGroup(item);}} return (A) this;
    }

    public java.lang.Boolean hasGroup() {
        return group != null && !group.isEmpty();
    }

    public A addNewGroup(java.lang.String original) {
        return (A)addToGroup(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNonResourceAttributes instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes getNonResourceAttributes() {
        return this.nonResourceAttributes!=null?this.nonResourceAttributes.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes buildNonResourceAttributes() {
        return this.nonResourceAttributes!=null?this.nonResourceAttributes.build():null;
    }

    public A withNonResourceAttributes(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes nonResourceAttributes) {
        _visitables.get("nonResourceAttributes").remove(this.nonResourceAttributes);
        if (nonResourceAttributes!=null){ this.nonResourceAttributes= new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder(nonResourceAttributes); _visitables.get("nonResourceAttributes").add(this.nonResourceAttributes);} return (A) this;
    }

    public java.lang.Boolean hasNonResourceAttributes() {
        return this.nonResourceAttributes != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributes() {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> withNewNonResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item) {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluentImpl.NonResourceAttributesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editNonResourceAttributes() {
        return withNewNonResourceAttributesLike(getNonResourceAttributes());
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributes() {
        return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A> editOrNewNonResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item) {
        return withNewNonResourceAttributesLike(getNonResourceAttributes() != null ? getNonResourceAttributes(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildResourceAttributes instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1ResourceAttributes getResourceAttributes() {
        return this.resourceAttributes!=null?this.resourceAttributes.build():null;
    }

    public io.kubernetes.client.openapi.models.V1beta1ResourceAttributes buildResourceAttributes() {
        return this.resourceAttributes!=null?this.resourceAttributes.build():null;
    }

    public A withResourceAttributes(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes resourceAttributes) {
        _visitables.get("resourceAttributes").remove(this.resourceAttributes);
        if (resourceAttributes!=null){ this.resourceAttributes= new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder(resourceAttributes); _visitables.get("resourceAttributes").add(this.resourceAttributes);} return (A) this;
    }

    public java.lang.Boolean hasResourceAttributes() {
        return this.resourceAttributes != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes() {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item) {
        return new io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluentImpl.ResourceAttributesNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editResourceAttributes() {
        return withNewResourceAttributesLike(getResourceAttributes());
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributes() {
        return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> editOrNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item) {
        return withNewResourceAttributesLike(getResourceAttributes() != null ? getResourceAttributes(): item);
    }

    public java.lang.String getUid() {
        return this.uid;
    }

    public A withUid(java.lang.String uid) {
        this.uid=uid; return (A) this;
    }

    public java.lang.Boolean hasUid() {
        return this.uid != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUid instead.
     */
        public A withNewUid(java.lang.String original) {
        return (A)withUid(new String(original));
    }

    public java.lang.String getUser() {
        return this.user;
    }

    public A withUser(java.lang.String user) {
        this.user=user; return (A) this;
    }

    public java.lang.Boolean hasUser() {
        return this.user != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withUser instead.
     */
        public A withNewUser(java.lang.String original) {
        return (A)withUser(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1SubjectAccessReviewSpecFluentImpl that = (V1beta1SubjectAccessReviewSpecFluentImpl) o;
        if (extra != null ? !extra.equals(that.extra) :that.extra != null) return false;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (nonResourceAttributes != null ? !nonResourceAttributes.equals(that.nonResourceAttributes) :that.nonResourceAttributes != null) return false;
        if (resourceAttributes != null ? !resourceAttributes.equals(that.resourceAttributes) :that.resourceAttributes != null) return false;
        if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
        if (user != null ? !user.equals(that.user) :that.user != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(extra,  group,  nonResourceAttributes,  resourceAttributes,  uid,  user,  super.hashCode());
    }

    public class NonResourceAttributesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesFluentImpl<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder builder;

            NonResourceAttributesNestedImpl(io.kubernetes.client.openapi.models.V1beta1NonResourceAttributes item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder(this, item);
                        
            }

            NonResourceAttributesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1NonResourceAttributesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1SubjectAccessReviewSpecFluentImpl.this.withNonResourceAttributes(builder.build());
            }

            public N endNonResourceAttributes() {
                return and();
            }
    }


    public class ResourceAttributesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1ResourceAttributesFluentImpl<io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder builder;

            ResourceAttributesNestedImpl(io.kubernetes.client.openapi.models.V1beta1ResourceAttributes item) {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder(this, item);
                        
            }

            ResourceAttributesNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1beta1ResourceAttributesBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1SubjectAccessReviewSpecFluentImpl.this.withResourceAttributes(builder.build());
            }

            public N endResourceAttributes() {
                return and();
            }
    }


}
