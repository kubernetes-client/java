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
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureFileVolumeSource;
import io.kubernetes.client.openapi.models.V1CSIVolumeSource;
import io.kubernetes.client.openapi.models.V1CephFSVolumeSource;
import io.kubernetes.client.openapi.models.V1CinderVolumeSource;
import io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource;
import io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource;
import io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource;
import io.kubernetes.client.openapi.models.V1EphemeralVolumeSource;
import io.kubernetes.client.openapi.models.V1FCVolumeSource;
import io.kubernetes.client.openapi.models.V1FlexVolumeSource;
import io.kubernetes.client.openapi.models.V1FlockerVolumeSource;
import io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1GitRepoVolumeSource;
import io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource;
import io.kubernetes.client.openapi.models.V1HostPathVolumeSource;
import io.kubernetes.client.openapi.models.V1ISCSIVolumeSource;
import io.kubernetes.client.openapi.models.V1NFSVolumeSource;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource;
import io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1PortworxVolumeSource;
import io.kubernetes.client.openapi.models.V1ProjectedVolumeSource;
import io.kubernetes.client.openapi.models.V1QuobyteVolumeSource;
import io.kubernetes.client.openapi.models.V1RBDVolumeSource;
import io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource;
import io.kubernetes.client.openapi.models.V1SecretVolumeSource;
import io.kubernetes.client.openapi.models.V1StorageOSVolumeSource;
import io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:09.091597Z[Etc/UTC]")
public class V1Volume {
  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";
  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  private V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";
  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  private V1AzureDiskVolumeSource azureDisk;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";
  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  private V1AzureFileVolumeSource azureFile;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";
  @SerializedName(SERIALIZED_NAME_CEPHFS)
  private V1CephFSVolumeSource cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";
  @SerializedName(SERIALIZED_NAME_CINDER)
  private V1CinderVolumeSource cinder;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ConfigMapVolumeSource configMap;

  public static final String SERIALIZED_NAME_CSI = "csi";
  @SerializedName(SERIALIZED_NAME_CSI)
  private V1CSIVolumeSource csi;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1DownwardAPIVolumeSource downwardAPI;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";
  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private V1EmptyDirVolumeSource emptyDir;

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private V1EphemeralVolumeSource ephemeral;

  public static final String SERIALIZED_NAME_FC = "fc";
  @SerializedName(SERIALIZED_NAME_FC)
  private V1FCVolumeSource fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";
  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  private V1FlexVolumeSource flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";
  @SerializedName(SERIALIZED_NAME_FLOCKER)
  private V1FlockerVolumeSource flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";
  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  private V1GCEPersistentDiskVolumeSource gcePersistentDisk;

  public static final String SERIALIZED_NAME_GIT_REPO = "gitRepo";
  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  private V1GitRepoVolumeSource gitRepo;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";
  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  private V1GlusterfsVolumeSource glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";
  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private V1HostPathVolumeSource hostPath;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";
  @SerializedName(SERIALIZED_NAME_ISCSI)
  private V1ISCSIVolumeSource iscsi;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NFS = "nfs";
  @SerializedName(SERIALIZED_NAME_NFS)
  private V1NFSVolumeSource nfs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private V1PersistentVolumeClaimVolumeSource persistentVolumeClaim;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";
  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  private V1PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";
  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  private V1PortworxVolumeSource portworxVolume;

  public static final String SERIALIZED_NAME_PROJECTED = "projected";
  @SerializedName(SERIALIZED_NAME_PROJECTED)
  private V1ProjectedVolumeSource projected;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";
  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  private V1QuobyteVolumeSource quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";
  @SerializedName(SERIALIZED_NAME_RBD)
  private V1RBDVolumeSource rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";
  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  private V1ScaleIOVolumeSource scaleIO;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1SecretVolumeSource secret;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";
  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  private V1StorageOSVolumeSource storageos;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";
  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  private V1VsphereVirtualDiskVolumeSource vsphereVolume;

  public V1Volume() {
  }

  public V1Volume awsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {

    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

   /**
   * Get awsElasticBlockStore
   * @return awsElasticBlockStore
  **/
  @jakarta.annotation.Nullable
  public V1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }


  public void setAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }


  public V1Volume azureDisk(V1AzureDiskVolumeSource azureDisk) {

    this.azureDisk = azureDisk;
    return this;
  }

   /**
   * Get azureDisk
   * @return azureDisk
  **/
  @jakarta.annotation.Nullable
  public V1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }


  public void setAzureDisk(V1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }


  public V1Volume azureFile(V1AzureFileVolumeSource azureFile) {

    this.azureFile = azureFile;
    return this;
  }

   /**
   * Get azureFile
   * @return azureFile
  **/
  @jakarta.annotation.Nullable
  public V1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }


  public void setAzureFile(V1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }


  public V1Volume cephfs(V1CephFSVolumeSource cephfs) {

    this.cephfs = cephfs;
    return this;
  }

   /**
   * Get cephfs
   * @return cephfs
  **/
  @jakarta.annotation.Nullable
  public V1CephFSVolumeSource getCephfs() {
    return cephfs;
  }


  public void setCephfs(V1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }


  public V1Volume cinder(V1CinderVolumeSource cinder) {

    this.cinder = cinder;
    return this;
  }

   /**
   * Get cinder
   * @return cinder
  **/
  @jakarta.annotation.Nullable
  public V1CinderVolumeSource getCinder() {
    return cinder;
  }


  public void setCinder(V1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }


  public V1Volume configMap(V1ConfigMapVolumeSource configMap) {

    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @jakarta.annotation.Nullable
  public V1ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }


  public void setConfigMap(V1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }


  public V1Volume csi(V1CSIVolumeSource csi) {

    this.csi = csi;
    return this;
  }

   /**
   * Get csi
   * @return csi
  **/
  @jakarta.annotation.Nullable
  public V1CSIVolumeSource getCsi() {
    return csi;
  }


  public void setCsi(V1CSIVolumeSource csi) {
    this.csi = csi;
  }


  public V1Volume downwardAPI(V1DownwardAPIVolumeSource downwardAPI) {

    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @jakarta.annotation.Nullable
  public V1DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }


  public void setDownwardAPI(V1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public V1Volume emptyDir(V1EmptyDirVolumeSource emptyDir) {

    this.emptyDir = emptyDir;
    return this;
  }

   /**
   * Get emptyDir
   * @return emptyDir
  **/
  @jakarta.annotation.Nullable
  public V1EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }


  public void setEmptyDir(V1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }


  public V1Volume ephemeral(V1EphemeralVolumeSource ephemeral) {

    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * Get ephemeral
   * @return ephemeral
  **/
  @jakarta.annotation.Nullable
  public V1EphemeralVolumeSource getEphemeral() {
    return ephemeral;
  }


  public void setEphemeral(V1EphemeralVolumeSource ephemeral) {
    this.ephemeral = ephemeral;
  }


  public V1Volume fc(V1FCVolumeSource fc) {

    this.fc = fc;
    return this;
  }

   /**
   * Get fc
   * @return fc
  **/
  @jakarta.annotation.Nullable
  public V1FCVolumeSource getFc() {
    return fc;
  }


  public void setFc(V1FCVolumeSource fc) {
    this.fc = fc;
  }


  public V1Volume flexVolume(V1FlexVolumeSource flexVolume) {

    this.flexVolume = flexVolume;
    return this;
  }

   /**
   * Get flexVolume
   * @return flexVolume
  **/
  @jakarta.annotation.Nullable
  public V1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }


  public void setFlexVolume(V1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }


  public V1Volume flocker(V1FlockerVolumeSource flocker) {

    this.flocker = flocker;
    return this;
  }

   /**
   * Get flocker
   * @return flocker
  **/
  @jakarta.annotation.Nullable
  public V1FlockerVolumeSource getFlocker() {
    return flocker;
  }


  public void setFlocker(V1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }


  public V1Volume gcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {

    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

   /**
   * Get gcePersistentDisk
   * @return gcePersistentDisk
  **/
  @jakarta.annotation.Nullable
  public V1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }


  public void setGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }


  public V1Volume gitRepo(V1GitRepoVolumeSource gitRepo) {

    this.gitRepo = gitRepo;
    return this;
  }

   /**
   * Get gitRepo
   * @return gitRepo
  **/
  @jakarta.annotation.Nullable
  public V1GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }


  public void setGitRepo(V1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }


  public V1Volume glusterfs(V1GlusterfsVolumeSource glusterfs) {

    this.glusterfs = glusterfs;
    return this;
  }

   /**
   * Get glusterfs
   * @return glusterfs
  **/
  @jakarta.annotation.Nullable
  public V1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }


  public void setGlusterfs(V1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }


  public V1Volume hostPath(V1HostPathVolumeSource hostPath) {

    this.hostPath = hostPath;
    return this;
  }

   /**
   * Get hostPath
   * @return hostPath
  **/
  @jakarta.annotation.Nullable
  public V1HostPathVolumeSource getHostPath() {
    return hostPath;
  }


  public void setHostPath(V1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }


  public V1Volume iscsi(V1ISCSIVolumeSource iscsi) {

    this.iscsi = iscsi;
    return this;
  }

   /**
   * Get iscsi
   * @return iscsi
  **/
  @jakarta.annotation.Nullable
  public V1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }


  public void setIscsi(V1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }


  public V1Volume name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1Volume nfs(V1NFSVolumeSource nfs) {

    this.nfs = nfs;
    return this;
  }

   /**
   * Get nfs
   * @return nfs
  **/
  @jakarta.annotation.Nullable
  public V1NFSVolumeSource getNfs() {
    return nfs;
  }


  public void setNfs(V1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }


  public V1Volume persistentVolumeClaim(V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {

    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

   /**
   * Get persistentVolumeClaim
   * @return persistentVolumeClaim
  **/
  @jakarta.annotation.Nullable
  public V1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }


  public void setPersistentVolumeClaim(V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }


  public V1Volume photonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {

    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

   /**
   * Get photonPersistentDisk
   * @return photonPersistentDisk
  **/
  @jakarta.annotation.Nullable
  public V1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }


  public void setPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }


  public V1Volume portworxVolume(V1PortworxVolumeSource portworxVolume) {

    this.portworxVolume = portworxVolume;
    return this;
  }

   /**
   * Get portworxVolume
   * @return portworxVolume
  **/
  @jakarta.annotation.Nullable
  public V1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }


  public void setPortworxVolume(V1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }


  public V1Volume projected(V1ProjectedVolumeSource projected) {

    this.projected = projected;
    return this;
  }

   /**
   * Get projected
   * @return projected
  **/
  @jakarta.annotation.Nullable
  public V1ProjectedVolumeSource getProjected() {
    return projected;
  }


  public void setProjected(V1ProjectedVolumeSource projected) {
    this.projected = projected;
  }


  public V1Volume quobyte(V1QuobyteVolumeSource quobyte) {

    this.quobyte = quobyte;
    return this;
  }

   /**
   * Get quobyte
   * @return quobyte
  **/
  @jakarta.annotation.Nullable
  public V1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }


  public void setQuobyte(V1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }


  public V1Volume rbd(V1RBDVolumeSource rbd) {

    this.rbd = rbd;
    return this;
  }

   /**
   * Get rbd
   * @return rbd
  **/
  @jakarta.annotation.Nullable
  public V1RBDVolumeSource getRbd() {
    return rbd;
  }


  public void setRbd(V1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }


  public V1Volume scaleIO(V1ScaleIOVolumeSource scaleIO) {

    this.scaleIO = scaleIO;
    return this;
  }

   /**
   * Get scaleIO
   * @return scaleIO
  **/
  @jakarta.annotation.Nullable
  public V1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }


  public void setScaleIO(V1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }


  public V1Volume secret(V1SecretVolumeSource secret) {

    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @jakarta.annotation.Nullable
  public V1SecretVolumeSource getSecret() {
    return secret;
  }


  public void setSecret(V1SecretVolumeSource secret) {
    this.secret = secret;
  }


  public V1Volume storageos(V1StorageOSVolumeSource storageos) {

    this.storageos = storageos;
    return this;
  }

   /**
   * Get storageos
   * @return storageos
  **/
  @jakarta.annotation.Nullable
  public V1StorageOSVolumeSource getStorageos() {
    return storageos;
  }


  public void setStorageos(V1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }


  public V1Volume vsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {

    this.vsphereVolume = vsphereVolume;
    return this;
  }

   /**
   * Get vsphereVolume
   * @return vsphereVolume
  **/
  @jakarta.annotation.Nullable
  public V1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }


  public void setVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Volume v1Volume = (V1Volume) o;
    return Objects.equals(this.awsElasticBlockStore, v1Volume.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, v1Volume.azureDisk) &&
        Objects.equals(this.azureFile, v1Volume.azureFile) &&
        Objects.equals(this.cephfs, v1Volume.cephfs) &&
        Objects.equals(this.cinder, v1Volume.cinder) &&
        Objects.equals(this.configMap, v1Volume.configMap) &&
        Objects.equals(this.csi, v1Volume.csi) &&
        Objects.equals(this.downwardAPI, v1Volume.downwardAPI) &&
        Objects.equals(this.emptyDir, v1Volume.emptyDir) &&
        Objects.equals(this.ephemeral, v1Volume.ephemeral) &&
        Objects.equals(this.fc, v1Volume.fc) &&
        Objects.equals(this.flexVolume, v1Volume.flexVolume) &&
        Objects.equals(this.flocker, v1Volume.flocker) &&
        Objects.equals(this.gcePersistentDisk, v1Volume.gcePersistentDisk) &&
        Objects.equals(this.gitRepo, v1Volume.gitRepo) &&
        Objects.equals(this.glusterfs, v1Volume.glusterfs) &&
        Objects.equals(this.hostPath, v1Volume.hostPath) &&
        Objects.equals(this.iscsi, v1Volume.iscsi) &&
        Objects.equals(this.name, v1Volume.name) &&
        Objects.equals(this.nfs, v1Volume.nfs) &&
        Objects.equals(this.persistentVolumeClaim, v1Volume.persistentVolumeClaim) &&
        Objects.equals(this.photonPersistentDisk, v1Volume.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, v1Volume.portworxVolume) &&
        Objects.equals(this.projected, v1Volume.projected) &&
        Objects.equals(this.quobyte, v1Volume.quobyte) &&
        Objects.equals(this.rbd, v1Volume.rbd) &&
        Objects.equals(this.scaleIO, v1Volume.scaleIO) &&
        Objects.equals(this.secret, v1Volume.secret) &&
        Objects.equals(this.storageos, v1Volume.storageos) &&
        Objects.equals(this.vsphereVolume, v1Volume.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardAPI, emptyDir, ephemeral, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, name, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Volume {\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    projected: ").append(toIndentedString(projected)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("awsElasticBlockStore");
    openapiFields.add("azureDisk");
    openapiFields.add("azureFile");
    openapiFields.add("cephfs");
    openapiFields.add("cinder");
    openapiFields.add("configMap");
    openapiFields.add("csi");
    openapiFields.add("downwardAPI");
    openapiFields.add("emptyDir");
    openapiFields.add("ephemeral");
    openapiFields.add("fc");
    openapiFields.add("flexVolume");
    openapiFields.add("flocker");
    openapiFields.add("gcePersistentDisk");
    openapiFields.add("gitRepo");
    openapiFields.add("glusterfs");
    openapiFields.add("hostPath");
    openapiFields.add("iscsi");
    openapiFields.add("name");
    openapiFields.add("nfs");
    openapiFields.add("persistentVolumeClaim");
    openapiFields.add("photonPersistentDisk");
    openapiFields.add("portworxVolume");
    openapiFields.add("projected");
    openapiFields.add("quobyte");
    openapiFields.add("rbd");
    openapiFields.add("scaleIO");
    openapiFields.add("secret");
    openapiFields.add("storageos");
    openapiFields.add("vsphereVolume");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1Volume
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1Volume.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Volume is not found in the empty JSON string", V1Volume.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1Volume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Volume` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1Volume.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `awsElasticBlockStore`
      if (jsonObj.get("awsElasticBlockStore") != null && !jsonObj.get("awsElasticBlockStore").isJsonNull()) {
        V1AWSElasticBlockStoreVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("awsElasticBlockStore"));
      }
      // validate the optional field `azureDisk`
      if (jsonObj.get("azureDisk") != null && !jsonObj.get("azureDisk").isJsonNull()) {
        V1AzureDiskVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("azureDisk"));
      }
      // validate the optional field `azureFile`
      if (jsonObj.get("azureFile") != null && !jsonObj.get("azureFile").isJsonNull()) {
        V1AzureFileVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("azureFile"));
      }
      // validate the optional field `cephfs`
      if (jsonObj.get("cephfs") != null && !jsonObj.get("cephfs").isJsonNull()) {
        V1CephFSVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("cephfs"));
      }
      // validate the optional field `cinder`
      if (jsonObj.get("cinder") != null && !jsonObj.get("cinder").isJsonNull()) {
        V1CinderVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("cinder"));
      }
      // validate the optional field `configMap`
      if (jsonObj.get("configMap") != null && !jsonObj.get("configMap").isJsonNull()) {
        V1ConfigMapVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("configMap"));
      }
      // validate the optional field `csi`
      if (jsonObj.get("csi") != null && !jsonObj.get("csi").isJsonNull()) {
        V1CSIVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("csi"));
      }
      // validate the optional field `downwardAPI`
      if (jsonObj.get("downwardAPI") != null && !jsonObj.get("downwardAPI").isJsonNull()) {
        V1DownwardAPIVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("downwardAPI"));
      }
      // validate the optional field `emptyDir`
      if (jsonObj.get("emptyDir") != null && !jsonObj.get("emptyDir").isJsonNull()) {
        V1EmptyDirVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("emptyDir"));
      }
      // validate the optional field `ephemeral`
      if (jsonObj.get("ephemeral") != null && !jsonObj.get("ephemeral").isJsonNull()) {
        V1EphemeralVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("ephemeral"));
      }
      // validate the optional field `fc`
      if (jsonObj.get("fc") != null && !jsonObj.get("fc").isJsonNull()) {
        V1FCVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("fc"));
      }
      // validate the optional field `flexVolume`
      if (jsonObj.get("flexVolume") != null && !jsonObj.get("flexVolume").isJsonNull()) {
        V1FlexVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("flexVolume"));
      }
      // validate the optional field `flocker`
      if (jsonObj.get("flocker") != null && !jsonObj.get("flocker").isJsonNull()) {
        V1FlockerVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("flocker"));
      }
      // validate the optional field `gcePersistentDisk`
      if (jsonObj.get("gcePersistentDisk") != null && !jsonObj.get("gcePersistentDisk").isJsonNull()) {
        V1GCEPersistentDiskVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("gcePersistentDisk"));
      }
      // validate the optional field `gitRepo`
      if (jsonObj.get("gitRepo") != null && !jsonObj.get("gitRepo").isJsonNull()) {
        V1GitRepoVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("gitRepo"));
      }
      // validate the optional field `glusterfs`
      if (jsonObj.get("glusterfs") != null && !jsonObj.get("glusterfs").isJsonNull()) {
        V1GlusterfsVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("glusterfs"));
      }
      // validate the optional field `hostPath`
      if (jsonObj.get("hostPath") != null && !jsonObj.get("hostPath").isJsonNull()) {
        V1HostPathVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("hostPath"));
      }
      // validate the optional field `iscsi`
      if (jsonObj.get("iscsi") != null && !jsonObj.get("iscsi").isJsonNull()) {
        V1ISCSIVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("iscsi"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `nfs`
      if (jsonObj.get("nfs") != null && !jsonObj.get("nfs").isJsonNull()) {
        V1NFSVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("nfs"));
      }
      // validate the optional field `persistentVolumeClaim`
      if (jsonObj.get("persistentVolumeClaim") != null && !jsonObj.get("persistentVolumeClaim").isJsonNull()) {
        V1PersistentVolumeClaimVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("persistentVolumeClaim"));
      }
      // validate the optional field `photonPersistentDisk`
      if (jsonObj.get("photonPersistentDisk") != null && !jsonObj.get("photonPersistentDisk").isJsonNull()) {
        V1PhotonPersistentDiskVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("photonPersistentDisk"));
      }
      // validate the optional field `portworxVolume`
      if (jsonObj.get("portworxVolume") != null && !jsonObj.get("portworxVolume").isJsonNull()) {
        V1PortworxVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("portworxVolume"));
      }
      // validate the optional field `projected`
      if (jsonObj.get("projected") != null && !jsonObj.get("projected").isJsonNull()) {
        V1ProjectedVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("projected"));
      }
      // validate the optional field `quobyte`
      if (jsonObj.get("quobyte") != null && !jsonObj.get("quobyte").isJsonNull()) {
        V1QuobyteVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("quobyte"));
      }
      // validate the optional field `rbd`
      if (jsonObj.get("rbd") != null && !jsonObj.get("rbd").isJsonNull()) {
        V1RBDVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("rbd"));
      }
      // validate the optional field `scaleIO`
      if (jsonObj.get("scaleIO") != null && !jsonObj.get("scaleIO").isJsonNull()) {
        V1ScaleIOVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("scaleIO"));
      }
      // validate the optional field `secret`
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) {
        V1SecretVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("secret"));
      }
      // validate the optional field `storageos`
      if (jsonObj.get("storageos") != null && !jsonObj.get("storageos").isJsonNull()) {
        V1StorageOSVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("storageos"));
      }
      // validate the optional field `vsphereVolume`
      if (jsonObj.get("vsphereVolume") != null && !jsonObj.get("vsphereVolume").isJsonNull()) {
        V1VsphereVirtualDiskVolumeSource.validateJsonObject(jsonObj.getAsJsonObject("vsphereVolume"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1Volume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Volume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Volume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Volume.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Volume>() {
           @Override
           public void write(JsonWriter out, V1Volume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Volume read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1Volume given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1Volume
  * @throws IOException if the JSON string is invalid with respect to V1Volume
  */
  public static V1Volume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Volume.class);
  }

 /**
  * Convert an instance of V1Volume to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
