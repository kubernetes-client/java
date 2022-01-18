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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1StatefulSetSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent<A> {
  public V1StatefulSetSpecFluentImpl() {}

  public V1StatefulSetSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1StatefulSetSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withPersistentVolumeClaimRetentionPolicy(
        instance.getPersistentVolumeClaimRetentionPolicy());

    this.withPodManagementPolicy(instance.getPodManagementPolicy());

    this.withReplicas(instance.getReplicas());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withServiceName(instance.getServiceName());

    this.withTemplate(instance.getTemplate());

    this.withUpdateStrategy(instance.getUpdateStrategy());

    this.withVolumeClaimTemplates(instance.getVolumeClaimTemplates());
  }

  private java.lang.Integer minReadySeconds;
  private io.kubernetes.client.openapi.models
          .V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder
      persistentVolumeClaimRetentionPolicy;
  private io.kubernetes.client.openapi.models.V1StatefulSetSpec.PodManagementPolicyEnum
      podManagementPolicy;
  private java.lang.Integer replicas;
  private java.lang.Integer revisionHistoryLimit;
  private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder selector;
  private java.lang.String serviceName;
  private io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder template;
  private io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyBuilder updateStrategy;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>
      volumeClaimTemplates;

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

  /**
   * This method has been deprecated, please use method buildPersistentVolumeClaimRetentionPolicy
   * instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
      getPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy != null
        ? this.persistentVolumeClaimRetentionPolicy.build()
        : null;
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
      buildPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy != null
        ? this.persistentVolumeClaimRetentionPolicy.build()
        : null;
  }

  public A withPersistentVolumeClaimRetentionPolicy(
      io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
          persistentVolumeClaimRetentionPolicy) {
    _visitables
        .get("persistentVolumeClaimRetentionPolicy")
        .remove(this.persistentVolumeClaimRetentionPolicy);
    if (persistentVolumeClaimRetentionPolicy != null) {
      this.persistentVolumeClaimRetentionPolicy =
          new io.kubernetes.client.openapi.models
              .V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(
              persistentVolumeClaimRetentionPolicy);
      _visitables
          .get("persistentVolumeClaimRetentionPolicy")
          .add(this.persistentVolumeClaimRetentionPolicy);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPersistentVolumeClaimRetentionPolicy() {
    return this.persistentVolumeClaimRetentionPolicy != null;
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
              .PersistentVolumeClaimRetentionPolicyNested<
          A>
      withNewPersistentVolumeClaimRetentionPolicy() {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl
        .PersistentVolumeClaimRetentionPolicyNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
              .PersistentVolumeClaimRetentionPolicyNested<
          A>
      withNewPersistentVolumeClaimRetentionPolicyLike(
          io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
              item) {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl
        .PersistentVolumeClaimRetentionPolicyNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
              .PersistentVolumeClaimRetentionPolicyNested<
          A>
      editPersistentVolumeClaimRetentionPolicy() {
    return withNewPersistentVolumeClaimRetentionPolicyLike(
        getPersistentVolumeClaimRetentionPolicy());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
              .PersistentVolumeClaimRetentionPolicyNested<
          A>
      editOrNewPersistentVolumeClaimRetentionPolicy() {
    return withNewPersistentVolumeClaimRetentionPolicyLike(
        getPersistentVolumeClaimRetentionPolicy() != null
            ? getPersistentVolumeClaimRetentionPolicy()
            : new io.kubernetes.client.openapi.models
                    .V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
              .PersistentVolumeClaimRetentionPolicyNested<
          A>
      editOrNewPersistentVolumeClaimRetentionPolicyLike(
          io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
              item) {
    return withNewPersistentVolumeClaimRetentionPolicyLike(
        getPersistentVolumeClaimRetentionPolicy() != null
            ? getPersistentVolumeClaimRetentionPolicy()
            : item);
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpec.PodManagementPolicyEnum
      getPodManagementPolicy() {
    return this.podManagementPolicy;
  }

  public A withPodManagementPolicy(
      io.kubernetes.client.openapi.models.V1StatefulSetSpec.PodManagementPolicyEnum
          podManagementPolicy) {
    this.podManagementPolicy = podManagementPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasPodManagementPolicy() {
    return this.podManagementPolicy != null;
  }

  public java.lang.Integer getReplicas() {
    return this.replicas;
  }

  public A withReplicas(java.lang.Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }

  public java.lang.Boolean hasReplicas() {
    return this.replicas != null;
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

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A>
      withNewSelector() {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl.SelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A>
      withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl.SelectorNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A>
      editSelector() {
    return withNewSelectorLike(getSelector());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A>
      editOrNewSelector() {
    return withNewSelectorLike(
        getSelector() != null
            ? getSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<A>
      editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewSelectorLike(getSelector() != null ? getSelector() : item);
  }

  public java.lang.String getServiceName() {
    return this.serviceName;
  }

  public A withServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return (A) this;
  }

  public java.lang.Boolean hasServiceName() {
    return this.serviceName != null;
  }

  /** Method is deprecated. use withServiceName instead. */
  @java.lang.Deprecated
  public A withNewServiceName(java.lang.String original) {
    return (A) withServiceName(new String(original));
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

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A>
      withNewTemplate() {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl.TemplateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A>
      withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl.TemplateNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A>
      editTemplate() {
    return withNewTemplateLike(getTemplate());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A>
      editOrNewTemplate() {
    return withNewTemplateLike(
        getTemplate() != null
            ? getTemplate()
            : new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<A>
      editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate() : item);
  }

  /**
   * This method has been deprecated, please use method buildUpdateStrategy instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy getUpdateStrategy() {
    return this.updateStrategy != null ? this.updateStrategy.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy buildUpdateStrategy() {
    return this.updateStrategy != null ? this.updateStrategy.build() : null;
  }

  public A withUpdateStrategy(
      io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy updateStrategy) {
    _visitables.get("updateStrategy").remove(this.updateStrategy);
    if (updateStrategy != null) {
      this.updateStrategy =
          new io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyBuilder(
              updateStrategy);
      _visitables.get("updateStrategy").add(this.updateStrategy);
    }
    return (A) this;
  }

  public java.lang.Boolean hasUpdateStrategy() {
    return this.updateStrategy != null;
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A>
      withNewUpdateStrategy() {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl
        .UpdateStrategyNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A>
      withNewUpdateStrategyLike(
          io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy item) {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl
        .UpdateStrategyNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A>
      editUpdateStrategy() {
    return withNewUpdateStrategyLike(getUpdateStrategy());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A>
      editOrNewUpdateStrategy() {
    return withNewUpdateStrategyLike(
        getUpdateStrategy() != null
            ? getUpdateStrategy()
            : new io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<A>
      editOrNewUpdateStrategyLike(
          io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy item) {
    return withNewUpdateStrategyLike(getUpdateStrategy() != null ? getUpdateStrategy() : item);
  }

  public A addToVolumeClaimTemplates(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder =
        new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(item);
    _visitables
        .get("volumeClaimTemplates")
        .add(index >= 0 ? index : _visitables.get("volumeClaimTemplates").size(), builder);
    this.volumeClaimTemplates.add(index >= 0 ? index : volumeClaimTemplates.size(), builder);
    return (A) this;
  }

  public A setToVolumeClaimTemplates(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>();
    }
    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder =
        new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(item);
    if (index < 0 || index >= _visitables.get("volumeClaimTemplates").size()) {
      _visitables.get("volumeClaimTemplates").add(builder);
    } else {
      _visitables.get("volumeClaimTemplates").set(index, builder);
    }
    if (index < 0 || index >= volumeClaimTemplates.size()) {
      volumeClaimTemplates.add(builder);
    } else {
      volumeClaimTemplates.set(index, builder);
    }
    return (A) this;
  }

  public A addToVolumeClaimTemplates(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(item);
      _visitables.get("volumeClaimTemplates").add(builder);
      this.volumeClaimTemplates.add(builder);
    }
    return (A) this;
  }

  public A addAllToVolumeClaimTemplates(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim> items) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(item);
      _visitables.get("volumeClaimTemplates").add(builder);
      this.volumeClaimTemplates.add(builder);
    }
    return (A) this;
  }

  public A removeFromVolumeClaimTemplates(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... items) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(item);
      _visitables.get("volumeClaimTemplates").remove(builder);
      if (this.volumeClaimTemplates != null) {
        this.volumeClaimTemplates.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromVolumeClaimTemplates(
      java.util.Collection<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim> items) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item : items) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(item);
      _visitables.get("volumeClaimTemplates").remove(builder);
      if (this.volumeClaimTemplates != null) {
        this.volumeClaimTemplates.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromVolumeClaimTemplates(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>
          predicate) {
    if (volumeClaimTemplates == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder> each =
        volumeClaimTemplates.iterator();
    final List visitables = _visitables.get("volumeClaimTemplates");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplates instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim>
      getVolumeClaimTemplates() {
    return volumeClaimTemplates != null ? build(volumeClaimTemplates) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim>
      buildVolumeClaimTemplates() {
    return volumeClaimTemplates != null ? build(volumeClaimTemplates) : null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim buildVolumeClaimTemplate(
      java.lang.Integer index) {
    return this.volumeClaimTemplates.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim
      buildFirstVolumeClaimTemplate() {
    return this.volumeClaimTemplates.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim
      buildLastVolumeClaimTemplate() {
    return this.volumeClaimTemplates.get(volumeClaimTemplates.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaim
      buildMatchingVolumeClaimTemplate(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>
              predicate) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder item :
        volumeClaimTemplates) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingVolumeClaimTemplate(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder item :
        volumeClaimTemplates) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withVolumeClaimTemplates(
      java.util.List<io.kubernetes.client.openapi.models.V1PersistentVolumeClaim>
          volumeClaimTemplates) {
    if (this.volumeClaimTemplates != null) {
      _visitables.get("volumeClaimTemplates").removeAll(this.volumeClaimTemplates);
    }
    if (volumeClaimTemplates != null) {
      this.volumeClaimTemplates = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item :
          volumeClaimTemplates) {
        this.addToVolumeClaimTemplates(item);
      }
    } else {
      this.volumeClaimTemplates = null;
    }
    return (A) this;
  }

  public A withVolumeClaimTemplates(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaim... volumeClaimTemplates) {
    if (this.volumeClaimTemplates != null) {
      this.volumeClaimTemplates.clear();
    }
    if (volumeClaimTemplates != null) {
      for (io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item :
          volumeClaimTemplates) {
        this.addToVolumeClaimTemplates(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasVolumeClaimTemplates() {
    return volumeClaimTemplates != null && !volumeClaimTemplates.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A>
      addNewVolumeClaimTemplate() {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl
        .VolumeClaimTemplatesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A>
      addNewVolumeClaimTemplateLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item) {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl
        .VolumeClaimTemplatesNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A>
      setNewVolumeClaimTemplateLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item) {
    return new io.kubernetes.client.openapi.models.V1StatefulSetSpecFluentImpl
        .VolumeClaimTemplatesNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A>
      editVolumeClaimTemplate(java.lang.Integer index) {
    if (volumeClaimTemplates.size() <= index)
      throw new RuntimeException("Can't edit volumeClaimTemplates. Index exceeds size.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A>
      editFirstVolumeClaimTemplate() {
    if (volumeClaimTemplates.size() == 0)
      throw new RuntimeException("Can't edit first volumeClaimTemplates. The list is empty.");
    return setNewVolumeClaimTemplateLike(0, buildVolumeClaimTemplate(0));
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A>
      editLastVolumeClaimTemplate() {
    int index = volumeClaimTemplates.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last volumeClaimTemplates. The list is empty.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }

  public io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<A>
      editMatchingVolumeClaimTemplate(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < volumeClaimTemplates.size(); i++) {
      if (predicate.test(volumeClaimTemplates.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching volumeClaimTemplates. No match found.");
    return setNewVolumeClaimTemplateLike(index, buildVolumeClaimTemplate(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1StatefulSetSpecFluentImpl that = (V1StatefulSetSpecFluentImpl) o;
    if (minReadySeconds != null
        ? !minReadySeconds.equals(that.minReadySeconds)
        : that.minReadySeconds != null) return false;
    if (persistentVolumeClaimRetentionPolicy != null
        ? !persistentVolumeClaimRetentionPolicy.equals(that.persistentVolumeClaimRetentionPolicy)
        : that.persistentVolumeClaimRetentionPolicy != null) return false;
    if (podManagementPolicy != null
        ? !podManagementPolicy.equals(that.podManagementPolicy)
        : that.podManagementPolicy != null) return false;
    if (replicas != null ? !replicas.equals(that.replicas) : that.replicas != null) return false;
    if (revisionHistoryLimit != null
        ? !revisionHistoryLimit.equals(that.revisionHistoryLimit)
        : that.revisionHistoryLimit != null) return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (serviceName != null ? !serviceName.equals(that.serviceName) : that.serviceName != null)
      return false;
    if (template != null ? !template.equals(that.template) : that.template != null) return false;
    if (updateStrategy != null
        ? !updateStrategy.equals(that.updateStrategy)
        : that.updateStrategy != null) return false;
    if (volumeClaimTemplates != null
        ? !volumeClaimTemplates.equals(that.volumeClaimTemplates)
        : that.volumeClaimTemplates != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        minReadySeconds,
        persistentVolumeClaimRetentionPolicy,
        podManagementPolicy,
        replicas,
        revisionHistoryLimit,
        selector,
        serviceName,
        template,
        updateStrategy,
        volumeClaimTemplates,
        super.hashCode());
  }

  public class PersistentVolumeClaimRetentionPolicyNestedImpl<N>
      extends io.kubernetes.client.openapi.models
              .V1StatefulSetPersistentVolumeClaimRetentionPolicyFluentImpl<
          io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
                  .PersistentVolumeClaimRetentionPolicyNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
                  .PersistentVolumeClaimRetentionPolicyNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    PersistentVolumeClaimRetentionPolicyNestedImpl(
        io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy
            item) {
      this.builder =
          new io.kubernetes.client.openapi.models
              .V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(this, item);
    }

    PersistentVolumeClaimRetentionPolicyNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models
              .V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicyBuilder
        builder;

    public N and() {
      return (N)
          V1StatefulSetSpecFluentImpl.this.withPersistentVolumeClaimRetentionPolicy(
              builder.build());
    }

    public N endPersistentVolumeClaimRetentionPolicy() {
      return and();
    }
  }

  public class SelectorNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.SelectorNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
    }

    SelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.withSelector(builder.build());
    }

    public N endSelector() {
      return and();
    }
  }

  public class TemplateNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl<
          io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<N>>
      implements io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.TemplateNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    TemplateNestedImpl(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this, item);
    }

    TemplateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder builder;

    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.withTemplate(builder.build());
    }

    public N endTemplate() {
      return and();
    }
  }

  public class UpdateStrategyNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyFluentImpl<
          io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<N>>
      implements io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.UpdateStrategyNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    UpdateStrategyNestedImpl(io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyBuilder(this, item);
    }

    UpdateStrategyNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategyBuilder builder;

    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.withUpdateStrategy(builder.build());
    }

    public N endUpdateStrategy() {
      return and();
    }
  }

  public class VolumeClaimTemplatesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimFluentImpl<
          io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent.VolumeClaimTemplatesNested<N>>
      implements io.kubernetes.client.openapi.models.V1StatefulSetSpecFluent
                  .VolumeClaimTemplatesNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    VolumeClaimTemplatesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1PersistentVolumeClaim item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(this, item);
    }

    VolumeClaimTemplatesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1StatefulSetSpecFluentImpl.this.setToVolumeClaimTemplates(index, builder.build());
    }

    public N endVolumeClaimTemplate() {
      return and();
    }
  }
}
