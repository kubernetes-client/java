package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class VersionInfoBuilder extends VersionInfoFluentImpl<VersionInfoBuilder> implements VisitableBuilder<VersionInfo,VersionInfoBuilder>{
  public VersionInfoBuilder() {
    this(false);
  }
  public VersionInfoBuilder(Boolean validationEnabled) {
    this(new VersionInfo(), validationEnabled);
  }
  public VersionInfoBuilder(VersionInfoFluent<?> fluent) {
    this(fluent, false);
  }
  public VersionInfoBuilder(VersionInfoFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new VersionInfo(), validationEnabled);
  }
  public VersionInfoBuilder(VersionInfoFluent<?> fluent,VersionInfo instance) {
    this(fluent, instance, false);
  }
  public VersionInfoBuilder(VersionInfoFluent<?> fluent,VersionInfo instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withBuildDate(instance.getBuildDate());

    fluent.withCompiler(instance.getCompiler());

    fluent.withGitCommit(instance.getGitCommit());

    fluent.withGitTreeState(instance.getGitTreeState());

    fluent.withGitVersion(instance.getGitVersion());

    fluent.withGoVersion(instance.getGoVersion());

    fluent.withMajor(instance.getMajor());

    fluent.withMinor(instance.getMinor());

    fluent.withPlatform(instance.getPlatform());

    this.validationEnabled = validationEnabled; 
  }
  public VersionInfoBuilder(VersionInfo instance) {
    this(instance,false);
  }
  public VersionInfoBuilder(VersionInfo instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withBuildDate(instance.getBuildDate());

    this.withCompiler(instance.getCompiler());

    this.withGitCommit(instance.getGitCommit());

    this.withGitTreeState(instance.getGitTreeState());

    this.withGitVersion(instance.getGitVersion());

    this.withGoVersion(instance.getGoVersion());

    this.withMajor(instance.getMajor());

    this.withMinor(instance.getMinor());

    this.withPlatform(instance.getPlatform());

    this.validationEnabled = validationEnabled; 
  }
  VersionInfoFluent<?> fluent;
  Boolean validationEnabled;
  public VersionInfo build() {
    VersionInfo buildable = new VersionInfo();
    buildable.setBuildDate(fluent.getBuildDate());
    buildable.setCompiler(fluent.getCompiler());
    buildable.setGitCommit(fluent.getGitCommit());
    buildable.setGitTreeState(fluent.getGitTreeState());
    buildable.setGitVersion(fluent.getGitVersion());
    buildable.setGoVersion(fluent.getGoVersion());
    buildable.setMajor(fluent.getMajor());
    buildable.setMinor(fluent.getMinor());
    buildable.setPlatform(fluent.getPlatform());
    return buildable;
  }
  
}