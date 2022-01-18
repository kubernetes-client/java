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
public interface V1CustomResourceSubresourcesFluent<
        A extends io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildScale instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale getScale();

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale buildScale();

  public A withScale(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale scale);

  public java.lang.Boolean hasScale();

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      withNewScale();

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      withNewScaleLike(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale item);

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      editScale();

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      editOrNewScale();

  public io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<A>
      editOrNewScaleLike(io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale item);

  public java.lang.Object getStatus();

  public A withStatus(java.lang.Object status);

  public java.lang.Boolean hasStatus();

  public interface ScaleNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScaleFluent<
              io.kubernetes.client.openapi.models.V1CustomResourceSubresourcesFluent.ScaleNested<
                  N>> {
    public N and();

    public N endScale();
  }
}
