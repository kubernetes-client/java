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
public interface V1DownwardAPIVolumeFileFluent<A extends V1DownwardAPIVolumeFileFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectFieldSelector getFieldRef();

  public V1ObjectFieldSelector buildFieldRef();

  public A withFieldRef(V1ObjectFieldSelector fieldRef);

  public Boolean hasFieldRef();

  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRef();

  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRefLike(
      V1ObjectFieldSelector item);

  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editFieldRef();

  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRef();

  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRefLike(
      V1ObjectFieldSelector item);

  public Integer getMode();

  public A withMode(Integer mode);

  public Boolean hasMode();

  public String getPath();

  public A withPath(String path);

  public Boolean hasPath();

  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceFieldSelector getResourceFieldRef();

  public V1ResourceFieldSelector buildResourceFieldRef();

  public A withResourceFieldRef(V1ResourceFieldSelector resourceFieldRef);

  public Boolean hasResourceFieldRef();

  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRef();

  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(
      V1ResourceFieldSelector item);

  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editResourceFieldRef();

  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef();

  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(
      V1ResourceFieldSelector item);

  public interface FieldRefNested<N>
      extends Nested<N>,
          V1ObjectFieldSelectorFluent<V1DownwardAPIVolumeFileFluent.FieldRefNested<N>> {
    public N and();

    public N endFieldRef();
  }

  public interface ResourceFieldRefNested<N>
      extends Nested<N>,
          V1ResourceFieldSelectorFluent<V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>> {
    public N and();

    public N endResourceFieldRef();
  }
}
