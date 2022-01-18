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
public interface V1beta1EndpointConditionsFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1EndpointConditionsFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Boolean getReady();

  public A withReady(java.lang.Boolean ready);

  public java.lang.Boolean hasReady();

  public java.lang.Boolean getServing();

  public A withServing(java.lang.Boolean serving);

  public java.lang.Boolean hasServing();

  public java.lang.Boolean getTerminating();

  public A withTerminating(java.lang.Boolean terminating);

  public java.lang.Boolean hasTerminating();
}
