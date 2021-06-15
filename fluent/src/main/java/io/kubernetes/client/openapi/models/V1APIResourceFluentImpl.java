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

public class V1APIResourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1APIResourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1APIResourceFluent<A> {

    private java.util.List<java.lang.String> categories;
    private java.lang.String group;
    private java.lang.String kind;
    private java.lang.String name;
    private java.lang.Boolean namespaced;
    private java.util.List<java.lang.String> shortNames;
    private java.lang.String singularName;
    private java.lang.String storageVersionHash;
    private java.util.List<java.lang.String> verbs;
    private java.lang.String version;

    public V1APIResourceFluentImpl() {
    }

    public V1APIResourceFluentImpl(io.kubernetes.client.openapi.models.V1APIResource instance) {
        this.withCategories(instance.getCategories());
        
        this.withGroup(instance.getGroup());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withNamespaced(instance.getNamespaced());
        
        this.withShortNames(instance.getShortNames());
        
        this.withSingularName(instance.getSingularName());
        
        this.withStorageVersionHash(instance.getStorageVersionHash());
        
        this.withVerbs(instance.getVerbs());
        
        this.withVersion(instance.getVersion());
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

    public java.lang.String getGroup() {
        return this.group;
    }

    public A withGroup(java.lang.String group) {
        this.group=group; return (A) this;
    }

    public java.lang.Boolean hasGroup() {
        return this.group != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGroup instead.
     */
        public A withNewGroup(java.lang.String original) {
        return (A)withGroup(new String(original));
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

    public java.lang.Boolean getNamespaced() {
        return this.namespaced;
    }

    public A withNamespaced(java.lang.Boolean namespaced) {
        this.namespaced=namespaced; return (A) this;
    }

    public java.lang.Boolean hasNamespaced() {
        return this.namespaced != null;
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

    public java.lang.String getSingularName() {
        return this.singularName;
    }

    public A withSingularName(java.lang.String singularName) {
        this.singularName=singularName; return (A) this;
    }

    public java.lang.Boolean hasSingularName() {
        return this.singularName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSingularName instead.
     */
        public A withNewSingularName(java.lang.String original) {
        return (A)withSingularName(new String(original));
    }

    public java.lang.String getStorageVersionHash() {
        return this.storageVersionHash;
    }

    public A withStorageVersionHash(java.lang.String storageVersionHash) {
        this.storageVersionHash=storageVersionHash; return (A) this;
    }

    public java.lang.Boolean hasStorageVersionHash() {
        return this.storageVersionHash != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withStorageVersionHash instead.
     */
        public A withNewStorageVersionHash(java.lang.String original) {
        return (A)withStorageVersionHash(new String(original));
    }

    public A addToVerbs(int index,java.lang.String item) {
        if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
        this.verbs.add(index, item);
        return (A)this;
    }

    public A setToVerbs(int index,java.lang.String item) {
        if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
        this.verbs.set(index, item); return (A)this;
    }

    public A addToVerbs(java.lang.String... items) {
        if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.verbs.add(item);} return (A)this;
    }

    public A addAllToVerbs(java.util.Collection<java.lang.String> items) {
        if (this.verbs == null) {this.verbs = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.verbs.add(item);} return (A)this;
    }

    public A removeFromVerbs(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
    }

    public A removeAllFromVerbs(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getVerbs() {
        return this.verbs;
    }

    public java.lang.String getVerb(int index) {
        return this.verbs.get(index);
    }

    public java.lang.String getFirstVerb() {
        return this.verbs.get(0);
    }

    public java.lang.String getLastVerb() {
        return this.verbs.get(verbs.size() - 1);
    }

    public java.lang.String getMatchingVerb(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: verbs) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingVerb(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: verbs) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withVerbs(java.util.List<java.lang.String> verbs) {
        if (this.verbs != null) { _visitables.get("verbs").removeAll(this.verbs);}
        if (verbs != null) {this.verbs = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : verbs){this.addToVerbs(item);}} else { this.verbs = null;} return (A) this;
    }

    public A withVerbs(java.lang.String... verbs) {
        if (this.verbs != null) {this.verbs.clear();}
        if (verbs != null) {for (java.lang.String item :verbs){ this.addToVerbs(item);}} return (A) this;
    }

    public java.lang.Boolean hasVerbs() {
        return verbs != null && !verbs.isEmpty();
    }

    public A addNewVerb(java.lang.String original) {
        return (A)addToVerbs(new String(original));
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public A withVersion(java.lang.String version) {
        this.version=version; return (A) this;
    }

    public java.lang.Boolean hasVersion() {
        return this.version != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVersion instead.
     */
        public A withNewVersion(java.lang.String original) {
        return (A)withVersion(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1APIResourceFluentImpl that = (V1APIResourceFluentImpl) o;
        if (categories != null ? !categories.equals(that.categories) :that.categories != null) return false;
        if (group != null ? !group.equals(that.group) :that.group != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (namespaced != null ? !namespaced.equals(that.namespaced) :that.namespaced != null) return false;
        if (shortNames != null ? !shortNames.equals(that.shortNames) :that.shortNames != null) return false;
        if (singularName != null ? !singularName.equals(that.singularName) :that.singularName != null) return false;
        if (storageVersionHash != null ? !storageVersionHash.equals(that.storageVersionHash) :that.storageVersionHash != null) return false;
        if (verbs != null ? !verbs.equals(that.verbs) :that.verbs != null) return false;
        if (version != null ? !version.equals(that.version) :that.version != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(categories,  group,  kind,  name,  namespaced,  shortNames,  singularName,  storageVersionHash,  verbs,  version,  super.hashCode());
    }

}
