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

import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class VersionInfoFluentImpl<A extends VersionInfoFluent<A>> extends BaseFluent<A>
    implements VersionInfoFluent<A> {
  public VersionInfoFluentImpl() {}

  public VersionInfoFluentImpl(io.kubernetes.client.openapi.models.VersionInfo instance) {
    this.withBuildDate(instance.getBuildDate());

    this.withCompiler(instance.getCompiler());

    this.withGitCommit(instance.getGitCommit());

    this.withGitTreeState(instance.getGitTreeState());

    this.withGitVersion(instance.getGitVersion());

    this.withGoVersion(instance.getGoVersion());

    this.withMajor(instance.getMajor());

    this.withMinor(instance.getMinor());

    this.withPlatform(instance.getPlatform());
  }

  private String buildDate;
  private java.lang.String compiler;
  private java.lang.String gitCommit;
  private java.lang.String gitTreeState;
  private java.lang.String gitVersion;
  private java.lang.String goVersion;
  private java.lang.String major;
  private java.lang.String minor;
  private java.lang.String platform;

  public java.lang.String getBuildDate() {
    return this.buildDate;
  }

  public A withBuildDate(java.lang.String buildDate) {
    this.buildDate = buildDate;
    return (A) this;
  }

  public Boolean hasBuildDate() {
    return this.buildDate != null;
  }

  public java.lang.String getCompiler() {
    return this.compiler;
  }

  public A withCompiler(java.lang.String compiler) {
    this.compiler = compiler;
    return (A) this;
  }

  public java.lang.Boolean hasCompiler() {
    return this.compiler != null;
  }

  public java.lang.String getGitCommit() {
    return this.gitCommit;
  }

  public A withGitCommit(java.lang.String gitCommit) {
    this.gitCommit = gitCommit;
    return (A) this;
  }

  public java.lang.Boolean hasGitCommit() {
    return this.gitCommit != null;
  }

  public java.lang.String getGitTreeState() {
    return this.gitTreeState;
  }

  public A withGitTreeState(java.lang.String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return (A) this;
  }

  public java.lang.Boolean hasGitTreeState() {
    return this.gitTreeState != null;
  }

  public java.lang.String getGitVersion() {
    return this.gitVersion;
  }

  public A withGitVersion(java.lang.String gitVersion) {
    this.gitVersion = gitVersion;
    return (A) this;
  }

  public java.lang.Boolean hasGitVersion() {
    return this.gitVersion != null;
  }

  public java.lang.String getGoVersion() {
    return this.goVersion;
  }

  public A withGoVersion(java.lang.String goVersion) {
    this.goVersion = goVersion;
    return (A) this;
  }

  public java.lang.Boolean hasGoVersion() {
    return this.goVersion != null;
  }

  public java.lang.String getMajor() {
    return this.major;
  }

  public A withMajor(java.lang.String major) {
    this.major = major;
    return (A) this;
  }

  public java.lang.Boolean hasMajor() {
    return this.major != null;
  }

  public java.lang.String getMinor() {
    return this.minor;
  }

  public A withMinor(java.lang.String minor) {
    this.minor = minor;
    return (A) this;
  }

  public java.lang.Boolean hasMinor() {
    return this.minor != null;
  }

  public java.lang.String getPlatform() {
    return this.platform;
  }

  public A withPlatform(java.lang.String platform) {
    this.platform = platform;
    return (A) this;
  }

  public java.lang.Boolean hasPlatform() {
    return this.platform != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VersionInfoFluentImpl that = (VersionInfoFluentImpl) o;
    if (buildDate != null ? !buildDate.equals(that.buildDate) : that.buildDate != null)
      return false;
    if (compiler != null ? !compiler.equals(that.compiler) : that.compiler != null) return false;
    if (gitCommit != null ? !gitCommit.equals(that.gitCommit) : that.gitCommit != null)
      return false;
    if (gitTreeState != null ? !gitTreeState.equals(that.gitTreeState) : that.gitTreeState != null)
      return false;
    if (gitVersion != null ? !gitVersion.equals(that.gitVersion) : that.gitVersion != null)
      return false;
    if (goVersion != null ? !goVersion.equals(that.goVersion) : that.goVersion != null)
      return false;
    if (major != null ? !major.equals(that.major) : that.major != null) return false;
    if (minor != null ? !minor.equals(that.minor) : that.minor != null) return false;
    if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        buildDate,
        compiler,
        gitCommit,
        gitTreeState,
        gitVersion,
        goVersion,
        major,
        minor,
        platform,
        super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (buildDate != null) {
      sb.append("buildDate:");
      sb.append(buildDate + ",");
    }
    if (compiler != null) {
      sb.append("compiler:");
      sb.append(compiler + ",");
    }
    if (gitCommit != null) {
      sb.append("gitCommit:");
      sb.append(gitCommit + ",");
    }
    if (gitTreeState != null) {
      sb.append("gitTreeState:");
      sb.append(gitTreeState + ",");
    }
    if (gitVersion != null) {
      sb.append("gitVersion:");
      sb.append(gitVersion + ",");
    }
    if (goVersion != null) {
      sb.append("goVersion:");
      sb.append(goVersion + ",");
    }
    if (major != null) {
      sb.append("major:");
      sb.append(major + ",");
    }
    if (minor != null) {
      sb.append("minor:");
      sb.append(minor + ",");
    }
    if (platform != null) {
      sb.append("platform:");
      sb.append(platform);
    }
    sb.append("}");
    return sb.toString();
  }
}
