package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeSystemInfoFluent<A extends V1NodeSystemInfoFluent<A>> extends Fluent<A>{
  public String getArchitecture();
  public A withArchitecture(String architecture);
  public Boolean hasArchitecture();
  public String getBootID();
  public A withBootID(String bootID);
  public Boolean hasBootID();
  public String getContainerRuntimeVersion();
  public A withContainerRuntimeVersion(String containerRuntimeVersion);
  public Boolean hasContainerRuntimeVersion();
  public String getKernelVersion();
  public A withKernelVersion(String kernelVersion);
  public Boolean hasKernelVersion();
  public String getKubeProxyVersion();
  public A withKubeProxyVersion(String kubeProxyVersion);
  public Boolean hasKubeProxyVersion();
  public String getKubeletVersion();
  public A withKubeletVersion(String kubeletVersion);
  public Boolean hasKubeletVersion();
  public String getMachineID();
  public A withMachineID(String machineID);
  public Boolean hasMachineID();
  public String getOperatingSystem();
  public A withOperatingSystem(String operatingSystem);
  public Boolean hasOperatingSystem();
  public String getOsImage();
  public A withOsImage(String osImage);
  public Boolean hasOsImage();
  public String getSystemUUID();
  public A withSystemUUID(String systemUUID);
  public Boolean hasSystemUUID();
  
}