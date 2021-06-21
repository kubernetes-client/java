package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1NodeSystemInfoFluent<A extends io.kubernetes.client.openapi.models.V1NodeSystemInfoFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getArchitecture();
    public A withArchitecture(java.lang.String architecture);
    public java.lang.Boolean hasArchitecture();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withArchitecture instead.
     */
        public A withNewArchitecture(java.lang.String original);
    public java.lang.String getBootID();
    public A withBootID(java.lang.String bootID);
    public java.lang.Boolean hasBootID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withBootID instead.
     */
        public A withNewBootID(java.lang.String original);
    public java.lang.String getContainerRuntimeVersion();
    public A withContainerRuntimeVersion(java.lang.String containerRuntimeVersion);
    public java.lang.Boolean hasContainerRuntimeVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withContainerRuntimeVersion instead.
     */
        public A withNewContainerRuntimeVersion(java.lang.String original);
    public java.lang.String getKernelVersion();
    public A withKernelVersion(java.lang.String kernelVersion);
    public java.lang.Boolean hasKernelVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKernelVersion instead.
     */
        public A withNewKernelVersion(java.lang.String original);
    public java.lang.String getKubeProxyVersion();
    public A withKubeProxyVersion(java.lang.String kubeProxyVersion);
    public java.lang.Boolean hasKubeProxyVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKubeProxyVersion instead.
     */
        public A withNewKubeProxyVersion(java.lang.String original);
    public java.lang.String getKubeletVersion();
    public A withKubeletVersion(java.lang.String kubeletVersion);
    public java.lang.Boolean hasKubeletVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKubeletVersion instead.
     */
        public A withNewKubeletVersion(java.lang.String original);
    public java.lang.String getMachineID();
    public A withMachineID(java.lang.String machineID);
    public java.lang.Boolean hasMachineID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMachineID instead.
     */
        public A withNewMachineID(java.lang.String original);
    public java.lang.String getOperatingSystem();
    public A withOperatingSystem(java.lang.String operatingSystem);
    public java.lang.Boolean hasOperatingSystem();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withOperatingSystem instead.
     */
        public A withNewOperatingSystem(java.lang.String original);
    public java.lang.String getOsImage();
    public A withOsImage(java.lang.String osImage);
    public java.lang.Boolean hasOsImage();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withOsImage instead.
     */
        public A withNewOsImage(java.lang.String original);
    public java.lang.String getSystemUUID();
    public A withSystemUUID(java.lang.String systemUUID);
    public java.lang.Boolean hasSystemUUID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSystemUUID instead.
     */
        public A withNewSystemUUID(java.lang.String original);
}
