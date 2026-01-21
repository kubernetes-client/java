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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1DeploymentCondition;
import io.kubernetes.client.openapi.models.V1DeploymentStatus;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeCondition;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodCondition;
import io.kubernetes.client.openapi.models.V1PodStatus;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.openapi.models.V1ReplicaSetStatus;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.openapi.models.V1StatefulSetStatus;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1DaemonSetStatus;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobCondition;
import io.kubernetes.client.openapi.models.V1JobStatus;
import io.kubernetes.client.openapi.models.V1Service;
import io.kubernetes.client.openapi.models.V1ReplicationController;
import io.kubernetes.client.openapi.models.V1ReplicationControllerStatus;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaim;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus;
import io.kubernetes.client.openapi.models.V1Endpoints;

import java.util.List;
import java.util.Objects;

/**
 * Utilities for checking the readiness of various Kubernetes resources.
 * Provides fabric8-style readiness checks for common resource types.
 * 
 * <p>Example usage:
 * <pre>{@code
 * V1Pod pod = coreV1Api.readNamespacedPod("my-pod", "default").execute();
 * if (Readiness.isPodReady(pod)) {
 *     // Pod is ready
 * }
 * 
 * // Or use generic method:
 * if (Readiness.isReady(pod)) {
 *     // Resource is ready
 * }
 * }</pre>
 */
public class Readiness {

    private Readiness() {
        // Utility class
    }

    /**
     * Checks if a Kubernetes resource is ready.
     * Supports Pod, Deployment, ReplicaSet, StatefulSet, DaemonSet, Job, Node,
     * ReplicationController, PersistentVolumeClaim, Endpoints, and Service.
     *
     * @param resource the Kubernetes resource to check
     * @return true if the resource is ready, false otherwise
     */
    public static boolean isReady(KubernetesObject resource) {
        if (resource == null) {
            return false;
        }

        if (resource instanceof V1Pod) {
            return isPodReady((V1Pod) resource);
        } else if (resource instanceof V1Deployment) {
            return isDeploymentReady((V1Deployment) resource);
        } else if (resource instanceof V1ReplicaSet) {
            return isReplicaSetReady((V1ReplicaSet) resource);
        } else if (resource instanceof V1StatefulSet) {
            return isStatefulSetReady((V1StatefulSet) resource);
        } else if (resource instanceof V1DaemonSet) {
            return isDaemonSetReady((V1DaemonSet) resource);
        } else if (resource instanceof V1Job) {
            return isJobComplete((V1Job) resource);
        } else if (resource instanceof V1Node) {
            return isNodeReady((V1Node) resource);
        } else if (resource instanceof V1ReplicationController) {
            return isReplicationControllerReady((V1ReplicationController) resource);
        } else if (resource instanceof V1PersistentVolumeClaim) {
            return isPersistentVolumeClaimBound((V1PersistentVolumeClaim) resource);
        } else if (resource instanceof V1Endpoints) {
            return isEndpointsReady((V1Endpoints) resource);
        } else if (resource instanceof V1Service) {
            // Services are considered ready if they exist
            return true;
        }

        // For unknown types, consider them ready if they exist
        return true;
    }

    /**
     * Checks if a Pod is ready.
     * A Pod is considered ready if all containers are ready and the Pod
     * has the "Ready" condition set to "True".
     *
     * @param pod the Pod to check
     * @return true if the Pod is ready, false otherwise
     */
    public static boolean isPodReady(V1Pod pod) {
        if (pod == null) {
            return false;
        }

        V1PodStatus status = pod.getStatus();
        if (status == null) {
            return false;
        }

        // Check for Running phase
        String phase = status.getPhase();
        if (!"Running".equals(phase)) {
            return false;
        }

        // Check Ready condition
        List<V1PodCondition> conditions = status.getConditions();
        if (conditions == null || conditions.isEmpty()) {
            return false;
        }

        return conditions.stream()
                .filter(c -> "Ready".equals(c.getType()))
                .findFirst()
                .map(c -> "True".equals(c.getStatus()))
                .orElse(false);
    }

    /**
     * Checks if a Deployment is ready.
     * A Deployment is considered ready when the number of available replicas
     * equals the desired number of replicas.
     *
     * @param deployment the Deployment to check
     * @return true if the Deployment is ready, false otherwise
     */
    public static boolean isDeploymentReady(V1Deployment deployment) {
        if (deployment == null) {
            return false;
        }

        V1DeploymentStatus status = deployment.getStatus();
        if (status == null) {
            return false;
        }

        // Check Available condition
        List<V1DeploymentCondition> conditions = status.getConditions();
        if (conditions != null) {
            boolean available = conditions.stream()
                    .filter(c -> "Available".equals(c.getType()))
                    .anyMatch(c -> "True".equals(c.getStatus()));
            if (!available) {
                return false;
            }
        }

        Integer replicas = deployment.getSpec() != null ? deployment.getSpec().getReplicas() : null;
        Integer readyReplicas = status.getReadyReplicas();
        Integer availableReplicas = status.getAvailableReplicas();

        if (replicas == null) {
            replicas = 1; // Default replicas is 1
        }

        return Objects.equals(replicas, readyReplicas) && 
               Objects.equals(replicas, availableReplicas);
    }

    /**
     * Checks if a ReplicaSet is ready.
     * A ReplicaSet is considered ready when the number of ready replicas
     * equals the desired number of replicas.
     *
     * @param replicaSet the ReplicaSet to check
     * @return true if the ReplicaSet is ready, false otherwise
     */
    public static boolean isReplicaSetReady(V1ReplicaSet replicaSet) {
        if (replicaSet == null) {
            return false;
        }

        V1ReplicaSetStatus status = replicaSet.getStatus();
        if (status == null) {
            return false;
        }

        Integer replicas = replicaSet.getSpec() != null ? replicaSet.getSpec().getReplicas() : null;
        Integer readyReplicas = status.getReadyReplicas();

        if (replicas == null) {
            replicas = 1;
        }
        if (readyReplicas == null) {
            readyReplicas = 0;
        }

        return replicas.equals(readyReplicas);
    }

    /**
     * Checks if a StatefulSet is ready.
     * A StatefulSet is considered ready when the number of ready replicas
     * equals the desired number of replicas.
     *
     * @param statefulSet the StatefulSet to check
     * @return true if the StatefulSet is ready, false otherwise
     */
    public static boolean isStatefulSetReady(V1StatefulSet statefulSet) {
        if (statefulSet == null) {
            return false;
        }

        V1StatefulSetStatus status = statefulSet.getStatus();
        if (status == null) {
            return false;
        }

        Integer replicas = statefulSet.getSpec() != null ? statefulSet.getSpec().getReplicas() : null;
        Integer readyReplicas = status.getReadyReplicas();

        if (replicas == null) {
            replicas = 1;
        }
        if (readyReplicas == null) {
            readyReplicas = 0;
        }

        return replicas.equals(readyReplicas);
    }

    /**
     * Checks if a DaemonSet is ready.
     * A DaemonSet is considered ready when the number of ready nodes
     * equals the desired number of scheduled nodes.
     *
     * @param daemonSet the DaemonSet to check
     * @return true if the DaemonSet is ready, false otherwise
     */
    public static boolean isDaemonSetReady(V1DaemonSet daemonSet) {
        if (daemonSet == null) {
            return false;
        }

        V1DaemonSetStatus status = daemonSet.getStatus();
        if (status == null) {
            return false;
        }

        Integer desiredNumberScheduled = status.getDesiredNumberScheduled();
        Integer numberReady = status.getNumberReady();

        if (desiredNumberScheduled == null) {
            desiredNumberScheduled = 0;
        }
        if (numberReady == null) {
            numberReady = 0;
        }

        return desiredNumberScheduled > 0 && desiredNumberScheduled.equals(numberReady);
    }

    /**
     * Checks if a Job has completed successfully.
     * A Job is considered complete when it has a "Complete" condition set to "True".
     *
     * @param job the Job to check
     * @return true if the Job is complete, false otherwise
     */
    public static boolean isJobComplete(V1Job job) {
        if (job == null) {
            return false;
        }

        V1JobStatus status = job.getStatus();
        if (status == null) {
            return false;
        }

        List<V1JobCondition> conditions = status.getConditions();
        if (conditions == null || conditions.isEmpty()) {
            return false;
        }

        return conditions.stream()
                .filter(c -> "Complete".equals(c.getType()))
                .anyMatch(c -> "True".equals(c.getStatus()));
    }

    /**
     * Checks if a Job has failed.
     *
     * @param job the Job to check
     * @return true if the Job has failed, false otherwise
     */
    public static boolean isJobFailed(V1Job job) {
        if (job == null) {
            return false;
        }

        V1JobStatus status = job.getStatus();
        if (status == null) {
            return false;
        }

        List<V1JobCondition> conditions = status.getConditions();
        if (conditions == null || conditions.isEmpty()) {
            return false;
        }

        return conditions.stream()
                .filter(c -> "Failed".equals(c.getType()))
                .anyMatch(c -> "True".equals(c.getStatus()));
    }

    /**
     * Checks if a Node is ready.
     * A Node is considered ready when it has the "Ready" condition set to "True".
     *
     * @param node the Node to check
     * @return true if the Node is ready, false otherwise
     */
    public static boolean isNodeReady(V1Node node) {
        if (node == null) {
            return false;
        }

        V1NodeStatus status = node.getStatus();
        if (status == null) {
            return false;
        }

        List<V1NodeCondition> conditions = status.getConditions();
        if (conditions == null || conditions.isEmpty()) {
            return false;
        }

        return conditions.stream()
                .filter(c -> "Ready".equals(c.getType()))
                .anyMatch(c -> "True".equals(c.getStatus()));
    }

    /**
     * Checks if a ReplicationController is ready.
     * A ReplicationController is considered ready when the number of ready replicas
     * equals the desired number of replicas.
     *
     * @param replicationController the ReplicationController to check
     * @return true if the ReplicationController is ready, false otherwise
     */
    public static boolean isReplicationControllerReady(V1ReplicationController replicationController) {
        if (replicationController == null) {
            return false;
        }

        V1ReplicationControllerStatus status = replicationController.getStatus();
        if (status == null) {
            return false;
        }

        Integer replicas = replicationController.getSpec() != null 
                ? replicationController.getSpec().getReplicas() : null;
        Integer readyReplicas = status.getReadyReplicas();

        if (replicas == null) {
            replicas = 1;
        }
        if (readyReplicas == null) {
            readyReplicas = 0;
        }

        return replicas.equals(readyReplicas);
    }

    /**
     * Checks if a PersistentVolumeClaim is bound.
     *
     * @param pvc the PersistentVolumeClaim to check
     * @return true if the PVC is bound, false otherwise
     */
    public static boolean isPersistentVolumeClaimBound(V1PersistentVolumeClaim pvc) {
        if (pvc == null) {
            return false;
        }

        V1PersistentVolumeClaimStatus status = pvc.getStatus();
        if (status == null) {
            return false;
        }

        return "Bound".equals(status.getPhase());
    }

    /**
     * Checks if Endpoints are ready (have at least one address).
     *
     * @param endpoints the Endpoints to check
     * @return true if the Endpoints have at least one address, false otherwise
     */
    public static boolean isEndpointsReady(V1Endpoints endpoints) {
        if (endpoints == null) {
            return false;
        }

        if (endpoints.getSubsets() == null || endpoints.getSubsets().isEmpty()) {
            return false;
        }

        return endpoints.getSubsets().stream()
                .anyMatch(subset -> subset.getAddresses() != null && !subset.getAddresses().isEmpty());
    }

    /**
     * Checks if a Pod is in a terminal state (Succeeded or Failed).
     *
     * @param pod the Pod to check
     * @return true if the Pod is in a terminal state, false otherwise
     */
    public static boolean isPodTerminal(V1Pod pod) {
        if (pod == null) {
            return false;
        }

        V1PodStatus status = pod.getStatus();
        if (status == null) {
            return false;
        }

        String phase = status.getPhase();
        return "Succeeded".equals(phase) || "Failed".equals(phase);
    }

    /**
     * Checks if a Pod has succeeded.
     *
     * @param pod the Pod to check
     * @return true if the Pod has succeeded, false otherwise
     */
    public static boolean isPodSucceeded(V1Pod pod) {
        if (pod == null) {
            return false;
        }

        V1PodStatus status = pod.getStatus();
        if (status == null) {
            return false;
        }

        return "Succeeded".equals(status.getPhase());
    }

    /**
     * Checks if a Pod has failed.
     *
     * @param pod the Pod to check
     * @return true if the Pod has failed, false otherwise
     */
    public static boolean isPodFailed(V1Pod pod) {
        if (pod == null) {
            return false;
        }

        V1PodStatus status = pod.getStatus();
        if (status == null) {
            return false;
        }

        return "Failed".equals(status.getPhase());
    }

    /**
     * Checks if a Pod is running.
     *
     * @param pod the Pod to check
     * @return true if the Pod is running, false otherwise
     */
    public static boolean isPodRunning(V1Pod pod) {
        if (pod == null) {
            return false;
        }

        V1PodStatus status = pod.getStatus();
        if (status == null) {
            return false;
        }

        return "Running".equals(status.getPhase());
    }
}
