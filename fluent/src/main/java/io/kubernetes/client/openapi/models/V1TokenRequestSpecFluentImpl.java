package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1TokenRequestSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<A> {

    private java.util.List<java.lang.String> audiences;
    private io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder boundObjectRef;
    private java.lang.Long expirationSeconds;

    public V1TokenRequestSpecFluentImpl() {
    }

    public V1TokenRequestSpecFluentImpl(io.kubernetes.client.openapi.models.V1TokenRequestSpec instance) {
        this.withAudiences(instance.getAudiences());
        
        this.withBoundObjectRef(instance.getBoundObjectRef());
        
        this.withExpirationSeconds(instance.getExpirationSeconds());
    }

    public A addToAudiences(int index,java.lang.String item) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        this.audiences.add(index, item);
        return (A)this;
    }

    public A setToAudiences(int index,java.lang.String item) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        this.audiences.set(index, item); return (A)this;
    }

    public A addToAudiences(java.lang.String... items) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.audiences.add(item);} return (A)this;
    }

    public A addAllToAudiences(java.util.Collection<java.lang.String> items) {
        if (this.audiences == null) {this.audiences = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.audiences.add(item);} return (A)this;
    }

    public A removeFromAudiences(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
    }

    public A removeAllFromAudiences(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getAudiences() {
        return this.audiences;
    }

    public java.lang.String getAudience(int index) {
        return this.audiences.get(index);
    }

    public java.lang.String getFirstAudience() {
        return this.audiences.get(0);
    }

    public java.lang.String getLastAudience() {
        return this.audiences.get(audiences.size() - 1);
    }

    public java.lang.String getMatchingAudience(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: audiences) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: audiences) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withAudiences(java.util.List<java.lang.String> audiences) {
        if (this.audiences != null) { _visitables.get("audiences").removeAll(this.audiences);}
        if (audiences != null) {this.audiences = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : audiences){this.addToAudiences(item);}} else { this.audiences = null;} return (A) this;
    }

    public A withAudiences(java.lang.String... audiences) {
        if (this.audiences != null) {this.audiences.clear();}
        if (audiences != null) {for (java.lang.String item :audiences){ this.addToAudiences(item);}} return (A) this;
    }

    public java.lang.Boolean hasAudiences() {
        return audiences != null && !audiences.isEmpty();
    }

    public A addNewAudience(java.lang.String original) {
        return (A)addToAudiences(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildBoundObjectRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1BoundObjectReference getBoundObjectRef() {
        return this.boundObjectRef!=null?this.boundObjectRef.build():null;
    }

    public io.kubernetes.client.openapi.models.V1BoundObjectReference buildBoundObjectRef() {
        return this.boundObjectRef!=null?this.boundObjectRef.build():null;
    }

    public A withBoundObjectRef(io.kubernetes.client.openapi.models.V1BoundObjectReference boundObjectRef) {
        _visitables.get("boundObjectRef").remove(this.boundObjectRef);
        if (boundObjectRef!=null){ this.boundObjectRef= new io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder(boundObjectRef); _visitables.get("boundObjectRef").add(this.boundObjectRef);} return (A) this;
    }

    public java.lang.Boolean hasBoundObjectRef() {
        return this.boundObjectRef != null;
    }

    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRef() {
        return new io.kubernetes.client.openapi.models.V1TokenRequestSpecFluentImpl.BoundObjectRefNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRefLike(io.kubernetes.client.openapi.models.V1BoundObjectReference item) {
        return new io.kubernetes.client.openapi.models.V1TokenRequestSpecFluentImpl.BoundObjectRefNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editBoundObjectRef() {
        return withNewBoundObjectRefLike(getBoundObjectRef());
    }

    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRef() {
        return withNewBoundObjectRefLike(getBoundObjectRef() != null ? getBoundObjectRef(): new io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRefLike(io.kubernetes.client.openapi.models.V1BoundObjectReference item) {
        return withNewBoundObjectRefLike(getBoundObjectRef() != null ? getBoundObjectRef(): item);
    }

    public java.lang.Long getExpirationSeconds() {
        return this.expirationSeconds;
    }

    public A withExpirationSeconds(java.lang.Long expirationSeconds) {
        this.expirationSeconds=expirationSeconds; return (A) this;
    }

    public java.lang.Boolean hasExpirationSeconds() {
        return this.expirationSeconds != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1TokenRequestSpecFluentImpl that = (V1TokenRequestSpecFluentImpl) o;
        if (audiences != null ? !audiences.equals(that.audiences) :that.audiences != null) return false;
        if (boundObjectRef != null ? !boundObjectRef.equals(that.boundObjectRef) :that.boundObjectRef != null) return false;
        if (expirationSeconds != null ? !expirationSeconds.equals(that.expirationSeconds) :that.expirationSeconds != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(audiences,  boundObjectRef,  expirationSeconds,  super.hashCode());
    }

    public class BoundObjectRefNestedImpl<N> extends io.kubernetes.client.openapi.models.V1BoundObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<N>> implements io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent.BoundObjectRefNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder builder;

            BoundObjectRefNestedImpl(io.kubernetes.client.openapi.models.V1BoundObjectReference item) {
                this.builder = new io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder(this, item);
                        
            }

            BoundObjectRefNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1BoundObjectReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) V1TokenRequestSpecFluentImpl.this.withBoundObjectRef(builder.build());
            }

            public N endBoundObjectRef() {
                return and();
            }
    }


}
