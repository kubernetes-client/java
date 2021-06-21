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

public class V1ScopedResourceSelectorRequirementFluentImpl<A extends io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirementFluent<A> {

    private java.lang.String operator;
    private java.lang.String scopeName;
    private java.util.List<java.lang.String> values;

    public V1ScopedResourceSelectorRequirementFluentImpl() {
    }

    public V1ScopedResourceSelectorRequirementFluentImpl(io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement instance) {
        this.withOperator(instance.getOperator());
        
        this.withScopeName(instance.getScopeName());
        
        this.withValues(instance.getValues());
    }

    public java.lang.String getOperator() {
        return this.operator;
    }

    public A withOperator(java.lang.String operator) {
        this.operator=operator; return (A) this;
    }

    public java.lang.Boolean hasOperator() {
        return this.operator != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withOperator instead.
     */
        public A withNewOperator(java.lang.String original) {
        return (A)withOperator(new String(original));
    }

    public java.lang.String getScopeName() {
        return this.scopeName;
    }

    public A withScopeName(java.lang.String scopeName) {
        this.scopeName=scopeName; return (A) this;
    }

    public java.lang.Boolean hasScopeName() {
        return this.scopeName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withScopeName instead.
     */
        public A withNewScopeName(java.lang.String original) {
        return (A)withScopeName(new String(original));
    }

    public A addToValues(int index,java.lang.String item) {
        if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
        this.values.add(index, item);
        return (A)this;
    }

    public A setToValues(int index,java.lang.String item) {
        if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
        this.values.set(index, item); return (A)this;
    }

    public A addToValues(java.lang.String... items) {
        if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.values.add(item);} return (A)this;
    }

    public A addAllToValues(java.util.Collection<java.lang.String> items) {
        if (this.values == null) {this.values = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.values.add(item);} return (A)this;
    }

    public A removeFromValues(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
    }

    public A removeAllFromValues(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getValues() {
        return this.values;
    }

    public java.lang.String getValue(int index) {
        return this.values.get(index);
    }

    public java.lang.String getFirstValue() {
        return this.values.get(0);
    }

    public java.lang.String getLastValue() {
        return this.values.get(values.size() - 1);
    }

    public java.lang.String getMatchingValue(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: values) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingValue(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: values) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withValues(java.util.List<java.lang.String> values) {
        if (this.values != null) { _visitables.get("values").removeAll(this.values);}
        if (values != null) {this.values = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : values){this.addToValues(item);}} else { this.values = null;} return (A) this;
    }

    public A withValues(java.lang.String... values) {
        if (this.values != null) {this.values.clear();}
        if (values != null) {for (java.lang.String item :values){ this.addToValues(item);}} return (A) this;
    }

    public java.lang.Boolean hasValues() {
        return values != null && !values.isEmpty();
    }

    public A addNewValue(java.lang.String original) {
        return (A)addToValues(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ScopedResourceSelectorRequirementFluentImpl that = (V1ScopedResourceSelectorRequirementFluentImpl) o;
        if (operator != null ? !operator.equals(that.operator) :that.operator != null) return false;
        if (scopeName != null ? !scopeName.equals(that.scopeName) :that.scopeName != null) return false;
        if (values != null ? !values.equals(that.values) :that.values != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(operator,  scopeName,  values,  super.hashCode());
    }

}
