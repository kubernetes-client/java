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
public interface VersionInfoFluent<
        A extends io.kubernetes.client.openapi.models.VersionInfoFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getBuildDate();

  public A withBuildDate(java.lang.String buildDate);

  public java.lang.Boolean hasBuildDate();

  /** Method is deprecated. use withBuildDate instead. */
  @java.lang.Deprecated
  public A withNewBuildDate(java.lang.String original);

  public java.lang.String getCompiler();

  public A withCompiler(java.lang.String compiler);

  public java.lang.Boolean hasCompiler();

  /** Method is deprecated. use withCompiler instead. */
  @java.lang.Deprecated
  public A withNewCompiler(java.lang.String original);

  public java.lang.String getGitCommit();

  public A withGitCommit(java.lang.String gitCommit);

  public java.lang.Boolean hasGitCommit();

  /** Method is deprecated. use withGitCommit instead. */
  @java.lang.Deprecated
  public A withNewGitCommit(java.lang.String original);

  public java.lang.String getGitTreeState();

  public A withGitTreeState(java.lang.String gitTreeState);

  public java.lang.Boolean hasGitTreeState();

  /** Method is deprecated. use withGitTreeState instead. */
  @java.lang.Deprecated
  public A withNewGitTreeState(java.lang.String original);

  public java.lang.String getGitVersion();

  public A withGitVersion(java.lang.String gitVersion);

  public java.lang.Boolean hasGitVersion();

  /** Method is deprecated. use withGitVersion instead. */
  @java.lang.Deprecated
  public A withNewGitVersion(java.lang.String original);

  public java.lang.String getGoVersion();

  public A withGoVersion(java.lang.String goVersion);

  public java.lang.Boolean hasGoVersion();

  /** Method is deprecated. use withGoVersion instead. */
  @java.lang.Deprecated
  public A withNewGoVersion(java.lang.String original);

  public java.lang.String getMajor();

  public A withMajor(java.lang.String major);

  public java.lang.Boolean hasMajor();

  /** Method is deprecated. use withMajor instead. */
  @java.lang.Deprecated
  public A withNewMajor(java.lang.String original);

  public java.lang.String getMinor();

  public A withMinor(java.lang.String minor);

  public java.lang.Boolean hasMinor();

  /** Method is deprecated. use withMinor instead. */
  @java.lang.Deprecated
  public A withNewMinor(java.lang.String original);

  public java.lang.String getPlatform();

  public A withPlatform(java.lang.String platform);

  public java.lang.Boolean hasPlatform();

  /** Method is deprecated. use withPlatform instead. */
  @java.lang.Deprecated
  public A withNewPlatform(java.lang.String original);
}
