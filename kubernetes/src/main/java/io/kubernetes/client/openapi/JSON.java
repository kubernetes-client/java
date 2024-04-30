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
package io.kubernetes.client.openapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import io.kubernetes.client.gson.V1StatusPreProcessor;
import io.kubernetes.client.openapi.models.V1Status;
import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;

    private static final DateTimeFormatter RFC3339MICRO_FORMATTER =
            new DateTimeFormatterBuilder()
                    .parseDefaulting(ChronoField.OFFSET_SECONDS, 0)
                    .append(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))
                    .optionalStart()
                    .appendFraction(ChronoField.NANO_OF_SECOND, 6, 6, true)
                    .optionalEnd()
                    .appendLiteral("Z")
                    .toFormatter();
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter(RFC3339MICRO_FORMATTER);
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder =
                fireBuilder
                        .registerPreProcessor(V1Status.class, new V1StatusPreProcessor())
                        .createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.AdmissionregistrationV1ServiceReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.AdmissionregistrationV1WebhookClientConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.ApiregistrationV1ServiceReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.AuthenticationV1TokenRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.CoreV1EndpointPort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.CoreV1Event.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.CoreV1EventList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.CoreV1EventSeries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.EventsV1Event.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.EventsV1EventList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.EventsV1EventSeries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.FlowcontrolV1Subject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.RbacV1Subject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.StorageV1TokenRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIGroupList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIResourceList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIService.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIServiceCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIServiceList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIServiceSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIServiceStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1APIVersions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Affinity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AggregationRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AppArmorProfile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AttachedVolume.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AuditAnnotation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1AzureFileVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Binding.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1BoundObjectReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSIDriver.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSIDriverList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSIDriverSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSINode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSINodeDriver.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSINodeList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSINodeSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSIStorageCapacity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSIStorageCapacityList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CSIVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Capabilities.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CephFSVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CertificateSigningRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CertificateSigningRequestCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CertificateSigningRequestList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CertificateSigningRequestSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CertificateSigningRequestStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CinderVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ClaimSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ClientIPConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ClusterRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ClusterRoleBinding.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ClusterRoleBindingList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ClusterRoleList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ClusterTrustBundleProjection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ComponentCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ComponentStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ComponentStatusList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Condition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ConfigMap.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ConfigMapEnvSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ConfigMapKeySelector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ConfigMapList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ConfigMapProjection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Container.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerImage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerPort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerResizePolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerStateRunning.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerStateTerminated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerStateWaiting.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ContainerStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ControllerRevision.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ControllerRevisionList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CronJob.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CronJobList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CronJobSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CronJobStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CrossVersionObjectReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceConversion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionNames.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceDefinitionVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceSubresourceScale.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceSubresources.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1CustomResourceValidation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DaemonEndpoint.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DaemonSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DaemonSetCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DaemonSetList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DaemonSetSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DaemonSetStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DeleteOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Deployment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DeploymentCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DeploymentList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DeploymentSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DeploymentStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DeploymentStrategy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DownwardAPIProjection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Endpoint.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EndpointAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EndpointConditions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EndpointHints.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EndpointSlice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EndpointSliceList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EndpointSubset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Endpoints.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EndpointsList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EnvFromSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EnvVar.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EnvVarSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EphemeralContainer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EphemeralVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1EventSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Eviction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ExecAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ExemptPriorityLevelConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ExpressionWarning.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ExternalDocumentation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FCVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlexVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlockerVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlowDistinguisherMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlowSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlowSchemaCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlowSchemaList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlowSchemaSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1FlowSchemaStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ForZone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1GRPCAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1GitRepoVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1GroupSubject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HTTPGetAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HTTPHeader.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HTTPIngressPath.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HTTPIngressRuleValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HostAlias.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HostIP.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1HostPathVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IPBlock.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ISCSIVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Ingress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressBackend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressClass.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressClassList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressClassParametersReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressClassSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressLoadBalancerStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressPortStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressServiceBackend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1IngressTLS.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1JSONSchemaProps.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Job.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1JobCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1JobList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1JobSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1JobStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1JobTemplateSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1KeyToPath.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LabelSelector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LabelSelectorRequirement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Lease.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LeaseList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LeaseSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Lifecycle.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LifecycleHandler.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LimitRange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LimitRangeItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LimitRangeList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LimitRangeSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LimitResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LimitedPriorityLevelConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ListMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LoadBalancerIngress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LoadBalancerStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LocalObjectReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1LocalVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ManagedFieldsEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1MatchCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1MatchResources.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ModifyVolumeStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1MutatingWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1MutatingWebhookConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NFSVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NamedRuleWithOperations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Namespace.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NamespaceCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NamespaceList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NamespaceSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NamespaceStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NetworkPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NetworkPolicyEgressRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NetworkPolicyList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NetworkPolicyPeer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NetworkPolicyPort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NetworkPolicySpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Node.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeAffinity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeConfigSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeConfigStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeDaemonEndpoints.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeRuntimeHandler.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeRuntimeHandlerFeatures.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeSelector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeSelectorRequirement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeSelectorTerm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NodeSystemInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NonResourceAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NonResourcePolicyRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1NonResourceRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ObjectFieldSelector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ObjectMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ObjectReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Overhead.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1OwnerReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ParamKind.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ParamRef.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolume.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeClaim.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PersistentVolumeStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Pod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodAffinity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodAffinityTerm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodAntiAffinity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodDNSConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodDNSConfigOption.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodDisruptionBudget.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodDisruptionBudgetStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodFailurePolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodFailurePolicyOnExitCodesRequirement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodFailurePolicyOnPodConditionsPattern.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodFailurePolicyRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodIP.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodOS.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodReadinessGate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodResourceClaim.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodResourceClaimStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodSchedulingGate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodSecurityContext.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodTemplateList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PodTemplateSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PolicyRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PolicyRulesWithSubjects.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PortStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PortworxVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Preconditions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PreferredSchedulingTerm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityClass.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityClassList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityLevelConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Probe.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ProjectedVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1QueuingConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1QuobyteVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RBDVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicaSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicaSetCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicaSetList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicaSetSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicaSetStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicationController.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicationControllerCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicationControllerList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicationControllerSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ReplicationControllerStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceClaim.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceFieldSelector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourcePolicyRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceQuota.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceQuotaList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceQuotaSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceQuotaStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceRequirements.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ResourceRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Role.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RoleBinding.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RoleBindingList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RoleList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RoleRef.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RollingUpdateDeployment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RuleWithOperations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RuntimeClass.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1RuntimeClassList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SELinuxOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Scale.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ScaleSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ScaleStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Scheduling.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ScopeSelector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ScopedResourceSelectorRequirement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SeccompProfile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Secret.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SecretEnvSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SecretKeySelector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SecretList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SecretProjection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SecretReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SecretVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SecurityContext.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SelectableField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SelfSubjectReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SelfSubjectReviewStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SelfSubjectRulesReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServerAddressByClientCIDR.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Service.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceAccountList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceAccountSubject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceBackendPort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServicePort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ServiceStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SessionAffinityConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SleepAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSetCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSetList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSetOrdinals.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSetPersistentVolumeClaimRetentionPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSetSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSetStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatefulSetUpdateStrategy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Status.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatusCause.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StatusDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StorageClass.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StorageClassList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1StorageOSVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SubjectAccessReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SubjectRulesReviewStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SuccessPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1SuccessPolicyRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Sysctl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TCPSocketAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Taint.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TokenRequestSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TokenRequestStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TokenReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TokenReviewSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TokenReviewStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Toleration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirement.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TopologySelectorTerm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TopologySpreadConstraint.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TypeChecking.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TypedLocalObjectReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1TypedObjectReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1UncountedTerminatedPods.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1UserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1UserSubject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBinding.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBindingList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyBindingSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicySpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingAdmissionPolicyStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingWebhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Validation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1ValidationRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Variable.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1Volume.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeAttachment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeAttachmentList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeAttachmentSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeAttachmentStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeMount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeMountStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeNodeAffinity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeNodeResources.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeProjection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VolumeResourceRequirements.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1WatchEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1WebhookConversion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1WeightedPodAffinityTerm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1WindowsSecurityContextOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1AuditAnnotation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundle.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundleList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundleSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ExpressionWarning.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1GroupVersionResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1IPAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1IPAddressList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1IPAddressSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1MatchCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1MatchResources.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1MigrationCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1NamedRuleWithOperations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ParamKind.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ParamRef.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ParentReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1SelfSubjectReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1SelfSubjectReviewStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ServiceCIDR.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ServiceCIDRList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ServiceCIDRSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ServiceCIDRStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersionList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1StorageVersionStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1TypeChecking.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ValidatingAdmissionPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ValidatingAdmissionPolicyBinding.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ValidatingAdmissionPolicyBindingList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ValidatingAdmissionPolicyBindingSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ValidatingAdmissionPolicyList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ValidatingAdmissionPolicySpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1ValidatingAdmissionPolicyStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1Validation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1Variable.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1VolumeAttributesClass.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha1VolumeAttributesClassList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2AllocationResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2DriverAllocationResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2DriverRequests.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesAllocationResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesAttribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesInstance.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesIntSlice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesResources.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2NamedResourcesStringSlice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2PodSchedulingContext.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2PodSchedulingContextList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2PodSchedulingContextSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2PodSchedulingContextStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaim.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimParametersList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimParametersReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimTemplateList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClaimTemplateSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClass.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClassList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClassParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClassParametersList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceClassParametersReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceHandle.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceSlice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2ResourceSliceList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2StructuredResourceHandle.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1alpha2VendorParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1AuditAnnotation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ExpressionWarning.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1MatchCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1MatchResources.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1NamedRuleWithOperations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ParamKind.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ParamRef.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1SelfSubjectReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1SelfSubjectReviewStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1TypeChecking.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyBinding.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyBindingList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyBindingSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicySpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1ValidatingAdmissionPolicyStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1Validation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta1Variable.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3ExemptPriorityLevelConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3FlowDistinguisherMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3FlowSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3FlowSchemaCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3FlowSchemaList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3FlowSchemaSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3FlowSchemaStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3GroupSubject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3LimitResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3LimitedPriorityLevelConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3NonResourcePolicyRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3PolicyRulesWithSubjects.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3PriorityLevelConfigurationStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3QueuingConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3ResourcePolicyRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3ServiceAccountSubject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3Subject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V1beta3UserSubject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ContainerResourceMetricSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ContainerResourceMetricStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2CrossVersionObjectReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ExternalMetricSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ExternalMetricStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HPAScalingPolicy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HPAScalingRules.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscaler.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerCondition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2MetricIdentifier.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2MetricSpec.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2MetricStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2MetricTarget.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2MetricValueStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ObjectMetricSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ObjectMetricStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2PodsMetricSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2PodsMetricStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ResourceMetricSource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.V2ResourceMetricStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.kubernetes.client.openapi.models.VersionInfo.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            boolean oldHtmlSafe = out.isHtmlSafe();
            out.setHtmlSafe(false);
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
            out.setHtmlSafe(oldHtmlSafe);
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    try {
                        return OffsetDateTime.parse(date, formatter);
                    } catch (DateTimeParseException e) {
                        // backward-compatibility for ISO8601 timestamp format
                        return OffsetDateTime.parse(date, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
