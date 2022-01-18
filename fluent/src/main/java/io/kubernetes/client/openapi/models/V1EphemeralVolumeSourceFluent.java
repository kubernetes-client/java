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
public interface V1EphemeralVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplate instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate
      getVolumeClaimTemplate();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate
      buildVolumeClaimTemplate();

  public A withVolumeClaimTemplate(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate volumeClaimTemplate);

  public java.lang.Boolean hasVolumeClaimTemplate();

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      withNewVolumeClaimTemplate();

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      withNewVolumeClaimTemplateLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate item);

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      editVolumeClaimTemplate();

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      editOrNewVolumeClaimTemplate();

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
              .VolumeClaimTemplateNested<
          A>
      editOrNewVolumeClaimTemplateLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate item);

  public interface VolumeClaimTemplateNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplateFluent<
              io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent
                      .VolumeClaimTemplateNested<
                  N>> {
    public N and();

    public N endVolumeClaimTemplate();
  }
}
