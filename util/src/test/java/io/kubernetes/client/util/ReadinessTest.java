/*
Copyright 2024 The Kubernetes Authors.
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
package io.kubernetes.client.util;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1DaemonSetSpec;
import io.kubernetes.client.openapi.models.V1DaemonSetStatus;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1DeploymentCondition;
import io.kubernetes.client.openapi.models.V1DeploymentSpec;
import io.kubernetes.client.openapi.models.V1DeploymentStatus;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import io.kubernetes.client.openapi.models.V1Endpoints;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobCondition;
import io.kubernetes.client.openapi.models.V1JobStatus;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeCondition;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaim;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodCondition;
import io.kubernetes.client.openapi.models.V1PodStatus;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.openapi.models.V1ReplicaSetSpec;
import io.kubernetes.client.openapi.models.V1ReplicaSetStatus;
import io.kubernetes.client.openapi.models.V1ReplicationController;
import io.kubernetes.client.openapi.models.V1ReplicationControllerStatus;
import io.kubernetes.client.openapi.models.V1Service;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.openapi.models.V1StatefulSetSpec;
import io.kubernetes.client.openapi.models.V1StatefulSetStatus;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class ReadinessTest {

    // ========== Pod Tests ==========

    @Test
    void isPodReady_nullPod_returnsFalse() {
        assertThat(Readiness.isPodReady(null)).isFalse();
    }

    @Test
    void isPodReady_nullStatus_returnsFalse() {
        V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name("test"));
        assertThat(Readiness.isPodReady(pod)).isFalse();
    }

    @Test
    void isPodReady_pendingPhase_returnsFalse() {
        V1Pod pod = new V1Pod()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PodStatus().phase("Pending"));
        assertThat(Readiness.isPodReady(pod)).isFalse();
    }

    @Test
    void isPodReady_runningWithReadyConditionTrue_returnsTrue() {
        V1Pod pod = new V1Pod()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PodStatus()
                        .phase("Running")
                        .conditions(List.of(
                                new V1PodCondition().type("Ready").status("True"))));
        assertThat(Readiness.isPodReady(pod)).isTrue();
    }

    @Test
    void isPodReady_runningWithReadyConditionFalse_returnsFalse() {
        V1Pod pod = new V1Pod()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PodStatus()
                        .phase("Running")
                        .conditions(List.of(
                                new V1PodCondition().type("Ready").status("False"))));
        assertThat(Readiness.isPodReady(pod)).isFalse();
    }

    @Test
    void isPodReady_runningWithNoConditions_returnsFalse() {
        V1Pod pod = new V1Pod()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PodStatus().phase("Running"));
        assertThat(Readiness.isPodReady(pod)).isFalse();
    }

    // ========== Deployment Tests ==========

    @Test
    void isDeploymentReady_nullDeployment_returnsFalse() {
        assertThat(Readiness.isDeploymentReady(null)).isFalse();
    }

    @Test
    void isDeploymentReady_nullStatus_returnsFalse() {
        V1Deployment deployment = new V1Deployment()
                .metadata(new V1ObjectMeta().name("test"));
        assertThat(Readiness.isDeploymentReady(deployment)).isFalse();
    }

    @Test
    void isDeploymentReady_availableWithCorrectReplicas_returnsTrue() {
        V1Deployment deployment = new V1Deployment()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1DeploymentSpec().replicas(3))
                .status(new V1DeploymentStatus()
                        .replicas(3)
                        .readyReplicas(3)
                        .availableReplicas(3)
                        .conditions(List.of(
                                new V1DeploymentCondition()
                                        .type("Available")
                                        .status("True"))));
        assertThat(Readiness.isDeploymentReady(deployment)).isTrue();
    }

    @Test
    void isDeploymentReady_notAvailable_returnsFalse() {
        V1Deployment deployment = new V1Deployment()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1DeploymentSpec().replicas(3))
                .status(new V1DeploymentStatus()
                        .replicas(3)
                        .readyReplicas(1)
                        .availableReplicas(1)
                        .conditions(List.of(
                                new V1DeploymentCondition()
                                        .type("Available")
                                        .status("False"))));
        assertThat(Readiness.isDeploymentReady(deployment)).isFalse();
    }

    @Test
    void isDeploymentReady_fewerReadyReplicas_returnsFalse() {
        V1Deployment deployment = new V1Deployment()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1DeploymentSpec().replicas(3))
                .status(new V1DeploymentStatus()
                        .replicas(3)
                        .readyReplicas(2)
                        .availableReplicas(3)
                        .conditions(List.of(
                                new V1DeploymentCondition()
                                        .type("Available")
                                        .status("True"))));
        assertThat(Readiness.isDeploymentReady(deployment)).isFalse();
    }

    // ========== StatefulSet Tests ==========

    @Test
    void isStatefulSetReady_nullStatefulSet_returnsFalse() {
        assertThat(Readiness.isStatefulSetReady(null)).isFalse();
    }

    @Test
    void isStatefulSetReady_allReplicasReady_returnsTrue() {
        V1StatefulSet statefulSet = new V1StatefulSet()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1StatefulSetSpec().replicas(3))
                .status(new V1StatefulSetStatus()
                        .replicas(3)
                        .readyReplicas(3));
        assertThat(Readiness.isStatefulSetReady(statefulSet)).isTrue();
    }

    @Test
    void isStatefulSetReady_notAllReplicasReady_returnsFalse() {
        V1StatefulSet statefulSet = new V1StatefulSet()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1StatefulSetSpec().replicas(3))
                .status(new V1StatefulSetStatus()
                        .replicas(3)
                        .readyReplicas(2));
        assertThat(Readiness.isStatefulSetReady(statefulSet)).isFalse();
    }

    // ========== ReplicaSet Tests ==========

    @Test
    void isReplicaSetReady_nullReplicaSet_returnsFalse() {
        assertThat(Readiness.isReplicaSetReady(null)).isFalse();
    }

    @Test
    void isReplicaSetReady_allReplicasReady_returnsTrue() {
        V1ReplicaSet replicaSet = new V1ReplicaSet()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1ReplicaSetSpec().replicas(3))
                .status(new V1ReplicaSetStatus()
                        .replicas(3)
                        .readyReplicas(3));
        assertThat(Readiness.isReplicaSetReady(replicaSet)).isTrue();
    }

    @Test
    void isReplicaSetReady_notAllReplicasReady_returnsFalse() {
        V1ReplicaSet replicaSet = new V1ReplicaSet()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1ReplicaSetSpec().replicas(3))
                .status(new V1ReplicaSetStatus()
                        .replicas(3)
                        .readyReplicas(1));
        assertThat(Readiness.isReplicaSetReady(replicaSet)).isFalse();
    }

    // ========== DaemonSet Tests ==========

    @Test
    void isDaemonSetReady_nullDaemonSet_returnsFalse() {
        assertThat(Readiness.isDaemonSetReady(null)).isFalse();
    }

    @Test
    void isDaemonSetReady_allNodesScheduled_returnsTrue() {
        V1DaemonSet daemonSet = new V1DaemonSet()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1DaemonSetStatus()
                        .desiredNumberScheduled(5)
                        .numberReady(5));
        assertThat(Readiness.isDaemonSetReady(daemonSet)).isTrue();
    }

    @Test
    void isDaemonSetReady_notAllNodesReady_returnsFalse() {
        V1DaemonSet daemonSet = new V1DaemonSet()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1DaemonSetStatus()
                        .desiredNumberScheduled(5)
                        .numberReady(3));
        assertThat(Readiness.isDaemonSetReady(daemonSet)).isFalse();
    }

    // ========== Job Tests ==========

    @Test
    void isJobComplete_nullJob_returnsFalse() {
        assertThat(Readiness.isJobComplete(null)).isFalse();
    }

    @Test
    void isJobComplete_withCompleteCondition_returnsTrue() {
        V1Job job = new V1Job()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1JobStatus()
                        .conditions(List.of(
                                new V1JobCondition()
                                        .type("Complete")
                                        .status("True"))));
        assertThat(Readiness.isJobComplete(job)).isTrue();
    }

    @Test
    void isJobComplete_withFailedCondition_returnsFalse() {
        V1Job job = new V1Job()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1JobStatus()
                        .conditions(List.of(
                                new V1JobCondition()
                                        .type("Failed")
                                        .status("True"))));
        assertThat(Readiness.isJobComplete(job)).isFalse();
    }

    @Test
    void isJobComplete_noConditions_returnsFalse() {
        V1Job job = new V1Job()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1JobStatus());
        assertThat(Readiness.isJobComplete(job)).isFalse();
    }

    // ========== Node Tests ==========

    @Test
    void isNodeReady_nullNode_returnsFalse() {
        assertThat(Readiness.isNodeReady(null)).isFalse();
    }

    @Test
    void isNodeReady_withReadyConditionTrue_returnsTrue() {
        V1Node node = new V1Node()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1NodeStatus()
                        .conditions(List.of(
                                new V1NodeCondition()
                                        .type("Ready")
                                        .status("True"))));
        assertThat(Readiness.isNodeReady(node)).isTrue();
    }

    @Test
    void isNodeReady_withReadyConditionFalse_returnsFalse() {
        V1Node node = new V1Node()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1NodeStatus()
                        .conditions(List.of(
                                new V1NodeCondition()
                                        .type("Ready")
                                        .status("False"))));
        assertThat(Readiness.isNodeReady(node)).isFalse();
    }

    // ========== ReplicationController Tests ==========

    @Test
    void isReplicationControllerReady_nullController_returnsFalse() {
        assertThat(Readiness.isReplicationControllerReady(null)).isFalse();
    }

    @Test
    void isReplicationControllerReady_allReplicasReady_returnsTrue() {
        V1ReplicationController rc = new V1ReplicationController()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new io.kubernetes.client.openapi.models.V1ReplicationControllerSpec().replicas(3))
                .status(new V1ReplicationControllerStatus()
                        .replicas(3)
                        .readyReplicas(3));
        assertThat(Readiness.isReplicationControllerReady(rc)).isTrue();
    }

    // ========== PersistentVolumeClaim Tests ==========

    @Test
    void isPersistentVolumeClaimBound_nullPvc_returnsFalse() {
        assertThat(Readiness.isPersistentVolumeClaimBound(null)).isFalse();
    }

    @Test
    void isPersistentVolumeClaimBound_boundPhase_returnsTrue() {
        V1PersistentVolumeClaim pvc = new V1PersistentVolumeClaim()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PersistentVolumeClaimStatus().phase("Bound"));
        assertThat(Readiness.isPersistentVolumeClaimBound(pvc)).isTrue();
    }

    @Test
    void isPersistentVolumeClaimBound_pendingPhase_returnsFalse() {
        V1PersistentVolumeClaim pvc = new V1PersistentVolumeClaim()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PersistentVolumeClaimStatus().phase("Pending"));
        assertThat(Readiness.isPersistentVolumeClaimBound(pvc)).isFalse();
    }

    // ========== Endpoints Tests ==========

    @Test
    void isEndpointsReady_nullEndpoints_returnsFalse() {
        assertThat(Readiness.isEndpointsReady(null)).isFalse();
    }

    @Test
    void isEndpointsReady_withAddresses_returnsTrue() {
        V1Endpoints endpoints = new V1Endpoints()
                .metadata(new V1ObjectMeta().name("test"))
                .subsets(List.of(
                        new V1EndpointSubset()
                                .addresses(List.of(
                                        new V1EndpointAddress().ip("10.0.0.1")))));
        assertThat(Readiness.isEndpointsReady(endpoints)).isTrue();
    }

    @Test
    void isEndpointsReady_noSubsets_returnsFalse() {
        V1Endpoints endpoints = new V1Endpoints()
                .metadata(new V1ObjectMeta().name("test"));
        assertThat(Readiness.isEndpointsReady(endpoints)).isFalse();
    }

    @Test
    void isEndpointsReady_emptySubsets_returnsFalse() {
        V1Endpoints endpoints = new V1Endpoints()
                .metadata(new V1ObjectMeta().name("test"))
                .subsets(Collections.emptyList());
        assertThat(Readiness.isEndpointsReady(endpoints)).isFalse();
    }

    // ========== Service Tests ==========

    @Test
    void isReady_service_returnsTrue() {
        V1Service service = new V1Service()
                .metadata(new V1ObjectMeta().name("test"));
        assertThat(Readiness.isReady(service)).isTrue();
    }

    // ========== Generic isReady Tests ==========

    @Test
    void isReady_nullResource_returnsFalse() {
        assertThat(Readiness.isReady(null)).isFalse();
    }

    @Test
    void isReady_delegatesToCorrectMethod_forPod() {
        V1Pod pod = new V1Pod()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1PodStatus()
                        .phase("Running")
                        .conditions(List.of(
                                new V1PodCondition().type("Ready").status("True"))));
        assertThat(Readiness.isReady(pod)).isTrue();
    }

    @Test
    void isReady_delegatesToCorrectMethod_forDeployment() {
        V1Deployment deployment = new V1Deployment()
                .metadata(new V1ObjectMeta().name("test"))
                .spec(new V1DeploymentSpec().replicas(1))
                .status(new V1DeploymentStatus()
                        .replicas(1)
                        .readyReplicas(1)
                        .availableReplicas(1)
                        .conditions(List.of(
                                new V1DeploymentCondition()
                                        .type("Available")
                                        .status("True"))));
        assertThat(Readiness.isReady(deployment)).isTrue();
    }

    @Test
    void isReady_delegatesToCorrectMethod_forJob() {
        V1Job job = new V1Job()
                .metadata(new V1ObjectMeta().name("test"))
                .status(new V1JobStatus()
                        .conditions(List.of(
                                new V1JobCondition()
                                        .type("Complete")
                                        .status("True"))));
        assertThat(Readiness.isReady(job)).isTrue();
    }
}
