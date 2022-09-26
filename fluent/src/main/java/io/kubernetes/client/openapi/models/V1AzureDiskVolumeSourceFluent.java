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

/** Generated */
public interface V1AzureDiskVolumeSourceFluent<A extends V1AzureDiskVolumeSourceFluent<A>>
    extends Fluent<A> {
  public String getCachingMode();

  public A withCachingMode(String cachingMode);

  public Boolean hasCachingMode();

  public String getDiskName();

  public A withDiskName(String diskName);

  public Boolean hasDiskName();

  public String getDiskURI();

  public A withDiskURI(String diskURI);

  public Boolean hasDiskURI();

  public String getFsType();

  public A withFsType(String fsType);

  public Boolean hasFsType();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  public Boolean getReadOnly();

  public A withReadOnly(Boolean readOnly);

  public Boolean hasReadOnly();

  public A withReadOnly();
}
