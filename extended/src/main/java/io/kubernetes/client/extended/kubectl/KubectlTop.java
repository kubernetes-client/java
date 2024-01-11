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

import io.kubernetes.client.Metrics;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.custom.ContainerMetrics;
import io.kubernetes.client.custom.NodeMetrics;
import io.kubernetes.client.custom.NodeMetricsList;
import io.kubernetes.client.custom.PodMetrics;
import io.kubernetes.client.custom.PodMetricsList;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class KubectlTop<ApiType extends KubernetesObject, MetricsType>
    extends Kubectl.ResourceBuilder<ApiType, KubectlTop<ApiType, MetricsType>>
    implements Kubectl.Executable<List<Pair<ApiType, MetricsType>>> {
  String metricName;

  KubectlTop(Class<ApiType> apiTypeClass) {
    super(apiTypeClass);
    this.metricName = "cpu";
  }

  public KubectlTop<ApiType, MetricsType> metric(String metricName) {
    this.metricName = metricName;
    return this;
  }

  @Override
  public List<Pair<ApiType, MetricsType>> execute() throws KubectlException {
    switch (metricName) {
      case "cpu":
      case "memory":
        break;
      default:
        throw new KubectlException("Unknown metric: " + metricName);
    }
    try {
      CoreV1Api api = new CoreV1Api(apiClient);
      if (apiTypeClass.equals(V1Node.class)) {
        return (List<Pair<ApiType, MetricsType>>) topNodes(api, apiClient, metricName);
      } else if (apiTypeClass.equals(V1Pod.class)) {
        return (List<Pair<ApiType, MetricsType>>) topPods(api, apiClient, metricName);
      } else {
        throw new KubectlException("Can not perform top for " + apiTypeClass.getName());
      }
    } catch (ApiException | IOException ex) {
      throw new KubectlException(ex);
    }
  }

  private NodeMetrics findNodeMetric(String nodeName, NodeMetricsList list) {
    for (NodeMetrics metric : list.getItems()) {
      if (metric.getMetadata().getName().equals(nodeName)) {
        return metric;
      }
    }
    return null;
  }

  private NodeMetrics findNodeMetric(V1Node node, NodeMetricsList list) {
    return findNodeMetric(node.getMetadata().getName(), list);
  }

  static double findNodePercentage(V1Node node, Quantity value, String metric) {
    Quantity capacity = node.getStatus().getCapacity().get(metric);
    if (capacity == null) {
      return Double.POSITIVE_INFINITY;
    }
    return value.getNumber().doubleValue() / capacity.getNumber().doubleValue();
  }

  private List<Pair<ApiType, MetricsType>> topNodes(
      CoreV1Api api, ApiClient apiClient, String metricName)
      throws KubectlException, ApiException, IOException {
    V1NodeList nodes = api.listNode().execute();
    NodeMetricsList metrics = new Metrics(apiClient).getNodeMetrics();
    List<V1Node> items = nodes.getItems();
    Collections.sort(
        items,
        new Comparator<V1Node>() {
          @Override
          public int compare(V1Node arg0, V1Node arg1) {
            Quantity m0 =
                findNodeMetric(arg0.getMetadata().getName(), metrics).getUsage().get(metricName);
            Quantity m1 =
                findNodeMetric(arg1.getMetadata().getName(), metrics).getUsage().get(metricName);
            double p0 = findNodePercentage(arg0, m0, metricName);
            double p1 = findNodePercentage(arg1, m1, metricName);
            return Double.compare(p0, p1) * -1; // sort high to low
          }
        });

    List<Pair<ApiType, MetricsType>> result = new ArrayList<>();
    for (V1Node node : items) {
      result.add(new ImmutablePair<>((ApiType) node, (MetricsType) findNodeMetric(node, metrics)));
    }
    return result;
  }

  private static PodMetrics findPodMetric(String podName, PodMetricsList list) {
    for (PodMetrics metric : list.getItems()) {
      if (metric.getMetadata().getName().equals(podName)) {
        return metric;
      }
    }
    return null;
  }

  private static PodMetrics findPodMetric(V1Pod pod, PodMetricsList list) {
    return findPodMetric(pod.getMetadata().getName(), list);
  }

  public static double podMetricSum(PodMetrics podMetrics, String metricName) {
    double sum = 0;
    for (ContainerMetrics containerMetrics : podMetrics.getContainers()) {
      Quantity value = containerMetrics.getUsage().get(metricName);
      if (value != null) {
        sum += value.getNumber().doubleValue();
      }
    }
    return sum;
  }

  private List<Pair<ApiType, MetricsType>> topPods(
      CoreV1Api api, ApiClient apiClient, String metricName)
      throws KubectlException, ApiException, IOException {
    V1PodList pods =
        api.listNamespacedPod(
            namespace).execute();
    PodMetricsList metrics = new Metrics(apiClient).getPodMetrics(namespace);
    List<V1Pod> items = pods.getItems();
    Collections.sort(
        items,
        new Comparator<V1Pod>() {
          @Override
          public int compare(V1Pod arg0, V1Pod arg1) {
            double m0 =
                podMetricSum(findPodMetric(arg0.getMetadata().getName(), metrics), metricName);
            double m1 =
                podMetricSum(findPodMetric(arg1.getMetadata().getName(), metrics), metricName);
            return Double.compare(m0, m1) * -1; // sort high to low
          }
        });

    List<Pair<ApiType, MetricsType>> result = new ArrayList<>();
    for (V1Pod pod : items) {
      result.add(new ImmutablePair<>((ApiType) pod, (MetricsType) findPodMetric(pod, metrics)));
    }
    return result;
  }
}
