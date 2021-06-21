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

public class V1CustomResourceDefinitionNamesFluentImpl<A extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNamesFluent<A> {

    private java.util.List<java.lang.String> categories;
    private java.lang.String kind;
    private java.lang.String listKind;
    private java.lang.String plural;
    private java.util.List<java.lang.String> shortNames;
    private java.lang.String singular;

    public V1CustomResourceDefinitionNamesFluentImpl() {
    }

    public V1CustomResourceDefinitionNamesFluentImpl(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames instance) {
        this.withCategories(instance.getCategories());
        
        this.withKind(instance.getKind());
        
        this.withListKind(instance.getListKind());
        
        this.withPlural(instance.getPlural());
        
        this.withShortNames(instance.getShortNames());
        
        this.withSingular(instance.getSingular());
    }

    public A addToCategories(int index,java.lang.String item) {
        if (this.categories == null) {this.categories = new java.util.ArrayList<java.lang.String>();}
        this.categories.add(index, item);
        return (A)this;
    }

    public A setToCategories(int index,java.lang.String item) {
        if (this.categories == null) {this.categories = new java.util.ArrayList<java.lang.String>();}
        this.categories.set(index, item); return (A)this;
    }

    public A addToCategories(java.lang.String... items) {
        if (this.categories == null) {this.categories = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.categories.add(item);} return (A)this;
    }

    public A addAllToCategories(java.util.Collection<java.lang.String> items) {
        if (this.categories == null) {this.categories = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.categories.add(item);} return (A)this;
    }

    public A removeFromCategories(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.categories!= null){ this.categories.remove(item);}} return (A)this;
    }

    public A removeAllFromCategories(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.categories!= null){ this.categories.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getCategories() {
        return this.categories;
    }

    public java.lang.String getCategory(int index) {
        return this.categories.get(index);
    }

    public java.lang.String getFirstCategory() {
        return this.categories.get(0);
    }

    public java.lang.String getLastCategory() {
        return this.categories.get(categories.size() - 1);
    }

    public java.lang.String getMatchingCategory(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: categories) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingCategory(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: categories) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withCategories(java.util.List<java.lang.String> categories) {
        if (this.categories != null) { _visitables.get("categories").removeAll(this.categories);}
        if (categories != null) {this.categories = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : categories){this.addToCategories(item);}} else { this.categories = null;} return (A) this;
    }

    public A withCategories(java.lang.String... categories) {
        if (this.categories != null) {this.categories.clear();}
        if (categories != null) {for (java.lang.String item :categories){ this.addToCategories(item);}} return (A) this;
    }

    public java.lang.Boolean hasCategories() {
        return categories != null && !categories.isEmpty();
    }

    public A addNewCategory(java.lang.String original) {
        return (A)addToCategories(new String(original));
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    public java.lang.String getListKind() {
        return this.listKind;
    }

    public A withListKind(java.lang.String listKind) {
        this.listKind=listKind; return (A) this;
    }

    public java.lang.Boolean hasListKind() {
        return this.listKind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withListKind instead.
     */
        public A withNewListKind(java.lang.String original) {
        return (A)withListKind(new String(original));
    }

    public java.lang.String getPlural() {
        return this.plural;
    }

    public A withPlural(java.lang.String plural) {
        this.plural=plural; return (A) this;
    }

    public java.lang.Boolean hasPlural() {
        return this.plural != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPlural instead.
     */
        public A withNewPlural(java.lang.String original) {
        return (A)withPlural(new String(original));
    }

    public A addToShortNames(int index,java.lang.String item) {
        if (this.shortNames == null) {this.shortNames = new java.util.ArrayList<java.lang.String>();}
        this.shortNames.add(index, item);
        return (A)this;
    }

    public A setToShortNames(int index,java.lang.String item) {
        if (this.shortNames == null) {this.shortNames = new java.util.ArrayList<java.lang.String>();}
        this.shortNames.set(index, item); return (A)this;
    }

    public A addToShortNames(java.lang.String... items) {
        if (this.shortNames == null) {this.shortNames = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.shortNames.add(item);} return (A)this;
    }

    public A addAllToShortNames(java.util.Collection<java.lang.String> items) {
        if (this.shortNames == null) {this.shortNames = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.shortNames.add(item);} return (A)this;
    }

    public A removeFromShortNames(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.shortNames!= null){ this.shortNames.remove(item);}} return (A)this;
    }

    public A removeAllFromShortNames(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.shortNames!= null){ this.shortNames.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getShortNames() {
        return this.shortNames;
    }

    public java.lang.String getShortName(int index) {
        return this.shortNames.get(index);
    }

    public java.lang.String getFirstShortName() {
        return this.shortNames.get(0);
    }

    public java.lang.String getLastShortName() {
        return this.shortNames.get(shortNames.size() - 1);
    }

    public java.lang.String getMatchingShortName(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: shortNames) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingShortName(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: shortNames) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withShortNames(java.util.List<java.lang.String> shortNames) {
        if (this.shortNames != null) { _visitables.get("shortNames").removeAll(this.shortNames);}
        if (shortNames != null) {this.shortNames = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : shortNames){this.addToShortNames(item);}} else { this.shortNames = null;} return (A) this;
    }

    public A withShortNames(java.lang.String... shortNames) {
        if (this.shortNames != null) {this.shortNames.clear();}
        if (shortNames != null) {for (java.lang.String item :shortNames){ this.addToShortNames(item);}} return (A) this;
    }

    public java.lang.Boolean hasShortNames() {
        return shortNames != null && !shortNames.isEmpty();
    }

    public A addNewShortName(java.lang.String original) {
        return (A)addToShortNames(new String(original));
    }

    public java.lang.String getSingular() {
        return this.singular;
    }

    public A withSingular(java.lang.String singular) {
        this.singular=singular; return (A) this;
    }

    public java.lang.Boolean hasSingular() {
        return this.singular != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSingular instead.
     */
        public A withNewSingular(java.lang.String original) {
        return (A)withSingular(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1CustomResourceDefinitionNamesFluentImpl that = (V1CustomResourceDefinitionNamesFluentImpl) o;
        if (categories != null ? !categories.equals(that.categories) :that.categories != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (listKind != null ? !listKind.equals(that.listKind) :that.listKind != null) return false;
        if (plural != null ? !plural.equals(that.plural) :that.plural != null) return false;
        if (shortNames != null ? !shortNames.equals(that.shortNames) :that.shortNames != null) return false;
        if (singular != null ? !singular.equals(that.singular) :that.singular != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(categories,  kind,  listKind,  plural,  shortNames,  singular,  super.hashCode());
    }

}
