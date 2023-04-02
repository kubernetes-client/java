package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class VersionInfoFluentImpl<A extends VersionInfoFluent<A>> extends BaseFluent<A> implements VersionInfoFluent<A>{
  public VersionInfoFluentImpl() {
  }
  public VersionInfoFluentImpl(VersionInfo instance) {
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
  private String compiler;
  private String gitCommit;
  private String gitTreeState;
  private String gitVersion;
  private String goVersion;
  private String major;
  private String minor;
  private String platform;
  public String getBuildDate() {
    return this.buildDate;
  }
  public A withBuildDate(String buildDate) {
    this.buildDate=buildDate; return (A) this;
  }
  public Boolean hasBuildDate() {
    return this.buildDate != null;
  }
  public String getCompiler() {
    return this.compiler;
  }
  public A withCompiler(String compiler) {
    this.compiler=compiler; return (A) this;
  }
  public Boolean hasCompiler() {
    return this.compiler != null;
  }
  public String getGitCommit() {
    return this.gitCommit;
  }
  public A withGitCommit(String gitCommit) {
    this.gitCommit=gitCommit; return (A) this;
  }
  public Boolean hasGitCommit() {
    return this.gitCommit != null;
  }
  public String getGitTreeState() {
    return this.gitTreeState;
  }
  public A withGitTreeState(String gitTreeState) {
    this.gitTreeState=gitTreeState; return (A) this;
  }
  public Boolean hasGitTreeState() {
    return this.gitTreeState != null;
  }
  public String getGitVersion() {
    return this.gitVersion;
  }
  public A withGitVersion(String gitVersion) {
    this.gitVersion=gitVersion; return (A) this;
  }
  public Boolean hasGitVersion() {
    return this.gitVersion != null;
  }
  public String getGoVersion() {
    return this.goVersion;
  }
  public A withGoVersion(String goVersion) {
    this.goVersion=goVersion; return (A) this;
  }
  public Boolean hasGoVersion() {
    return this.goVersion != null;
  }
  public String getMajor() {
    return this.major;
  }
  public A withMajor(String major) {
    this.major=major; return (A) this;
  }
  public Boolean hasMajor() {
    return this.major != null;
  }
  public String getMinor() {
    return this.minor;
  }
  public A withMinor(String minor) {
    this.minor=minor; return (A) this;
  }
  public Boolean hasMinor() {
    return this.minor != null;
  }
  public String getPlatform() {
    return this.platform;
  }
  public A withPlatform(String platform) {
    this.platform=platform; return (A) this;
  }
  public Boolean hasPlatform() {
    return this.platform != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VersionInfoFluentImpl that = (VersionInfoFluentImpl) o;
    if (buildDate != null ? !buildDate.equals(that.buildDate) :that.buildDate != null) return false;
    if (compiler != null ? !compiler.equals(that.compiler) :that.compiler != null) return false;
    if (gitCommit != null ? !gitCommit.equals(that.gitCommit) :that.gitCommit != null) return false;
    if (gitTreeState != null ? !gitTreeState.equals(that.gitTreeState) :that.gitTreeState != null) return false;
    if (gitVersion != null ? !gitVersion.equals(that.gitVersion) :that.gitVersion != null) return false;
    if (goVersion != null ? !goVersion.equals(that.goVersion) :that.goVersion != null) return false;
    if (major != null ? !major.equals(that.major) :that.major != null) return false;
    if (minor != null ? !minor.equals(that.minor) :that.minor != null) return false;
    if (platform != null ? !platform.equals(that.platform) :that.platform != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(buildDate,  compiler,  gitCommit,  gitTreeState,  gitVersion,  goVersion,  major,  minor,  platform,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (buildDate != null) { sb.append("buildDate:"); sb.append(buildDate + ","); }
    if (compiler != null) { sb.append("compiler:"); sb.append(compiler + ","); }
    if (gitCommit != null) { sb.append("gitCommit:"); sb.append(gitCommit + ","); }
    if (gitTreeState != null) { sb.append("gitTreeState:"); sb.append(gitTreeState + ","); }
    if (gitVersion != null) { sb.append("gitVersion:"); sb.append(gitVersion + ","); }
    if (goVersion != null) { sb.append("goVersion:"); sb.append(goVersion + ","); }
    if (major != null) { sb.append("major:"); sb.append(major + ","); }
    if (minor != null) { sb.append("minor:"); sb.append(minor + ","); }
    if (platform != null) { sb.append("platform:"); sb.append(platform); }
    sb.append("}");
    return sb.toString();
  }
  
}