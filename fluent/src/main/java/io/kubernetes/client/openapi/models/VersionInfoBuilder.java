package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class VersionInfoBuilder extends VersionInfoFluent<VersionInfoBuilder> implements VisitableBuilder<VersionInfo,VersionInfoBuilder>{
  public VersionInfoBuilder() {
    this(new VersionInfo());
  }
  
  public VersionInfoBuilder(VersionInfoFluent<?> fluent) {
    this(fluent, new VersionInfo());
  }
  
  public VersionInfoBuilder(VersionInfoFluent<?> fluent,VersionInfo instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public VersionInfoBuilder(VersionInfo instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  VersionInfoFluent<?> fluent;
  
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