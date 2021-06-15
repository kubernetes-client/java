package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1ISCSIPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Boolean getChapAuthDiscovery();
    public A withChapAuthDiscovery(java.lang.Boolean chapAuthDiscovery);
    public java.lang.Boolean hasChapAuthDiscovery();
    public java.lang.Boolean getChapAuthSession();
    public A withChapAuthSession(java.lang.Boolean chapAuthSession);
    public java.lang.Boolean hasChapAuthSession();
    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.String getInitiatorName();
    public A withInitiatorName(java.lang.String initiatorName);
    public java.lang.Boolean hasInitiatorName();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withInitiatorName instead.
     */
        public A withNewInitiatorName(java.lang.String original);
    public java.lang.String getIqn();
    public A withIqn(java.lang.String iqn);
    public java.lang.Boolean hasIqn();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIqn instead.
     */
        public A withNewIqn(java.lang.String original);
    public java.lang.String getIscsiInterface();
    public A withIscsiInterface(java.lang.String iscsiInterface);
    public java.lang.Boolean hasIscsiInterface();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withIscsiInterface instead.
     */
        public A withNewIscsiInterface(java.lang.String original);
    public java.lang.Integer getLun();
    public A withLun(java.lang.Integer lun);
    public java.lang.Boolean hasLun();
    public A addToPortals(int index,java.lang.String item);
    public A setToPortals(int index,java.lang.String item);
    public A addToPortals(java.lang.String... items);
    public A addAllToPortals(java.util.Collection<java.lang.String> items);
    public A removeFromPortals(java.lang.String... items);
    public A removeAllFromPortals(java.util.Collection<java.lang.String> items);
    public java.util.List<java.lang.String> getPortals();
    public java.lang.String getPortal(int index);
    public java.lang.String getFirstPortal();
    public java.lang.String getLastPortal();
    public java.lang.String getMatchingPortal(java.util.function.Predicate<java.lang.String> predicate);
    public java.lang.Boolean hasMatchingPortal(java.util.function.Predicate<java.lang.String> predicate);
    public A withPortals(java.util.List<java.lang.String> portals);
    public A withPortals(java.lang.String... portals);
    public java.lang.Boolean hasPortals();
    public A addNewPortal(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSecretRef instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1SecretReference getSecretRef();
    public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef();
    public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef);
    public java.lang.Boolean hasSecretRef();
    public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
    public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
    public java.lang.String getTargetPortal();
    public A withTargetPortal(java.lang.String targetPortal);
    public java.lang.Boolean hasTargetPortal();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withTargetPortal instead.
     */
        public A withNewTargetPortal(java.lang.String original);
    public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1SecretReferenceFluent<io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent.SecretRefNested<N>> {

            public N and();
            public N endSecretRef();    }


}
