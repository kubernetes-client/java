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
