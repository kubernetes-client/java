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
public interface V1beta1SELinuxStrategyOptionsFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getRule();

  public A withRule(java.lang.String rule);

  public java.lang.Boolean hasRule();

  /** Method is deprecated. use withRule instead. */
  @java.lang.Deprecated
  public A withNewRule(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildSeLinuxOptions instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SELinuxOptions getSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1SELinuxOptions buildSeLinuxOptions();

  public A withSeLinuxOptions(io.kubernetes.client.openapi.models.V1SELinuxOptions seLinuxOptions);

  public java.lang.Boolean hasSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      withNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      withNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editOrNewSeLinuxOptions();

  public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
              .SeLinuxOptionsNested<
          A>
      editOrNewSeLinuxOptionsLike(io.kubernetes.client.openapi.models.V1SELinuxOptions item);

  public interface SeLinuxOptionsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<
              io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent
                      .SeLinuxOptionsNested<
                  N>> {
    public N and();

    public N endSeLinuxOptions();
  }
}
