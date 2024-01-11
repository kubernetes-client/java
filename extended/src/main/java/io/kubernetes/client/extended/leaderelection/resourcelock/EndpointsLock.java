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
package io.kubernetes.client.extended.leaderelection.resourcelock;

import io.kubernetes.client.extended.leaderelection.LeaderElectionRecord;
import io.kubernetes.client.extended.leaderelection.Lock;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Endpoints;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndpointsLock implements Lock {

  private static final Logger log = LoggerFactory.getLogger(EndpointsLock.class);

  String LeaderElectionRecordAnnotationKey = "control-plane.alpha.kubernetes.io/leader";

  // Namespace and name describes the endpoint object
  // that the LeaderElector will attempt to lead.
  private final String namespace;
  private final String name;
  private final String identity;

  private CoreV1Api coreV1Client;

  private AtomicReference<V1Endpoints> endpointsRefer = new AtomicReference<>(null);

  public EndpointsLock(String namespace, String name, String identity) {
    this(namespace, name, identity, Configuration.getDefaultApiClient());
  }

  public EndpointsLock(String namespace, String name, String identity, ApiClient apiClient) {
    this.namespace = namespace;
    this.name = name;
    this.identity = identity;
    this.coreV1Client = new CoreV1Api(apiClient);
  }

  @Override
  public LeaderElectionRecord get() throws ApiException {
    V1Endpoints endpoints = coreV1Client.readNamespacedEndpoints(name, namespace).execute();
    endpointsRefer.set(endpoints);

    Map<String, String> annotations = endpoints.getMetadata().getAnnotations();
    if (annotations == null || annotations.isEmpty()) {
      endpoints.getMetadata().setAnnotations(new HashMap<>());
    }

    String recordRawStringContent =
        endpoints.getMetadata().getAnnotations().get(LeaderElectionRecordAnnotationKey);
    if (StringUtils.isEmpty(recordRawStringContent)) {
      return new LeaderElectionRecord();
    }
    LeaderElectionRecord record =
        coreV1Client
            .getApiClient()
            .getJSON()
            .deserialize(recordRawStringContent, LeaderElectionRecord.class);
    return record;
  }

  @Override
  public boolean create(LeaderElectionRecord record) {
    try {
      V1Endpoints endpoints = new V1Endpoints();
      V1ObjectMeta objectMeta = new V1ObjectMeta();
      objectMeta.setName(name);
      objectMeta.setNamespace(namespace);
      Map<String, String> annotations = new HashMap<>();
      annotations.put(
          LeaderElectionRecordAnnotationKey,
          coreV1Client.getApiClient().getJSON().serialize(record));
      objectMeta.setAnnotations(annotations);
      if (record.getOwnerReference() != null) {
        objectMeta.setOwnerReferences(Collections.singletonList(record.getOwnerReference()));
      }
      endpoints.setMetadata(objectMeta);
      V1Endpoints createdendpoints =
          coreV1Client.createNamespacedEndpoints(namespace, endpoints).execute();
      endpointsRefer.set(createdendpoints);
      return true;
    } catch (ApiException e) {
      if (e.getCode() == HttpURLConnection.HTTP_CONFLICT) {
        log.debug("received {} when creating endpoints lock", e.getCode(), e);
      } else {
        log.error("received {} when creating endpoints lock", e.getCode(), e);
      }
      return false;
    }
  }

  @Override
  public boolean update(LeaderElectionRecord record) {
    try {
      V1Endpoints endpoints = endpointsRefer.get();
      endpoints
          .getMetadata()
          .putAnnotationsItem(
              LeaderElectionRecordAnnotationKey,
              coreV1Client.getApiClient().getJSON().serialize(record));
      // TODO consider to retry if receiving a 409 code
      V1Endpoints replacedEndpoints =
          coreV1Client.replaceNamespacedEndpoints(
              name, namespace, endpoints).execute();
      endpointsRefer.set(replacedEndpoints);
      return true;
    } catch (ApiException e) {
      if (e.getCode() == HttpURLConnection.HTTP_CONFLICT) {
        log.debug("received {} when updating endpoints lock", e.getCode(), e);
      } else {
        log.error("received {} when updating endpoints lock", e.getCode(), e);
      }
      return false;
    }
  }

  @Override
  public String identity() {
    return identity;
  }

  @Override
  public String describe() {
    return namespace + "/" + name;
  }
}
