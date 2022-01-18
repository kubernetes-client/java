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
public interface V1CephFSVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToMonitors(java.lang.Integer index, java.lang.String item);

  public A setToMonitors(java.lang.Integer index, java.lang.String item);

  public A addToMonitors(java.lang.String... items);

  public A addAllToMonitors(java.util.Collection<java.lang.String> items);

  public A removeFromMonitors(java.lang.String... items);

  public A removeAllFromMonitors(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getMonitors();

  public java.lang.String getMonitor(java.lang.Integer index);

  public java.lang.String getFirstMonitor();

  public java.lang.String getLastMonitor();

  public java.lang.String getMatchingMonitor(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingMonitor(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withMonitors(java.util.List<java.lang.String> monitors);

  public A withMonitors(java.lang.String... monitors);

  public java.lang.Boolean hasMonitors();

  public A addNewMonitor(java.lang.String original);

  public java.lang.String getPath();

  public A withPath(java.lang.String path);

  public java.lang.Boolean hasPath();

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original);

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();

  public java.lang.String getSecretFile();

  public A withSecretFile(java.lang.String secretFile);

  public java.lang.Boolean hasSecretFile();

  /** Method is deprecated. use withSecretFile instead. */
  @java.lang.Deprecated
  public A withNewSecretFile(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalObjectReference getSecretRef();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef();

  public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef);

  public java.lang.Boolean hasSecretRef();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRef();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      editSecretRef();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public java.lang.String getUser();

  public A withUser(java.lang.String user);

  public java.lang.Boolean hasUser();

  /** Method is deprecated. use withUser instead. */
  @java.lang.Deprecated
  public A withNewUser(java.lang.String original);

  public interface SecretRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent.SecretRefNested<N>> {
    public N and();

    public N endSecretRef();
  }
}
