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

/** Generated */
public class V1DaemonSetSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent<A> {
  public V1DaemonSetSpecFluentImpl() {}

  public V1DaemonSetSpecFluentImpl(io.kubernetes.client.openapi.models.V1DaemonSetSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.withUpdateStrategy(instance.getUpdateStrategy());
  }

  private java.lang.Integer minReadySeconds;
  private java.lang.Integer revisionHistoryLimit;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
  private io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder template;
  private io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder updateStrategy;

  public java.lang.Integer getMinReadySeconds() {
    return this.minReadySeconds;
  }

  public A withMinReadySeconds(java.lang.Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return (A) this;
  }

  public java.lang.Boolean hasMinReadySeconds() {
    return this.minReadySeconds != null;
  }

  public java.lang.Integer getRevisionHistoryLimit() {
    return this.revisionHistoryLimit;
  }

  public A withRevisionHistoryLimit(java.lang.Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return (A) this;
  }

  public java.lang.Boolean hasRevisionHistoryLimit() {
    return this.revisionHistoryLimit != null;
  }

  /**
   * This method has been deprecated, please use method buildSelector instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector() {
    return this.selector != null ? this.selector.build() : null;
  }

  public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector) {
    _visitables.get("selector").remove(this.selector);
    if (selector != null) {
      this.selector = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(selector);
      _visitables.get("selector").add(this.selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A>
      withNewSelector() {
    return new io.kubernetes.client.openapi.models.V1DaemonSetSpecFluentImpl.SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1DaemonSetSpecFluentImpl.SelectorNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A>
      editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A>
      editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  /**
   * This method has been deprecated, please use method buildTemplate instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate() {
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

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A>
      withNewTemplate() {
    return new io.kubernetes.client.openapi.models.V1DaemonSetSpecFluentImpl.TemplateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A>
      withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return new io.kubernetes.client.openapi.models.V1DaemonSetSpecFluentImpl.TemplateNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A>
      editTemplate() {
    return withNewTemplateLike(getTemplate());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A>
      editOrNewTemplate() {
    return withNewTemplateLike(
        getTemplate() != null
            ? getTemplate()
            : new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<A>
      editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate() : item);
  }

  /**
   * This method has been deprecated, please use method buildUpdateStrategy instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy getUpdateStrategy() {
    return this.updateStrategy != null ? this.updateStrategy.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy buildUpdateStrategy() {
    return this.updateStrategy != null ? this.updateStrategy.build() : null;
  }

  public A withUpdateStrategy(
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy updateStrategy) {
    _visitables.get("updateStrategy").remove(this.updateStrategy);
    if (updateStrategy != null) {
      this.updateStrategy =
          new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder(updateStrategy);
      _visitables.get("updateStrategy").add(this.updateStrategy);
    }
    return (A) this;
  }

  public java.lang.Boolean hasUpdateStrategy() {
    return this.updateStrategy != null;
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A>
      withNewUpdateStrategy() {
    return new io.kubernetes.client.openapi.models.V1DaemonSetSpecFluentImpl
        .UpdateStrategyNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A>
      withNewUpdateStrategyLike(
          io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy item) {
    return new io.kubernetes.client.openapi.models.V1DaemonSetSpecFluentImpl
        .UpdateStrategyNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A>
      editUpdateStrategy() {
    return withNewUpdateStrategyLike(getUpdateStrategy());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A>
      editOrNewUpdateStrategy() {
    return withNewUpdateStrategyLike(
        getUpdateStrategy() != null
            ? getUpdateStrategy()
            : new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<A>
      editOrNewUpdateStrategyLike(
          io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy item) {
    return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonSetSpecFluentImpl that = (V1DaemonSetSpecFluentImpl) o;
    if (minReadySeconds != null
        ? !minReadySeconds.equals(that.minReadySeconds)
        : that.minReadySeconds != null) return false;
    if (revisionHistoryLimit != null
        ? !revisionHistoryLimit.equals(that.revisionHistoryLimit)
        : that.revisionHistoryLimit != null) return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (template != null ? !template.equals(that.template) : that.template != null) return false;
    if (updateStrategy != null
        ? !updateStrategy.equals(that.updateStrategy)
        : that.updateStrategy != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        minReadySeconds,
        revisionHistoryLimit,
        selector,
        template,
        updateStrategy,
        super.hashCode());
  }

  public class SelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.SelectorNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1DaemonSetSpecFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }

  public class TemplateNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl<
          io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<N>>
      implements io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.TemplateNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TemplateNestedImpl(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this, item);
    }

    TemplateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder builder;

    public N and() {
      return (N) V1DaemonSetSpecFluentImpl.this.withTemplate(builder.build());
    }

    public N endTemplate() {
      return and();
    }
  }

  public class UpdateStrategyNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluentImpl<
          io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<N>>
      implements io.kubernetes.client.openapi.models.V1DaemonSetSpecFluent.UpdateStrategyNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    UpdateStrategyNestedImpl(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder(this, item);
    }

    UpdateStrategyNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyBuilder builder;

    public N and() {
      return (N) V1DaemonSetSpecFluentImpl.this.withUpdateStrategy(builder.build());
    }

    public N endUpdateStrategy() {
      return and();
    }
  }
}
