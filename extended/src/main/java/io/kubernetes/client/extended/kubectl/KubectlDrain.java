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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1OwnerReference;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

public class KubectlDrain extends KubectlCordon {
  private int gracePeriodSeconds;
  private boolean force;
  private boolean ignoreDaemonSets;

  KubectlDrain() {
    super(true);
    gracePeriodSeconds = 30;
  }

  public KubectlDrain gracePeriod(int gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
    return this;
  }

  public KubectlDrain force() {
    this.force = true;
    return this;
  }

  public KubectlDrain ignoreDaemonSets() {
    this.ignoreDaemonSets = true;
    return this;
  }

  @Override
  public V1Node execute() throws KubectlException {
    try {
      refreshDiscovery();
      return doDrain();
    } catch (ApiException | IOException ex) {
      throw new KubectlException(ex);
    }
  }

  private V1Node doDrain() throws KubectlException, ApiException, IOException {
    CoreV1Api api = new CoreV1Api(apiClient);
    V1Node node = performCordon();

    V1PodList allPods =
        api.listPodForAllNamespaces()
                .fieldSelector("spec.nodeName=" + node.getMetadata().getName())
                .execute();

    validatePods(allPods.getItems());

    boolean isDaemonSetPod;
    for (V1Pod pod : allPods.getItems()) {
      isDaemonSetPod = false;
      // at this point we know, that we have to ignore daemon set pods
      if (pod.getMetadata().getOwnerReferences() != null) {
        for (V1OwnerReference ref : pod.getMetadata().getOwnerReferences()) {
          if (ref.getKind().equals("DaemonSet")) {
            isDaemonSetPod = true;
            break;
          }
        }
      }
      if (!isDaemonSetPod) {
        deletePod(api, pod.getMetadata().getName(), pod.getMetadata().getNamespace());
      }
    }
    return node;
  }

  private void validatePods(List<V1Pod> pods) throws KubectlException {
    // Throw if there are any unmanaged pods and force is false
    for (V1Pod pod : pods) {
      if (pod.getMetadata().getOwnerReferences() == null) continue;

      if (!force && pod.getMetadata().getOwnerReferences().size() == 0) {
        throw new KubectlException("Pods unmanaged by a controller are present on the node");
      }
      // Throw exception if there are daemon set pods and ignore daemon set is false
      if (!ignoreDaemonSets) {
        for (V1OwnerReference ref : pod.getMetadata().getOwnerReferences()) {
          if (ref.getKind().equals("DaemonSet")) {
            throw new KubectlException("Pod managed by DaemonSet found");
          }
        }
      }
    }
  }

  private void deletePod(CoreV1Api api, String name, String namespace)
      throws ApiException, IOException, KubectlException {
    api.deleteNamespacedPod(name, namespace).gracePeriodSeconds(gracePeriodSeconds).execute();
    waitForPodDelete(api, name, namespace);
  }

  private void waitForPodDelete(CoreV1Api api, String name, String namespace)
      throws KubectlException {
    long start = System.currentTimeMillis();
    do {
      try {
        api.readNamespacedPod(name, namespace).execute();
      } catch (ApiException ex) {
        if (ex.getCode() == HttpURLConnection.HTTP_NOT_FOUND) {
          return;
        }
        throw new KubectlException(ex);
      }
      // add 10 seconds to gracePeriod to allow the force deletion of the pod to finish
    } while (System.currentTimeMillis() - start < (this.gracePeriodSeconds + 10) * 1000);
    throw new KubectlException("Timed out waiting for Pod delete.");
  }
}
