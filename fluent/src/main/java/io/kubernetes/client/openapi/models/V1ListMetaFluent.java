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
public interface V1ListMetaFluent<A extends io.kubernetes.client.openapi.models.V1ListMetaFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getContinue();

  public A withContinue(java.lang.String _continue);

  public java.lang.Boolean hasContinue();

  /** Method is deprecated. use withContinue instead. */
  @java.lang.Deprecated
  public A withNewContinue(java.lang.String original);

  public java.lang.Long getRemainingItemCount();

  public A withRemainingItemCount(java.lang.Long remainingItemCount);

  public java.lang.Boolean hasRemainingItemCount();

  public java.lang.String getResourceVersion();

  public A withResourceVersion(java.lang.String resourceVersion);

  public java.lang.Boolean hasResourceVersion();

  /** Method is deprecated. use withResourceVersion instead. */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String original);

  public java.lang.String getSelfLink();

  public A withSelfLink(java.lang.String selfLink);

  public java.lang.Boolean hasSelfLink();

  /** Method is deprecated. use withSelfLink instead. */
  @java.lang.Deprecated
  public A withNewSelfLink(java.lang.String original);
}
