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
public interface V1NodeConfigStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildActive instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getActive();

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildActive();

  public A withActive(io.kubernetes.client.openapi.models.V1NodeConfigSource active);

  public java.lang.Boolean hasActive();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      withNewActive();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      withNewActiveLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A> editActive();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      editOrNewActive();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<A>
      editOrNewActiveLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  /**
   * This method has been deprecated, please use method buildAssigned instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getAssigned();

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildAssigned();

  public A withAssigned(io.kubernetes.client.openapi.models.V1NodeConfigSource assigned);

  public java.lang.Boolean hasAssigned();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      withNewAssigned();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      withNewAssignedLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      editAssigned();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      editOrNewAssigned();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<A>
      editOrNewAssignedLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  public java.lang.String getError();

  public A withError(java.lang.String error);

  public java.lang.Boolean hasError();

  /** Method is deprecated. use withError instead. */
  @java.lang.Deprecated
  public A withNewError(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildLastKnownGood instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NodeConfigSource getLastKnownGood();

  public io.kubernetes.client.openapi.models.V1NodeConfigSource buildLastKnownGood();

  public A withLastKnownGood(io.kubernetes.client.openapi.models.V1NodeConfigSource lastKnownGood);

  public java.lang.Boolean hasLastKnownGood();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      withNewLastKnownGood();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      withNewLastKnownGoodLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      editLastKnownGood();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      editOrNewLastKnownGood();

  public io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<A>
      editOrNewLastKnownGoodLike(io.kubernetes.client.openapi.models.V1NodeConfigSource item);

  public interface ActiveNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<
              io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.ActiveNested<N>> {
    public N and();

    public N endActive();
  }

  public interface AssignedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<
              io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.AssignedNested<N>> {
    public N and();

    public N endAssigned();
  }

  public interface LastKnownGoodNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NodeConfigSourceFluent<
              io.kubernetes.client.openapi.models.V1NodeConfigStatusFluent.LastKnownGoodNested<N>> {
    public N and();

    public N endLastKnownGood();
  }
}
