package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class VersionInfoFluentImpl<A extends io.kubernetes.client.openapi.models.VersionInfoFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.VersionInfoFluent<A> {

    private java.lang.String buildDate;
    private java.lang.String compiler;
    private java.lang.String gitCommit;
    private java.lang.String gitTreeState;
    private java.lang.String gitVersion;
    private java.lang.String goVersion;
    private java.lang.String major;
    private java.lang.String minor;
    private java.lang.String platform;

    public VersionInfoFluentImpl() {
    }

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

    public java.lang.String getBuildDate() {
        return this.buildDate;
    }

    public A withBuildDate(java.lang.String buildDate) {
        this.buildDate=buildDate; return (A) this;
    }

    public java.lang.Boolean hasBuildDate() {
        return this.buildDate != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withBuildDate instead.
     */
        public A withNewBuildDate(java.lang.String original) {
        return (A)withBuildDate(new String(original));
    }

    public java.lang.String getCompiler() {
        return this.compiler;
    }

    public A withCompiler(java.lang.String compiler) {
        this.compiler=compiler; return (A) this;
    }

    public java.lang.Boolean hasCompiler() {
        return this.compiler != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withCompiler instead.
     */
        public A withNewCompiler(java.lang.String original) {
        return (A)withCompiler(new String(original));
    }

    public java.lang.String getGitCommit() {
        return this.gitCommit;
    }

    public A withGitCommit(java.lang.String gitCommit) {
        this.gitCommit=gitCommit; return (A) this;
    }

    public java.lang.Boolean hasGitCommit() {
        return this.gitCommit != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGitCommit instead.
     */
        public A withNewGitCommit(java.lang.String original) {
        return (A)withGitCommit(new String(original));
    }

    public java.lang.String getGitTreeState() {
        return this.gitTreeState;
    }

    public A withGitTreeState(java.lang.String gitTreeState) {
        this.gitTreeState=gitTreeState; return (A) this;
    }

    public java.lang.Boolean hasGitTreeState() {
        return this.gitTreeState != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGitTreeState instead.
     */
        public A withNewGitTreeState(java.lang.String original) {
        return (A)withGitTreeState(new String(original));
    }

    public java.lang.String getGitVersion() {
        return this.gitVersion;
    }

    public A withGitVersion(java.lang.String gitVersion) {
        this.gitVersion=gitVersion; return (A) this;
    }

    public java.lang.Boolean hasGitVersion() {
        return this.gitVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGitVersion instead.
     */
        public A withNewGitVersion(java.lang.String original) {
        return (A)withGitVersion(new String(original));
    }

    public java.lang.String getGoVersion() {
        return this.goVersion;
    }

    public A withGoVersion(java.lang.String goVersion) {
        this.goVersion=goVersion; return (A) this;
    }

    public java.lang.Boolean hasGoVersion() {
        return this.goVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGoVersion instead.
     */
        public A withNewGoVersion(java.lang.String original) {
        return (A)withGoVersion(new String(original));
    }

    public java.lang.String getMajor() {
        return this.major;
    }

    public A withMajor(java.lang.String major) {
        this.major=major; return (A) this;
    }

    public java.lang.Boolean hasMajor() {
        return this.major != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMajor instead.
     */
        public A withNewMajor(java.lang.String original) {
        return (A)withMajor(new String(original));
    }

    public java.lang.String getMinor() {
        return this.minor;
    }

    public A withMinor(java.lang.String minor) {
        this.minor=minor; return (A) this;
    }

    public java.lang.Boolean hasMinor() {
        return this.minor != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMinor instead.
     */
        public A withNewMinor(java.lang.String original) {
        return (A)withMinor(new String(original));
    }

    public java.lang.String getPlatform() {
        return this.platform;
    }

    public A withPlatform(java.lang.String platform) {
        this.platform=platform; return (A) this;
    }

    public java.lang.Boolean hasPlatform() {
        return this.platform != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPlatform instead.
     */
        public A withNewPlatform(java.lang.String original) {
        return (A)withPlatform(new String(original));
    }

    public boolean equals(java.lang.Object o) {
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

}
