/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.extended.network;

import io.kubernetes.client.extended.network.exception.NoAvailableAddressException;
import java.util.List;

/** LoadBalancer provides IP address for L4 client-side load-balancing. */
public interface LoadBalancer {

  List<String> getAllAvailableIPs() throws NoAvailableAddressException;

  List<String> getAllAvailableIPs(int port) throws NoAvailableAddressException;

  String getTargetIP() throws NoAvailableAddressException;

  String getTargetIP(int port) throws NoAvailableAddressException;
}
