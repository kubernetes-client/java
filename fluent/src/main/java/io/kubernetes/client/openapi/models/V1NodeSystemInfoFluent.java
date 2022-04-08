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

import io.kubernetes.client.fluent.Fluent;

/** Generated */
public interface V1NodeSystemInfoFluent<A extends V1NodeSystemInfoFluent<A>> extends Fluent<A> {
  public String getArchitecture();

  public A withArchitecture(java.lang.String architecture);

  public Boolean hasArchitecture();

  public java.lang.String getBootID();

  public A withBootID(java.lang.String bootID);

  public java.lang.Boolean hasBootID();

  public java.lang.String getContainerRuntimeVersion();

  public A withContainerRuntimeVersion(java.lang.String containerRuntimeVersion);

  public java.lang.Boolean hasContainerRuntimeVersion();

  public java.lang.String getKernelVersion();

  public A withKernelVersion(java.lang.String kernelVersion);

  public java.lang.Boolean hasKernelVersion();

  public java.lang.String getKubeProxyVersion();

  public A withKubeProxyVersion(java.lang.String kubeProxyVersion);

  public java.lang.Boolean hasKubeProxyVersion();

  public java.lang.String getKubeletVersion();

  public A withKubeletVersion(java.lang.String kubeletVersion);

  public java.lang.Boolean hasKubeletVersion();

  public java.lang.String getMachineID();

  public A withMachineID(java.lang.String machineID);

  public java.lang.Boolean hasMachineID();

  public java.lang.String getOperatingSystem();

  public A withOperatingSystem(java.lang.String operatingSystem);

  public java.lang.Boolean hasOperatingSystem();

  public java.lang.String getOsImage();

  public A withOsImage(java.lang.String osImage);

  public java.lang.Boolean hasOsImage();

  public java.lang.String getSystemUUID();

  public A withSystemUUID(java.lang.String systemUUID);

  public java.lang.Boolean hasSystemUUID();
}
