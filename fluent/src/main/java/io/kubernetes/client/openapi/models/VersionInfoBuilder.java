/*
Copyright 2026 The Kubernetes Authors.
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

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class VersionInfoBuilder extends VersionInfoFluent<VersionInfoBuilder> implements VisitableBuilder<VersionInfo,VersionInfoBuilder>{

  VersionInfoFluent<?> fluent;

  public VersionInfoBuilder() {
    this(new VersionInfo());
  }
  
  public VersionInfoBuilder(VersionInfoFluent<?> fluent) {
    this(fluent, new VersionInfo());
  }
  
  public VersionInfoBuilder(VersionInfo instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public VersionInfoBuilder(VersionInfoFluent<?> fluent,VersionInfo instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public VersionInfo build() {
    VersionInfo buildable = new VersionInfo();
    buildable.setBuildDate(fluent.getBuildDate());
    buildable.setCompiler(fluent.getCompiler());
    buildable.setEmulationMajor(fluent.getEmulationMajor());
    buildable.setEmulationMinor(fluent.getEmulationMinor());
    buildable.setGitCommit(fluent.getGitCommit());
    buildable.setGitTreeState(fluent.getGitTreeState());
    buildable.setGitVersion(fluent.getGitVersion());
    buildable.setGoVersion(fluent.getGoVersion());
    buildable.setMajor(fluent.getMajor());
    buildable.setMinCompatibilityMajor(fluent.getMinCompatibilityMajor());
    buildable.setMinCompatibilityMinor(fluent.getMinCompatibilityMinor());
    buildable.setMinor(fluent.getMinor());
    buildable.setPlatform(fluent.getPlatform());
    return buildable;
  }
  
}