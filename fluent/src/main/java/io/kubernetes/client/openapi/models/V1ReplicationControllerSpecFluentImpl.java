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
public class V1ReplicationControllerSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<A> {
  public V1ReplicationControllerSpecFluentImpl() {}

  public V1ReplicationControllerSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpec instance) {
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());
  }

  private java.lang.Integer minReadySeconds;
  private java.lang.Integer replicas;
  private java.util.Map<java.lang.String, java.lang.String> selector;
  private io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder template;

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

  public A addToSelector(java.lang.String key, java.lang.String value) {
    if (this.selector == null && key != null && value != null) {
      this.selector = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.selector.put(key, value);
    }
    return (A) this;
  }

  public A addToSelector(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.selector == null && map != null) {
      this.selector = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.selector.putAll(map);
    }
    return (A) this;
  }

  public A removeFromSelector(java.lang.String key) {
    if (this.selector == null) {
      return (A) this;
    }
    if (key != null && this.selector != null) {
      this.selector.remove(key);
    }
    return (A) this;
  }

  public A removeFromSelector(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.selector == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.selector != null) {
          this.selector.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getSelector() {
    return this.selector;
  }

  public <K, V> A withSelector(java.util.Map<java.lang.String, java.lang.String> selector) {
    if (selector == null) {
      this.selector = null;
    } else {
      this.selector = new java.util.LinkedHashMap(selector);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
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

  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A>
      withNewTemplate() {
    return new io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluentImpl
        .TemplateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A>
      withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return new io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluentImpl
        .TemplateNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A>
      editTemplate() {
    return withNewTemplateLike(getTemplate());
  }

  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A>
      editOrNewTemplate() {
    return withNewTemplateLike(
        getTemplate() != null
            ? getTemplate()
            : new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<A>
      editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
    return withNewTemplateLike(getTemplate() != null ? getTemplate() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ReplicationControllerSpecFluentImpl that = (V1ReplicationControllerSpecFluentImpl) o;
    if (minReadySeconds != null
        ? !minReadySeconds.equals(that.minReadySeconds)
        : that.minReadySeconds != null) return false;
    if (replicas != null ? !replicas.equals(that.replicas) : that.replicas != null) return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    if (template != null ? !template.equals(that.template) : that.template != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(minReadySeconds, replicas, selector, template, super.hashCode());
  }

  public class TemplateNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PodTemplateSpecFluentImpl<
          io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent.TemplateNested<N>>
      implements io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent
                  .TemplateNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    TemplateNestedImpl(io.kubernetes.client.openapi.models.V1PodTemplateSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this, item);
    }

    TemplateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PodTemplateSpecBuilder builder;

    public N and() {
      return (N) V1ReplicationControllerSpecFluentImpl.this.withTemplate(builder.build());
    }

    public N endTemplate() {
      return and();
    }
  }
}
