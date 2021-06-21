package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;
import java.util.function.Predicate;

public class V1beta1RuntimeClassStrategyOptionsFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<A> {

    private java.util.List<java.lang.String> allowedRuntimeClassNames;
    private java.lang.String defaultRuntimeClassName;

    public V1beta1RuntimeClassStrategyOptionsFluentImpl() {
    }

    public V1beta1RuntimeClassStrategyOptionsFluentImpl(io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions instance) {
        this.withAllowedRuntimeClassNames(instance.getAllowedRuntimeClassNames());
        
        this.withDefaultRuntimeClassName(instance.getDefaultRuntimeClassName());
    }

    public A addToAllowedRuntimeClassNames(int index,java.lang.String item) {
        if (this.allowedRuntimeClassNames == null) {this.allowedRuntimeClassNames = new java.util.ArrayList<java.lang.String>();}
        this.allowedRuntimeClassNames.add(index, item);
        return (A)this;
    }

    public A setToAllowedRuntimeClassNames(int index,java.lang.String item) {
        if (this.allowedRuntimeClassNames == null) {this.allowedRuntimeClassNames = new java.util.ArrayList<java.lang.String>();}
        this.allowedRuntimeClassNames.set(index, item); return (A)this;
    }

    public A addToAllowedRuntimeClassNames(java.lang.String... items) {
        if (this.allowedRuntimeClassNames == null) {this.allowedRuntimeClassNames = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.allowedRuntimeClassNames.add(item);} return (A)this;
    }

    public A addAllToAllowedRuntimeClassNames(java.util.Collection<java.lang.String> items) {
        if (this.allowedRuntimeClassNames == null) {this.allowedRuntimeClassNames = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.allowedRuntimeClassNames.add(item);} return (A)this;
    }

    public A removeFromAllowedRuntimeClassNames(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.allowedRuntimeClassNames!= null){ this.allowedRuntimeClassNames.remove(item);}} return (A)this;
    }

    public A removeAllFromAllowedRuntimeClassNames(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.allowedRuntimeClassNames!= null){ this.allowedRuntimeClassNames.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getAllowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }

    public java.lang.String getAllowedRuntimeClassName(int index) {
        return this.allowedRuntimeClassNames.get(index);
    }

    public java.lang.String getFirstAllowedRuntimeClassName() {
        return this.allowedRuntimeClassNames.get(0);
    }

    public java.lang.String getLastAllowedRuntimeClassName() {
        return this.allowedRuntimeClassNames.get(allowedRuntimeClassNames.size() - 1);
    }

    public java.lang.String getMatchingAllowedRuntimeClassName(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: allowedRuntimeClassNames) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingAllowedRuntimeClassName(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: allowedRuntimeClassNames) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withAllowedRuntimeClassNames(java.util.List<java.lang.String> allowedRuntimeClassNames) {
        if (this.allowedRuntimeClassNames != null) { _visitables.get("allowedRuntimeClassNames").removeAll(this.allowedRuntimeClassNames);}
        if (allowedRuntimeClassNames != null) {this.allowedRuntimeClassNames = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : allowedRuntimeClassNames){this.addToAllowedRuntimeClassNames(item);}} else { this.allowedRuntimeClassNames = null;} return (A) this;
    }

    public A withAllowedRuntimeClassNames(java.lang.String... allowedRuntimeClassNames) {
        if (this.allowedRuntimeClassNames != null) {this.allowedRuntimeClassNames.clear();}
        if (allowedRuntimeClassNames != null) {for (java.lang.String item :allowedRuntimeClassNames){ this.addToAllowedRuntimeClassNames(item);}} return (A) this;
    }

    public java.lang.Boolean hasAllowedRuntimeClassNames() {
        return allowedRuntimeClassNames != null && !allowedRuntimeClassNames.isEmpty();
    }

    public A addNewAllowedRuntimeClassName(java.lang.String original) {
        return (A)addToAllowedRuntimeClassNames(new String(original));
    }

    public java.lang.String getDefaultRuntimeClassName() {
        return this.defaultRuntimeClassName;
    }

    public A withDefaultRuntimeClassName(java.lang.String defaultRuntimeClassName) {
        this.defaultRuntimeClassName=defaultRuntimeClassName; return (A) this;
    }

    public java.lang.Boolean hasDefaultRuntimeClassName() {
        return this.defaultRuntimeClassName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withDefaultRuntimeClassName instead.
     */
        public A withNewDefaultRuntimeClassName(java.lang.String original) {
        return (A)withDefaultRuntimeClassName(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1RuntimeClassStrategyOptionsFluentImpl that = (V1beta1RuntimeClassStrategyOptionsFluentImpl) o;
        if (allowedRuntimeClassNames != null ? !allowedRuntimeClassNames.equals(that.allowedRuntimeClassNames) :that.allowedRuntimeClassNames != null) return false;
        if (defaultRuntimeClassName != null ? !defaultRuntimeClassName.equals(that.defaultRuntimeClassName) :that.defaultRuntimeClassName != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(allowedRuntimeClassNames,  defaultRuntimeClassName,  super.hashCode());
    }

}
