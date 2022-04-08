/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1JobSpecFluentImpl<A extends V1JobSpecFluent<A>> extends BaseFluent<A>
    implements V1JobSpecFluent<A> {
  public V1JobSpecFluentImpl() {}

  public V1JobSpecFluentImpl(io.kubernetes.client.openapi.models.V1JobSpec instance) {
    this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    this.withBackoffLimit(instance.getBackoffLimit());

    this.withCompletionMode(instance.getCompletionMode());

    this.withCompletions(instance.getCompletions());

    this.withManualSelector(instance.getManualSelector());

    this.withParallelism(instance.getParallelism());

    this.withSelector(instance.getSelector());

    this.withSuspend(instance.getSuspend());

    this.withTemplate(instance.getTemplate());

    this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());
  }

  private Long activeDeadlineSeconds;
  private Integer backoffLimit;
  private String completionMode;
  private java.lang.Integer completions;
  private Boolean manualSelector;
  private java.lang.Integer parallelism;
  private V1LabelSelectorBuilder selector;
  private java.lang.Boolean suspend;
  private V1PodTemplateSpecBuilder template;
  private java.lang.Integer ttlSecondsAfterFinished;

  public java.lang.Long getActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds;
  }

  public A withActiveDeadlineSeconds(java.lang.Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasActiveDeadlineSeconds() {
    return this.activeDeadlineSeconds != null;
  }

  public java.lang.Integer getBackoffLimit() {
    return this.backoffLimit;
  }

  public A withBackoffLimit(java.lang.Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
    return (A) this;
  }

  public java.lang.Boolean hasBackoffLimit() {
    return this.backoffLimit != null;
  }

  public java.lang.String getCompletionMode() {
    return this.completionMode;
  }

  public A withCompletionMode(java.lang.String completionMode) {
    this.completionMode = completionMode;
    return (A) this;
  }

  public java.lang.Boolean hasCompletionMode() {
    return this.completionMode != null;
  }

  public java.lang.Integer getCompletions() {
    return this.completions;
  }

  public A withCompletions(java.lang.Integer completions) {
    this.completions = completions;
    return (A) this;
  }

  public java.lang.Boolean hasCompletions() {
    return this.completions != null;
  }

  public java.lang.Boolean getManualSelector() {
    return this.manualSelector;
  }

  public A withManualSelector(java.lang.Boolean manualSelector) {
    this.manualSelector = manualSelector;
    return (A) this;
  }

  public java.lang.Boolean hasManualSelector() {
    return this.manualSelector != null;
  }

  public java.lang.Integer getParallelism() {
    return this.parallelism;
  }

  public A withParallelism(java.lang.Integer parallelism) {
    this.parallelism = parallelism;
    return (A) this;
  }

  public java.lang.Boolean hasParallelism() {
    return this.parallelism != null;
  }

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector != null) {
      this.selector = new V1LabelSelectorBuilder(selector);
      _visitables.get("selector").add(this.selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public V1JobSpecFluent.SelectorNested<A> withNewSelector() {
    return new V1JobSpecFluentImpl.SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> withNewSelectorLike(
      io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V1JobSpecFluentImpl.SelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A> editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  public java.lang.Boolean getSuspend() {
    return this.suspend;
  }

  public A withSuspend(java.lang.Boolean suspend) {
    this.suspend = suspend;
    return (A) this;
  }

  public java.lang.Boolean hasSuspend() {
    return this.suspend != null;
  }

  /**
   * This method has been deprecated, please use method buildTemplate instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1PodTemplateSpec getTemplate() {
    return this.template != null ? this.template.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate() {
    return this.template != null ? this.template.build() : null;
  }

  public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template) {
    _visitables.get("template").remove(this.template);
    if (template != null) {
      this.template = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(template);
      _visitables.get("template").add(this.template);
    }
    return (A) this;
  }

  public java.lang.Boolean hasTemplate() {
    return this.template != null;
  }

  public V1JobSpecFluent.TemplateNested<A> withNewTemplate() {
    return new V1JobSpecFluentImpl.TemplateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> withNewTemplateLike(
      io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return new io.kubernetes.client.openapi.models.V1JobSpecFluentImpl.TemplateNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editTemplate() {
    return withNewTemplateLike(getTemplate());
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A> editOrNewTemplate() {
    return withNewTemplateLike(
        getTemplate() != null
            ? getTemplate()
            : new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<A>
      editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate() : item);
  }

  public java.lang.Integer getTtlSecondsAfterFinished() {
    return this.ttlSecondsAfterFinished;
  }

  public A withTtlSecondsAfterFinished(java.lang.Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return (A) this;
  }

  public java.lang.Boolean hasTtlSecondsAfterFinished() {
    return this.ttlSecondsAfterFinished != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1JobSpecFluentImpl that = (V1JobSpecFluentImpl) o;
    if (activeDeadlineSeconds != null
        ? !activeDeadlineSeconds.equals(that.activeDeadlineSeconds)
        : that.activeDeadlineSeconds != null) return false;
    if (backoffLimit != null ? !backoffLimit.equals(that.backoffLimit) : that.backoffLimit != null)
      return false;
    if (completionMode != null
        ? !completionMode.equals(that.completionMode)
        : that.completionMode != null) return false;
    if (completions != null ? !completions.equals(that.completions) : that.completions != null)
      return false;
    if (manualSelector != null
        ? !manualSelector.equals(that.manualSelector)
        : that.manualSelector != null) return false;
    if (parallelism != null ? !parallelism.equals(that.parallelism) : that.parallelism != null)
      return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (suspend != null ? !suspend.equals(that.suspend) : that.suspend != null) return false;
    if (template != null ? !template.equals(that.template) : that.template != null) return false;
    if (ttlSecondsAfterFinished != null
        ? !ttlSecondsAfterFinished.equals(that.ttlSecondsAfterFinished)
        : that.ttlSecondsAfterFinished != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        activeDeadlineSeconds,
        backoffLimit,
        completionMode,
        completions,
        manualSelector,
        parallelism,
        selector,
        suspend,
        template,
        ttlSecondsAfterFinished,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (activeDeadlineSeconds != null) {
      sb.append("activeDeadlineSeconds:");
      sb.append(activeDeadlineSeconds + ",");
    }
    if (backoffLimit != null) {
      sb.append("backoffLimit:");
      sb.append(backoffLimit + ",");
    }
    if (completionMode != null) {
      sb.append("completionMode:");
      sb.append(completionMode + ",");
    }
    if (completions != null) {
      sb.append("completions:");
      sb.append(completions + ",");
    }
    if (manualSelector != null) {
      sb.append("manualSelector:");
      sb.append(manualSelector + ",");
    }
    if (parallelism != null) {
      sb.append("parallelism:");
      sb.append(parallelism + ",");
    }
    if (selector != null) {
      sb.append("selector:");
      sb.append(selector + ",");
    }
    if (suspend != null) {
      sb.append("suspend:");
      sb.append(suspend + ",");
    }
    if (template != null) {
      sb.append("template:");
      sb.append(template + ",");
    }
    if (ttlSecondsAfterFinished != null) {
      sb.append("ttlSecondsAfterFinished:");
      sb.append(ttlSecondsAfterFinished);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withManualSelector() {
    return withManualSelector(true);
  }

  public A withSuspend() {
    return withSuspend(true);
  }

  class SelectorNestedImpl<N> extends V1LabelSelectorFluentImpl<V1JobSpecFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1JobSpecFluent.SelectorNested<N>, Nested<N> {
    SelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1JobSpecFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }

  class TemplateNestedImpl<N> extends V1PodTemplateSpecFluentImpl<V1JobSpecFluent.TemplateNested<N>>
      implements io.kubernetes.client.openapi.models.V1JobSpecFluent.TemplateNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TemplateNestedImpl(V1PodTemplateSpec item) {
      this.builder = new V1PodTemplateSpecBuilder(this, item);
    }

    TemplateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder builder;

    public N and() {
      return (N) V1JobSpecFluentImpl.this.withTemplate(builder.build());
    }

    public N endTemplate() {
      return and();
    }
  }
}
