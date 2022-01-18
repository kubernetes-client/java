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
public class V1beta1SELinuxStrategyOptionsFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<A> {
  public V1beta1SELinuxStrategyOptionsFluentImpl() {}

  public V1beta1SELinuxStrategyOptionsFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions instance) {
    this.withRule(instance.getRule());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());
  }

  private java.lang.String rule;
  private io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder seLinuxOptions;

  public java.lang.String getRule() {
    return this.rule;
  }

  public A withRule(java.lang.String rule) {
    this.rule = rule;
    return (A) this;
  }

  public java.lang.Boolean hasRule() {
    return this.rule != null;
  }

  /** Method is deprecated. use withRule instead. */
  @java.lang.Deprecated
  public A withNewRule(java.lang.String original) {
    return (A) withRule(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SELinuxOptions getSeLinuxOptions() {
    return this.seLinuxOptions != null ? this.seLinuxOptions.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SELinuxOptions buildSeLinuxOptions() {
    return this.seLinuxOptions != null ? this.seLinuxOptions.build() : null;
  }

  public A withSeLinuxOptions(io.kubernetes.client.openapi.models.V1SELinuxOptions seLinuxOptions) {
    _visitables.get("seLinuxOptions").remove(this.seLinuxOptions);
    if (seLinuxOptions != null) {
      this.seLinuxOptions =
          new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder(seLinuxOptions);
      _visitables.get("seLinuxOptions").add(this.seLinuxOptions);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSeLinuxOptions() {
    return this.seLinuxOptions != null;
  }

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      withNewSeLinuxOptions() {
    return new io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluentImpl
        .SeLinuxOptionsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item) {
    return new io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluentImpl
        .SeLinuxOptionsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions());
  }

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editOrNewSeLinuxOptions() {
    return withNewSeLinuxOptionsLike(
        getSeLinuxOptions() != null
            ? getSeLinuxOptions()
            : new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editOrNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item) {
    return withNewSeLinuxOptionsLike(getSeLinuxOptions() != null ? getSeLinuxOptions() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1SELinuxStrategyOptionsFluentImpl that = (V1beta1SELinuxStrategyOptionsFluentImpl) o;
    if (rule != null ? !rule.equals(that.rule) : that.rule != null) return false;
    if (seLinuxOptions != null
        ? !seLinuxOptions.equals(that.seLinuxOptions)
        : that.seLinuxOptions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(rule, seLinuxOptions, super.hashCode());
  }

  public class SeLinuxOptionsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluentImpl<
          io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
                  .SeLinuxOptionsNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
                  .SeLinuxOptionsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SeLinuxOptionsNestedImpl(io.kubernetes.client.openapi.models.V1SELinuxOptions item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder(this, item);
    }

    SeLinuxOptionsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SELinuxOptionsBuilder builder;

    public N and() {
      return (N) V1beta1SELinuxStrategyOptionsFluentImpl.this.withSeLinuxOptions(builder.build());
    }

    public N endSeLinuxOptions() {
      return and();
    }
  }
}
