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
public interface V1SeccompProfileFluent<
        A extends io.kubernetes.client.openapi.models.V1SeccompProfileFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getLocalhostProfile();

  public A withLocalhostProfile(java.lang.String localhostProfile);

  public java.lang.Boolean hasLocalhostProfile();

  /** Method is deprecated. use withLocalhostProfile instead. */
  @java.lang.Deprecated
  public A withNewLocalhostProfile(java.lang.String original);

  public io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum getType();

  public A withType(io.kubernetes.client.openapi.models.V1SeccompProfile.TypeEnum type);

  public java.lang.Boolean hasType();
}
