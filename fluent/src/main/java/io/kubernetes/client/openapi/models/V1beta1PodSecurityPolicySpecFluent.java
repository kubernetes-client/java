package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import java.util.Iterator;

public interface V1beta1PodSecurityPolicySpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Boolean getAllowPrivilegeEscalation();
    public A withAllowPrivilegeEscalation(java.lang.Boolean allowPrivilegeEscalation);
    public java.lang.Boolean hasAllowPrivilegeEscalation();
    public A addToAllowedCSIDrivers(int index,io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item);
    public A setToAllowedCSIDrivers(int index,io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item);
    public A addToAllowedCSIDrivers(io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver... items);
    public A addAllToAllowedCSIDrivers(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver> items);
    public A removeFromAllowedCSIDrivers(io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver... items);
    public A removeAllFromAllowedCSIDrivers(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver> items);
    public A removeMatchingFromAllowedCSIDrivers(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAllowedCSIDrivers instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver> getAllowedCSIDrivers();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver> buildAllowedCSIDrivers();
    public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildAllowedCSIDriver(int index);
    public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildFirstAllowedCSIDriver();
    public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildLastAllowedCSIDriver();
    public io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver buildMatchingAllowedCSIDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder> predicate);
    public java.lang.Boolean hasMatchingAllowedCSIDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder> predicate);
    public A withAllowedCSIDrivers(java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver> allowedCSIDrivers);
    public A withAllowedCSIDrivers(io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver... allowedCSIDrivers);
    public java.lang.Boolean hasAllowedCSIDrivers();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<A> addNewAllowedCSIDriver();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<A> addNewAllowedCSIDriverLike(io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<A> setNewAllowedCSIDriverLike(int index,io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriver item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<A> editAllowedCSIDriver(int index);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<A> editFirstAllowedCSIDriver();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<A> editLastAllowedCSIDriver();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<A> editMatchingAllowedCSIDriver(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverBuilder> predicate);
    public A addToAllowedCapabilities(int index,java.lang.String item);
    public A setToAllowedCapabilities(int index,java.lang.String item);
    public A addToAllowedCapabilities(java.lang.String... items);
    public A addAllToAllowedCapabilities(java.util.Collection<java.lang.String> items);
    public A removeFromAllowedCapabilities(java.lang.String... items);
    public A removeAllFromAllowedCapabilities(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAllowedCapabilities();
    public java.lang.String getAllowedCapability(int index);
    public java.lang.String getFirstAllowedCapability();
    public java.lang.String getLastAllowedCapability();
    public java.lang.String getMatchingAllowedCapability(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAllowedCapability(java.util.function.Predicate<java.lang.String> predicate);
    public A withAllowedCapabilities(java.util.List<java.lang.String> allowedCapabilities);
    public A withAllowedCapabilities(java.lang.String... allowedCapabilities);
    public java.lang.Boolean hasAllowedCapabilities();
    public A addNewAllowedCapability(java.lang.String original);
    public A addToAllowedFlexVolumes(int index,io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item);
    public A setToAllowedFlexVolumes(int index,io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item);
    public A addToAllowedFlexVolumes(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume... items);
    public A addAllToAllowedFlexVolumes(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume> items);
    public A removeFromAllowedFlexVolumes(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume... items);
    public A removeAllFromAllowedFlexVolumes(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume> items);
    public A removeMatchingFromAllowedFlexVolumes(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAllowedFlexVolumes instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume> getAllowedFlexVolumes();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume> buildAllowedFlexVolumes();
    public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume buildAllowedFlexVolume(int index);
    public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume buildFirstAllowedFlexVolume();
    public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume buildLastAllowedFlexVolume();
    public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume buildMatchingAllowedFlexVolume(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder> predicate);
    public java.lang.Boolean hasMatchingAllowedFlexVolume(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder> predicate);
    public A withAllowedFlexVolumes(java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume> allowedFlexVolumes);
    public A withAllowedFlexVolumes(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume... allowedFlexVolumes);
    public java.lang.Boolean hasAllowedFlexVolumes();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolume();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> addNewAllowedFlexVolumeLike(io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> setNewAllowedFlexVolumeLike(int index,io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editAllowedFlexVolume(int index);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editFirstAllowedFlexVolume();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editLastAllowedFlexVolume();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<A> editMatchingAllowedFlexVolume(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder> predicate);
    public A addToAllowedHostPaths(int index,io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item);
    public A setToAllowedHostPaths(int index,io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item);
    public A addToAllowedHostPaths(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath... items);
    public A addAllToAllowedHostPaths(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> items);
    public A removeFromAllowedHostPaths(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath... items);
    public A removeAllFromAllowedHostPaths(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> items);
    public A removeMatchingFromAllowedHostPaths(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildAllowedHostPaths instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> getAllowedHostPaths();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> buildAllowedHostPaths();
    public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildAllowedHostPath(int index);
    public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildFirstAllowedHostPath();
    public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildLastAllowedHostPath();
    public io.kubernetes.client.openapi.models.V1beta1AllowedHostPath buildMatchingAllowedHostPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder> predicate);
    public java.lang.Boolean hasMatchingAllowedHostPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder> predicate);
    public A withAllowedHostPaths(java.util.List<io.kubernetes.client.openapi.models.V1beta1AllowedHostPath> allowedHostPaths);
    public A withAllowedHostPaths(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath... allowedHostPaths);
    public java.lang.Boolean hasAllowedHostPaths();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> addNewAllowedHostPath();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> addNewAllowedHostPathLike(io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> setNewAllowedHostPathLike(int index,io.kubernetes.client.openapi.models.V1beta1AllowedHostPath item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editAllowedHostPath(int index);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editFirstAllowedHostPath();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editLastAllowedHostPath();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<A> editMatchingAllowedHostPath(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1AllowedHostPathBuilder> predicate);
    public A addToAllowedProcMountTypes(int index,java.lang.String item);
    public A setToAllowedProcMountTypes(int index,java.lang.String item);
    public A addToAllowedProcMountTypes(java.lang.String... items);
    public A addAllToAllowedProcMountTypes(java.util.Collection<java.lang.String> items);
    public A removeFromAllowedProcMountTypes(java.lang.String... items);
    public A removeAllFromAllowedProcMountTypes(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAllowedProcMountTypes();
    public java.lang.String getAllowedProcMountType(int index);
    public java.lang.String getFirstAllowedProcMountType();
    public java.lang.String getLastAllowedProcMountType();
    public java.lang.String getMatchingAllowedProcMountType(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAllowedProcMountType(java.util.function.Predicate<java.lang.String> predicate);
    public A withAllowedProcMountTypes(java.util.List<java.lang.String> allowedProcMountTypes);
    public A withAllowedProcMountTypes(java.lang.String... allowedProcMountTypes);
    public java.lang.Boolean hasAllowedProcMountTypes();
    public A addNewAllowedProcMountType(java.lang.String original);
    public A addToAllowedUnsafeSysctls(int index,java.lang.String item);
    public A setToAllowedUnsafeSysctls(int index,java.lang.String item);
    public A addToAllowedUnsafeSysctls(java.lang.String... items);
    public A addAllToAllowedUnsafeSysctls(java.util.Collection<java.lang.String> items);
    public A removeFromAllowedUnsafeSysctls(java.lang.String... items);
    public A removeAllFromAllowedUnsafeSysctls(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getAllowedUnsafeSysctls();
    public java.lang.String getAllowedUnsafeSysctl(int index);
    public java.lang.String getFirstAllowedUnsafeSysctl();
    public java.lang.String getLastAllowedUnsafeSysctl();
    public java.lang.String getMatchingAllowedUnsafeSysctl(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingAllowedUnsafeSysctl(java.util.function.Predicate<java.lang.String> predicate);
    public A withAllowedUnsafeSysctls(java.util.List<java.lang.String> allowedUnsafeSysctls);
    public A withAllowedUnsafeSysctls(java.lang.String... allowedUnsafeSysctls);
    public java.lang.Boolean hasAllowedUnsafeSysctls();
    public A addNewAllowedUnsafeSysctl(java.lang.String original);
    public A addToDefaultAddCapabilities(int index,java.lang.String item);
    public A setToDefaultAddCapabilities(int index,java.lang.String item);
    public A addToDefaultAddCapabilities(java.lang.String... items);
    public A addAllToDefaultAddCapabilities(java.util.Collection<java.lang.String> items);
    public A removeFromDefaultAddCapabilities(java.lang.String... items);
    public A removeAllFromDefaultAddCapabilities(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getDefaultAddCapabilities();
    public java.lang.String getDefaultAddCapability(int index);
    public java.lang.String getFirstDefaultAddCapability();
    public java.lang.String getLastDefaultAddCapability();
    public java.lang.String getMatchingDefaultAddCapability(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingDefaultAddCapability(java.util.function.Predicate<java.lang.String> predicate);
    public A withDefaultAddCapabilities(java.util.List<java.lang.String> defaultAddCapabilities);
    public A withDefaultAddCapabilities(java.lang.String... defaultAddCapabilities);
    public java.lang.Boolean hasDefaultAddCapabilities();
    public A addNewDefaultAddCapability(java.lang.String original);
    public java.lang.Boolean getDefaultAllowPrivilegeEscalation();
    public A withDefaultAllowPrivilegeEscalation(java.lang.Boolean defaultAllowPrivilegeEscalation);
    public java.lang.Boolean hasDefaultAllowPrivilegeEscalation();
    public A addToForbiddenSysctls(int index,java.lang.String item);
    public A setToForbiddenSysctls(int index,java.lang.String item);
    public A addToForbiddenSysctls(java.lang.String... items);
    public A addAllToForbiddenSysctls(java.util.Collection<java.lang.String> items);
    public A removeFromForbiddenSysctls(java.lang.String... items);
    public A removeAllFromForbiddenSysctls(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getForbiddenSysctls();
    public java.lang.String getForbiddenSysctl(int index);
    public java.lang.String getFirstForbiddenSysctl();
    public java.lang.String getLastForbiddenSysctl();
    public java.lang.String getMatchingForbiddenSysctl(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingForbiddenSysctl(java.util.function.Predicate<java.lang.String> predicate);
    public A withForbiddenSysctls(java.util.List<java.lang.String> forbiddenSysctls);
    public A withForbiddenSysctls(java.lang.String... forbiddenSysctls);
    public java.lang.Boolean hasForbiddenSysctls();
    public A addNewForbiddenSysctl(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildFsGroup instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions getFsGroup();
    public io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions buildFsGroup();
    public A withFsGroup(io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions fsGroup);
    public java.lang.Boolean hasFsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A> withNewFsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A> withNewFsGroupLike(io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A> editFsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A> editOrNewFsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<A> editOrNewFsGroupLike(io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptions item);
    public java.lang.Boolean getHostIPC();
    public A withHostIPC(java.lang.Boolean hostIPC);
    public java.lang.Boolean hasHostIPC();
    public java.lang.Boolean getHostNetwork();
    public A withHostNetwork(java.lang.Boolean hostNetwork);
    public java.lang.Boolean hasHostNetwork();
    public java.lang.Boolean getHostPID();
    public A withHostPID(java.lang.Boolean hostPID);
    public java.lang.Boolean hasHostPID();
    public A addToHostPorts(int index,io.kubernetes.client.openapi.models.V1beta1HostPortRange item);
    public A setToHostPorts(int index,io.kubernetes.client.openapi.models.V1beta1HostPortRange item);
    public A addToHostPorts(io.kubernetes.client.openapi.models.V1beta1HostPortRange... items);
    public A addAllToHostPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1HostPortRange> items);
    public A removeFromHostPorts(io.kubernetes.client.openapi.models.V1beta1HostPortRange... items);
    public A removeAllFromHostPorts(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1HostPortRange> items);
    public A removeMatchingFromHostPorts(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildHostPorts instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1HostPortRange> getHostPorts();
    public java.util.List<io.kubernetes.client.openapi.models.V1beta1HostPortRange> buildHostPorts();
    public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildHostPort(int index);
    public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildFirstHostPort();
    public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildLastHostPort();
    public io.kubernetes.client.openapi.models.V1beta1HostPortRange buildMatchingHostPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder> predicate);
    public java.lang.Boolean hasMatchingHostPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder> predicate);
    public A withHostPorts(java.util.List<io.kubernetes.client.openapi.models.V1beta1HostPortRange> hostPorts);
    public A withHostPorts(io.kubernetes.client.openapi.models.V1beta1HostPortRange... hostPorts);
    public java.lang.Boolean hasHostPorts();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A> addNewHostPort();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A> addNewHostPortLike(io.kubernetes.client.openapi.models.V1beta1HostPortRange item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A> setNewHostPortLike(int index,io.kubernetes.client.openapi.models.V1beta1HostPortRange item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A> editHostPort(int index);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A> editFirstHostPort();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A> editLastHostPort();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<A> editMatchingHostPort(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1HostPortRangeBuilder> predicate);
    public java.lang.Boolean getPrivileged();
    public A withPrivileged(java.lang.Boolean privileged);
    public java.lang.Boolean hasPrivileged();
    public java.lang.Boolean getReadOnlyRootFilesystem();
    public A withReadOnlyRootFilesystem(java.lang.Boolean readOnlyRootFilesystem);
    public java.lang.Boolean hasReadOnlyRootFilesystem();
    public A addToRequiredDropCapabilities(int index,java.lang.String item);
    public A setToRequiredDropCapabilities(int index,java.lang.String item);
    public A addToRequiredDropCapabilities(java.lang.String... items);
    public A addAllToRequiredDropCapabilities(java.util.Collection<java.lang.String> items);
    public A removeFromRequiredDropCapabilities(java.lang.String... items);
    public A removeAllFromRequiredDropCapabilities(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getRequiredDropCapabilities();
    public java.lang.String getRequiredDropCapability(int index);
    public java.lang.String getFirstRequiredDropCapability();
    public java.lang.String getLastRequiredDropCapability();
    public java.lang.String getMatchingRequiredDropCapability(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingRequiredDropCapability(java.util.function.Predicate<java.lang.String> predicate);
    public A withRequiredDropCapabilities(java.util.List<java.lang.String> requiredDropCapabilities);
    public A withRequiredDropCapabilities(java.lang.String... requiredDropCapabilities);
    public java.lang.Boolean hasRequiredDropCapabilities();
    public A addNewRequiredDropCapability(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRunAsGroup instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions getRunAsGroup();
    public io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions buildRunAsGroup();
    public A withRunAsGroup(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions runAsGroup);
    public java.lang.Boolean hasRunAsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A> withNewRunAsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A> withNewRunAsGroupLike(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A> editRunAsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A> editOrNewRunAsGroup();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<A> editOrNewRunAsGroupLike(io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptions item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRunAsUser instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions getRunAsUser();
    public io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions buildRunAsUser();
    public A withRunAsUser(io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions runAsUser);
    public java.lang.Boolean hasRunAsUser();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A> withNewRunAsUser();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A> withNewRunAsUserLike(io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A> editRunAsUser();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A> editOrNewRunAsUser();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<A> editOrNewRunAsUserLike(io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptions item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRuntimeClass instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions getRuntimeClass();
    public io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions buildRuntimeClass();
    public A withRuntimeClass(io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions runtimeClass);
    public java.lang.Boolean hasRuntimeClass();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<A> withNewRuntimeClass();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<A> withNewRuntimeClassLike(io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<A> editRuntimeClass();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<A> editOrNewRuntimeClass();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<A> editOrNewRuntimeClassLike(io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptions item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSeLinux instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions getSeLinux();
    public io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions buildSeLinux();
    public A withSeLinux(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions seLinux);
    public java.lang.Boolean hasSeLinux();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A> withNewSeLinux();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A> withNewSeLinuxLike(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A> editSeLinux();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A> editOrNewSeLinux();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<A> editOrNewSeLinuxLike(io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptions item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSupplementalGroups instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions getSupplementalGroups();
    public io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions buildSupplementalGroups();
    public A withSupplementalGroups(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions supplementalGroups);
    public java.lang.Boolean hasSupplementalGroups();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> withNewSupplementalGroups();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> withNewSupplementalGroupsLike(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions item);
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editSupplementalGroups();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroups();
    public io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SupplementalGroupsNested<A> editOrNewSupplementalGroupsLike(io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptions item);
    public A addToVolumes(int index,java.lang.String item);
    public A setToVolumes(int index,java.lang.String item);
    public A addToVolumes(java.lang.String... items);
    public A addAllToVolumes(java.util.Collection<java.lang.String> items);
    public A removeFromVolumes(java.lang.String... items);
    public A removeAllFromVolumes(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getVolumes();
    public java.lang.String getVolume(int index);
    public java.lang.String getFirstVolume();
    public java.lang.String getLastVolume();
    public java.lang.String getMatchingVolume(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingVolume(java.util.function.Predicate<java.lang.String> predicate);
    public A withVolumes(java.util.List<java.lang.String> volumes);
    public A withVolumes(java.lang.String... volumes);
    public java.lang.Boolean hasVolumes();
    public A addNewVolume(java.lang.String original);
    public interface AllowedCSIDriversNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1AllowedCSIDriverFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedCSIDriversNested<N>> {

            public N and();
            public N endAllowedCSIDriver();    }


    public interface AllowedFlexVolumesNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedFlexVolumesNested<N>> {

            public N and();
            public N endAllowedFlexVolume();    }


    public interface AllowedHostPathsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.AllowedHostPathsNested<N>> {

            public N and();
            public N endAllowedHostPath();    }


    public interface FsGroupNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1FSGroupStrategyOptionsFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.FsGroupNested<N>> {

            public N and();
            public N endFsGroup();    }


    public interface HostPortsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1HostPortRangeFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.HostPortsNested<N>> {

            public N and();
            public N endHostPort();    }


    public interface RunAsGroupNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1RunAsGroupStrategyOptionsFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsGroupNested<N>> {

            public N and();
            public N endRunAsGroup();    }


    public interface RunAsUserNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1RunAsUserStrategyOptionsFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RunAsUserNested<N>> {

            public N and();
            public N endRunAsUser();    }


    public interface RuntimeClassNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1RuntimeClassStrategyOptionsFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.RuntimeClassNested<N>> {

            public N and();
            public N endRuntimeClass();    }


    public interface SeLinuxNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1SELinuxStrategyOptionsFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SeLinuxNested<N>> {

            public N and();
            public N endSeLinux();    }


    public interface SupplementalGroupsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1beta1SupplementalGroupsStrategyOptionsFluent<io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicySpecFluent.SupplementalGroupsNested<N>> {

            public N and();
            public N endSupplementalGroups();    }


}
