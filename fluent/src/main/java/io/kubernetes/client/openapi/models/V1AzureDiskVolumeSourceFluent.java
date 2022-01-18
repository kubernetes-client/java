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
public interface V1AzureDiskVolumeSourceFluent<
        A extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getCachingMode();

  public A withCachingMode(java.lang.String cachingMode);

  public java.lang.Boolean hasCachingMode();

  /** Method is deprecated. use withCachingMode instead. */
  @java.lang.Deprecated
  public A withNewCachingMode(java.lang.String original);

  public java.lang.String getDiskName();

  public A withDiskName(java.lang.String diskName);

  public java.lang.Boolean hasDiskName();

  /** Method is deprecated. use withDiskName instead. */
  @java.lang.Deprecated
  public A withNewDiskName(java.lang.String original);

  public java.lang.String getDiskURI();

  public A withDiskURI(java.lang.String diskURI);

  public java.lang.Boolean hasDiskURI();

  /** Method is deprecated. use withDiskURI instead. */
  @java.lang.Deprecated
  public A withNewDiskURI(java.lang.String original);

  public java.lang.String getFsType();

  public A withFsType(java.lang.String fsType);

  public java.lang.Boolean hasFsType();

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  public java.lang.Boolean getReadOnly();

  public A withReadOnly(java.lang.Boolean readOnly);

  public java.lang.Boolean hasReadOnly();
}
