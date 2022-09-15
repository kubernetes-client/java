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
public interface VersionInfoFluent<A extends VersionInfoFluent<A>> extends Fluent<A> {
  public String getBuildDate();

  public A withBuildDate(String buildDate);

  public Boolean hasBuildDate();

  public String getCompiler();

  public A withCompiler(String compiler);

  public Boolean hasCompiler();

  public String getGitCommit();

  public A withGitCommit(String gitCommit);

  public Boolean hasGitCommit();

  public String getGitTreeState();

  public A withGitTreeState(String gitTreeState);

  public Boolean hasGitTreeState();

  public String getGitVersion();

  public A withGitVersion(String gitVersion);

  public Boolean hasGitVersion();

  public String getGoVersion();

  public A withGoVersion(String goVersion);

  public Boolean hasGoVersion();

  public String getMajor();

  public A withMajor(String major);

  public Boolean hasMajor();

  public String getMinor();

  public A withMinor(String minor);

  public Boolean hasMinor();

  public String getPlatform();

  public A withPlatform(String platform);

  public Boolean hasPlatform();
}
