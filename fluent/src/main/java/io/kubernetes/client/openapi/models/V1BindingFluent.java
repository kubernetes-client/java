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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1BindingFluent<A extends V1BindingFluent<A>> extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public V1ObjectMeta buildMetadata();

  public A withMetadata(V1ObjectMeta metadata);

  public Boolean hasMetadata();

  public V1BindingFluent.MetadataNested<A> withNewMetadata();

  public V1BindingFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);

  public V1BindingFluent.MetadataNested<A> editMetadata();

  public V1BindingFluent.MetadataNested<A> editOrNewMetadata();

  public V1BindingFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTarget();

  public V1ObjectReference buildTarget();

  public A withTarget(V1ObjectReference target);

  public Boolean hasTarget();

  public V1BindingFluent.TargetNested<A> withNewTarget();

  public V1BindingFluent.TargetNested<A> withNewTargetLike(V1ObjectReference item);

  public V1BindingFluent.TargetNested<A> editTarget();

  public V1BindingFluent.TargetNested<A> editOrNewTarget();

  public V1BindingFluent.TargetNested<A> editOrNewTargetLike(V1ObjectReference item);

  public interface MetadataNested<N>
      extends Nested<N>, V1ObjectMetaFluent<V1BindingFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface TargetNested<N>
      extends Nested<N>, V1ObjectReferenceFluent<V1BindingFluent.TargetNested<N>> {
    public N and();

    public N endTarget();
  }
}
