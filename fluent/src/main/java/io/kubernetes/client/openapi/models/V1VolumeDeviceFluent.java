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
public interface V1VolumeDeviceFluent<A extends V1VolumeDeviceFluent<A>> extends Fluent<A> {
  public String getDevicePath();

  public A withDevicePath(java.lang.String devicePath);

  public Boolean hasDevicePath();

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();
}
