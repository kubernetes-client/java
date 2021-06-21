package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class V1JobSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1JobSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1JobSpecFluent<A> {

    private java.lang.Long activeDeadlineSeconds;
    private java.lang.Integer backoffLimit;
    private java.lang.Integer completions;
    private java.lang.Boolean manualSelector;
    private java.lang.Integer parallelism;
    private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
    private io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder template;
    private java.lang.Integer ttlSecondsAfterFinished;

    public V1JobSpecFluentImpl() {
    }

    public V1JobSpecFluentImpl(io.kubernetes.client.openapi.models.V1JobSpec instance) {
        this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());
        
        this.withBackoffLimit(instance.getBackoffLimit());
        
        this.withCompletions(instance.getCompletions());
        
        this.withManualSelector(instance.getManualSelector());
        
        this.withParallelism(instance.getParallelism());
        
        this.withSelector(instance.getSelector());
        
        this.withTemplate(instance.getTemplate());
        
        this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());
    }

    public java.lang.Long getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public A withActiveDeadlineSeconds(java.lang.Long activeDeadlineSeconds) {
        this.activeDeadlineSeconds=activeDeadlineSeconds; return (A) this;
    }

    public java.lang.Boolean hasActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds != null;
    }

    public java.lang.Integer getBackoffLimit() {
        return this.backoffLimit;
    }

    public A withBackoffLimit(java.lang.Integer backoffLimit) {
        this.backoffLimit=backoffLimit; return (A) this;
    }

    public java.lang.Boolean hasBackoffLimit() {
        return this.backoffLimit != null;
    }

    public java.lang.Integer getCompletions() {
        return this.completions;
    }

    public A withCompletions(java.lang.Integer completions) {
        this.completions=completions; return (A) this;
    }

    public java.lang.Boolean hasCompletions() {
        return this.completions != null;
    }

    public java.lang.Boolean getManualSelector() {
        return this.manualSelector;
    }

    public A withManualSelector(java.lang.Boolean manualSelector) {
        this.manualSelector=manualSelector; return (A) this;
    }

    public java.lang.Boolean hasManualSelector() {
        return this.manualSelector != null;
    }

    public java.lang.Integer getParallelism() {
        return this.parallelism;
    }

    public A withParallelism(java.lang.Integer parallelism) {
        this.parallelism=parallelism; return (A) this;
    }

    public java.lang.Boolean hasParallelism() {
        return this.parallelism != null;
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

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> withNewSelector() {
        return new io.kubernetes.client.openapi.models.V1JobSpecFluentImpl.SelectorNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return new io.kubernetes.client.openapi.models.V1JobSpecFluentImpl.SelectorNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editSelector() {
        return withNewSelectorLike(getSelector());
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editOrNewSelector() {
        return withNewSelectorLike(getSelector() != null ? getSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return withNewSelectorLike(getSelector() != null ? getSelector(): item);
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

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> withNewTemplate() {
        return new io.kubernetes.client.openapi.models.V1JobSpecFluentImpl.TemplateNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
        return new io.kubernetes.client.openapi.models.V1JobSpecFluentImpl.TemplateNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editTemplate() {
        return withNewTemplateLike(getTemplate());
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editOrNewTemplate() {
        return withNewTemplateLike(getTemplate() != null ? getTemplate(): new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
        return withNewTemplateLike(getTemplate() != null ? getTemplate(): item);
    }

    public java.lang.Integer getTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished;
    }

    public A withTtlSecondsAfterFinished(java.lang.Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished=ttlSecondsAfterFinished; return (A) this;
    }

    public java.lang.Boolean hasTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1JobSpecFluentImpl that = (V1JobSpecFluentImpl) o;
        if (activeDeadlineSeconds != null ? !activeDeadlineSeconds.equals(that.activeDeadlineSeconds) :that.activeDeadlineSeconds != null) return false;
        if (backoffLimit != null ? !backoffLimit.equals(that.backoffLimit) :that.backoffLimit != null) return false;
        if (completions != null ? !completions.equals(that.completions) :that.completions != null) return false;
        if (manualSelector != null ? !manualSelector.equals(that.manualSelector) :that.manualSelector != null) return false;
        if (parallelism != null ? !parallelism.equals(that.parallelism) :that.parallelism != null) return false;
        if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
        if (template != null ? !template.equals(that.template) :that.template != null) return false;
        if (ttlSecondsAfterFinished != null ? !ttlSecondsAfterFinished.equals(that.ttlSecondsAfterFinished) :that.ttlSecondsAfterFinished != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(activeDeadlineSeconds,  backoffLimit,  completions,  manualSelector,  parallelism,  selector,  template,  ttlSecondsAfterFinished,  super.hashCode());
    }

    public class SelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<N>> implements io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

            SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
                        
            }

            SelectorNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V1JobSpecFluentImpl.this.withSelector(builder.build());
            }

            public N endSelector() {
                return and();
            }
    }


    public class TemplateNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl<io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<N>> implements io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder builder;

            TemplateNestedImpl(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
                this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this, item);
                        
            }

            TemplateNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this);
                        
            }

            public N and() {
                return (N) V1JobSpecFluentImpl.this.withTemplate(builder.build());
            }

            public N endTemplate() {
                return and();
            }
    }


}
