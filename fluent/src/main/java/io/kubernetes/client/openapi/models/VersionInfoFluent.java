package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class VersionInfoFluent<A extends VersionInfoFluent<A>> extends BaseFluent<A>{
  public VersionInfoFluent() {
  }
  
  public VersionInfoFluent(VersionInfo instance) {
    this.copyInstance(instance);
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
  
  protected void copyInstance(VersionInfo instance) {
    instance = (instance != null ? instance : new VersionInfo());
    if (instance != null) {
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
  }
  
  public String getBuildDate() {
    return this.buildDate;
  }
  
  public A withBuildDate(String buildDate) {
    this.buildDate = buildDate;
    return (A) this;
  }
  
  public boolean hasBuildDate() {
    return this.buildDate != null;
  }
  
  public String getCompiler() {
    return this.compiler;
  }
  
  public A withCompiler(String compiler) {
    this.compiler = compiler;
    return (A) this;
  }
  
  public boolean hasCompiler() {
    return this.compiler != null;
  }
  
  public String getGitCommit() {
    return this.gitCommit;
  }
  
  public A withGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return (A) this;
  }
  
  public boolean hasGitCommit() {
    return this.gitCommit != null;
  }
  
  public String getGitTreeState() {
    return this.gitTreeState;
  }
  
  public A withGitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
    return (A) this;
  }
  
  public boolean hasGitTreeState() {
    return this.gitTreeState != null;
  }
  
  public String getGitVersion() {
    return this.gitVersion;
  }
  
  public A withGitVersion(String gitVersion) {
    this.gitVersion = gitVersion;
    return (A) this;
  }
  
  public boolean hasGitVersion() {
    return this.gitVersion != null;
  }
  
  public String getGoVersion() {
    return this.goVersion;
  }
  
  public A withGoVersion(String goVersion) {
    this.goVersion = goVersion;
    return (A) this;
  }
  
  public boolean hasGoVersion() {
    return this.goVersion != null;
  }
  
  public String getMajor() {
    return this.major;
  }
  
  public A withMajor(String major) {
    this.major = major;
    return (A) this;
  }
  
  public boolean hasMajor() {
    return this.major != null;
  }
  
  public String getMinor() {
    return this.minor;
  }
  
  public A withMinor(String minor) {
    this.minor = minor;
    return (A) this;
  }
  
  public boolean hasMinor() {
    return this.minor != null;
  }
  
  public String getPlatform() {
    return this.platform;
  }
  
  public A withPlatform(String platform) {
    this.platform = platform;
    return (A) this;
  }
  
  public boolean hasPlatform() {
    return this.platform != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    VersionInfoFluent that = (VersionInfoFluent) o;
    if (!java.util.Objects.equals(buildDate, that.buildDate)) return false;
    if (!java.util.Objects.equals(compiler, that.compiler)) return false;
    if (!java.util.Objects.equals(gitCommit, that.gitCommit)) return false;
    if (!java.util.Objects.equals(gitTreeState, that.gitTreeState)) return false;
    if (!java.util.Objects.equals(gitVersion, that.gitVersion)) return false;
    if (!java.util.Objects.equals(goVersion, that.goVersion)) return false;
    if (!java.util.Objects.equals(major, that.major)) return false;
    if (!java.util.Objects.equals(minor, that.minor)) return false;
    if (!java.util.Objects.equals(platform, that.platform)) return false;
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