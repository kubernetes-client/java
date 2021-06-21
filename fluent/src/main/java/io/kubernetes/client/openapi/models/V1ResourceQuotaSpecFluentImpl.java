package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class V1ResourceQuotaSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent<A> {

    private java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> hard;
    private io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder scopeSelector;
    private java.util.List<java.lang.String> scopes;

    public V1ResourceQuotaSpecFluentImpl() {
    }

    public V1ResourceQuotaSpecFluentImpl(io.kubernetes.client.openapi.models.V1ResourceQuotaSpec instance) {
        this.withHard(instance.getHard());
        
        this.withScopeSelector(instance.getScopeSelector());
        
        this.withScopes(instance.getScopes());
    }

    public A addToHard(java.lang.String key,io.kubernetes.client.custom.Quantity value) {
        if(this.hard == null && key != null && value != null) { this.hard = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(); }
        if(key != null && value != null) {this.hard.put(key, value);} return (A)this;
    }

    public A addToHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
        if(this.hard == null && map != null) { this.hard = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(); }
        if(map != null) { this.hard.putAll(map);} return (A)this;
    }

    public A removeFromHard(java.lang.String key) {
        if(this.hard == null) { return (A) this; }
        if(key != null && this.hard != null) {this.hard.remove(key);} return (A)this;
    }

    public A removeFromHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> map) {
        if(this.hard == null) { return (A) this; }
        if(map != null) { for(Object key : map.keySet()) {if (this.hard != null){this.hard.remove(key);}}} return (A)this;
    }

    public java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> getHard() {
        return this.hard;
    }

    public <K,V>A withHard(java.util.Map<java.lang.String,io.kubernetes.client.custom.Quantity> hard) {
        if (hard == null) { this.hard =  null;} else {this.hard = new java.util.LinkedHashMap<java.lang.String,io.kubernetes.client.custom.Quantity>(hard);} return (A) this;
    }

    public java.lang.Boolean hasHard() {
        return this.hard != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildScopeSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ScopeSelector getScopeSelector() {
        return this.scopeSelector!=null?this.scopeSelector.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ScopeSelector buildScopeSelector() {
        return this.scopeSelector!=null?this.scopeSelector.build():null;
    }

    public A withScopeSelector(io.kubernetes.client.openapi.models.V1ScopeSelector scopeSelector) {
        _visitables.get("scopeSelector").remove(this.scopeSelector);
        if (scopeSelector!=null){ this.scopeSelector= new io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder(scopeSelector); _visitables.get("scopeSelector").add(this.scopeSelector);} return (A) this;
    }

    public java.lang.Boolean hasScopeSelector() {
        return this.scopeSelector != null;
    }

    public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelector() {
        return new io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluentImpl.ScopeSelectorNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> withNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item) {
        return new io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluentImpl.ScopeSelectorNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editScopeSelector() {
        return withNewScopeSelectorLike(getScopeSelector());
    }

    public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelector() {
        return withNewScopeSelectorLike(getScopeSelector() != null ? getScopeSelector(): new io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<A> editOrNewScopeSelectorLike(io.kubernetes.client.openapi.models.V1ScopeSelector item) {
        return withNewScopeSelectorLike(getScopeSelector() != null ? getScopeSelector(): item);
    }

    public A addToScopes(int index,java.lang.String item) {
        if (this.scopes == null) {this.scopes = new java.util.ArrayList<java.lang.String>();}
        this.scopes.add(index, item);
        return (A)this;
    }

    public A setToScopes(int index,java.lang.String item) {
        if (this.scopes == null) {this.scopes = new java.util.ArrayList<java.lang.String>();}
        this.scopes.set(index, item); return (A)this;
    }

    public A addToScopes(java.lang.String... items) {
        if (this.scopes == null) {this.scopes = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A addAllToScopes(java.util.Collection<java.lang.String> items) {
        if (this.scopes == null) {this.scopes = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.scopes.add(item);} return (A)this;
    }

    public A removeFromScopes(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public A removeAllFromScopes(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.scopes!= null){ this.scopes.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getScopes() {
        return this.scopes;
    }

    public java.lang.String getScope(int index) {
        return this.scopes.get(index);
    }

    public java.lang.String getFirstScope() {
        return this.scopes.get(0);
    }

    public java.lang.String getLastScope() {
        return this.scopes.get(scopes.size() - 1);
    }

    public java.lang.String getMatchingScope(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: scopes) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingScope(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: scopes) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withScopes(java.util.List<java.lang.String> scopes) {
        if (this.scopes != null) { _visitables.get("scopes").removeAll(this.scopes);}
        if (scopes != null) {this.scopes = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : scopes){this.addToScopes(item);}} else { this.scopes = null;} return (A) this;
    }

    public A withScopes(java.lang.String... scopes) {
        if (this.scopes != null) {this.scopes.clear();}
        if (scopes != null) {for (java.lang.String item :scopes){ this.addToScopes(item);}} return (A) this;
    }

    public java.lang.Boolean hasScopes() {
        return scopes != null && !scopes.isEmpty();
    }

    public A addNewScope(java.lang.String original) {
        return (A)addToScopes(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1ResourceQuotaSpecFluentImpl that = (V1ResourceQuotaSpecFluentImpl) o;
        if (hard != null ? !hard.equals(that.hard) :that.hard != null) return false;
        if (scopeSelector != null ? !scopeSelector.equals(that.scopeSelector) :that.scopeSelector != null) return false;
        if (scopes != null ? !scopes.equals(that.scopes) :that.scopes != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(hard,  scopeSelector,  scopes,  super.hashCode());
    }

    public class ScopeSelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ScopeSelectorFluentImpl<io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<N>> implements io.kubernetes.client.openapi.models.V1ResourceQuotaSpecFluent.ScopeSelectorNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder builder;

            ScopeSelectorNestedImpl(io.kubernetes.client.openapi.models.V1ScopeSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder(this, item);
                        
            }

            ScopeSelectorNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ScopeSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V1ResourceQuotaSpecFluentImpl.this.withScopeSelector(builder.build());
            }

            public N endScopeSelector() {
                return and();
            }
    }


}
