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
import io.kubernetes.client.openapi.apis.CoordinationV1Api;
import io.kubernetes.client.openapi.models.V1Lease;
import io.kubernetes.client.openapi.models.V1LeaseSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.net.HttpURLConnection;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeaseLock implements Lock {

  private static final Logger log = LoggerFactory.getLogger(LeaseLock.class);

  // Namespace and name describes the endpoint object
  // that the LeaderElector will attempt to lead.
  private final String namespace;
  private final String name;
  private final String identity;

  private CoordinationV1Api coordinationV1Api;

  private AtomicReference<V1Lease> leaseRefer = new AtomicReference<>(null);

  public LeaseLock(String namespace, String name, String identity) {
    this(namespace, name, identity, Configuration.getDefaultApiClient());
  }

  public LeaseLock(String namespace, String name, String identity, ApiClient apiClient) {
    this.namespace = namespace;
    this.name = name;
    this.identity = identity;
    this.coordinationV1Api = new CoordinationV1Api(apiClient);
  }

  @Override
  public LeaderElectionRecord get() throws ApiException {
    V1Lease lease = coordinationV1Api.readNamespacedLease(name, namespace).execute();
    leaseRefer.set(lease);
    return getRecordFromLease(lease.getSpec());
  }

  @Override
  public boolean create(LeaderElectionRecord record) {
    try {
      V1ObjectMeta objectMeta = new V1ObjectMeta();
      objectMeta.setName(name);
      objectMeta.setNamespace(namespace);
      if (record.getOwnerReference() != null) {
        objectMeta.setOwnerReferences(Collections.singletonList(record.getOwnerReference()));
      }
      V1Lease createdLease =
          coordinationV1Api.createNamespacedLease(
              namespace,
              new V1Lease().metadata(objectMeta).spec(getLeaseFromRecord(record))).execute();
      leaseRefer.set(createdLease);
      return true;
    } catch (ApiException e) {
      if (e.getCode() == HttpURLConnection.HTTP_CONFLICT) {
        log.debug("received {} when creating lease lock", e.getCode(), e);
      } else {
        log.error("received {} when creating lease lock", e.getCode(), e);
      }
      return false;
    }
  }

  @Override
  public boolean update(LeaderElectionRecord record) {
    try {
      V1Lease latest = leaseRefer.get();
      latest.setSpec(getLeaseFromRecord(record));
      V1Lease updatedLease =
          coordinationV1Api.replaceNamespacedLease(name, namespace, latest)
                  .execute();
      leaseRefer.set(updatedLease);
      return true;
    } catch (ApiException e) {
      if (e.getCode() == HttpURLConnection.HTTP_CONFLICT) {
        log.debug("received {} when updating lease lock", e.getCode(), e);
      } else {
        log.error("received {} when updating lease lock", e.getCode(), e);
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

  private LeaderElectionRecord getRecordFromLease(V1LeaseSpec lease) {
    LeaderElectionRecord record = new LeaderElectionRecord();
    if (lease.getAcquireTime() != null) {
      record.setAcquireTime(new Date(lease.getAcquireTime().toInstant().toEpochMilli()));
    }
    if (lease.getRenewTime() != null) {
      record.setRenewTime(new Date(lease.getRenewTime().toInstant().toEpochMilli()));
    }
    record.setHolderIdentity(lease.getHolderIdentity());
    record.setLeaderTransitions(lease.getLeaseTransitions());
    record.setLeaseDurationSeconds(lease.getLeaseDurationSeconds());
    return record;
  }

  private V1LeaseSpec getLeaseFromRecord(LeaderElectionRecord record) {
    V1LeaseSpec spec =
        new V1LeaseSpec()
            .holderIdentity(record.getHolderIdentity())
            .leaseDurationSeconds(record.getLeaseDurationSeconds())
            .leaseTransitions(record.getLeaderTransitions());
    if (record.getAcquireTime() != null) {
      spec =
          spec.acquireTime(
              OffsetDateTime.ofInstant(
                  Instant.ofEpochMilli(record.getAcquireTime().getTime()), ZoneOffset.UTC));
    }
    if (record.getRenewTime() != null) {
      spec =
          spec.renewTime(
              OffsetDateTime.ofInstant(
                  Instant.ofEpochMilli(record.getRenewTime().getTime()), ZoneOffset.UTC));
    }
    return spec;
  }
}
