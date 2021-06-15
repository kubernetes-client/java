package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface VersionInfoFluent<A extends io.kubernetes.client.openapi.models.VersionInfoFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getBuildDate();
    public A withBuildDate(java.lang.String buildDate);
    public java.lang.Boolean hasBuildDate();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withBuildDate instead.
     */
        public A withNewBuildDate(java.lang.String original);
    public java.lang.String getCompiler();
    public A withCompiler(java.lang.String compiler);
    public java.lang.Boolean hasCompiler();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withCompiler instead.
     */
        public A withNewCompiler(java.lang.String original);
    public java.lang.String getGitCommit();
    public A withGitCommit(java.lang.String gitCommit);
    public java.lang.Boolean hasGitCommit();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGitCommit instead.
     */
        public A withNewGitCommit(java.lang.String original);
    public java.lang.String getGitTreeState();
    public A withGitTreeState(java.lang.String gitTreeState);
    public java.lang.Boolean hasGitTreeState();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGitTreeState instead.
     */
        public A withNewGitTreeState(java.lang.String original);
    public java.lang.String getGitVersion();
    public A withGitVersion(java.lang.String gitVersion);
    public java.lang.Boolean hasGitVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGitVersion instead.
     */
        public A withNewGitVersion(java.lang.String original);
    public java.lang.String getGoVersion();
    public A withGoVersion(java.lang.String goVersion);
    public java.lang.Boolean hasGoVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withGoVersion instead.
     */
        public A withNewGoVersion(java.lang.String original);
    public java.lang.String getMajor();
    public A withMajor(java.lang.String major);
    public java.lang.Boolean hasMajor();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMajor instead.
     */
        public A withNewMajor(java.lang.String original);
    public java.lang.String getMinor();
    public A withMinor(java.lang.String minor);
    public java.lang.Boolean hasMinor();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMinor instead.
     */
        public A withNewMinor(java.lang.String original);
    public java.lang.String getPlatform();
    public A withPlatform(java.lang.String platform);
    public java.lang.Boolean hasPlatform();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPlatform instead.
     */
        public A withNewPlatform(java.lang.String original);
}
