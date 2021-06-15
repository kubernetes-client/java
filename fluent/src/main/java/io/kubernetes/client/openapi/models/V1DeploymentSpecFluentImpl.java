package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class V1DeploymentSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<A> {

    private java.lang.Integer minReadySeconds;
    private java.lang.Boolean paused;
    private java.lang.Integer progressDeadlineSeconds;
    private java.lang.Integer replicas;
    private java.lang.Integer revisionHistoryLimit;
    private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
    private io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder strategy;
    private io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder template;

    public V1DeploymentSpecFluentImpl() {
    }

    public V1DeploymentSpecFluentImpl(io.kubernetes.client.openapi.models.V1DeploymentSpec instance) {
        this.withMinReadySeconds(instance.getMinReadySeconds());
        
        this.withPaused(instance.getPaused());
        
        this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());
        
        this.withReplicas(instance.getReplicas());
        
        this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());
        
        this.withSelector(instance.getSelector());
        
        this.withStrategy(instance.getStrategy());
        
        this.withTemplate(instance.getTemplate());
    }

    public java.lang.Integer getMinReadySeconds() {
        return this.minReadySeconds;
    }

    public A withMinReadySeconds(java.lang.Integer minReadySeconds) {
        this.minReadySeconds=minReadySeconds; return (A) this;
    }

    public java.lang.Boolean hasMinReadySeconds() {
        return this.minReadySeconds != null;
    }

    public java.lang.Boolean getPaused() {
        return this.paused;
    }

    public A withPaused(java.lang.Boolean paused) {
        this.paused=paused; return (A) this;
    }

    public java.lang.Boolean hasPaused() {
        return this.paused != null;
    }

    public java.lang.Integer getProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds;
    }

    public A withProgressDeadlineSeconds(java.lang.Integer progressDeadlineSeconds) {
        this.progressDeadlineSeconds=progressDeadlineSeconds; return (A) this;
    }

    public java.lang.Boolean hasProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds != null;
    }

    public java.lang.Integer getReplicas() {
        return this.replicas;
    }

    public A withReplicas(java.lang.Integer replicas) {
        this.replicas=replicas; return (A) this;
    }

    public java.lang.Boolean hasReplicas() {
        return this.replicas != null;
    }

    public java.lang.Integer getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public A withRevisionHistoryLimit(java.lang.Integer revisionHistoryLimit) {
        this.revisionHistoryLimit=revisionHistoryLimit; return (A) this;
    }

    public java.lang.Boolean hasRevisionHistoryLimit() {
        return this.revisionHistoryLimit != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
        return this.selector!=null?this.selector.build():null;
    }

    public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
        return this.selector!=null?this.selector.build():null;
    }

    public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
        _visitables.get("selector").remove(this.selector);
        if (selector!=null){ this.selector= new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(selector); _visitables.get("selector").add(this.selector);} return (A) this;
    }

    public java.lang.Boolean hasSelector() {
        return this.selector != null;
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> withNewSelector() {
        return new io.kubernetes.client.openapi.models.V1DeploymentSpecFluentImpl.SelectorNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return new io.kubernetes.client.openapi.models.V1DeploymentSpecFluentImpl.SelectorNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> editSelector() {
        return withNewSelectorLike(getSelector());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelector() {
        return withNewSelectorLike(getSelector() != null ? getSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStrategy instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1DeploymentStrategy getStrategy() {
        return this.strategy!=null?this.strategy.build():null;
    }

    public io.kubernetes.client.openapi.models.V1DeploymentStrategy buildStrategy() {
        return this.strategy!=null?this.strategy.build():null;
    }

    public A withStrategy(io.kubernetes.client.openapi.models.V1DeploymentStrategy strategy) {
        _visitables.get("strategy").remove(this.strategy);
        if (strategy!=null){ this.strategy= new io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder(strategy); _visitables.get("strategy").add(this.strategy);} return (A) this;
    }

    public java.lang.Boolean hasStrategy() {
        return this.strategy != null;
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> withNewStrategy() {
        return new io.kubernetes.client.openapi.models.V1DeploymentSpecFluentImpl.StrategyNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> withNewStrategyLike(io.kubernetes.client.openapi.models.V1DeploymentStrategy item) {
        return new io.kubernetes.client.openapi.models.V1DeploymentSpecFluentImpl.StrategyNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> editStrategy() {
        return withNewStrategyLike(getStrategy());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategy() {
        return withNewStrategyLike(getStrategy() != null ? getStrategy(): new io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategyLike(io.kubernetes.client.openapi.models.V1DeploymentStrategy item) {
        return withNewStrategyLike(getStrategy() != null ? getStrategy(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate() {
        return this.template!=null?this.template.build():null;
    }

    public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate() {
        return this.template!=null?this.template.build():null;
    }

    public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template) {
        _visitables.get("template").remove(this.template);
        if (template!=null){ this.template= new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(template); _visitables.get("template").add(this.template);} return (A) this;
    }

    public java.lang.Boolean hasTemplate() {
        return this.template != null;
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> withNewTemplate() {
        return new io.kubernetes.client.openapi.models.V1DeploymentSpecFluentImpl.TemplateNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
        return new io.kubernetes.client.openapi.models.V1DeploymentSpecFluentImpl.TemplateNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> editTemplate() {
        return withNewTemplateLike(getTemplate());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplate() {
        return withNewTemplateLike(getTemplate() != null ? getTemplate(): new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
        return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1DeploymentSpecFluentImpl that = (V1DeploymentSpecFluentImpl) o;
        if (minReadySeconds != null ? !minReadySeconds.equals(that.minReadySeconds) :that.minReadySeconds != null) return false;
        if (paused != null ? !paused.equals(that.paused) :that.paused != null) return false;
        if (progressDeadlineSeconds != null ? !progressDeadlineSeconds.equals(that.progressDeadlineSeconds) :that.progressDeadlineSeconds != null) return false;
        if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
        if (revisionHistoryLimit != null ? !revisionHistoryLimit.equals(that.revisionHistoryLimit) :that.revisionHistoryLimit != null) return false;
        if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
        if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
        if (template != null ? !template.equals(that.template) :that.template != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(minReadySeconds,  paused,  progressDeadlineSeconds,  replicas,  revisionHistoryLimit,  selector,  strategy,  template,  super.hashCode());
    }

    public class SelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<N>> implements io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

            SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
                        
            }

            SelectorNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V1DeploymentSpecFluentImpl.this.withSelector(builder.build());
            }

            public N endSelector() {
                return and();
            }
    }


    public class StrategyNestedImpl<N> extends io.kubernetes.client.openapi.models.V1DeploymentStrategyFluentImpl<io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<N>> implements io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder builder;

            StrategyNestedImpl(io.kubernetes.client.openapi.models.V1DeploymentStrategy item) {
                this.builder = new io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder(this, item);
                        
            }

            StrategyNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1DeploymentStrategyBuilder(this);
                        
            }

            public N and() {
                return (N) V1DeploymentSpecFluentImpl.this.withStrategy(builder.build());
            }

            public N endStrategy() {
                return and();
            }
    }


    public class TemplateNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl<io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<N>> implements io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder builder;

            TemplateNestedImpl(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
                this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this, item);
                        
            }

            TemplateNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this);
                        
            }

            public N and() {
                return (N) V1DeploymentSpecFluentImpl.this.withTemplate(builder.build());
            }

            public N endTemplate() {
                return and();
            }
    }


}
