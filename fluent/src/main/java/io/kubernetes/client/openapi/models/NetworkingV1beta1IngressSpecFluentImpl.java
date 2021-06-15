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

public class NetworkingV1beta1IngressSpecFluentImpl<A extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent<A> {

    private io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder backend;
    private java.lang.String ingressClassName;
    private java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> rules;
    private java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> tls;

    public NetworkingV1beta1IngressSpecFluentImpl() {
    }

    public NetworkingV1beta1IngressSpecFluentImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpec instance) {
        this.withBackend(instance.getBackend());
        
        this.withIngressClassName(instance.getIngressClassName());
        
        this.withRules(instance.getRules());
        
        this.withTls(instance.getTls());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildBackend instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend getBackend() {
        return this.backend!=null?this.backend.build():null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend buildBackend() {
        return this.backend!=null?this.backend.build():null;
    }

    public A withBackend(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend backend) {
        _visitables.get("backend").remove(this.backend);
        if (backend!=null){ this.backend= new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder(backend); _visitables.get("backend").add(this.backend);} return (A) this;
    }

    public java.lang.Boolean hasBackend() {
        return this.backend != null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> withNewBackend() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.BackendNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> withNewBackendLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.BackendNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> editBackend() {
        return withNewBackendLike(getBackend());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> editOrNewBackend() {
        return withNewBackendLike(getBackend() != null ? getBackend(): new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder().build());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<A> editOrNewBackendLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item) {
        return withNewBackendLike(getBackend() != null ? getBackend(): item);
    }

    public java.lang.String getIngressClassName() {
        return this.ingressClassName;
    }

    public A withIngressClassName(java.lang.String ingressClassName) {
        this.ingressClassName=ingressClassName; return (A) this;
    }

    public java.lang.Boolean hasIngressClassName() {
        return this.ingressClassName != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIngressClassName instead.
     */
        public A withNewIngressClassName(java.lang.String original) {
        return (A)withIngressClassName(new String(original));
    }

    public A addToRules(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder>();}
        io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
    }

    public A setToRules(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder>();}
        io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(item);
        if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
        if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
         return (A)this;
    }

    public A addToRules(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule... items) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
    }

    public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> items) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder>();}
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
    }

    public A removeFromRules(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule... items) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> items) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate) {
        if (rules == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> each = rules.iterator();
        final List visitables = _visitables.get("rules");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> getRules() {
        return build(rules);
    }

    public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> buildRules() {
        return build(rules);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildRule(int index) {
        return this.rules.get(index).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildFirstRule() {
        return this.rules.get(0).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildLastRule() {
        return this.rules.get(rules.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withRules(java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule> rules) {
        if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
        if (rules != null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder>(); for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
    }

    public A withRules(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule... rules) {
        if (this.rules != null) {this.rules.clear();}
        if (rules != null) {for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item :rules){ this.addToRules(item);}} return (A) this;
    }

    public java.lang.Boolean hasRules() {
        return rules != null && !rules.isEmpty();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> addNewRule() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.RulesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.RulesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> setNewRuleLike(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.RulesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editRule(int index) {
        if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
        return setNewRuleLike(index, buildRule(index));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editFirstRule() {
        if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
        return setNewRuleLike(0, buildRule(0));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editLastRule() {
        int index = rules.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
        return setNewRuleLike(index, buildRule(index));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder> predicate) {
        int index = -1;
        for (int i=0;i<rules.size();i++) { 
        if (predicate.test(rules.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
        return setNewRuleLike(index, buildRule(index));
    }

    public A addToTls(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item) {
        if (this.tls == null) {this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder>();}
        io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(item);_visitables.get("tls").add(index >= 0 ? index : _visitables.get("tls").size(), builder);this.tls.add(index >= 0 ? index : tls.size(), builder); return (A)this;
    }

    public A setToTls(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item) {
        if (this.tls == null) {this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder>();}
        io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(item);
        if (index < 0 || index >= _visitables.get("tls").size()) { _visitables.get("tls").add(builder); } else { _visitables.get("tls").set(index, builder);}
        if (index < 0 || index >= tls.size()) { tls.add(builder); } else { tls.set(index, builder);}
         return (A)this;
    }

    public A addToTls(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS... items) {
        if (this.tls == null) {this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder>();}
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(item);_visitables.get("tls").add(builder);this.tls.add(builder);} return (A)this;
    }

    public A addAllToTls(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> items) {
        if (this.tls == null) {this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder>();}
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(item);_visitables.get("tls").add(builder);this.tls.add(builder);} return (A)this;
    }

    public A removeFromTls(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS... items) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(item);_visitables.get("tls").remove(builder);if (this.tls != null) {this.tls.remove(builder);}} return (A)this;
    }

    public A removeAllFromTls(java.util.Collection<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> items) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item : items) {io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(item);_visitables.get("tls").remove(builder);if (this.tls != null) {this.tls.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromTls(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate) {
        if (tls == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> each = tls.iterator();
        final List visitables = _visitables.get("tls");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTls instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> getTls() {
        return build(tls);
    }

    public java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> buildTls() {
        return build(tls);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildTl(int index) {
        return this.tls.get(index).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildFirstTl() {
        return this.tls.get(0).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildLastTl() {
        return this.tls.get(tls.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS buildMatchingTl(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder item: tls) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingTl(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder item: tls) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withTls(java.util.List<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS> tls) {
        if (this.tls != null) { _visitables.get("tls").removeAll(this.tls);}
        if (tls != null) {this.tls = new java.util.ArrayList<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder>(); for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item : tls){this.addToTls(item);}} else { this.tls = null;} return (A) this;
    }

    public A withTls(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS... tls) {
        if (this.tls != null) {this.tls.clear();}
        if (tls != null) {for (io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item :tls){ this.addToTls(item);}} return (A) this;
    }

    public java.lang.Boolean hasTls() {
        return tls != null && !tls.isEmpty();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> addNewTl() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.TlsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> addNewTlLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.TlsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> setNewTlLike(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluentImpl.TlsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editTl(int index) {
        if (tls.size() <= index) throw new RuntimeException("Can't edit tls. Index exceeds size.");
        return setNewTlLike(index, buildTl(index));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editFirstTl() {
        if (tls.size() == 0) throw new RuntimeException("Can't edit first tls. The list is empty.");
        return setNewTlLike(0, buildTl(0));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editLastTl() {
        int index = tls.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last tls. The list is empty.");
        return setNewTlLike(index, buildTl(index));
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<A> editMatchingTl(java.util.function.Predicate<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder> predicate) {
        int index = -1;
        for (int i=0;i<tls.size();i++) { 
        if (predicate.test(tls.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching tls. No match found.");
        return setNewTlLike(index, buildTl(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkingV1beta1IngressSpecFluentImpl that = (NetworkingV1beta1IngressSpecFluentImpl) o;
        if (backend != null ? !backend.equals(that.backend) :that.backend != null) return false;
        if (ingressClassName != null ? !ingressClassName.equals(that.ingressClassName) :that.ingressClassName != null) return false;
        if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
        if (tls != null ? !tls.equals(that.tls) :that.tls != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(backend,  ingressClassName,  rules,  tls,  super.hashCode());
    }

    public class BackendNestedImpl<N> extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.BackendNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder builder;

            BackendNestedImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item) {
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder(this, item);
                        
            }

            BackendNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1IngressSpecFluentImpl.this.withBackend(builder.build());
            }

            public N endBackend() {
                return and();
            }
    }


    public class RulesNestedImpl<N> extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.RulesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder builder;
        private final int index;

            RulesNestedImpl(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRule item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(this, item);
                        
            }

            RulesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressRuleBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1IngressSpecFluentImpl.this.setToRules(index,builder.build());
            }

            public N endRule() {
                return and();
            }
    }


    public class TlsNestedImpl<N> extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1IngressSpecFluent.TlsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder builder;
        private final int index;

            TlsNestedImpl(int index,io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLS item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(this, item);
                        
            }

            TlsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressTLSBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1IngressSpecFluentImpl.this.setToTls(index,builder.build());
            }

            public N endTl() {
                return and();
            }
    }


}
