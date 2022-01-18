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
public interface V1VsphereVirtualDiskVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getFsType();

  public A withFsType(java.lang.String fsType);

  public java.lang.Boolean hasFsType();

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original);

  public java.lang.String getStoragePolicyID();

  public A withStoragePolicyID(java.lang.String storagePolicyID);

  public java.lang.Boolean hasStoragePolicyID();

  /** Method is deprecated. use withStoragePolicyID instead. */
  @java.lang.Deprecated
  public A withNewStoragePolicyID(java.lang.String original);

  public java.lang.String getStoragePolicyName();

  public A withStoragePolicyName(java.lang.String storagePolicyName);

  public java.lang.Boolean hasStoragePolicyName();

  /** Method is deprecated. use withStoragePolicyName instead. */
  @java.lang.Deprecated
  public A withNewStoragePolicyName(java.lang.String original);

  public java.lang.String getVolumePath();

  public A withVolumePath(java.lang.String volumePath);

  public java.lang.Boolean hasVolumePath();

  /** Method is deprecated. use withVolumePath instead. */
  @java.lang.Deprecated
  public A withNewVolumePath(java.lang.String original);
}
