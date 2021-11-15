/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.proto;

public final class V1Storage {
  private V1Storage() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface CSIDriverOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.CSIDriver)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * metadata.Name indicates the name of the CSI driver that this object
     * refers to; it MUST be the same name returned by the CSI GetPluginName()
     * call for that driver.
     * The driver name must be 63 characters or less, beginning and ending with
     * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
     * alphanumerics between.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * metadata.Name indicates the name of the CSI driver that this object
     * refers to; it MUST be the same name returned by the CSI GetPluginName()
     * call for that driver.
     * The driver name must be 63 characters or less, beginning and ending with
     * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
     * alphanumerics between.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * metadata.Name indicates the name of the CSI driver that this object
     * refers to; it MUST be the same name returned by the CSI GetPluginName()
     * call for that driver.
     * The driver name must be 63 characters or less, beginning and ending with
     * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
     * alphanumerics between.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Specification of the CSI Driver.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the CSI Driver.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSIDriverSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the CSI Driver.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSIDriverSpecOrBuilder getSpecOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * CSIDriver captures information about a Container Storage Interface (CSI)
   * volume driver deployed on the cluster.
   * Kubernetes attach detach controller uses this object to determine whether attach is required.
   * Kubelet uses this object to determine whether pod information needs to be passed on mount.
   * CSIDriver objects are non-namespaced.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.CSIDriver}
   */
  public static final class CSIDriver extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.CSIDriver)
      CSIDriverOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CSIDriver.newBuilder() to construct.
    private CSIDriver(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CSIDriver() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CSIDriver(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.CSIDriverSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSIDriver_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSIDriver_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.CSIDriver.class,
              io.kubernetes.client.proto.V1Storage.CSIDriver.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * metadata.Name indicates the name of the CSI driver that this object
     * refers to; it MUST be the same name returned by the CSI GetPluginName()
     * call for that driver.
     * The driver name must be 63 characters or less, beginning and ending with
     * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
     * alphanumerics between.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * metadata.Name indicates the name of the CSI driver that this object
     * refers to; it MUST be the same name returned by the CSI GetPluginName()
     * call for that driver.
     * The driver name must be 63 characters or less, beginning and ending with
     * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
     * alphanumerics between.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * metadata.Name indicates the name of the CSI driver that this object
     * refers to; it MUST be the same name returned by the CSI GetPluginName()
     * call for that driver.
     * The driver name must be 63 characters or less, beginning and ending with
     * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
     * alphanumerics between.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Storage.CSIDriverSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the CSI Driver.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the CSI Driver.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSIDriverSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.CSIDriverSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the CSI Driver.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSIDriverSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.CSIDriverSpec.getDefaultInstance()
          : spec_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.CSIDriver)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.CSIDriver other =
          (io.kubernetes.client.proto.V1Storage.CSIDriver) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.CSIDriver prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CSIDriver captures information about a Container Storage Interface (CSI)
     * volume driver deployed on the cluster.
     * Kubernetes attach detach controller uses this object to determine whether attach is required.
     * Kubelet uses this object to determine whether pod information needs to be passed on mount.
     * CSIDriver objects are non-namespaced.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.CSIDriver}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.CSIDriver)
        io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriver_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriver_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.CSIDriver.class,
                io.kubernetes.client.proto.V1Storage.CSIDriver.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.CSIDriver.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriver_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriver getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.CSIDriver.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriver build() {
        io.kubernetes.client.proto.V1Storage.CSIDriver result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriver buildPartial() {
        io.kubernetes.client.proto.V1Storage.CSIDriver result =
            new io.kubernetes.client.proto.V1Storage.CSIDriver(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.CSIDriver) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.CSIDriver) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.CSIDriver other) {
        if (other == io.kubernetes.client.proto.V1Storage.CSIDriver.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.CSIDriver parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Storage.CSIDriver) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * metadata.Name indicates the name of the CSI driver that this object
       * refers to; it MUST be the same name returned by the CSI GetPluginName()
       * call for that driver.
       * The driver name must be 63 characters or less, beginning and ending with
       * an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and
       * alphanumerics between.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1Storage.CSIDriverSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSIDriverSpec,
              io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder,
              io.kubernetes.client.proto.V1Storage.CSIDriverSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriverSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.CSIDriverSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Storage.CSIDriverSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Storage.CSIDriverSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_ != io.kubernetes.client.proto.V1Storage.CSIDriverSpec.getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Storage.CSIDriverSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriverSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.CSIDriverSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the CSI Driver.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSIDriverSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSIDriverSpec,
              io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder,
              io.kubernetes.client.proto.V1Storage.CSIDriverSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.CSIDriverSpec,
                  io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder,
                  io.kubernetes.client.proto.V1Storage.CSIDriverSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.CSIDriver)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.CSIDriver)
    private static final io.kubernetes.client.proto.V1Storage.CSIDriver DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.CSIDriver();
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriver getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CSIDriver> PARSER =
        new com.google.protobuf.AbstractParser<CSIDriver>() {
          @java.lang.Override
          public CSIDriver parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CSIDriver(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CSIDriver> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSIDriver> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.CSIDriver getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CSIDriverListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.CSIDriverList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.CSIDriver> getItemsList();
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSIDriver getItems(int index);
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * CSIDriverList is a collection of CSIDriver objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.CSIDriverList}
   */
  public static final class CSIDriverList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.CSIDriverList)
      CSIDriverListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CSIDriverList.newBuilder() to construct.
    private CSIDriverList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CSIDriverList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CSIDriverList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.CSIDriver>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.CSIDriver.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSIDriverList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSIDriverList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.CSIDriverList.class,
              io.kubernetes.client.proto.V1Storage.CSIDriverList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Storage.CSIDriver> items_;
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.CSIDriver> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSIDriver getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSIDriver
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.CSIDriverList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.CSIDriverList other =
          (io.kubernetes.client.proto.V1Storage.CSIDriverList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.CSIDriverList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CSIDriverList is a collection of CSIDriver objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.CSIDriverList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.CSIDriverList)
        io.kubernetes.client.proto.V1Storage.CSIDriverListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriverList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriverList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.CSIDriverList.class,
                io.kubernetes.client.proto.V1Storage.CSIDriverList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.CSIDriverList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriverList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriverList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.CSIDriverList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriverList build() {
        io.kubernetes.client.proto.V1Storage.CSIDriverList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriverList buildPartial() {
        io.kubernetes.client.proto.V1Storage.CSIDriverList result =
            new io.kubernetes.client.proto.V1Storage.CSIDriverList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.CSIDriverList) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.CSIDriverList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.CSIDriverList other) {
        if (other == io.kubernetes.client.proto.V1Storage.CSIDriverList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.CSIDriverList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.CSIDriverList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Storage.CSIDriver> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.CSIDriver>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSIDriver,
              io.kubernetes.client.proto.V1Storage.CSIDriver.Builder,
              io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.CSIDriver> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriver getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Storage.CSIDriver value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Storage.CSIDriver.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Storage.CSIDriver value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Storage.CSIDriver value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Storage.CSIDriver.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Storage.CSIDriver.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.CSIDriver> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriver.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriver.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.CSIDriver.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSIDriver.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Storage.CSIDriver.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSIDriver
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSIDriver items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.CSIDriver.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSIDriver,
              io.kubernetes.client.proto.V1Storage.CSIDriver.Builder,
              io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.CSIDriver,
                  io.kubernetes.client.proto.V1Storage.CSIDriver.Builder,
                  io.kubernetes.client.proto.V1Storage.CSIDriverOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.CSIDriverList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.CSIDriverList)
    private static final io.kubernetes.client.proto.V1Storage.CSIDriverList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.CSIDriverList();
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CSIDriverList> PARSER =
        new com.google.protobuf.AbstractParser<CSIDriverList>() {
          @java.lang.Override
          public CSIDriverList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CSIDriverList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CSIDriverList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSIDriverList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.CSIDriverList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CSIDriverSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.CSIDriverSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * attachRequired indicates this CSI volume driver requires an attach
     * operation (because it implements the CSI ControllerPublishVolume()
     * method), and that the Kubernetes attach detach controller should call
     * the attach volume interface which checks the volumeattachment status
     * and waits until the volume is attached before proceeding to mounting.
     * The CSI external-attacher coordinates with CSI volume driver and updates
     * the volumeattachment status when the attach operation is complete.
     * If the CSIDriverRegistry feature gate is enabled and the value is
     * specified to false, the attach operation will be skipped.
     * Otherwise the attach operation will be called.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool attachRequired = 1;</code>
     */
    boolean hasAttachRequired();
    /**
     *
     *
     * <pre>
     * attachRequired indicates this CSI volume driver requires an attach
     * operation (because it implements the CSI ControllerPublishVolume()
     * method), and that the Kubernetes attach detach controller should call
     * the attach volume interface which checks the volumeattachment status
     * and waits until the volume is attached before proceeding to mounting.
     * The CSI external-attacher coordinates with CSI volume driver and updates
     * the volumeattachment status when the attach operation is complete.
     * If the CSIDriverRegistry feature gate is enabled and the value is
     * specified to false, the attach operation will be skipped.
     * Otherwise the attach operation will be called.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool attachRequired = 1;</code>
     */
    boolean getAttachRequired();

    /**
     *
     *
     * <pre>
     * If set to true, podInfoOnMount indicates this CSI volume driver
     * requires additional pod information (like podName, podUID, etc.) during
     * mount operations.
     * If set to false, pod information will not be passed on mount.
     * Default is false.
     * The CSI driver specifies podInfoOnMount as part of driver deployment.
     * If true, Kubelet will pass pod information as VolumeContext in the CSI
     * NodePublishVolume() calls.
     * The CSI driver is responsible for parsing and validating the information
     * passed in as VolumeContext.
     * The following VolumeConext will be passed if podInfoOnMount is set to true.
     * This list might grow, but the prefix will be used.
     * "csi.storage.k8s.io/pod.name": pod.Name
     * "csi.storage.k8s.io/pod.namespace": pod.Namespace
     * "csi.storage.k8s.io/pod.uid": string(pod.UID)
     * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise "false"
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
     * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
     * Other drivers can leave pod info disabled and/or ignore this field.
     * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
     * deployed on such a cluster and the deployment determines which mode that is, for example
     * via a command line parameter of the driver.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool podInfoOnMount = 2;</code>
     */
    boolean hasPodInfoOnMount();
    /**
     *
     *
     * <pre>
     * If set to true, podInfoOnMount indicates this CSI volume driver
     * requires additional pod information (like podName, podUID, etc.) during
     * mount operations.
     * If set to false, pod information will not be passed on mount.
     * Default is false.
     * The CSI driver specifies podInfoOnMount as part of driver deployment.
     * If true, Kubelet will pass pod information as VolumeContext in the CSI
     * NodePublishVolume() calls.
     * The CSI driver is responsible for parsing and validating the information
     * passed in as VolumeContext.
     * The following VolumeConext will be passed if podInfoOnMount is set to true.
     * This list might grow, but the prefix will be used.
     * "csi.storage.k8s.io/pod.name": pod.Name
     * "csi.storage.k8s.io/pod.namespace": pod.Namespace
     * "csi.storage.k8s.io/pod.uid": string(pod.UID)
     * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise "false"
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
     * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
     * Other drivers can leave pod info disabled and/or ignore this field.
     * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
     * deployed on such a cluster and the deployment determines which mode that is, for example
     * via a command line parameter of the driver.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool podInfoOnMount = 2;</code>
     */
    boolean getPodInfoOnMount();

    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    java.util.List<java.lang.String> getVolumeLifecycleModesList();
    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    int getVolumeLifecycleModesCount();
    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    java.lang.String getVolumeLifecycleModes(int index);
    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    com.google.protobuf.ByteString getVolumeLifecycleModesBytes(int index);

    /**
     *
     *
     * <pre>
     * If set to true, storageCapacity indicates that the CSI
     * volume driver wants pod scheduling to consider the storage
     * capacity that the driver deployment will report by creating
     * CSIStorageCapacity objects with capacity information.
     * The check can be enabled immediately when deploying a driver.
     * In that case, provisioning new volumes with late binding
     * will pause until the driver deployment has published
     * some suitable CSIStorageCapacity object.
     * Alternatively, the driver can be deployed with the field
     * unset or false and it can be flipped later when storage
     * capacity information has been published.
     * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
     * This is a beta field and only available when the CSIStorageCapacity
     * feature is enabled. The default is false.
     * +optional
     * +featureGate=CSIStorageCapacity
     * </pre>
     *
     * <code>optional bool storageCapacity = 4;</code>
     */
    boolean hasStorageCapacity();
    /**
     *
     *
     * <pre>
     * If set to true, storageCapacity indicates that the CSI
     * volume driver wants pod scheduling to consider the storage
     * capacity that the driver deployment will report by creating
     * CSIStorageCapacity objects with capacity information.
     * The check can be enabled immediately when deploying a driver.
     * In that case, provisioning new volumes with late binding
     * will pause until the driver deployment has published
     * some suitable CSIStorageCapacity object.
     * Alternatively, the driver can be deployed with the field
     * unset or false and it can be flipped later when storage
     * capacity information has been published.
     * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
     * This is a beta field and only available when the CSIStorageCapacity
     * feature is enabled. The default is false.
     * +optional
     * +featureGate=CSIStorageCapacity
     * </pre>
     *
     * <code>optional bool storageCapacity = 4;</code>
     */
    boolean getStorageCapacity();

    /**
     *
     *
     * <pre>
     * Defines if the underlying volume supports changing ownership and
     * permission of the volume before being mounted.
     * Refer to the specific FSGroupPolicy values for additional details.
     * This field is immutable.
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume
     * to determine if Kubernetes should modify ownership and permissions of the volume.
     * With the default policy the defined fsGroup will only be applied
     * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     * +optional
     * </pre>
     *
     * <code>optional string fsGroupPolicy = 5;</code>
     */
    boolean hasFsGroupPolicy();
    /**
     *
     *
     * <pre>
     * Defines if the underlying volume supports changing ownership and
     * permission of the volume before being mounted.
     * Refer to the specific FSGroupPolicy values for additional details.
     * This field is immutable.
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume
     * to determine if Kubernetes should modify ownership and permissions of the volume.
     * With the default policy the defined fsGroup will only be applied
     * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     * +optional
     * </pre>
     *
     * <code>optional string fsGroupPolicy = 5;</code>
     */
    java.lang.String getFsGroupPolicy();
    /**
     *
     *
     * <pre>
     * Defines if the underlying volume supports changing ownership and
     * permission of the volume before being mounted.
     * Refer to the specific FSGroupPolicy values for additional details.
     * This field is immutable.
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume
     * to determine if Kubernetes should modify ownership and permissions of the volume.
     * With the default policy the defined fsGroup will only be applied
     * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     * +optional
     * </pre>
     *
     * <code>optional string fsGroupPolicy = 5;</code>
     */
    com.google.protobuf.ByteString getFsGroupPolicyBytes();

    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.TokenRequest> getTokenRequestsList();
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    io.kubernetes.client.proto.V1Storage.TokenRequest getTokenRequests(int index);
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    int getTokenRequestsCount();
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder>
        getTokenRequestsOrBuilderList();
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder getTokenRequestsOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
     * being periodically called to reflect any possible change in the mounted
     * volume. This field defaults to false.
     * Note: After a successful initial NodePublishVolume call, subsequent calls
     * to NodePublishVolume should only update the contents of the volume. New
     * mount points will not be seen by a running container.
     * +optional
     * </pre>
     *
     * <code>optional bool requiresRepublish = 7;</code>
     */
    boolean hasRequiresRepublish();
    /**
     *
     *
     * <pre>
     * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
     * being periodically called to reflect any possible change in the mounted
     * volume. This field defaults to false.
     * Note: After a successful initial NodePublishVolume call, subsequent calls
     * to NodePublishVolume should only update the contents of the volume. New
     * mount points will not be seen by a running container.
     * +optional
     * </pre>
     *
     * <code>optional bool requiresRepublish = 7;</code>
     */
    boolean getRequiresRepublish();
  }
  /**
   *
   *
   * <pre>
   * CSIDriverSpec is the specification of a CSIDriver.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.CSIDriverSpec}
   */
  public static final class CSIDriverSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.CSIDriverSpec)
      CSIDriverSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CSIDriverSpec.newBuilder() to construct.
    private CSIDriverSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CSIDriverSpec() {
      attachRequired_ = false;
      podInfoOnMount_ = false;
      volumeLifecycleModes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      storageCapacity_ = false;
      fsGroupPolicy_ = "";
      tokenRequests_ = java.util.Collections.emptyList();
      requiresRepublish_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CSIDriverSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                bitField0_ |= 0x00000001;
                attachRequired_ = input.readBool();
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                podInfoOnMount_ = input.readBool();
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  volumeLifecycleModes_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                volumeLifecycleModes_.add(bs);
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000004;
                storageCapacity_ = input.readBool();
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                fsGroupPolicy_ = bs;
                break;
              }
            case 50:
              {
                if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                  tokenRequests_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.TokenRequest>();
                  mutable_bitField0_ |= 0x00000020;
                }
                tokenRequests_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.TokenRequest.PARSER,
                        extensionRegistry));
                break;
              }
            case 56:
              {
                bitField0_ |= 0x00000010;
                requiresRepublish_ = input.readBool();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          volumeLifecycleModes_ = volumeLifecycleModes_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          tokenRequests_ = java.util.Collections.unmodifiableList(tokenRequests_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSIDriverSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSIDriverSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.CSIDriverSpec.class,
              io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder.class);
    }

    private int bitField0_;
    public static final int ATTACHREQUIRED_FIELD_NUMBER = 1;
    private boolean attachRequired_;
    /**
     *
     *
     * <pre>
     * attachRequired indicates this CSI volume driver requires an attach
     * operation (because it implements the CSI ControllerPublishVolume()
     * method), and that the Kubernetes attach detach controller should call
     * the attach volume interface which checks the volumeattachment status
     * and waits until the volume is attached before proceeding to mounting.
     * The CSI external-attacher coordinates with CSI volume driver and updates
     * the volumeattachment status when the attach operation is complete.
     * If the CSIDriverRegistry feature gate is enabled and the value is
     * specified to false, the attach operation will be skipped.
     * Otherwise the attach operation will be called.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool attachRequired = 1;</code>
     */
    public boolean hasAttachRequired() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * attachRequired indicates this CSI volume driver requires an attach
     * operation (because it implements the CSI ControllerPublishVolume()
     * method), and that the Kubernetes attach detach controller should call
     * the attach volume interface which checks the volumeattachment status
     * and waits until the volume is attached before proceeding to mounting.
     * The CSI external-attacher coordinates with CSI volume driver and updates
     * the volumeattachment status when the attach operation is complete.
     * If the CSIDriverRegistry feature gate is enabled and the value is
     * specified to false, the attach operation will be skipped.
     * Otherwise the attach operation will be called.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool attachRequired = 1;</code>
     */
    public boolean getAttachRequired() {
      return attachRequired_;
    }

    public static final int PODINFOONMOUNT_FIELD_NUMBER = 2;
    private boolean podInfoOnMount_;
    /**
     *
     *
     * <pre>
     * If set to true, podInfoOnMount indicates this CSI volume driver
     * requires additional pod information (like podName, podUID, etc.) during
     * mount operations.
     * If set to false, pod information will not be passed on mount.
     * Default is false.
     * The CSI driver specifies podInfoOnMount as part of driver deployment.
     * If true, Kubelet will pass pod information as VolumeContext in the CSI
     * NodePublishVolume() calls.
     * The CSI driver is responsible for parsing and validating the information
     * passed in as VolumeContext.
     * The following VolumeConext will be passed if podInfoOnMount is set to true.
     * This list might grow, but the prefix will be used.
     * "csi.storage.k8s.io/pod.name": pod.Name
     * "csi.storage.k8s.io/pod.namespace": pod.Namespace
     * "csi.storage.k8s.io/pod.uid": string(pod.UID)
     * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise "false"
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
     * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
     * Other drivers can leave pod info disabled and/or ignore this field.
     * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
     * deployed on such a cluster and the deployment determines which mode that is, for example
     * via a command line parameter of the driver.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool podInfoOnMount = 2;</code>
     */
    public boolean hasPodInfoOnMount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * If set to true, podInfoOnMount indicates this CSI volume driver
     * requires additional pod information (like podName, podUID, etc.) during
     * mount operations.
     * If set to false, pod information will not be passed on mount.
     * Default is false.
     * The CSI driver specifies podInfoOnMount as part of driver deployment.
     * If true, Kubelet will pass pod information as VolumeContext in the CSI
     * NodePublishVolume() calls.
     * The CSI driver is responsible for parsing and validating the information
     * passed in as VolumeContext.
     * The following VolumeConext will be passed if podInfoOnMount is set to true.
     * This list might grow, but the prefix will be used.
     * "csi.storage.k8s.io/pod.name": pod.Name
     * "csi.storage.k8s.io/pod.namespace": pod.Namespace
     * "csi.storage.k8s.io/pod.uid": string(pod.UID)
     * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise "false"
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
     * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
     * Other drivers can leave pod info disabled and/or ignore this field.
     * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
     * deployed on such a cluster and the deployment determines which mode that is, for example
     * via a command line parameter of the driver.
     * This field is immutable.
     * +optional
     * </pre>
     *
     * <code>optional bool podInfoOnMount = 2;</code>
     */
    public boolean getPodInfoOnMount() {
      return podInfoOnMount_;
    }

    public static final int VOLUMELIFECYCLEMODES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList volumeLifecycleModes_;
    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getVolumeLifecycleModesList() {
      return volumeLifecycleModes_;
    }
    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    public int getVolumeLifecycleModesCount() {
      return volumeLifecycleModes_.size();
    }
    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    public java.lang.String getVolumeLifecycleModes(int index) {
      return volumeLifecycleModes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
     * The default if the list is empty is "Persistent", which is the usage
     * defined by the CSI specification and implemented in Kubernetes via the usual
     * PV/PVC mechanism.
     * The other mode is "Ephemeral". In this mode, volumes are defined inline
     * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
     * the lifecycle of that pod. A driver has to be aware of this
     * because it is only going to get a NodePublishVolume call for such a volume.
     * For more information about implementing this mode, see
     * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
     * A driver can support one or more of these modes and
     * more modes may be added in the future.
     * This field is beta.
     * This field is immutable.
     * +optional
     * +listType=set
     * </pre>
     *
     * <code>repeated string volumeLifecycleModes = 3;</code>
     */
    public com.google.protobuf.ByteString getVolumeLifecycleModesBytes(int index) {
      return volumeLifecycleModes_.getByteString(index);
    }

    public static final int STORAGECAPACITY_FIELD_NUMBER = 4;
    private boolean storageCapacity_;
    /**
     *
     *
     * <pre>
     * If set to true, storageCapacity indicates that the CSI
     * volume driver wants pod scheduling to consider the storage
     * capacity that the driver deployment will report by creating
     * CSIStorageCapacity objects with capacity information.
     * The check can be enabled immediately when deploying a driver.
     * In that case, provisioning new volumes with late binding
     * will pause until the driver deployment has published
     * some suitable CSIStorageCapacity object.
     * Alternatively, the driver can be deployed with the field
     * unset or false and it can be flipped later when storage
     * capacity information has been published.
     * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
     * This is a beta field and only available when the CSIStorageCapacity
     * feature is enabled. The default is false.
     * +optional
     * +featureGate=CSIStorageCapacity
     * </pre>
     *
     * <code>optional bool storageCapacity = 4;</code>
     */
    public boolean hasStorageCapacity() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * If set to true, storageCapacity indicates that the CSI
     * volume driver wants pod scheduling to consider the storage
     * capacity that the driver deployment will report by creating
     * CSIStorageCapacity objects with capacity information.
     * The check can be enabled immediately when deploying a driver.
     * In that case, provisioning new volumes with late binding
     * will pause until the driver deployment has published
     * some suitable CSIStorageCapacity object.
     * Alternatively, the driver can be deployed with the field
     * unset or false and it can be flipped later when storage
     * capacity information has been published.
     * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
     * This is a beta field and only available when the CSIStorageCapacity
     * feature is enabled. The default is false.
     * +optional
     * +featureGate=CSIStorageCapacity
     * </pre>
     *
     * <code>optional bool storageCapacity = 4;</code>
     */
    public boolean getStorageCapacity() {
      return storageCapacity_;
    }

    public static final int FSGROUPPOLICY_FIELD_NUMBER = 5;
    private volatile java.lang.Object fsGroupPolicy_;
    /**
     *
     *
     * <pre>
     * Defines if the underlying volume supports changing ownership and
     * permission of the volume before being mounted.
     * Refer to the specific FSGroupPolicy values for additional details.
     * This field is immutable.
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume
     * to determine if Kubernetes should modify ownership and permissions of the volume.
     * With the default policy the defined fsGroup will only be applied
     * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     * +optional
     * </pre>
     *
     * <code>optional string fsGroupPolicy = 5;</code>
     */
    public boolean hasFsGroupPolicy() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * Defines if the underlying volume supports changing ownership and
     * permission of the volume before being mounted.
     * Refer to the specific FSGroupPolicy values for additional details.
     * This field is immutable.
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume
     * to determine if Kubernetes should modify ownership and permissions of the volume.
     * With the default policy the defined fsGroup will only be applied
     * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     * +optional
     * </pre>
     *
     * <code>optional string fsGroupPolicy = 5;</code>
     */
    public java.lang.String getFsGroupPolicy() {
      java.lang.Object ref = fsGroupPolicy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fsGroupPolicy_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Defines if the underlying volume supports changing ownership and
     * permission of the volume before being mounted.
     * Refer to the specific FSGroupPolicy values for additional details.
     * This field is immutable.
     * Defaults to ReadWriteOnceWithFSType, which will examine each volume
     * to determine if Kubernetes should modify ownership and permissions of the volume.
     * With the default policy the defined fsGroup will only be applied
     * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
     * +optional
     * </pre>
     *
     * <code>optional string fsGroupPolicy = 5;</code>
     */
    public com.google.protobuf.ByteString getFsGroupPolicyBytes() {
      java.lang.Object ref = fsGroupPolicy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fsGroupPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOKENREQUESTS_FIELD_NUMBER = 6;
    private java.util.List<io.kubernetes.client.proto.V1Storage.TokenRequest> tokenRequests_;
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.TokenRequest>
        getTokenRequestsList() {
      return tokenRequests_;
    }
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder>
        getTokenRequestsOrBuilderList() {
      return tokenRequests_;
    }
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    public int getTokenRequestsCount() {
      return tokenRequests_.size();
    }
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    public io.kubernetes.client.proto.V1Storage.TokenRequest getTokenRequests(int index) {
      return tokenRequests_.get(index);
    }
    /**
     *
     *
     * <pre>
     * TokenRequests indicates the CSI driver needs pods' service account
     * tokens it is mounting volume for to do necessary authentication. Kubelet
     * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
     * The CSI driver should parse and validate the following VolumeContext:
     * "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "&lt;audience&gt;": {
     *     "token": &lt;token&gt;,
     *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
     *   },
     *   ...
     * }
     * Note: Audience in each TokenRequest should be different and at
     * most one token is empty string. To receive a new token after expiry,
     * RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
     */
    public io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder getTokenRequestsOrBuilder(
        int index) {
      return tokenRequests_.get(index);
    }

    public static final int REQUIRESREPUBLISH_FIELD_NUMBER = 7;
    private boolean requiresRepublish_;
    /**
     *
     *
     * <pre>
     * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
     * being periodically called to reflect any possible change in the mounted
     * volume. This field defaults to false.
     * Note: After a successful initial NodePublishVolume call, subsequent calls
     * to NodePublishVolume should only update the contents of the volume. New
     * mount points will not be seen by a running container.
     * +optional
     * </pre>
     *
     * <code>optional bool requiresRepublish = 7;</code>
     */
    public boolean hasRequiresRepublish() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
     * being periodically called to reflect any possible change in the mounted
     * volume. This field defaults to false.
     * Note: After a successful initial NodePublishVolume call, subsequent calls
     * to NodePublishVolume should only update the contents of the volume. New
     * mount points will not be seen by a running container.
     * +optional
     * </pre>
     *
     * <code>optional bool requiresRepublish = 7;</code>
     */
    public boolean getRequiresRepublish() {
      return requiresRepublish_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, attachRequired_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, podInfoOnMount_);
      }
      for (int i = 0; i < volumeLifecycleModes_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(
            output, 3, volumeLifecycleModes_.getRaw(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(4, storageCapacity_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fsGroupPolicy_);
      }
      for (int i = 0; i < tokenRequests_.size(); i++) {
        output.writeMessage(6, tokenRequests_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(7, requiresRepublish_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, attachRequired_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, podInfoOnMount_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < volumeLifecycleModes_.size(); i++) {
          dataSize += computeStringSizeNoTag(volumeLifecycleModes_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getVolumeLifecycleModesList().size();
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, storageCapacity_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fsGroupPolicy_);
      }
      for (int i = 0; i < tokenRequests_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, tokenRequests_.get(i));
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, requiresRepublish_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.CSIDriverSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.CSIDriverSpec other =
          (io.kubernetes.client.proto.V1Storage.CSIDriverSpec) obj;

      boolean result = true;
      result = result && (hasAttachRequired() == other.hasAttachRequired());
      if (hasAttachRequired()) {
        result = result && (getAttachRequired() == other.getAttachRequired());
      }
      result = result && (hasPodInfoOnMount() == other.hasPodInfoOnMount());
      if (hasPodInfoOnMount()) {
        result = result && (getPodInfoOnMount() == other.getPodInfoOnMount());
      }
      result = result && getVolumeLifecycleModesList().equals(other.getVolumeLifecycleModesList());
      result = result && (hasStorageCapacity() == other.hasStorageCapacity());
      if (hasStorageCapacity()) {
        result = result && (getStorageCapacity() == other.getStorageCapacity());
      }
      result = result && (hasFsGroupPolicy() == other.hasFsGroupPolicy());
      if (hasFsGroupPolicy()) {
        result = result && getFsGroupPolicy().equals(other.getFsGroupPolicy());
      }
      result = result && getTokenRequestsList().equals(other.getTokenRequestsList());
      result = result && (hasRequiresRepublish() == other.hasRequiresRepublish());
      if (hasRequiresRepublish()) {
        result = result && (getRequiresRepublish() == other.getRequiresRepublish());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAttachRequired()) {
        hash = (37 * hash) + ATTACHREQUIRED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAttachRequired());
      }
      if (hasPodInfoOnMount()) {
        hash = (37 * hash) + PODINFOONMOUNT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getPodInfoOnMount());
      }
      if (getVolumeLifecycleModesCount() > 0) {
        hash = (37 * hash) + VOLUMELIFECYCLEMODES_FIELD_NUMBER;
        hash = (53 * hash) + getVolumeLifecycleModesList().hashCode();
      }
      if (hasStorageCapacity()) {
        hash = (37 * hash) + STORAGECAPACITY_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getStorageCapacity());
      }
      if (hasFsGroupPolicy()) {
        hash = (37 * hash) + FSGROUPPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getFsGroupPolicy().hashCode();
      }
      if (getTokenRequestsCount() > 0) {
        hash = (37 * hash) + TOKENREQUESTS_FIELD_NUMBER;
        hash = (53 * hash) + getTokenRequestsList().hashCode();
      }
      if (hasRequiresRepublish()) {
        hash = (37 * hash) + REQUIRESREPUBLISH_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getRequiresRepublish());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.CSIDriverSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CSIDriverSpec is the specification of a CSIDriver.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.CSIDriverSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.CSIDriverSpec)
        io.kubernetes.client.proto.V1Storage.CSIDriverSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriverSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriverSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.CSIDriverSpec.class,
                io.kubernetes.client.proto.V1Storage.CSIDriverSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.CSIDriverSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTokenRequestsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        attachRequired_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        podInfoOnMount_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        volumeLifecycleModes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        storageCapacity_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        fsGroupPolicy_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        if (tokenRequestsBuilder_ == null) {
          tokenRequests_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          tokenRequestsBuilder_.clear();
        }
        requiresRepublish_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSIDriverSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriverSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.CSIDriverSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriverSpec build() {
        io.kubernetes.client.proto.V1Storage.CSIDriverSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSIDriverSpec buildPartial() {
        io.kubernetes.client.proto.V1Storage.CSIDriverSpec result =
            new io.kubernetes.client.proto.V1Storage.CSIDriverSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.attachRequired_ = attachRequired_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.podInfoOnMount_ = podInfoOnMount_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          volumeLifecycleModes_ = volumeLifecycleModes_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.volumeLifecycleModes_ = volumeLifecycleModes_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.storageCapacity_ = storageCapacity_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.fsGroupPolicy_ = fsGroupPolicy_;
        if (tokenRequestsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            tokenRequests_ = java.util.Collections.unmodifiableList(tokenRequests_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.tokenRequests_ = tokenRequests_;
        } else {
          result.tokenRequests_ = tokenRequestsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000010;
        }
        result.requiresRepublish_ = requiresRepublish_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.CSIDriverSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.CSIDriverSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.CSIDriverSpec other) {
        if (other == io.kubernetes.client.proto.V1Storage.CSIDriverSpec.getDefaultInstance())
          return this;
        if (other.hasAttachRequired()) {
          setAttachRequired(other.getAttachRequired());
        }
        if (other.hasPodInfoOnMount()) {
          setPodInfoOnMount(other.getPodInfoOnMount());
        }
        if (!other.volumeLifecycleModes_.isEmpty()) {
          if (volumeLifecycleModes_.isEmpty()) {
            volumeLifecycleModes_ = other.volumeLifecycleModes_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureVolumeLifecycleModesIsMutable();
            volumeLifecycleModes_.addAll(other.volumeLifecycleModes_);
          }
          onChanged();
        }
        if (other.hasStorageCapacity()) {
          setStorageCapacity(other.getStorageCapacity());
        }
        if (other.hasFsGroupPolicy()) {
          bitField0_ |= 0x00000010;
          fsGroupPolicy_ = other.fsGroupPolicy_;
          onChanged();
        }
        if (tokenRequestsBuilder_ == null) {
          if (!other.tokenRequests_.isEmpty()) {
            if (tokenRequests_.isEmpty()) {
              tokenRequests_ = other.tokenRequests_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureTokenRequestsIsMutable();
              tokenRequests_.addAll(other.tokenRequests_);
            }
            onChanged();
          }
        } else {
          if (!other.tokenRequests_.isEmpty()) {
            if (tokenRequestsBuilder_.isEmpty()) {
              tokenRequestsBuilder_.dispose();
              tokenRequestsBuilder_ = null;
              tokenRequests_ = other.tokenRequests_;
              bitField0_ = (bitField0_ & ~0x00000020);
              tokenRequestsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getTokenRequestsFieldBuilder()
                      : null;
            } else {
              tokenRequestsBuilder_.addAllMessages(other.tokenRequests_);
            }
          }
        }
        if (other.hasRequiresRepublish()) {
          setRequiresRepublish(other.getRequiresRepublish());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.CSIDriverSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.CSIDriverSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private boolean attachRequired_;
      /**
       *
       *
       * <pre>
       * attachRequired indicates this CSI volume driver requires an attach
       * operation (because it implements the CSI ControllerPublishVolume()
       * method), and that the Kubernetes attach detach controller should call
       * the attach volume interface which checks the volumeattachment status
       * and waits until the volume is attached before proceeding to mounting.
       * The CSI external-attacher coordinates with CSI volume driver and updates
       * the volumeattachment status when the attach operation is complete.
       * If the CSIDriverRegistry feature gate is enabled and the value is
       * specified to false, the attach operation will be skipped.
       * Otherwise the attach operation will be called.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool attachRequired = 1;</code>
       */
      public boolean hasAttachRequired() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * attachRequired indicates this CSI volume driver requires an attach
       * operation (because it implements the CSI ControllerPublishVolume()
       * method), and that the Kubernetes attach detach controller should call
       * the attach volume interface which checks the volumeattachment status
       * and waits until the volume is attached before proceeding to mounting.
       * The CSI external-attacher coordinates with CSI volume driver and updates
       * the volumeattachment status when the attach operation is complete.
       * If the CSIDriverRegistry feature gate is enabled and the value is
       * specified to false, the attach operation will be skipped.
       * Otherwise the attach operation will be called.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool attachRequired = 1;</code>
       */
      public boolean getAttachRequired() {
        return attachRequired_;
      }
      /**
       *
       *
       * <pre>
       * attachRequired indicates this CSI volume driver requires an attach
       * operation (because it implements the CSI ControllerPublishVolume()
       * method), and that the Kubernetes attach detach controller should call
       * the attach volume interface which checks the volumeattachment status
       * and waits until the volume is attached before proceeding to mounting.
       * The CSI external-attacher coordinates with CSI volume driver and updates
       * the volumeattachment status when the attach operation is complete.
       * If the CSIDriverRegistry feature gate is enabled and the value is
       * specified to false, the attach operation will be skipped.
       * Otherwise the attach operation will be called.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool attachRequired = 1;</code>
       */
      public Builder setAttachRequired(boolean value) {
        bitField0_ |= 0x00000001;
        attachRequired_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * attachRequired indicates this CSI volume driver requires an attach
       * operation (because it implements the CSI ControllerPublishVolume()
       * method), and that the Kubernetes attach detach controller should call
       * the attach volume interface which checks the volumeattachment status
       * and waits until the volume is attached before proceeding to mounting.
       * The CSI external-attacher coordinates with CSI volume driver and updates
       * the volumeattachment status when the attach operation is complete.
       * If the CSIDriverRegistry feature gate is enabled and the value is
       * specified to false, the attach operation will be skipped.
       * Otherwise the attach operation will be called.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool attachRequired = 1;</code>
       */
      public Builder clearAttachRequired() {
        bitField0_ = (bitField0_ & ~0x00000001);
        attachRequired_ = false;
        onChanged();
        return this;
      }

      private boolean podInfoOnMount_;
      /**
       *
       *
       * <pre>
       * If set to true, podInfoOnMount indicates this CSI volume driver
       * requires additional pod information (like podName, podUID, etc.) during
       * mount operations.
       * If set to false, pod information will not be passed on mount.
       * Default is false.
       * The CSI driver specifies podInfoOnMount as part of driver deployment.
       * If true, Kubelet will pass pod information as VolumeContext in the CSI
       * NodePublishVolume() calls.
       * The CSI driver is responsible for parsing and validating the information
       * passed in as VolumeContext.
       * The following VolumeConext will be passed if podInfoOnMount is set to true.
       * This list might grow, but the prefix will be used.
       * "csi.storage.k8s.io/pod.name": pod.Name
       * "csi.storage.k8s.io/pod.namespace": pod.Namespace
       * "csi.storage.k8s.io/pod.uid": string(pod.UID)
       * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
       *                                 defined by a CSIVolumeSource, otherwise "false"
       * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
       * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
       * Other drivers can leave pod info disabled and/or ignore this field.
       * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
       * deployed on such a cluster and the deployment determines which mode that is, for example
       * via a command line parameter of the driver.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool podInfoOnMount = 2;</code>
       */
      public boolean hasPodInfoOnMount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * If set to true, podInfoOnMount indicates this CSI volume driver
       * requires additional pod information (like podName, podUID, etc.) during
       * mount operations.
       * If set to false, pod information will not be passed on mount.
       * Default is false.
       * The CSI driver specifies podInfoOnMount as part of driver deployment.
       * If true, Kubelet will pass pod information as VolumeContext in the CSI
       * NodePublishVolume() calls.
       * The CSI driver is responsible for parsing and validating the information
       * passed in as VolumeContext.
       * The following VolumeConext will be passed if podInfoOnMount is set to true.
       * This list might grow, but the prefix will be used.
       * "csi.storage.k8s.io/pod.name": pod.Name
       * "csi.storage.k8s.io/pod.namespace": pod.Namespace
       * "csi.storage.k8s.io/pod.uid": string(pod.UID)
       * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
       *                                 defined by a CSIVolumeSource, otherwise "false"
       * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
       * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
       * Other drivers can leave pod info disabled and/or ignore this field.
       * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
       * deployed on such a cluster and the deployment determines which mode that is, for example
       * via a command line parameter of the driver.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool podInfoOnMount = 2;</code>
       */
      public boolean getPodInfoOnMount() {
        return podInfoOnMount_;
      }
      /**
       *
       *
       * <pre>
       * If set to true, podInfoOnMount indicates this CSI volume driver
       * requires additional pod information (like podName, podUID, etc.) during
       * mount operations.
       * If set to false, pod information will not be passed on mount.
       * Default is false.
       * The CSI driver specifies podInfoOnMount as part of driver deployment.
       * If true, Kubelet will pass pod information as VolumeContext in the CSI
       * NodePublishVolume() calls.
       * The CSI driver is responsible for parsing and validating the information
       * passed in as VolumeContext.
       * The following VolumeConext will be passed if podInfoOnMount is set to true.
       * This list might grow, but the prefix will be used.
       * "csi.storage.k8s.io/pod.name": pod.Name
       * "csi.storage.k8s.io/pod.namespace": pod.Namespace
       * "csi.storage.k8s.io/pod.uid": string(pod.UID)
       * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
       *                                 defined by a CSIVolumeSource, otherwise "false"
       * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
       * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
       * Other drivers can leave pod info disabled and/or ignore this field.
       * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
       * deployed on such a cluster and the deployment determines which mode that is, for example
       * via a command line parameter of the driver.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool podInfoOnMount = 2;</code>
       */
      public Builder setPodInfoOnMount(boolean value) {
        bitField0_ |= 0x00000002;
        podInfoOnMount_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * If set to true, podInfoOnMount indicates this CSI volume driver
       * requires additional pod information (like podName, podUID, etc.) during
       * mount operations.
       * If set to false, pod information will not be passed on mount.
       * Default is false.
       * The CSI driver specifies podInfoOnMount as part of driver deployment.
       * If true, Kubelet will pass pod information as VolumeContext in the CSI
       * NodePublishVolume() calls.
       * The CSI driver is responsible for parsing and validating the information
       * passed in as VolumeContext.
       * The following VolumeConext will be passed if podInfoOnMount is set to true.
       * This list might grow, but the prefix will be used.
       * "csi.storage.k8s.io/pod.name": pod.Name
       * "csi.storage.k8s.io/pod.namespace": pod.Namespace
       * "csi.storage.k8s.io/pod.uid": string(pod.UID)
       * "csi.storage.k8s.io/ephemeral": "true" if the volume is an ephemeral inline volume
       *                                 defined by a CSIVolumeSource, otherwise "false"
       * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only
       * required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode.
       * Other drivers can leave pod info disabled and/or ignore this field.
       * As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when
       * deployed on such a cluster and the deployment determines which mode that is, for example
       * via a command line parameter of the driver.
       * This field is immutable.
       * +optional
       * </pre>
       *
       * <code>optional bool podInfoOnMount = 2;</code>
       */
      public Builder clearPodInfoOnMount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        podInfoOnMount_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList volumeLifecycleModes_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureVolumeLifecycleModesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          volumeLifecycleModes_ =
              new com.google.protobuf.LazyStringArrayList(volumeLifecycleModes_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList getVolumeLifecycleModesList() {
        return volumeLifecycleModes_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public int getVolumeLifecycleModesCount() {
        return volumeLifecycleModes_.size();
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public java.lang.String getVolumeLifecycleModes(int index) {
        return volumeLifecycleModes_.get(index);
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public com.google.protobuf.ByteString getVolumeLifecycleModesBytes(int index) {
        return volumeLifecycleModes_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public Builder setVolumeLifecycleModes(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeLifecycleModesIsMutable();
        volumeLifecycleModes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public Builder addVolumeLifecycleModes(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeLifecycleModesIsMutable();
        volumeLifecycleModes_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public Builder addAllVolumeLifecycleModes(java.lang.Iterable<java.lang.String> values) {
        ensureVolumeLifecycleModesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, volumeLifecycleModes_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public Builder clearVolumeLifecycleModes() {
        volumeLifecycleModes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * volumeLifecycleModes defines what kind of volumes this CSI volume driver supports.
       * The default if the list is empty is "Persistent", which is the usage
       * defined by the CSI specification and implemented in Kubernetes via the usual
       * PV/PVC mechanism.
       * The other mode is "Ephemeral". In this mode, volumes are defined inline
       * inside the pod spec with CSIVolumeSource and their lifecycle is tied to
       * the lifecycle of that pod. A driver has to be aware of this
       * because it is only going to get a NodePublishVolume call for such a volume.
       * For more information about implementing this mode, see
       * https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html
       * A driver can support one or more of these modes and
       * more modes may be added in the future.
       * This field is beta.
       * This field is immutable.
       * +optional
       * +listType=set
       * </pre>
       *
       * <code>repeated string volumeLifecycleModes = 3;</code>
       */
      public Builder addVolumeLifecycleModesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeLifecycleModesIsMutable();
        volumeLifecycleModes_.add(value);
        onChanged();
        return this;
      }

      private boolean storageCapacity_;
      /**
       *
       *
       * <pre>
       * If set to true, storageCapacity indicates that the CSI
       * volume driver wants pod scheduling to consider the storage
       * capacity that the driver deployment will report by creating
       * CSIStorageCapacity objects with capacity information.
       * The check can be enabled immediately when deploying a driver.
       * In that case, provisioning new volumes with late binding
       * will pause until the driver deployment has published
       * some suitable CSIStorageCapacity object.
       * Alternatively, the driver can be deployed with the field
       * unset or false and it can be flipped later when storage
       * capacity information has been published.
       * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
       * This is a beta field and only available when the CSIStorageCapacity
       * feature is enabled. The default is false.
       * +optional
       * +featureGate=CSIStorageCapacity
       * </pre>
       *
       * <code>optional bool storageCapacity = 4;</code>
       */
      public boolean hasStorageCapacity() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * If set to true, storageCapacity indicates that the CSI
       * volume driver wants pod scheduling to consider the storage
       * capacity that the driver deployment will report by creating
       * CSIStorageCapacity objects with capacity information.
       * The check can be enabled immediately when deploying a driver.
       * In that case, provisioning new volumes with late binding
       * will pause until the driver deployment has published
       * some suitable CSIStorageCapacity object.
       * Alternatively, the driver can be deployed with the field
       * unset or false and it can be flipped later when storage
       * capacity information has been published.
       * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
       * This is a beta field and only available when the CSIStorageCapacity
       * feature is enabled. The default is false.
       * +optional
       * +featureGate=CSIStorageCapacity
       * </pre>
       *
       * <code>optional bool storageCapacity = 4;</code>
       */
      public boolean getStorageCapacity() {
        return storageCapacity_;
      }
      /**
       *
       *
       * <pre>
       * If set to true, storageCapacity indicates that the CSI
       * volume driver wants pod scheduling to consider the storage
       * capacity that the driver deployment will report by creating
       * CSIStorageCapacity objects with capacity information.
       * The check can be enabled immediately when deploying a driver.
       * In that case, provisioning new volumes with late binding
       * will pause until the driver deployment has published
       * some suitable CSIStorageCapacity object.
       * Alternatively, the driver can be deployed with the field
       * unset or false and it can be flipped later when storage
       * capacity information has been published.
       * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
       * This is a beta field and only available when the CSIStorageCapacity
       * feature is enabled. The default is false.
       * +optional
       * +featureGate=CSIStorageCapacity
       * </pre>
       *
       * <code>optional bool storageCapacity = 4;</code>
       */
      public Builder setStorageCapacity(boolean value) {
        bitField0_ |= 0x00000008;
        storageCapacity_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * If set to true, storageCapacity indicates that the CSI
       * volume driver wants pod scheduling to consider the storage
       * capacity that the driver deployment will report by creating
       * CSIStorageCapacity objects with capacity information.
       * The check can be enabled immediately when deploying a driver.
       * In that case, provisioning new volumes with late binding
       * will pause until the driver deployment has published
       * some suitable CSIStorageCapacity object.
       * Alternatively, the driver can be deployed with the field
       * unset or false and it can be flipped later when storage
       * capacity information has been published.
       * This field was immutable in Kubernetes &lt;= 1.22 and now is mutable.
       * This is a beta field and only available when the CSIStorageCapacity
       * feature is enabled. The default is false.
       * +optional
       * +featureGate=CSIStorageCapacity
       * </pre>
       *
       * <code>optional bool storageCapacity = 4;</code>
       */
      public Builder clearStorageCapacity() {
        bitField0_ = (bitField0_ & ~0x00000008);
        storageCapacity_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object fsGroupPolicy_ = "";
      /**
       *
       *
       * <pre>
       * Defines if the underlying volume supports changing ownership and
       * permission of the volume before being mounted.
       * Refer to the specific FSGroupPolicy values for additional details.
       * This field is immutable.
       * Defaults to ReadWriteOnceWithFSType, which will examine each volume
       * to determine if Kubernetes should modify ownership and permissions of the volume.
       * With the default policy the defined fsGroup will only be applied
       * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
       * +optional
       * </pre>
       *
       * <code>optional string fsGroupPolicy = 5;</code>
       */
      public boolean hasFsGroupPolicy() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * Defines if the underlying volume supports changing ownership and
       * permission of the volume before being mounted.
       * Refer to the specific FSGroupPolicy values for additional details.
       * This field is immutable.
       * Defaults to ReadWriteOnceWithFSType, which will examine each volume
       * to determine if Kubernetes should modify ownership and permissions of the volume.
       * With the default policy the defined fsGroup will only be applied
       * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
       * +optional
       * </pre>
       *
       * <code>optional string fsGroupPolicy = 5;</code>
       */
      public java.lang.String getFsGroupPolicy() {
        java.lang.Object ref = fsGroupPolicy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            fsGroupPolicy_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Defines if the underlying volume supports changing ownership and
       * permission of the volume before being mounted.
       * Refer to the specific FSGroupPolicy values for additional details.
       * This field is immutable.
       * Defaults to ReadWriteOnceWithFSType, which will examine each volume
       * to determine if Kubernetes should modify ownership and permissions of the volume.
       * With the default policy the defined fsGroup will only be applied
       * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
       * +optional
       * </pre>
       *
       * <code>optional string fsGroupPolicy = 5;</code>
       */
      public com.google.protobuf.ByteString getFsGroupPolicyBytes() {
        java.lang.Object ref = fsGroupPolicy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          fsGroupPolicy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Defines if the underlying volume supports changing ownership and
       * permission of the volume before being mounted.
       * Refer to the specific FSGroupPolicy values for additional details.
       * This field is immutable.
       * Defaults to ReadWriteOnceWithFSType, which will examine each volume
       * to determine if Kubernetes should modify ownership and permissions of the volume.
       * With the default policy the defined fsGroup will only be applied
       * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
       * +optional
       * </pre>
       *
       * <code>optional string fsGroupPolicy = 5;</code>
       */
      public Builder setFsGroupPolicy(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        fsGroupPolicy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Defines if the underlying volume supports changing ownership and
       * permission of the volume before being mounted.
       * Refer to the specific FSGroupPolicy values for additional details.
       * This field is immutable.
       * Defaults to ReadWriteOnceWithFSType, which will examine each volume
       * to determine if Kubernetes should modify ownership and permissions of the volume.
       * With the default policy the defined fsGroup will only be applied
       * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
       * +optional
       * </pre>
       *
       * <code>optional string fsGroupPolicy = 5;</code>
       */
      public Builder clearFsGroupPolicy() {
        bitField0_ = (bitField0_ & ~0x00000010);
        fsGroupPolicy_ = getDefaultInstance().getFsGroupPolicy();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Defines if the underlying volume supports changing ownership and
       * permission of the volume before being mounted.
       * Refer to the specific FSGroupPolicy values for additional details.
       * This field is immutable.
       * Defaults to ReadWriteOnceWithFSType, which will examine each volume
       * to determine if Kubernetes should modify ownership and permissions of the volume.
       * With the default policy the defined fsGroup will only be applied
       * if a fstype is defined and the volume's access mode contains ReadWriteOnce.
       * +optional
       * </pre>
       *
       * <code>optional string fsGroupPolicy = 5;</code>
       */
      public Builder setFsGroupPolicyBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        fsGroupPolicy_ = value;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1Storage.TokenRequest> tokenRequests_ =
          java.util.Collections.emptyList();

      private void ensureTokenRequestsIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          tokenRequests_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.TokenRequest>(
                  tokenRequests_);
          bitField0_ |= 0x00000020;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.TokenRequest,
              io.kubernetes.client.proto.V1Storage.TokenRequest.Builder,
              io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder>
          tokenRequestsBuilder_;

      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.TokenRequest>
          getTokenRequestsList() {
        if (tokenRequestsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(tokenRequests_);
        } else {
          return tokenRequestsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public int getTokenRequestsCount() {
        if (tokenRequestsBuilder_ == null) {
          return tokenRequests_.size();
        } else {
          return tokenRequestsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public io.kubernetes.client.proto.V1Storage.TokenRequest getTokenRequests(int index) {
        if (tokenRequestsBuilder_ == null) {
          return tokenRequests_.get(index);
        } else {
          return tokenRequestsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder setTokenRequests(
          int index, io.kubernetes.client.proto.V1Storage.TokenRequest value) {
        if (tokenRequestsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokenRequestsIsMutable();
          tokenRequests_.set(index, value);
          onChanged();
        } else {
          tokenRequestsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder setTokenRequests(
          int index, io.kubernetes.client.proto.V1Storage.TokenRequest.Builder builderForValue) {
        if (tokenRequestsBuilder_ == null) {
          ensureTokenRequestsIsMutable();
          tokenRequests_.set(index, builderForValue.build());
          onChanged();
        } else {
          tokenRequestsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder addTokenRequests(io.kubernetes.client.proto.V1Storage.TokenRequest value) {
        if (tokenRequestsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokenRequestsIsMutable();
          tokenRequests_.add(value);
          onChanged();
        } else {
          tokenRequestsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder addTokenRequests(
          int index, io.kubernetes.client.proto.V1Storage.TokenRequest value) {
        if (tokenRequestsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokenRequestsIsMutable();
          tokenRequests_.add(index, value);
          onChanged();
        } else {
          tokenRequestsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder addTokenRequests(
          io.kubernetes.client.proto.V1Storage.TokenRequest.Builder builderForValue) {
        if (tokenRequestsBuilder_ == null) {
          ensureTokenRequestsIsMutable();
          tokenRequests_.add(builderForValue.build());
          onChanged();
        } else {
          tokenRequestsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder addTokenRequests(
          int index, io.kubernetes.client.proto.V1Storage.TokenRequest.Builder builderForValue) {
        if (tokenRequestsBuilder_ == null) {
          ensureTokenRequestsIsMutable();
          tokenRequests_.add(index, builderForValue.build());
          onChanged();
        } else {
          tokenRequestsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder addAllTokenRequests(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.TokenRequest> values) {
        if (tokenRequestsBuilder_ == null) {
          ensureTokenRequestsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tokenRequests_);
          onChanged();
        } else {
          tokenRequestsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder clearTokenRequests() {
        if (tokenRequestsBuilder_ == null) {
          tokenRequests_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          tokenRequestsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public Builder removeTokenRequests(int index) {
        if (tokenRequestsBuilder_ == null) {
          ensureTokenRequestsIsMutable();
          tokenRequests_.remove(index);
          onChanged();
        } else {
          tokenRequestsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public io.kubernetes.client.proto.V1Storage.TokenRequest.Builder getTokenRequestsBuilder(
          int index) {
        return getTokenRequestsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder getTokenRequestsOrBuilder(
          int index) {
        if (tokenRequestsBuilder_ == null) {
          return tokenRequests_.get(index);
        } else {
          return tokenRequestsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder>
          getTokenRequestsOrBuilderList() {
        if (tokenRequestsBuilder_ != null) {
          return tokenRequestsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(tokenRequests_);
        }
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public io.kubernetes.client.proto.V1Storage.TokenRequest.Builder addTokenRequestsBuilder() {
        return getTokenRequestsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.TokenRequest.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public io.kubernetes.client.proto.V1Storage.TokenRequest.Builder addTokenRequestsBuilder(
          int index) {
        return getTokenRequestsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Storage.TokenRequest.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * TokenRequests indicates the CSI driver needs pods' service account
       * tokens it is mounting volume for to do necessary authentication. Kubelet
       * will pass the tokens in VolumeContext in the CSI NodePublishVolume calls.
       * The CSI driver should parse and validate the following VolumeContext:
       * "csi.storage.k8s.io/serviceAccount.tokens": {
       *   "&lt;audience&gt;": {
       *     "token": &lt;token&gt;,
       *     "expirationTimestamp": &lt;expiration timestamp in RFC3339&gt;,
       *   },
       *   ...
       * }
       * Note: Audience in each TokenRequest should be different and at
       * most one token is empty string. To receive a new token after expiry,
       * RequiresRepublish can be used to trigger NodePublishVolume periodically.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.TokenRequest tokenRequests = 6;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.TokenRequest.Builder>
          getTokenRequestsBuilderList() {
        return getTokenRequestsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.TokenRequest,
              io.kubernetes.client.proto.V1Storage.TokenRequest.Builder,
              io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder>
          getTokenRequestsFieldBuilder() {
        if (tokenRequestsBuilder_ == null) {
          tokenRequestsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.TokenRequest,
                  io.kubernetes.client.proto.V1Storage.TokenRequest.Builder,
                  io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder>(
                  tokenRequests_,
                  ((bitField0_ & 0x00000020) == 0x00000020),
                  getParentForChildren(),
                  isClean());
          tokenRequests_ = null;
        }
        return tokenRequestsBuilder_;
      }

      private boolean requiresRepublish_;
      /**
       *
       *
       * <pre>
       * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
       * being periodically called to reflect any possible change in the mounted
       * volume. This field defaults to false.
       * Note: After a successful initial NodePublishVolume call, subsequent calls
       * to NodePublishVolume should only update the contents of the volume. New
       * mount points will not be seen by a running container.
       * +optional
       * </pre>
       *
       * <code>optional bool requiresRepublish = 7;</code>
       */
      public boolean hasRequiresRepublish() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
       * being periodically called to reflect any possible change in the mounted
       * volume. This field defaults to false.
       * Note: After a successful initial NodePublishVolume call, subsequent calls
       * to NodePublishVolume should only update the contents of the volume. New
       * mount points will not be seen by a running container.
       * +optional
       * </pre>
       *
       * <code>optional bool requiresRepublish = 7;</code>
       */
      public boolean getRequiresRepublish() {
        return requiresRepublish_;
      }
      /**
       *
       *
       * <pre>
       * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
       * being periodically called to reflect any possible change in the mounted
       * volume. This field defaults to false.
       * Note: After a successful initial NodePublishVolume call, subsequent calls
       * to NodePublishVolume should only update the contents of the volume. New
       * mount points will not be seen by a running container.
       * +optional
       * </pre>
       *
       * <code>optional bool requiresRepublish = 7;</code>
       */
      public Builder setRequiresRepublish(boolean value) {
        bitField0_ |= 0x00000040;
        requiresRepublish_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * RequiresRepublish indicates the CSI driver wants `NodePublishVolume`
       * being periodically called to reflect any possible change in the mounted
       * volume. This field defaults to false.
       * Note: After a successful initial NodePublishVolume call, subsequent calls
       * to NodePublishVolume should only update the contents of the volume. New
       * mount points will not be seen by a running container.
       * +optional
       * </pre>
       *
       * <code>optional bool requiresRepublish = 7;</code>
       */
      public Builder clearRequiresRepublish() {
        bitField0_ = (bitField0_ & ~0x00000040);
        requiresRepublish_ = false;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.CSIDriverSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.CSIDriverSpec)
    private static final io.kubernetes.client.proto.V1Storage.CSIDriverSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.CSIDriverSpec();
    }

    public static io.kubernetes.client.proto.V1Storage.CSIDriverSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CSIDriverSpec> PARSER =
        new com.google.protobuf.AbstractParser<CSIDriverSpec>() {
          @java.lang.Override
          public CSIDriverSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CSIDriverSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CSIDriverSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSIDriverSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.CSIDriverSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CSINodeOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.CSINode)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metadata.name must be the Kubernetes node name.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * metadata.name must be the Kubernetes node name.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * metadata.name must be the Kubernetes node name.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * spec is the specification of CSINode
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * spec is the specification of CSINode
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSINodeSpec getSpec();
    /**
     *
     *
     * <pre>
     * spec is the specification of CSINode
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSINodeSpecOrBuilder getSpecOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * CSINode holds information about all CSI drivers installed on a node.
   * CSI drivers do not need to create the CSINode object directly. As long as
   * they use the node-driver-registrar sidecar container, the kubelet will
   * automatically populate the CSINode object for the CSI driver as part of
   * kubelet plugin registration.
   * CSINode has the same name as a node. If the object is missing, it means either
   * there are no CSI Drivers available on the node, or the Kubelet version is low
   * enough that it doesn't create this object.
   * CSINode has an OwnerReference that points to the corresponding node object.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.CSINode}
   */
  public static final class CSINode extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.CSINode)
      CSINodeOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CSINode.newBuilder() to construct.
    private CSINode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CSINode() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CSINode(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.CSINodeSpec.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.CSINode.class,
              io.kubernetes.client.proto.V1Storage.CSINode.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * metadata.name must be the Kubernetes node name.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metadata.name must be the Kubernetes node name.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * metadata.name must be the Kubernetes node name.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Storage.CSINodeSpec spec_;
    /**
     *
     *
     * <pre>
     * spec is the specification of CSINode
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * spec is the specification of CSINode
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSINodeSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.CSINodeSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * spec is the specification of CSINode
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSINodeSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.CSINodeSpec.getDefaultInstance()
          : spec_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.CSINode)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.CSINode other =
          (io.kubernetes.client.proto.V1Storage.CSINode) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.CSINode prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CSINode holds information about all CSI drivers installed on a node.
     * CSI drivers do not need to create the CSINode object directly. As long as
     * they use the node-driver-registrar sidecar container, the kubelet will
     * automatically populate the CSINode object for the CSI driver as part of
     * kubelet plugin registration.
     * CSINode has the same name as a node. If the object is missing, it means either
     * there are no CSI Drivers available on the node, or the Kubelet version is low
     * enough that it doesn't create this object.
     * CSINode has an OwnerReference that points to the corresponding node object.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.CSINode}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.CSINode)
        io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINode_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINode_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.CSINode.class,
                io.kubernetes.client.proto.V1Storage.CSINode.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.CSINode.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINode_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINode getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.CSINode.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINode build() {
        io.kubernetes.client.proto.V1Storage.CSINode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINode buildPartial() {
        io.kubernetes.client.proto.V1Storage.CSINode result =
            new io.kubernetes.client.proto.V1Storage.CSINode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.CSINode) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.CSINode) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.CSINode other) {
        if (other == io.kubernetes.client.proto.V1Storage.CSINode.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.CSINode parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Storage.CSINode) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * metadata.name must be the Kubernetes node name.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1Storage.CSINodeSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSINodeSpec,
              io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder,
              io.kubernetes.client.proto.V1Storage.CSINodeSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.CSINodeSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Storage.CSINodeSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Storage.CSINodeSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_ != io.kubernetes.client.proto.V1Storage.CSINodeSpec.getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Storage.CSINodeSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.CSINodeSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * spec is the specification of CSINode
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.CSINodeSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSINodeSpec,
              io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder,
              io.kubernetes.client.proto.V1Storage.CSINodeSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.CSINodeSpec,
                  io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder,
                  io.kubernetes.client.proto.V1Storage.CSINodeSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.CSINode)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.CSINode)
    private static final io.kubernetes.client.proto.V1Storage.CSINode DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.CSINode();
    }

    public static io.kubernetes.client.proto.V1Storage.CSINode getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CSINode> PARSER =
        new com.google.protobuf.AbstractParser<CSINode>() {
          @java.lang.Override
          public CSINode parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CSINode(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CSINode> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSINode> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.CSINode getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CSINodeDriverOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.CSINodeDriver)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * This is the name of the CSI driver that this object refers to.
     * This MUST be the same name returned by the CSI GetPluginName() call for
     * that driver.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * This is the name of the CSI driver that this object refers to.
     * This MUST be the same name returned by the CSI GetPluginName() call for
     * that driver.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * This is the name of the CSI driver that this object refers to.
     * This MUST be the same name returned by the CSI GetPluginName() call for
     * that driver.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * nodeID of the node from the driver point of view.
     * This field enables Kubernetes to communicate with storage systems that do
     * not share the same nomenclature for nodes. For example, Kubernetes may
     * refer to a given node as "node1", but the storage system may refer to
     * the same node as "nodeA". When Kubernetes issues a command to the storage
     * system to attach a volume to a specific node, it can use this field to
     * refer to the node name using the ID that the storage system will
     * understand, e.g. "nodeA" instead of "node1". This field is required.
     * </pre>
     *
     * <code>optional string nodeID = 2;</code>
     */
    boolean hasNodeID();
    /**
     *
     *
     * <pre>
     * nodeID of the node from the driver point of view.
     * This field enables Kubernetes to communicate with storage systems that do
     * not share the same nomenclature for nodes. For example, Kubernetes may
     * refer to a given node as "node1", but the storage system may refer to
     * the same node as "nodeA". When Kubernetes issues a command to the storage
     * system to attach a volume to a specific node, it can use this field to
     * refer to the node name using the ID that the storage system will
     * understand, e.g. "nodeA" instead of "node1". This field is required.
     * </pre>
     *
     * <code>optional string nodeID = 2;</code>
     */
    java.lang.String getNodeID();
    /**
     *
     *
     * <pre>
     * nodeID of the node from the driver point of view.
     * This field enables Kubernetes to communicate with storage systems that do
     * not share the same nomenclature for nodes. For example, Kubernetes may
     * refer to a given node as "node1", but the storage system may refer to
     * the same node as "nodeA". When Kubernetes issues a command to the storage
     * system to attach a volume to a specific node, it can use this field to
     * refer to the node name using the ID that the storage system will
     * understand, e.g. "nodeA" instead of "node1". This field is required.
     * </pre>
     *
     * <code>optional string nodeID = 2;</code>
     */
    com.google.protobuf.ByteString getNodeIDBytes();

    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    java.util.List<java.lang.String> getTopologyKeysList();
    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    int getTopologyKeysCount();
    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    java.lang.String getTopologyKeys(int index);
    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    com.google.protobuf.ByteString getTopologyKeysBytes(int index);

    /**
     *
     *
     * <pre>
     * allocatable represents the volume resources of a node that are available for scheduling.
     * This field is beta.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
     */
    boolean hasAllocatable();
    /**
     *
     *
     * <pre>
     * allocatable represents the volume resources of a node that are available for scheduling.
     * This field is beta.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeNodeResources getAllocatable();
    /**
     *
     *
     * <pre>
     * allocatable represents the volume resources of a node that are available for scheduling.
     * This field is beta.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeNodeResourcesOrBuilder getAllocatableOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * CSINodeDriver holds information about the specification of one CSI driver installed on a node
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.CSINodeDriver}
   */
  public static final class CSINodeDriver extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.CSINodeDriver)
      CSINodeDriverOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CSINodeDriver.newBuilder() to construct.
    private CSINodeDriver(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CSINodeDriver() {
      name_ = "";
      nodeID_ = "";
      topologyKeys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CSINodeDriver(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                nodeID_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  topologyKeys_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                topologyKeys_.add(bs);
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = allocatable_.toBuilder();
                }
                allocatable_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeNodeResources.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(allocatable_);
                  allocatable_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          topologyKeys_ = topologyKeys_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINodeDriver_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINodeDriver_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.CSINodeDriver.class,
              io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * This is the name of the CSI driver that this object refers to.
     * This MUST be the same name returned by the CSI GetPluginName() call for
     * that driver.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * This is the name of the CSI driver that this object refers to.
     * This MUST be the same name returned by the CSI GetPluginName() call for
     * that driver.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * This is the name of the CSI driver that this object refers to.
     * This MUST be the same name returned by the CSI GetPluginName() call for
     * that driver.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NODEID_FIELD_NUMBER = 2;
    private volatile java.lang.Object nodeID_;
    /**
     *
     *
     * <pre>
     * nodeID of the node from the driver point of view.
     * This field enables Kubernetes to communicate with storage systems that do
     * not share the same nomenclature for nodes. For example, Kubernetes may
     * refer to a given node as "node1", but the storage system may refer to
     * the same node as "nodeA". When Kubernetes issues a command to the storage
     * system to attach a volume to a specific node, it can use this field to
     * refer to the node name using the ID that the storage system will
     * understand, e.g. "nodeA" instead of "node1". This field is required.
     * </pre>
     *
     * <code>optional string nodeID = 2;</code>
     */
    public boolean hasNodeID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * nodeID of the node from the driver point of view.
     * This field enables Kubernetes to communicate with storage systems that do
     * not share the same nomenclature for nodes. For example, Kubernetes may
     * refer to a given node as "node1", but the storage system may refer to
     * the same node as "nodeA". When Kubernetes issues a command to the storage
     * system to attach a volume to a specific node, it can use this field to
     * refer to the node name using the ID that the storage system will
     * understand, e.g. "nodeA" instead of "node1". This field is required.
     * </pre>
     *
     * <code>optional string nodeID = 2;</code>
     */
    public java.lang.String getNodeID() {
      java.lang.Object ref = nodeID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nodeID_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * nodeID of the node from the driver point of view.
     * This field enables Kubernetes to communicate with storage systems that do
     * not share the same nomenclature for nodes. For example, Kubernetes may
     * refer to a given node as "node1", but the storage system may refer to
     * the same node as "nodeA". When Kubernetes issues a command to the storage
     * system to attach a volume to a specific node, it can use this field to
     * refer to the node name using the ID that the storage system will
     * understand, e.g. "nodeA" instead of "node1". This field is required.
     * </pre>
     *
     * <code>optional string nodeID = 2;</code>
     */
    public com.google.protobuf.ByteString getNodeIDBytes() {
      java.lang.Object ref = nodeID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nodeID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TOPOLOGYKEYS_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList topologyKeys_;
    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getTopologyKeysList() {
      return topologyKeys_;
    }
    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    public int getTopologyKeysCount() {
      return topologyKeys_.size();
    }
    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    public java.lang.String getTopologyKeys(int index) {
      return topologyKeys_.get(index);
    }
    /**
     *
     *
     * <pre>
     * topologyKeys is the list of keys supported by the driver.
     * When a driver is initialized on a cluster, it provides a set of topology
     * keys that it understands (e.g. "company.com/zone", "company.com/region").
     * When a driver is initialized on a node, it provides the same topology keys
     * along with values. Kubelet will expose these topology keys as labels
     * on its own node object.
     * When Kubernetes does topology aware provisioning, it can use this list to
     * determine which labels it should retrieve from the node object and pass
     * back to the driver.
     * It is possible for different nodes to use different topology keys.
     * This can be empty if driver does not support topology.
     * +optional
     * </pre>
     *
     * <code>repeated string topologyKeys = 3;</code>
     */
    public com.google.protobuf.ByteString getTopologyKeysBytes(int index) {
      return topologyKeys_.getByteString(index);
    }

    public static final int ALLOCATABLE_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.V1Storage.VolumeNodeResources allocatable_;
    /**
     *
     *
     * <pre>
     * allocatable represents the volume resources of a node that are available for scheduling.
     * This field is beta.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
     */
    public boolean hasAllocatable() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * allocatable represents the volume resources of a node that are available for scheduling.
     * This field is beta.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeNodeResources getAllocatable() {
      return allocatable_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeNodeResources.getDefaultInstance()
          : allocatable_;
    }
    /**
     *
     *
     * <pre>
     * allocatable represents the volume resources of a node that are available for scheduling.
     * This field is beta.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeNodeResourcesOrBuilder
        getAllocatableOrBuilder() {
      return allocatable_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeNodeResources.getDefaultInstance()
          : allocatable_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nodeID_);
      }
      for (int i = 0; i < topologyKeys_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, topologyKeys_.getRaw(i));
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(4, getAllocatable());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nodeID_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < topologyKeys_.size(); i++) {
          dataSize += computeStringSizeNoTag(topologyKeys_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getTopologyKeysList().size();
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getAllocatable());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.CSINodeDriver)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.CSINodeDriver other =
          (io.kubernetes.client.proto.V1Storage.CSINodeDriver) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasNodeID() == other.hasNodeID());
      if (hasNodeID()) {
        result = result && getNodeID().equals(other.getNodeID());
      }
      result = result && getTopologyKeysList().equals(other.getTopologyKeysList());
      result = result && (hasAllocatable() == other.hasAllocatable());
      if (hasAllocatable()) {
        result = result && getAllocatable().equals(other.getAllocatable());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasNodeID()) {
        hash = (37 * hash) + NODEID_FIELD_NUMBER;
        hash = (53 * hash) + getNodeID().hashCode();
      }
      if (getTopologyKeysCount() > 0) {
        hash = (37 * hash) + TOPOLOGYKEYS_FIELD_NUMBER;
        hash = (53 * hash) + getTopologyKeysList().hashCode();
      }
      if (hasAllocatable()) {
        hash = (37 * hash) + ALLOCATABLE_FIELD_NUMBER;
        hash = (53 * hash) + getAllocatable().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.CSINodeDriver prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CSINodeDriver holds information about the specification of one CSI driver installed on a node
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.CSINodeDriver}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.CSINodeDriver)
        io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeDriver_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeDriver_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.CSINodeDriver.class,
                io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.CSINodeDriver.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getAllocatableFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeID_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        topologyKeys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (allocatableBuilder_ == null) {
          allocatable_ = null;
        } else {
          allocatableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeDriver_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeDriver getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.CSINodeDriver.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeDriver build() {
        io.kubernetes.client.proto.V1Storage.CSINodeDriver result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeDriver buildPartial() {
        io.kubernetes.client.proto.V1Storage.CSINodeDriver result =
            new io.kubernetes.client.proto.V1Storage.CSINodeDriver(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.nodeID_ = nodeID_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          topologyKeys_ = topologyKeys_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.topologyKeys_ = topologyKeys_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        if (allocatableBuilder_ == null) {
          result.allocatable_ = allocatable_;
        } else {
          result.allocatable_ = allocatableBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.CSINodeDriver) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.CSINodeDriver) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.CSINodeDriver other) {
        if (other == io.kubernetes.client.proto.V1Storage.CSINodeDriver.getDefaultInstance())
          return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasNodeID()) {
          bitField0_ |= 0x00000002;
          nodeID_ = other.nodeID_;
          onChanged();
        }
        if (!other.topologyKeys_.isEmpty()) {
          if (topologyKeys_.isEmpty()) {
            topologyKeys_ = other.topologyKeys_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureTopologyKeysIsMutable();
            topologyKeys_.addAll(other.topologyKeys_);
          }
          onChanged();
        }
        if (other.hasAllocatable()) {
          mergeAllocatable(other.getAllocatable());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.CSINodeDriver parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.CSINodeDriver) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * This is the name of the CSI driver that this object refers to.
       * This MUST be the same name returned by the CSI GetPluginName() call for
       * that driver.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * This is the name of the CSI driver that this object refers to.
       * This MUST be the same name returned by the CSI GetPluginName() call for
       * that driver.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * This is the name of the CSI driver that this object refers to.
       * This MUST be the same name returned by the CSI GetPluginName() call for
       * that driver.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * This is the name of the CSI driver that this object refers to.
       * This MUST be the same name returned by the CSI GetPluginName() call for
       * that driver.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * This is the name of the CSI driver that this object refers to.
       * This MUST be the same name returned by the CSI GetPluginName() call for
       * that driver.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * This is the name of the CSI driver that this object refers to.
       * This MUST be the same name returned by the CSI GetPluginName() call for
       * that driver.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object nodeID_ = "";
      /**
       *
       *
       * <pre>
       * nodeID of the node from the driver point of view.
       * This field enables Kubernetes to communicate with storage systems that do
       * not share the same nomenclature for nodes. For example, Kubernetes may
       * refer to a given node as "node1", but the storage system may refer to
       * the same node as "nodeA". When Kubernetes issues a command to the storage
       * system to attach a volume to a specific node, it can use this field to
       * refer to the node name using the ID that the storage system will
       * understand, e.g. "nodeA" instead of "node1". This field is required.
       * </pre>
       *
       * <code>optional string nodeID = 2;</code>
       */
      public boolean hasNodeID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * nodeID of the node from the driver point of view.
       * This field enables Kubernetes to communicate with storage systems that do
       * not share the same nomenclature for nodes. For example, Kubernetes may
       * refer to a given node as "node1", but the storage system may refer to
       * the same node as "nodeA". When Kubernetes issues a command to the storage
       * system to attach a volume to a specific node, it can use this field to
       * refer to the node name using the ID that the storage system will
       * understand, e.g. "nodeA" instead of "node1". This field is required.
       * </pre>
       *
       * <code>optional string nodeID = 2;</code>
       */
      public java.lang.String getNodeID() {
        java.lang.Object ref = nodeID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nodeID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * nodeID of the node from the driver point of view.
       * This field enables Kubernetes to communicate with storage systems that do
       * not share the same nomenclature for nodes. For example, Kubernetes may
       * refer to a given node as "node1", but the storage system may refer to
       * the same node as "nodeA". When Kubernetes issues a command to the storage
       * system to attach a volume to a specific node, it can use this field to
       * refer to the node name using the ID that the storage system will
       * understand, e.g. "nodeA" instead of "node1". This field is required.
       * </pre>
       *
       * <code>optional string nodeID = 2;</code>
       */
      public com.google.protobuf.ByteString getNodeIDBytes() {
        java.lang.Object ref = nodeID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          nodeID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * nodeID of the node from the driver point of view.
       * This field enables Kubernetes to communicate with storage systems that do
       * not share the same nomenclature for nodes. For example, Kubernetes may
       * refer to a given node as "node1", but the storage system may refer to
       * the same node as "nodeA". When Kubernetes issues a command to the storage
       * system to attach a volume to a specific node, it can use this field to
       * refer to the node name using the ID that the storage system will
       * understand, e.g. "nodeA" instead of "node1". This field is required.
       * </pre>
       *
       * <code>optional string nodeID = 2;</code>
       */
      public Builder setNodeID(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        nodeID_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * nodeID of the node from the driver point of view.
       * This field enables Kubernetes to communicate with storage systems that do
       * not share the same nomenclature for nodes. For example, Kubernetes may
       * refer to a given node as "node1", but the storage system may refer to
       * the same node as "nodeA". When Kubernetes issues a command to the storage
       * system to attach a volume to a specific node, it can use this field to
       * refer to the node name using the ID that the storage system will
       * understand, e.g. "nodeA" instead of "node1". This field is required.
       * </pre>
       *
       * <code>optional string nodeID = 2;</code>
       */
      public Builder clearNodeID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nodeID_ = getDefaultInstance().getNodeID();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * nodeID of the node from the driver point of view.
       * This field enables Kubernetes to communicate with storage systems that do
       * not share the same nomenclature for nodes. For example, Kubernetes may
       * refer to a given node as "node1", but the storage system may refer to
       * the same node as "nodeA". When Kubernetes issues a command to the storage
       * system to attach a volume to a specific node, it can use this field to
       * refer to the node name using the ID that the storage system will
       * understand, e.g. "nodeA" instead of "node1". This field is required.
       * </pre>
       *
       * <code>optional string nodeID = 2;</code>
       */
      public Builder setNodeIDBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        nodeID_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList topologyKeys_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureTopologyKeysIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          topologyKeys_ = new com.google.protobuf.LazyStringArrayList(topologyKeys_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList getTopologyKeysList() {
        return topologyKeys_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public int getTopologyKeysCount() {
        return topologyKeys_.size();
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public java.lang.String getTopologyKeys(int index) {
        return topologyKeys_.get(index);
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public com.google.protobuf.ByteString getTopologyKeysBytes(int index) {
        return topologyKeys_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public Builder setTopologyKeys(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopologyKeysIsMutable();
        topologyKeys_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public Builder addTopologyKeys(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopologyKeysIsMutable();
        topologyKeys_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public Builder addAllTopologyKeys(java.lang.Iterable<java.lang.String> values) {
        ensureTopologyKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, topologyKeys_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public Builder clearTopologyKeys() {
        topologyKeys_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * topologyKeys is the list of keys supported by the driver.
       * When a driver is initialized on a cluster, it provides a set of topology
       * keys that it understands (e.g. "company.com/zone", "company.com/region").
       * When a driver is initialized on a node, it provides the same topology keys
       * along with values. Kubelet will expose these topology keys as labels
       * on its own node object.
       * When Kubernetes does topology aware provisioning, it can use this list to
       * determine which labels it should retrieve from the node object and pass
       * back to the driver.
       * It is possible for different nodes to use different topology keys.
       * This can be empty if driver does not support topology.
       * +optional
       * </pre>
       *
       * <code>repeated string topologyKeys = 3;</code>
       */
      public Builder addTopologyKeysBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopologyKeysIsMutable();
        topologyKeys_.add(value);
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeNodeResources allocatable_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeNodeResources,
              io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeNodeResourcesOrBuilder>
          allocatableBuilder_;
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public boolean hasAllocatable() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeNodeResources getAllocatable() {
        if (allocatableBuilder_ == null) {
          return allocatable_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeNodeResources.getDefaultInstance()
              : allocatable_;
        } else {
          return allocatableBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public Builder setAllocatable(
          io.kubernetes.client.proto.V1Storage.VolumeNodeResources value) {
        if (allocatableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          allocatable_ = value;
          onChanged();
        } else {
          allocatableBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public Builder setAllocatable(
          io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder builderForValue) {
        if (allocatableBuilder_ == null) {
          allocatable_ = builderForValue.build();
          onChanged();
        } else {
          allocatableBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public Builder mergeAllocatable(
          io.kubernetes.client.proto.V1Storage.VolumeNodeResources value) {
        if (allocatableBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && allocatable_ != null
              && allocatable_
                  != io.kubernetes.client.proto.V1Storage.VolumeNodeResources
                      .getDefaultInstance()) {
            allocatable_ =
                io.kubernetes.client.proto.V1Storage.VolumeNodeResources.newBuilder(allocatable_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            allocatable_ = value;
          }
          onChanged();
        } else {
          allocatableBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public Builder clearAllocatable() {
        if (allocatableBuilder_ == null) {
          allocatable_ = null;
          onChanged();
        } else {
          allocatableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder
          getAllocatableBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getAllocatableFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeNodeResourcesOrBuilder
          getAllocatableOrBuilder() {
        if (allocatableBuilder_ != null) {
          return allocatableBuilder_.getMessageOrBuilder();
        } else {
          return allocatable_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeNodeResources.getDefaultInstance()
              : allocatable_;
        }
      }
      /**
       *
       *
       * <pre>
       * allocatable represents the volume resources of a node that are available for scheduling.
       * This field is beta.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeNodeResources allocatable = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeNodeResources,
              io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeNodeResourcesOrBuilder>
          getAllocatableFieldBuilder() {
        if (allocatableBuilder_ == null) {
          allocatableBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeNodeResources,
                  io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeNodeResourcesOrBuilder>(
                  getAllocatable(), getParentForChildren(), isClean());
          allocatable_ = null;
        }
        return allocatableBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.CSINodeDriver)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.CSINodeDriver)
    private static final io.kubernetes.client.proto.V1Storage.CSINodeDriver DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.CSINodeDriver();
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeDriver getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CSINodeDriver> PARSER =
        new com.google.protobuf.AbstractParser<CSINodeDriver>() {
          @java.lang.Override
          public CSINodeDriver parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CSINodeDriver(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CSINodeDriver> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSINodeDriver> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.CSINodeDriver getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CSINodeListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.CSINodeList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.CSINode> getItemsList();
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSINode getItems(int index);
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * CSINodeList is a collection of CSINode objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.CSINodeList}
   */
  public static final class CSINodeList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.CSINodeList)
      CSINodeListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CSINodeList.newBuilder() to construct.
    private CSINodeList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CSINodeList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CSINodeList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.CSINode>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.CSINode.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINodeList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINodeList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.CSINodeList.class,
              io.kubernetes.client.proto.V1Storage.CSINodeList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Storage.CSINode> items_;
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.CSINode> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSINode getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is the list of CSINode
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.CSINodeList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.CSINodeList other =
          (io.kubernetes.client.proto.V1Storage.CSINodeList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.CSINodeList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CSINodeList is a collection of CSINode objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.CSINodeList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.CSINodeList)
        io.kubernetes.client.proto.V1Storage.CSINodeListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.CSINodeList.class,
                io.kubernetes.client.proto.V1Storage.CSINodeList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.CSINodeList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.CSINodeList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeList build() {
        io.kubernetes.client.proto.V1Storage.CSINodeList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeList buildPartial() {
        io.kubernetes.client.proto.V1Storage.CSINodeList result =
            new io.kubernetes.client.proto.V1Storage.CSINodeList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.CSINodeList) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.CSINodeList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.CSINodeList other) {
        if (other == io.kubernetes.client.proto.V1Storage.CSINodeList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.CSINodeList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.CSINodeList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Storage.CSINode> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.CSINode>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSINode,
              io.kubernetes.client.proto.V1Storage.CSINode.Builder,
              io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.CSINode> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINode getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Storage.CSINode value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Storage.CSINode.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Storage.CSINode value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Storage.CSINode value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Storage.CSINode.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Storage.CSINode.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.CSINode> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINode.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINode.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.CSINode.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINode.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Storage.CSINode.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of CSINode
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINode items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.CSINode.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSINode,
              io.kubernetes.client.proto.V1Storage.CSINode.Builder,
              io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.CSINode,
                  io.kubernetes.client.proto.V1Storage.CSINode.Builder,
                  io.kubernetes.client.proto.V1Storage.CSINodeOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.CSINodeList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.CSINodeList)
    private static final io.kubernetes.client.proto.V1Storage.CSINodeList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.CSINodeList();
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CSINodeList> PARSER =
        new com.google.protobuf.AbstractParser<CSINodeList>() {
          @java.lang.Override
          public CSINodeList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CSINodeList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CSINodeList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSINodeList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.CSINodeList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface CSINodeSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.CSINodeSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.CSINodeDriver> getDriversList();
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSINodeDriver getDrivers(int index);
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    int getDriversCount();
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder>
        getDriversOrBuilderList();
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder getDriversOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.CSINodeSpec}
   */
  public static final class CSINodeSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.CSINodeSpec)
      CSINodeSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CSINodeSpec.newBuilder() to construct.
    private CSINodeSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CSINodeSpec() {
      drivers_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CSINodeSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  drivers_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.CSINodeDriver>();
                  mutable_bitField0_ |= 0x00000001;
                }
                drivers_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.CSINodeDriver.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          drivers_ = java.util.Collections.unmodifiableList(drivers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINodeSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_CSINodeSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.CSINodeSpec.class,
              io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder.class);
    }

    public static final int DRIVERS_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.V1Storage.CSINodeDriver> drivers_;
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.CSINodeDriver> getDriversList() {
      return drivers_;
    }
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder>
        getDriversOrBuilderList() {
      return drivers_;
    }
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    public int getDriversCount() {
      return drivers_.size();
    }
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSINodeDriver getDrivers(int index) {
      return drivers_.get(index);
    }
    /**
     *
     *
     * <pre>
     * drivers is a list of information of all CSI Drivers existing on a node.
     * If all drivers in the list are uninstalled, this can become empty.
     * +patchMergeKey=name
     * +patchStrategy=merge
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
     */
    public io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder getDriversOrBuilder(
        int index) {
      return drivers_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < drivers_.size(); i++) {
        output.writeMessage(1, drivers_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < drivers_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, drivers_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.CSINodeSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.CSINodeSpec other =
          (io.kubernetes.client.proto.V1Storage.CSINodeSpec) obj;

      boolean result = true;
      result = result && getDriversList().equals(other.getDriversList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getDriversCount() > 0) {
        hash = (37 * hash) + DRIVERS_FIELD_NUMBER;
        hash = (53 * hash) + getDriversList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.CSINodeSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.CSINodeSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.CSINodeSpec)
        io.kubernetes.client.proto.V1Storage.CSINodeSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.CSINodeSpec.class,
                io.kubernetes.client.proto.V1Storage.CSINodeSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.CSINodeSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getDriversFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (driversBuilder_ == null) {
          drivers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          driversBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_CSINodeSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.CSINodeSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeSpec build() {
        io.kubernetes.client.proto.V1Storage.CSINodeSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.CSINodeSpec buildPartial() {
        io.kubernetes.client.proto.V1Storage.CSINodeSpec result =
            new io.kubernetes.client.proto.V1Storage.CSINodeSpec(this);
        int from_bitField0_ = bitField0_;
        if (driversBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            drivers_ = java.util.Collections.unmodifiableList(drivers_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.drivers_ = drivers_;
        } else {
          result.drivers_ = driversBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.CSINodeSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.CSINodeSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.CSINodeSpec other) {
        if (other == io.kubernetes.client.proto.V1Storage.CSINodeSpec.getDefaultInstance())
          return this;
        if (driversBuilder_ == null) {
          if (!other.drivers_.isEmpty()) {
            if (drivers_.isEmpty()) {
              drivers_ = other.drivers_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDriversIsMutable();
              drivers_.addAll(other.drivers_);
            }
            onChanged();
          }
        } else {
          if (!other.drivers_.isEmpty()) {
            if (driversBuilder_.isEmpty()) {
              driversBuilder_.dispose();
              driversBuilder_ = null;
              drivers_ = other.drivers_;
              bitField0_ = (bitField0_ & ~0x00000001);
              driversBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getDriversFieldBuilder()
                      : null;
            } else {
              driversBuilder_.addAllMessages(other.drivers_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.CSINodeSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.CSINodeSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<io.kubernetes.client.proto.V1Storage.CSINodeDriver> drivers_ =
          java.util.Collections.emptyList();

      private void ensureDriversIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          drivers_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.CSINodeDriver>(drivers_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSINodeDriver,
              io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder,
              io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder>
          driversBuilder_;

      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.CSINodeDriver> getDriversList() {
        if (driversBuilder_ == null) {
          return java.util.Collections.unmodifiableList(drivers_);
        } else {
          return driversBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public int getDriversCount() {
        if (driversBuilder_ == null) {
          return drivers_.size();
        } else {
          return driversBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeDriver getDrivers(int index) {
        if (driversBuilder_ == null) {
          return drivers_.get(index);
        } else {
          return driversBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder setDrivers(
          int index, io.kubernetes.client.proto.V1Storage.CSINodeDriver value) {
        if (driversBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDriversIsMutable();
          drivers_.set(index, value);
          onChanged();
        } else {
          driversBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder setDrivers(
          int index, io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder builderForValue) {
        if (driversBuilder_ == null) {
          ensureDriversIsMutable();
          drivers_.set(index, builderForValue.build());
          onChanged();
        } else {
          driversBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder addDrivers(io.kubernetes.client.proto.V1Storage.CSINodeDriver value) {
        if (driversBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDriversIsMutable();
          drivers_.add(value);
          onChanged();
        } else {
          driversBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder addDrivers(
          int index, io.kubernetes.client.proto.V1Storage.CSINodeDriver value) {
        if (driversBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDriversIsMutable();
          drivers_.add(index, value);
          onChanged();
        } else {
          driversBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder addDrivers(
          io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder builderForValue) {
        if (driversBuilder_ == null) {
          ensureDriversIsMutable();
          drivers_.add(builderForValue.build());
          onChanged();
        } else {
          driversBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder addDrivers(
          int index, io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder builderForValue) {
        if (driversBuilder_ == null) {
          ensureDriversIsMutable();
          drivers_.add(index, builderForValue.build());
          onChanged();
        } else {
          driversBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder addAllDrivers(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.CSINodeDriver> values) {
        if (driversBuilder_ == null) {
          ensureDriversIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, drivers_);
          onChanged();
        } else {
          driversBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder clearDrivers() {
        if (driversBuilder_ == null) {
          drivers_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          driversBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public Builder removeDrivers(int index) {
        if (driversBuilder_ == null) {
          ensureDriversIsMutable();
          drivers_.remove(index);
          onChanged();
        } else {
          driversBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder getDriversBuilder(
          int index) {
        return getDriversFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder getDriversOrBuilder(
          int index) {
        if (driversBuilder_ == null) {
          return drivers_.get(index);
        } else {
          return driversBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder>
          getDriversOrBuilderList() {
        if (driversBuilder_ != null) {
          return driversBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(drivers_);
        }
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder addDriversBuilder() {
        return getDriversFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.CSINodeDriver.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder addDriversBuilder(
          int index) {
        return getDriversFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Storage.CSINodeDriver.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * drivers is a list of information of all CSI Drivers existing on a node.
       * If all drivers in the list are uninstalled, this can become empty.
       * +patchMergeKey=name
       * +patchStrategy=merge
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.CSINodeDriver drivers = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder>
          getDriversBuilderList() {
        return getDriversFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.CSINodeDriver,
              io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder,
              io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder>
          getDriversFieldBuilder() {
        if (driversBuilder_ == null) {
          driversBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.CSINodeDriver,
                  io.kubernetes.client.proto.V1Storage.CSINodeDriver.Builder,
                  io.kubernetes.client.proto.V1Storage.CSINodeDriverOrBuilder>(
                  drivers_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          drivers_ = null;
        }
        return driversBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.CSINodeSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.CSINodeSpec)
    private static final io.kubernetes.client.proto.V1Storage.CSINodeSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.CSINodeSpec();
    }

    public static io.kubernetes.client.proto.V1Storage.CSINodeSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CSINodeSpec> PARSER =
        new com.google.protobuf.AbstractParser<CSINodeSpec>() {
          @java.lang.Override
          public CSINodeSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CSINodeSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CSINodeSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CSINodeSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.CSINodeSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface StorageClassOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.StorageClass)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    boolean hasProvisioner();
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    java.lang.String getProvisioner();
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    com.google.protobuf.ByteString getProvisionerBytes();

    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    int getParametersCount();
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    boolean containsParameters(java.lang.String key);
    /** Use {@link #getParametersMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getParameters();
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getParametersMap();
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    java.lang.String getParametersOrDefault(java.lang.String key, java.lang.String defaultValue);
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    java.lang.String getParametersOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    boolean hasReclaimPolicy();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    java.lang.String getReclaimPolicy();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    com.google.protobuf.ByteString getReclaimPolicyBytes();

    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    java.util.List<java.lang.String> getMountOptionsList();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    int getMountOptionsCount();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    java.lang.String getMountOptions(int index);
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    com.google.protobuf.ByteString getMountOptionsBytes(int index);

    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    boolean hasAllowVolumeExpansion();
    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    boolean getAllowVolumeExpansion();

    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    boolean hasVolumeBindingMode();
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    java.lang.String getVolumeBindingMode();
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    com.google.protobuf.ByteString getVolumeBindingModeBytes();

    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm> getAllowedTopologiesList();
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    io.kubernetes.client.proto.V1.TopologySelectorTerm getAllowedTopologies(int index);
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    int getAllowedTopologiesCount();
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
        getAllowedTopologiesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder getAllowedTopologiesOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * StorageClass describes the parameters for a class of storage for
   * which PersistentVolumes can be dynamically provisioned.
   * StorageClasses are non-namespaced; the name of the storage class
   * according to etcd is in ObjectMeta.Name.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.StorageClass}
   */
  public static final class StorageClass extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.StorageClass)
      StorageClassOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use StorageClass.newBuilder() to construct.
    private StorageClass(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private StorageClass() {
      provisioner_ = "";
      reclaimPolicy_ = "";
      mountOptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      allowVolumeExpansion_ = false;
      volumeBindingMode_ = "";
      allowedTopologies_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private StorageClass(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                provisioner_ = bs;
                break;
              }
            case 26:
              {
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  parameters_ =
                      com.google.protobuf.MapField.newMapField(
                          ParametersDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000004;
                }
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> parameters__ =
                    input.readMessage(
                        ParametersDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                parameters_.getMutableMap().put(parameters__.getKey(), parameters__.getValue());
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                reclaimPolicy_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  mountOptions_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000010;
                }
                mountOptions_.add(bs);
                break;
              }
            case 48:
              {
                bitField0_ |= 0x00000008;
                allowVolumeExpansion_ = input.readBool();
                break;
              }
            case 58:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                volumeBindingMode_ = bs;
                break;
              }
            case 66:
              {
                if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                  allowedTopologies_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1.TopologySelectorTerm>();
                  mutable_bitField0_ |= 0x00000080;
                }
                allowedTopologies_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1.TopologySelectorTerm.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          mountOptions_ = mountOptions_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
          allowedTopologies_ = java.util.Collections.unmodifiableList(allowedTopologies_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetParameters();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.StorageClass.class,
              io.kubernetes.client.proto.V1Storage.StorageClass.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int PROVISIONER_FIELD_NUMBER = 2;
    private volatile java.lang.Object provisioner_;
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    public boolean hasProvisioner() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    public java.lang.String getProvisioner() {
      java.lang.Object ref = provisioner_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          provisioner_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    public com.google.protobuf.ByteString getProvisionerBytes() {
      java.lang.Object ref = provisioner_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        provisioner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMETERS_FIELD_NUMBER = 3;

    private static final class ParametersDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
          com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
              io.kubernetes.client.proto.V1Storage
                  .internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor,
              com.google.protobuf.WireFormat.FieldType.STRING,
              "",
              com.google.protobuf.WireFormat.FieldType.STRING,
              "");
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> parameters_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetParameters() {
      if (parameters_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParametersDefaultEntryHolder.defaultEntry);
      }
      return parameters_;
    }

    public int getParametersCount() {
      return internalGetParameters().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public boolean containsParameters(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetParameters().getMap().containsKey(key);
    }
    /** Use {@link #getParametersMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParameters() {
      return getParametersMap();
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
      return internalGetParameters().getMap();
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public java.lang.String getParametersOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public java.lang.String getParametersOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int RECLAIMPOLICY_FIELD_NUMBER = 4;
    private volatile java.lang.Object reclaimPolicy_;
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    public boolean hasReclaimPolicy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    public java.lang.String getReclaimPolicy() {
      java.lang.Object ref = reclaimPolicy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reclaimPolicy_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    public com.google.protobuf.ByteString getReclaimPolicyBytes() {
      java.lang.Object ref = reclaimPolicy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reclaimPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MOUNTOPTIONS_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList mountOptions_;
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList getMountOptionsList() {
      return mountOptions_;
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public int getMountOptionsCount() {
      return mountOptions_.size();
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public java.lang.String getMountOptions(int index) {
      return mountOptions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public com.google.protobuf.ByteString getMountOptionsBytes(int index) {
      return mountOptions_.getByteString(index);
    }

    public static final int ALLOWVOLUMEEXPANSION_FIELD_NUMBER = 6;
    private boolean allowVolumeExpansion_;
    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    public boolean hasAllowVolumeExpansion() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    public boolean getAllowVolumeExpansion() {
      return allowVolumeExpansion_;
    }

    public static final int VOLUMEBINDINGMODE_FIELD_NUMBER = 7;
    private volatile java.lang.Object volumeBindingMode_;
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    public boolean hasVolumeBindingMode() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    public java.lang.String getVolumeBindingMode() {
      java.lang.Object ref = volumeBindingMode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          volumeBindingMode_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    public com.google.protobuf.ByteString getVolumeBindingModeBytes() {
      java.lang.Object ref = volumeBindingMode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        volumeBindingMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOWEDTOPOLOGIES_FIELD_NUMBER = 8;
    private java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm> allowedTopologies_;
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm>
        getAllowedTopologiesList() {
      return allowedTopologies_;
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
        getAllowedTopologiesOrBuilderList() {
      return allowedTopologies_;
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public int getAllowedTopologiesCount() {
      return allowedTopologies_.size();
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public io.kubernetes.client.proto.V1.TopologySelectorTerm getAllowedTopologies(int index) {
      return allowedTopologies_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * +listType=atomic
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder
        getAllowedTopologiesOrBuilder(int index) {
      return allowedTopologies_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, provisioner_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetParameters(), ParametersDefaultEntryHolder.defaultEntry, 3);
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, reclaimPolicy_);
      }
      for (int i = 0; i < mountOptions_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, mountOptions_.getRaw(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(6, allowVolumeExpansion_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, volumeBindingMode_);
      }
      for (int i = 0; i < allowedTopologies_.size(); i++) {
        output.writeMessage(8, allowedTopologies_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, provisioner_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
          internalGetParameters().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String> parameters__ =
            ParametersDefaultEntryHolder.defaultEntry
                .newBuilderForType()
                .setKey(entry.getKey())
                .setValue(entry.getValue())
                .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, parameters__);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, reclaimPolicy_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mountOptions_.size(); i++) {
          dataSize += computeStringSizeNoTag(mountOptions_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getMountOptionsList().size();
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, allowVolumeExpansion_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, volumeBindingMode_);
      }
      for (int i = 0; i < allowedTopologies_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(8, allowedTopologies_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.StorageClass)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.StorageClass other =
          (io.kubernetes.client.proto.V1Storage.StorageClass) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasProvisioner() == other.hasProvisioner());
      if (hasProvisioner()) {
        result = result && getProvisioner().equals(other.getProvisioner());
      }
      result = result && internalGetParameters().equals(other.internalGetParameters());
      result = result && (hasReclaimPolicy() == other.hasReclaimPolicy());
      if (hasReclaimPolicy()) {
        result = result && getReclaimPolicy().equals(other.getReclaimPolicy());
      }
      result = result && getMountOptionsList().equals(other.getMountOptionsList());
      result = result && (hasAllowVolumeExpansion() == other.hasAllowVolumeExpansion());
      if (hasAllowVolumeExpansion()) {
        result = result && (getAllowVolumeExpansion() == other.getAllowVolumeExpansion());
      }
      result = result && (hasVolumeBindingMode() == other.hasVolumeBindingMode());
      if (hasVolumeBindingMode()) {
        result = result && getVolumeBindingMode().equals(other.getVolumeBindingMode());
      }
      result = result && getAllowedTopologiesList().equals(other.getAllowedTopologiesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasProvisioner()) {
        hash = (37 * hash) + PROVISIONER_FIELD_NUMBER;
        hash = (53 * hash) + getProvisioner().hashCode();
      }
      if (!internalGetParameters().getMap().isEmpty()) {
        hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetParameters().hashCode();
      }
      if (hasReclaimPolicy()) {
        hash = (37 * hash) + RECLAIMPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getReclaimPolicy().hashCode();
      }
      if (getMountOptionsCount() > 0) {
        hash = (37 * hash) + MOUNTOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getMountOptionsList().hashCode();
      }
      if (hasAllowVolumeExpansion()) {
        hash = (37 * hash) + ALLOWVOLUMEEXPANSION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowVolumeExpansion());
      }
      if (hasVolumeBindingMode()) {
        hash = (37 * hash) + VOLUMEBINDINGMODE_FIELD_NUMBER;
        hash = (53 * hash) + getVolumeBindingMode().hashCode();
      }
      if (getAllowedTopologiesCount() > 0) {
        hash = (37 * hash) + ALLOWEDTOPOLOGIES_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedTopologiesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.StorageClass prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * StorageClass describes the parameters for a class of storage for
     * which PersistentVolumes can be dynamically provisioned.
     * StorageClasses are non-namespaced; the name of the storage class
     * according to etcd is in ObjectMeta.Name.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.StorageClass}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.StorageClass)
        io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 3:
            return internalGetParameters();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 3:
            return internalGetMutableParameters();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.StorageClass.class,
                io.kubernetes.client.proto.V1Storage.StorageClass.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.StorageClass.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getAllowedTopologiesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        provisioner_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableParameters().clear();
        reclaimPolicy_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        mountOptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        allowVolumeExpansion_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        volumeBindingMode_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        if (allowedTopologiesBuilder_ == null) {
          allowedTopologies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
        } else {
          allowedTopologiesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClass getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClass build() {
        io.kubernetes.client.proto.V1Storage.StorageClass result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClass buildPartial() {
        io.kubernetes.client.proto.V1Storage.StorageClass result =
            new io.kubernetes.client.proto.V1Storage.StorageClass(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.provisioner_ = provisioner_;
        result.parameters_ = internalGetParameters();
        result.parameters_.makeImmutable();
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.reclaimPolicy_ = reclaimPolicy_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          mountOptions_ = mountOptions_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.mountOptions_ = mountOptions_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000008;
        }
        result.allowVolumeExpansion_ = allowVolumeExpansion_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000010;
        }
        result.volumeBindingMode_ = volumeBindingMode_;
        if (allowedTopologiesBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            allowedTopologies_ = java.util.Collections.unmodifiableList(allowedTopologies_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.allowedTopologies_ = allowedTopologies_;
        } else {
          result.allowedTopologies_ = allowedTopologiesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.StorageClass) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.StorageClass) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.StorageClass other) {
        if (other == io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasProvisioner()) {
          bitField0_ |= 0x00000002;
          provisioner_ = other.provisioner_;
          onChanged();
        }
        internalGetMutableParameters().mergeFrom(other.internalGetParameters());
        if (other.hasReclaimPolicy()) {
          bitField0_ |= 0x00000008;
          reclaimPolicy_ = other.reclaimPolicy_;
          onChanged();
        }
        if (!other.mountOptions_.isEmpty()) {
          if (mountOptions_.isEmpty()) {
            mountOptions_ = other.mountOptions_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureMountOptionsIsMutable();
            mountOptions_.addAll(other.mountOptions_);
          }
          onChanged();
        }
        if (other.hasAllowVolumeExpansion()) {
          setAllowVolumeExpansion(other.getAllowVolumeExpansion());
        }
        if (other.hasVolumeBindingMode()) {
          bitField0_ |= 0x00000040;
          volumeBindingMode_ = other.volumeBindingMode_;
          onChanged();
        }
        if (allowedTopologiesBuilder_ == null) {
          if (!other.allowedTopologies_.isEmpty()) {
            if (allowedTopologies_.isEmpty()) {
              allowedTopologies_ = other.allowedTopologies_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureAllowedTopologiesIsMutable();
              allowedTopologies_.addAll(other.allowedTopologies_);
            }
            onChanged();
          }
        } else {
          if (!other.allowedTopologies_.isEmpty()) {
            if (allowedTopologiesBuilder_.isEmpty()) {
              allowedTopologiesBuilder_.dispose();
              allowedTopologiesBuilder_ = null;
              allowedTopologies_ = other.allowedTopologies_;
              bitField0_ = (bitField0_ & ~0x00000080);
              allowedTopologiesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getAllowedTopologiesFieldBuilder()
                      : null;
            } else {
              allowedTopologiesBuilder_.addAllMessages(other.allowedTopologies_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.StorageClass parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.StorageClass) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.lang.Object provisioner_ = "";
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public boolean hasProvisioner() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public java.lang.String getProvisioner() {
        java.lang.Object ref = provisioner_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            provisioner_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public com.google.protobuf.ByteString getProvisionerBytes() {
        java.lang.Object ref = provisioner_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          provisioner_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public Builder setProvisioner(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        provisioner_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public Builder clearProvisioner() {
        bitField0_ = (bitField0_ & ~0x00000002);
        provisioner_ = getDefaultInstance().getProvisioner();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public Builder setProvisionerBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        provisioner_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String> parameters_;

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetParameters() {
        if (parameters_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ParametersDefaultEntryHolder.defaultEntry);
        }
        return parameters_;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetMutableParameters() {
        onChanged();
        ;
        if (parameters_ == null) {
          parameters_ =
              com.google.protobuf.MapField.newMapField(ParametersDefaultEntryHolder.defaultEntry);
        }
        if (!parameters_.isMutable()) {
          parameters_ = parameters_.copy();
        }
        return parameters_;
      }

      public int getParametersCount() {
        return internalGetParameters().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public boolean containsParameters(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetParameters().getMap().containsKey(key);
      }
      /** Use {@link #getParametersMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return getParametersMap();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
        return internalGetParameters().getMap();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public java.lang.String getParametersOrDefault(
          java.lang.String key, java.lang.String defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public java.lang.String getParametersOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearParameters() {
        internalGetMutableParameters().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public Builder removeParameters(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableParameters().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getMutableParameters() {
        return internalGetMutableParameters().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public Builder putParameters(java.lang.String key, java.lang.String value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableParameters().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public Builder putAllParameters(java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableParameters().getMutableMap().putAll(values);
        return this;
      }

      private java.lang.Object reclaimPolicy_ = "";
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public boolean hasReclaimPolicy() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public java.lang.String getReclaimPolicy() {
        java.lang.Object ref = reclaimPolicy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reclaimPolicy_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public com.google.protobuf.ByteString getReclaimPolicyBytes() {
        java.lang.Object ref = reclaimPolicy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reclaimPolicy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public Builder setReclaimPolicy(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reclaimPolicy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public Builder clearReclaimPolicy() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reclaimPolicy_ = getDefaultInstance().getReclaimPolicy();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public Builder setReclaimPolicyBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reclaimPolicy_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList mountOptions_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureMountOptionsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          mountOptions_ = new com.google.protobuf.LazyStringArrayList(mountOptions_);
          bitField0_ |= 0x00000010;
        }
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public com.google.protobuf.ProtocolStringList getMountOptionsList() {
        return mountOptions_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public int getMountOptionsCount() {
        return mountOptions_.size();
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public java.lang.String getMountOptions(int index) {
        return mountOptions_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public com.google.protobuf.ByteString getMountOptionsBytes(int index) {
        return mountOptions_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder setMountOptions(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMountOptionsIsMutable();
        mountOptions_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder addMountOptions(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMountOptionsIsMutable();
        mountOptions_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder addAllMountOptions(java.lang.Iterable<java.lang.String> values) {
        ensureMountOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mountOptions_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder clearMountOptions() {
        mountOptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder addMountOptionsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMountOptionsIsMutable();
        mountOptions_.add(value);
        onChanged();
        return this;
      }

      private boolean allowVolumeExpansion_;
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public boolean hasAllowVolumeExpansion() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public boolean getAllowVolumeExpansion() {
        return allowVolumeExpansion_;
      }
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public Builder setAllowVolumeExpansion(boolean value) {
        bitField0_ |= 0x00000020;
        allowVolumeExpansion_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public Builder clearAllowVolumeExpansion() {
        bitField0_ = (bitField0_ & ~0x00000020);
        allowVolumeExpansion_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object volumeBindingMode_ = "";
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public boolean hasVolumeBindingMode() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public java.lang.String getVolumeBindingMode() {
        java.lang.Object ref = volumeBindingMode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            volumeBindingMode_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public com.google.protobuf.ByteString getVolumeBindingModeBytes() {
        java.lang.Object ref = volumeBindingMode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          volumeBindingMode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public Builder setVolumeBindingMode(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        volumeBindingMode_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public Builder clearVolumeBindingMode() {
        bitField0_ = (bitField0_ & ~0x00000040);
        volumeBindingMode_ = getDefaultInstance().getVolumeBindingMode();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public Builder setVolumeBindingModeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        volumeBindingMode_ = value;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm>
          allowedTopologies_ = java.util.Collections.emptyList();

      private void ensureAllowedTopologiesIsMutable() {
        if (!((bitField0_ & 0x00000080) == 0x00000080)) {
          allowedTopologies_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1.TopologySelectorTerm>(
                  allowedTopologies_);
          bitField0_ |= 0x00000080;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.TopologySelectorTerm,
              io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder,
              io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
          allowedTopologiesBuilder_;

      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm>
          getAllowedTopologiesList() {
        if (allowedTopologiesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allowedTopologies_);
        } else {
          return allowedTopologiesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public int getAllowedTopologiesCount() {
        if (allowedTopologiesBuilder_ == null) {
          return allowedTopologies_.size();
        } else {
          return allowedTopologiesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm getAllowedTopologies(int index) {
        if (allowedTopologiesBuilder_ == null) {
          return allowedTopologies_.get(index);
        } else {
          return allowedTopologiesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder setAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm value) {
        if (allowedTopologiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.set(index, value);
          onChanged();
        } else {
          allowedTopologiesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder setAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder builderForValue) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.set(index, builderForValue.build());
          onChanged();
        } else {
          allowedTopologiesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          io.kubernetes.client.proto.V1.TopologySelectorTerm value) {
        if (allowedTopologiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(value);
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm value) {
        if (allowedTopologiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(index, value);
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder builderForValue) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(builderForValue.build());
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder builderForValue) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(index, builderForValue.build());
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllAllowedTopologies(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1.TopologySelectorTerm> values) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedTopologies_);
          onChanged();
        } else {
          allowedTopologiesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder clearAllowedTopologies() {
        if (allowedTopologiesBuilder_ == null) {
          allowedTopologies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          allowedTopologiesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder removeAllowedTopologies(int index) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.remove(index);
          onChanged();
        } else {
          allowedTopologiesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder getAllowedTopologiesBuilder(
          int index) {
        return getAllowedTopologiesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder
          getAllowedTopologiesOrBuilder(int index) {
        if (allowedTopologiesBuilder_ == null) {
          return allowedTopologies_.get(index);
        } else {
          return allowedTopologiesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
          getAllowedTopologiesOrBuilderList() {
        if (allowedTopologiesBuilder_ != null) {
          return allowedTopologiesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allowedTopologies_);
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder
          addAllowedTopologiesBuilder() {
        return getAllowedTopologiesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1.TopologySelectorTerm.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder addAllowedTopologiesBuilder(
          int index) {
        return getAllowedTopologiesFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1.TopologySelectorTerm.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * +listType=atomic
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder>
          getAllowedTopologiesBuilderList() {
        return getAllowedTopologiesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.TopologySelectorTerm,
              io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder,
              io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
          getAllowedTopologiesFieldBuilder() {
        if (allowedTopologiesBuilder_ == null) {
          allowedTopologiesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1.TopologySelectorTerm,
                  io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder,
                  io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>(
                  allowedTopologies_,
                  ((bitField0_ & 0x00000080) == 0x00000080),
                  getParentForChildren(),
                  isClean());
          allowedTopologies_ = null;
        }
        return allowedTopologiesBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.StorageClass)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.StorageClass)
    private static final io.kubernetes.client.proto.V1Storage.StorageClass DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.StorageClass();
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<StorageClass> PARSER =
        new com.google.protobuf.AbstractParser<StorageClass>() {
          @java.lang.Override
          public StorageClass parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new StorageClass(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<StorageClass> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StorageClass> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.StorageClass getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface StorageClassListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.StorageClassList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.StorageClass getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * StorageClassList is a collection of storage classes.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.StorageClassList}
   */
  public static final class StorageClassList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.StorageClassList)
      StorageClassListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use StorageClassList.newBuilder() to construct.
    private StorageClassList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private StorageClassList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private StorageClassList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.StorageClass>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.StorageClass.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.StorageClassList.class,
              io.kubernetes.client.proto.V1Storage.StorageClassList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> items_;
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.StorageClass getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.StorageClassList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.StorageClassList other =
          (io.kubernetes.client.proto.V1Storage.StorageClassList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Storage.StorageClassList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * StorageClassList is a collection of storage classes.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.StorageClassList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.StorageClassList)
        io.kubernetes.client.proto.V1Storage.StorageClassListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.StorageClassList.class,
                io.kubernetes.client.proto.V1Storage.StorageClassList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.StorageClassList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClassList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.StorageClassList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClassList build() {
        io.kubernetes.client.proto.V1Storage.StorageClassList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClassList buildPartial() {
        io.kubernetes.client.proto.V1Storage.StorageClassList result =
            new io.kubernetes.client.proto.V1Storage.StorageClassList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.StorageClassList) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.StorageClassList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.StorageClassList other) {
        if (other == io.kubernetes.client.proto.V1Storage.StorageClassList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.StorageClassList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.StorageClassList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.StorageClass>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.StorageClass,
              io.kubernetes.client.proto.V1Storage.StorageClass.Builder,
              io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Storage.StorageClass value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Storage.StorageClass.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Storage.StorageClass value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Storage.StorageClass value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Storage.StorageClass.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Storage.StorageClass.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.StorageClass> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder getItemsOrBuilder(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.StorageClass,
              io.kubernetes.client.proto.V1Storage.StorageClass.Builder,
              io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.StorageClass,
                  io.kubernetes.client.proto.V1Storage.StorageClass.Builder,
                  io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.StorageClassList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.StorageClassList)
    private static final io.kubernetes.client.proto.V1Storage.StorageClassList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.StorageClassList();
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<StorageClassList> PARSER =
        new com.google.protobuf.AbstractParser<StorageClassList>() {
          @java.lang.Override
          public StorageClassList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new StorageClassList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<StorageClassList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StorageClassList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.StorageClassList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface TokenRequestOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.TokenRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Audience is the intended audience of the token in "TokenRequestSpec".
     * It will default to the audiences of kube apiserver.
     * </pre>
     *
     * <code>optional string audience = 1;</code>
     */
    boolean hasAudience();
    /**
     *
     *
     * <pre>
     * Audience is the intended audience of the token in "TokenRequestSpec".
     * It will default to the audiences of kube apiserver.
     * </pre>
     *
     * <code>optional string audience = 1;</code>
     */
    java.lang.String getAudience();
    /**
     *
     *
     * <pre>
     * Audience is the intended audience of the token in "TokenRequestSpec".
     * It will default to the audiences of kube apiserver.
     * </pre>
     *
     * <code>optional string audience = 1;</code>
     */
    com.google.protobuf.ByteString getAudienceBytes();

    /**
     *
     *
     * <pre>
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
     * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
     * +optional
     * </pre>
     *
     * <code>optional int64 expirationSeconds = 2;</code>
     */
    boolean hasExpirationSeconds();
    /**
     *
     *
     * <pre>
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
     * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
     * +optional
     * </pre>
     *
     * <code>optional int64 expirationSeconds = 2;</code>
     */
    long getExpirationSeconds();
  }
  /**
   *
   *
   * <pre>
   * TokenRequest contains parameters of a service account token.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.TokenRequest}
   */
  public static final class TokenRequest extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.TokenRequest)
      TokenRequestOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use TokenRequest.newBuilder() to construct.
    private TokenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TokenRequest() {
      audience_ = "";
      expirationSeconds_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TokenRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                audience_ = bs;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                expirationSeconds_ = input.readInt64();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_TokenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_TokenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.TokenRequest.class,
              io.kubernetes.client.proto.V1Storage.TokenRequest.Builder.class);
    }

    private int bitField0_;
    public static final int AUDIENCE_FIELD_NUMBER = 1;
    private volatile java.lang.Object audience_;
    /**
     *
     *
     * <pre>
     * Audience is the intended audience of the token in "TokenRequestSpec".
     * It will default to the audiences of kube apiserver.
     * </pre>
     *
     * <code>optional string audience = 1;</code>
     */
    public boolean hasAudience() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Audience is the intended audience of the token in "TokenRequestSpec".
     * It will default to the audiences of kube apiserver.
     * </pre>
     *
     * <code>optional string audience = 1;</code>
     */
    public java.lang.String getAudience() {
      java.lang.Object ref = audience_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          audience_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Audience is the intended audience of the token in "TokenRequestSpec".
     * It will default to the audiences of kube apiserver.
     * </pre>
     *
     * <code>optional string audience = 1;</code>
     */
    public com.google.protobuf.ByteString getAudienceBytes() {
      java.lang.Object ref = audience_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        audience_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXPIRATIONSECONDS_FIELD_NUMBER = 2;
    private long expirationSeconds_;
    /**
     *
     *
     * <pre>
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
     * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
     * +optional
     * </pre>
     *
     * <code>optional int64 expirationSeconds = 2;</code>
     */
    public boolean hasExpirationSeconds() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
     * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
     * +optional
     * </pre>
     *
     * <code>optional int64 expirationSeconds = 2;</code>
     */
    public long getExpirationSeconds() {
      return expirationSeconds_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, audience_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, expirationSeconds_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, audience_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, expirationSeconds_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.TokenRequest)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.TokenRequest other =
          (io.kubernetes.client.proto.V1Storage.TokenRequest) obj;

      boolean result = true;
      result = result && (hasAudience() == other.hasAudience());
      if (hasAudience()) {
        result = result && getAudience().equals(other.getAudience());
      }
      result = result && (hasExpirationSeconds() == other.hasExpirationSeconds());
      if (hasExpirationSeconds()) {
        result = result && (getExpirationSeconds() == other.getExpirationSeconds());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAudience()) {
        hash = (37 * hash) + AUDIENCE_FIELD_NUMBER;
        hash = (53 * hash) + getAudience().hashCode();
      }
      if (hasExpirationSeconds()) {
        hash = (37 * hash) + EXPIRATIONSECONDS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getExpirationSeconds());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.TokenRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * TokenRequest contains parameters of a service account token.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.TokenRequest}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.TokenRequest)
        io.kubernetes.client.proto.V1Storage.TokenRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_TokenRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_TokenRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.TokenRequest.class,
                io.kubernetes.client.proto.V1Storage.TokenRequest.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.TokenRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        audience_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        expirationSeconds_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_TokenRequest_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.TokenRequest getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.TokenRequest.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.TokenRequest build() {
        io.kubernetes.client.proto.V1Storage.TokenRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.TokenRequest buildPartial() {
        io.kubernetes.client.proto.V1Storage.TokenRequest result =
            new io.kubernetes.client.proto.V1Storage.TokenRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.audience_ = audience_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.expirationSeconds_ = expirationSeconds_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.TokenRequest) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.TokenRequest) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.TokenRequest other) {
        if (other == io.kubernetes.client.proto.V1Storage.TokenRequest.getDefaultInstance())
          return this;
        if (other.hasAudience()) {
          bitField0_ |= 0x00000001;
          audience_ = other.audience_;
          onChanged();
        }
        if (other.hasExpirationSeconds()) {
          setExpirationSeconds(other.getExpirationSeconds());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.TokenRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.TokenRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object audience_ = "";
      /**
       *
       *
       * <pre>
       * Audience is the intended audience of the token in "TokenRequestSpec".
       * It will default to the audiences of kube apiserver.
       * </pre>
       *
       * <code>optional string audience = 1;</code>
       */
      public boolean hasAudience() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Audience is the intended audience of the token in "TokenRequestSpec".
       * It will default to the audiences of kube apiserver.
       * </pre>
       *
       * <code>optional string audience = 1;</code>
       */
      public java.lang.String getAudience() {
        java.lang.Object ref = audience_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            audience_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Audience is the intended audience of the token in "TokenRequestSpec".
       * It will default to the audiences of kube apiserver.
       * </pre>
       *
       * <code>optional string audience = 1;</code>
       */
      public com.google.protobuf.ByteString getAudienceBytes() {
        java.lang.Object ref = audience_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          audience_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Audience is the intended audience of the token in "TokenRequestSpec".
       * It will default to the audiences of kube apiserver.
       * </pre>
       *
       * <code>optional string audience = 1;</code>
       */
      public Builder setAudience(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        audience_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audience is the intended audience of the token in "TokenRequestSpec".
       * It will default to the audiences of kube apiserver.
       * </pre>
       *
       * <code>optional string audience = 1;</code>
       */
      public Builder clearAudience() {
        bitField0_ = (bitField0_ & ~0x00000001);
        audience_ = getDefaultInstance().getAudience();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Audience is the intended audience of the token in "TokenRequestSpec".
       * It will default to the audiences of kube apiserver.
       * </pre>
       *
       * <code>optional string audience = 1;</code>
       */
      public Builder setAudienceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        audience_ = value;
        onChanged();
        return this;
      }

      private long expirationSeconds_;
      /**
       *
       *
       * <pre>
       * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
       * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
       * +optional
       * </pre>
       *
       * <code>optional int64 expirationSeconds = 2;</code>
       */
      public boolean hasExpirationSeconds() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
       * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
       * +optional
       * </pre>
       *
       * <code>optional int64 expirationSeconds = 2;</code>
       */
      public long getExpirationSeconds() {
        return expirationSeconds_;
      }
      /**
       *
       *
       * <pre>
       * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
       * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
       * +optional
       * </pre>
       *
       * <code>optional int64 expirationSeconds = 2;</code>
       */
      public Builder setExpirationSeconds(long value) {
        bitField0_ |= 0x00000002;
        expirationSeconds_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec".
       * It has the same default value of "ExpirationSeconds" in "TokenRequestSpec".
       * +optional
       * </pre>
       *
       * <code>optional int64 expirationSeconds = 2;</code>
       */
      public Builder clearExpirationSeconds() {
        bitField0_ = (bitField0_ & ~0x00000002);
        expirationSeconds_ = 0L;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.TokenRequest)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.TokenRequest)
    private static final io.kubernetes.client.proto.V1Storage.TokenRequest DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.TokenRequest();
    }

    public static io.kubernetes.client.proto.V1Storage.TokenRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<TokenRequest> PARSER =
        new com.google.protobuf.AbstractParser<TokenRequest>() {
          @java.lang.Override
          public TokenRequest parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TokenRequest(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<TokenRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TokenRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.TokenRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachment)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachment captures the intent to attach or detach the specified volume
   * to/from the specified node.
   * VolumeAttachment objects are non-namespaced.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachment}
   */
  public static final class VolumeAttachment extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachment)
      VolumeAttachmentOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachment.newBuilder() to construct.
    private VolumeAttachment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachment() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachment(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus status_;
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
          : status_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachment)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachment other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachment) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Storage.VolumeAttachment prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * VolumeAttachment captures the intent to attach or detach the specified volume
     * to/from the specified node.
     * VolumeAttachment objects are non-namespaced.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachment}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachment)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachment.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeAttachment.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachment result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachment result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachment(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachment) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachment) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachment other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.VolumeAttachment parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachment) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachment)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachment)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachment DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachment();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachment> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachment>() {
          @java.lang.Override
          public VolumeAttachment parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachment(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachment> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachment> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachment getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachment getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentList is a collection of VolumeAttachment objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentList}
   */
  public static final class VolumeAttachmentList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentList)
      VolumeAttachmentListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentList.newBuilder() to construct.
    private VolumeAttachmentList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Storage.VolumeAttachment>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachment.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> items_;
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachment getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder getItemsOrBuilder(
        int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentList other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * VolumeAttachmentList is a collection of VolumeAttachment objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentList)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentList other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.VolumeAttachment>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachment,
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Storage.VolumeAttachment value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Storage.VolumeAttachment value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Storage.VolumeAttachment value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.VolumeAttachment>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder getItemsOrBuilder(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachment,
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachment,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentList)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentList();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentList> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentList>() {
          @java.lang.Override
          public VolumeAttachmentList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    boolean hasPersistentVolumeName();
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    java.lang.String getPersistentVolumeName();
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    com.google.protobuf.ByteString getPersistentVolumeNameBytes();

    /**
     *
     *
     * <pre>
     * inlineVolumeSpec contains all the information necessary to attach
     * a persistent volume defined by a pod's inline VolumeSource. This field
     * is populated only for the CSIMigration feature. It contains
     * translated fields from a pod's inline VolumeSource to a
     * PersistentVolumeSpec. This field is beta-level and is only
     * honored by servers that enabled the CSIMigration feature.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
     */
    boolean hasInlineVolumeSpec();
    /**
     *
     *
     * <pre>
     * inlineVolumeSpec contains all the information necessary to attach
     * a persistent volume defined by a pod's inline VolumeSource. This field
     * is populated only for the CSIMigration feature. It contains
     * translated fields from a pod's inline VolumeSource to a
     * PersistentVolumeSpec. This field is beta-level and is only
     * honored by servers that enabled the CSIMigration feature.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
     */
    io.kubernetes.client.proto.V1.PersistentVolumeSpec getInlineVolumeSpec();
    /**
     *
     *
     * <pre>
     * inlineVolumeSpec contains all the information necessary to attach
     * a persistent volume defined by a pod's inline VolumeSource. This field
     * is populated only for the CSIMigration feature. It contains
     * translated fields from a pod's inline VolumeSource to a
     * PersistentVolumeSpec. This field is beta-level and is only
     * honored by servers that enabled the CSIMigration feature.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
     */
    io.kubernetes.client.proto.V1.PersistentVolumeSpecOrBuilder getInlineVolumeSpecOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentSource represents a volume that should be attached.
   * Right now only PersistenVolumes can be attached via external attacher,
   * in future we may allow also inline volumes in pods.
   * Exactly one member can be set.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSource}
   */
  public static final class VolumeAttachmentSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentSource)
      VolumeAttachmentSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentSource.newBuilder() to construct.
    private VolumeAttachmentSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentSource() {
      persistentVolumeName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                persistentVolumeName_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1.PersistentVolumeSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = inlineVolumeSpec_.toBuilder();
                }
                inlineVolumeSpec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1.PersistentVolumeSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(inlineVolumeSpec_);
                  inlineVolumeSpec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder.class);
    }

    private int bitField0_;
    public static final int PERSISTENTVOLUMENAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object persistentVolumeName_;
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    public boolean hasPersistentVolumeName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    public java.lang.String getPersistentVolumeName() {
      java.lang.Object ref = persistentVolumeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          persistentVolumeName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    public com.google.protobuf.ByteString getPersistentVolumeNameBytes() {
      java.lang.Object ref = persistentVolumeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        persistentVolumeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INLINEVOLUMESPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1.PersistentVolumeSpec inlineVolumeSpec_;
    /**
     *
     *
     * <pre>
     * inlineVolumeSpec contains all the information necessary to attach
     * a persistent volume defined by a pod's inline VolumeSource. This field
     * is populated only for the CSIMigration feature. It contains
     * translated fields from a pod's inline VolumeSource to a
     * PersistentVolumeSpec. This field is beta-level and is only
     * honored by servers that enabled the CSIMigration feature.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
     */
    public boolean hasInlineVolumeSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * inlineVolumeSpec contains all the information necessary to attach
     * a persistent volume defined by a pod's inline VolumeSource. This field
     * is populated only for the CSIMigration feature. It contains
     * translated fields from a pod's inline VolumeSource to a
     * PersistentVolumeSpec. This field is beta-level and is only
     * honored by servers that enabled the CSIMigration feature.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
     */
    public io.kubernetes.client.proto.V1.PersistentVolumeSpec getInlineVolumeSpec() {
      return inlineVolumeSpec_ == null
          ? io.kubernetes.client.proto.V1.PersistentVolumeSpec.getDefaultInstance()
          : inlineVolumeSpec_;
    }
    /**
     *
     *
     * <pre>
     * inlineVolumeSpec contains all the information necessary to attach
     * a persistent volume defined by a pod's inline VolumeSource. This field
     * is populated only for the CSIMigration feature. It contains
     * translated fields from a pod's inline VolumeSource to a
     * PersistentVolumeSpec. This field is beta-level and is only
     * honored by servers that enabled the CSIMigration feature.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
     */
    public io.kubernetes.client.proto.V1.PersistentVolumeSpecOrBuilder
        getInlineVolumeSpecOrBuilder() {
      return inlineVolumeSpec_ == null
          ? io.kubernetes.client.proto.V1.PersistentVolumeSpec.getDefaultInstance()
          : inlineVolumeSpec_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, persistentVolumeName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getInlineVolumeSpec());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, persistentVolumeName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getInlineVolumeSpec());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource) obj;

      boolean result = true;
      result = result && (hasPersistentVolumeName() == other.hasPersistentVolumeName());
      if (hasPersistentVolumeName()) {
        result = result && getPersistentVolumeName().equals(other.getPersistentVolumeName());
      }
      result = result && (hasInlineVolumeSpec() == other.hasInlineVolumeSpec());
      if (hasInlineVolumeSpec()) {
        result = result && getInlineVolumeSpec().equals(other.getInlineVolumeSpec());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPersistentVolumeName()) {
        hash = (37 * hash) + PERSISTENTVOLUMENAME_FIELD_NUMBER;
        hash = (53 * hash) + getPersistentVolumeName().hashCode();
      }
      if (hasInlineVolumeSpec()) {
        hash = (37 * hash) + INLINEVOLUMESPEC_FIELD_NUMBER;
        hash = (53 * hash) + getInlineVolumeSpec().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * VolumeAttachmentSource represents a volume that should be attached.
     * Right now only PersistenVolumes can be attached via external attacher,
     * in future we may allow also inline volumes in pods.
     * Exactly one member can be set.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentSource)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getInlineVolumeSpecFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        persistentVolumeName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (inlineVolumeSpecBuilder_ == null) {
          inlineVolumeSpec_ = null;
        } else {
          inlineVolumeSpecBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.persistentVolumeName_ = persistentVolumeName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (inlineVolumeSpecBuilder_ == null) {
          result.inlineVolumeSpec_ = inlineVolumeSpec_;
        } else {
          result.inlineVolumeSpec_ = inlineVolumeSpecBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource other) {
        if (other
            == io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance())
          return this;
        if (other.hasPersistentVolumeName()) {
          bitField0_ |= 0x00000001;
          persistentVolumeName_ = other.persistentVolumeName_;
          onChanged();
        }
        if (other.hasInlineVolumeSpec()) {
          mergeInlineVolumeSpec(other.getInlineVolumeSpec());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object persistentVolumeName_ = "";
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public boolean hasPersistentVolumeName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public java.lang.String getPersistentVolumeName() {
        java.lang.Object ref = persistentVolumeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            persistentVolumeName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public com.google.protobuf.ByteString getPersistentVolumeNameBytes() {
        java.lang.Object ref = persistentVolumeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          persistentVolumeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public Builder setPersistentVolumeName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        persistentVolumeName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public Builder clearPersistentVolumeName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        persistentVolumeName_ = getDefaultInstance().getPersistentVolumeName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public Builder setPersistentVolumeNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        persistentVolumeName_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1.PersistentVolumeSpec inlineVolumeSpec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1.PersistentVolumeSpec,
              io.kubernetes.client.proto.V1.PersistentVolumeSpec.Builder,
              io.kubernetes.client.proto.V1.PersistentVolumeSpecOrBuilder>
          inlineVolumeSpecBuilder_;
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public boolean hasInlineVolumeSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public io.kubernetes.client.proto.V1.PersistentVolumeSpec getInlineVolumeSpec() {
        if (inlineVolumeSpecBuilder_ == null) {
          return inlineVolumeSpec_ == null
              ? io.kubernetes.client.proto.V1.PersistentVolumeSpec.getDefaultInstance()
              : inlineVolumeSpec_;
        } else {
          return inlineVolumeSpecBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public Builder setInlineVolumeSpec(io.kubernetes.client.proto.V1.PersistentVolumeSpec value) {
        if (inlineVolumeSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          inlineVolumeSpec_ = value;
          onChanged();
        } else {
          inlineVolumeSpecBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public Builder setInlineVolumeSpec(
          io.kubernetes.client.proto.V1.PersistentVolumeSpec.Builder builderForValue) {
        if (inlineVolumeSpecBuilder_ == null) {
          inlineVolumeSpec_ = builderForValue.build();
          onChanged();
        } else {
          inlineVolumeSpecBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public Builder mergeInlineVolumeSpec(
          io.kubernetes.client.proto.V1.PersistentVolumeSpec value) {
        if (inlineVolumeSpecBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && inlineVolumeSpec_ != null
              && inlineVolumeSpec_
                  != io.kubernetes.client.proto.V1.PersistentVolumeSpec.getDefaultInstance()) {
            inlineVolumeSpec_ =
                io.kubernetes.client.proto.V1.PersistentVolumeSpec.newBuilder(inlineVolumeSpec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            inlineVolumeSpec_ = value;
          }
          onChanged();
        } else {
          inlineVolumeSpecBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public Builder clearInlineVolumeSpec() {
        if (inlineVolumeSpecBuilder_ == null) {
          inlineVolumeSpec_ = null;
          onChanged();
        } else {
          inlineVolumeSpecBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public io.kubernetes.client.proto.V1.PersistentVolumeSpec.Builder
          getInlineVolumeSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getInlineVolumeSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      public io.kubernetes.client.proto.V1.PersistentVolumeSpecOrBuilder
          getInlineVolumeSpecOrBuilder() {
        if (inlineVolumeSpecBuilder_ != null) {
          return inlineVolumeSpecBuilder_.getMessageOrBuilder();
        } else {
          return inlineVolumeSpec_ == null
              ? io.kubernetes.client.proto.V1.PersistentVolumeSpec.getDefaultInstance()
              : inlineVolumeSpec_;
        }
      }
      /**
       *
       *
       * <pre>
       * inlineVolumeSpec contains all the information necessary to attach
       * a persistent volume defined by a pod's inline VolumeSource. This field
       * is populated only for the CSIMigration feature. It contains
       * translated fields from a pod's inline VolumeSource to a
       * PersistentVolumeSpec. This field is beta-level and is only
       * honored by servers that enabled the CSIMigration feature.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.core.v1.PersistentVolumeSpec inlineVolumeSpec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1.PersistentVolumeSpec,
              io.kubernetes.client.proto.V1.PersistentVolumeSpec.Builder,
              io.kubernetes.client.proto.V1.PersistentVolumeSpecOrBuilder>
          getInlineVolumeSpecFieldBuilder() {
        if (inlineVolumeSpecBuilder_ == null) {
          inlineVolumeSpecBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1.PersistentVolumeSpec,
                  io.kubernetes.client.proto.V1.PersistentVolumeSpec.Builder,
                  io.kubernetes.client.proto.V1.PersistentVolumeSpecOrBuilder>(
                  getInlineVolumeSpec(), getParentForChildren(), isClean());
          inlineVolumeSpec_ = null;
        }
        return inlineVolumeSpecBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentSource)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentSource> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentSource>() {
          @java.lang.Override
          public VolumeAttachmentSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    boolean hasAttacher();
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    java.lang.String getAttacher();
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    com.google.protobuf.ByteString getAttacherBytes();

    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    boolean hasSource();
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getSource();
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder getSourceOrBuilder();

    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    boolean hasNodeName();
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    java.lang.String getNodeName();
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    com.google.protobuf.ByteString getNodeNameBytes();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSpec}
   */
  public static final class VolumeAttachmentSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentSpec)
      VolumeAttachmentSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentSpec.newBuilder() to construct.
    private VolumeAttachmentSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentSpec() {
      attacher_ = "";
      nodeName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                attacher_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = source_.toBuilder();
                }
                source_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(source_);
                  source_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                nodeName_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder.class);
    }

    private int bitField0_;
    public static final int ATTACHER_FIELD_NUMBER = 1;
    private volatile java.lang.Object attacher_;
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    public boolean hasAttacher() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    public java.lang.String getAttacher() {
      java.lang.Object ref = attacher_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          attacher_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    public com.google.protobuf.ByteString getAttacherBytes() {
      java.lang.Object ref = attacher_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        attacher_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SOURCE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource source_;
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getSource() {
      return source_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
          : source_;
    }
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder
        getSourceOrBuilder() {
      return source_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
          : source_;
    }

    public static final int NODENAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object nodeName_;
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    public boolean hasNodeName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    public java.lang.String getNodeName() {
      java.lang.Object ref = nodeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nodeName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    public com.google.protobuf.ByteString getNodeNameBytes() {
      java.lang.Object ref = nodeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nodeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attacher_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSource());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nodeName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attacher_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSource());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nodeName_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) obj;

      boolean result = true;
      result = result && (hasAttacher() == other.hasAttacher());
      if (hasAttacher()) {
        result = result && getAttacher().equals(other.getAttacher());
      }
      result = result && (hasSource() == other.hasSource());
      if (hasSource()) {
        result = result && getSource().equals(other.getSource());
      }
      result = result && (hasNodeName() == other.hasNodeName());
      if (hasNodeName()) {
        result = result && getNodeName().equals(other.getNodeName());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAttacher()) {
        hash = (37 * hash) + ATTACHER_FIELD_NUMBER;
        hash = (53 * hash) + getAttacher().hashCode();
      }
      if (hasSource()) {
        hash = (37 * hash) + SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSource().hashCode();
      }
      if (hasNodeName()) {
        hash = (37 * hash) + NODENAME_FIELD_NUMBER;
        hash = (53 * hash) + getNodeName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentSpec)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getSourceFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        attacher_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (sourceBuilder_ == null) {
          source_ = null;
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        nodeName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.attacher_ = attacher_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (sourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = sourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.nodeName_ = nodeName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance())
          return this;
        if (other.hasAttacher()) {
          bitField0_ |= 0x00000001;
          attacher_ = other.attacher_;
          onChanged();
        }
        if (other.hasSource()) {
          mergeSource(other.getSource());
        }
        if (other.hasNodeName()) {
          bitField0_ |= 0x00000004;
          nodeName_ = other.nodeName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object attacher_ = "";
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public boolean hasAttacher() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public java.lang.String getAttacher() {
        java.lang.Object ref = attacher_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            attacher_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public com.google.protobuf.ByteString getAttacherBytes() {
        java.lang.Object ref = attacher_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          attacher_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public Builder setAttacher(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        attacher_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public Builder clearAttacher() {
        bitField0_ = (bitField0_ & ~0x00000001);
        attacher_ = getDefaultInstance().getAttacher();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public Builder setAttacherBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        attacher_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource source_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder>
          sourceBuilder_;
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public boolean hasSource() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getSource() {
        if (sourceBuilder_ == null) {
          return source_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
              : source_;
        } else {
          return sourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder setSource(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource value) {
        if (sourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          source_ = value;
          onChanged();
        } else {
          sourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder setSource(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder builderForValue) {
        if (sourceBuilder_ == null) {
          source_ = builderForValue.build();
          onChanged();
        } else {
          sourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder mergeSource(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource value) {
        if (sourceBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && source_ != null
              && source_
                  != io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource
                      .getDefaultInstance()) {
            source_ =
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.newBuilder(source_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            source_ = value;
          }
          onChanged();
        } else {
          sourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder clearSource() {
        if (sourceBuilder_ == null) {
          source_ = null;
          onChanged();
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder
          getSourceBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder
          getSourceOrBuilder() {
        if (sourceBuilder_ != null) {
          return sourceBuilder_.getMessageOrBuilder();
        } else {
          return source_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
              : source_;
        }
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder>
          getSourceFieldBuilder() {
        if (sourceBuilder_ == null) {
          sourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder>(
                  getSource(), getParentForChildren(), isClean());
          source_ = null;
        }
        return sourceBuilder_;
      }

      private java.lang.Object nodeName_ = "";
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public boolean hasNodeName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public java.lang.String getNodeName() {
        java.lang.Object ref = nodeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nodeName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public com.google.protobuf.ByteString getNodeNameBytes() {
        java.lang.Object ref = nodeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          nodeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public Builder setNodeName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        nodeName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public Builder clearNodeName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        nodeName_ = getDefaultInstance().getNodeName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public Builder setNodeNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        nodeName_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentSpec)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentSpec> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentSpec>() {
          @java.lang.Override
          public VolumeAttachmentSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    boolean hasAttached();
    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    boolean getAttached();

    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    int getAttachmentMetadataCount();
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    boolean containsAttachmentMetadata(java.lang.String key);
    /** Use {@link #getAttachmentMetadataMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata();
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadataMap();
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    java.lang.String getAttachmentMetadataOrDefault(
        java.lang.String key, java.lang.String defaultValue);
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    java.lang.String getAttachmentMetadataOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    boolean hasAttachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeError getAttachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getAttachErrorOrBuilder();

    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    boolean hasDetachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeError getDetachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getDetachErrorOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentStatus is the status of a VolumeAttachment request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentStatus}
   */
  public static final class VolumeAttachmentStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentStatus)
      VolumeAttachmentStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentStatus.newBuilder() to construct.
    private VolumeAttachmentStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentStatus() {
      attached_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                bitField0_ |= 0x00000001;
                attached_ = input.readBool();
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  attachmentMetadata_ =
                      com.google.protobuf.MapField.newMapField(
                          AttachmentMetadataDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000002;
                }
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
                    attachmentMetadata__ =
                        input.readMessage(
                            AttachmentMetadataDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                attachmentMetadata_
                    .getMutableMap()
                    .put(attachmentMetadata__.getKey(), attachmentMetadata__.getValue());
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Storage.VolumeError.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = attachError_.toBuilder();
                }
                attachError_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeError.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(attachError_);
                  attachError_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.V1Storage.VolumeError.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = detachError_.toBuilder();
                }
                detachError_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeError.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(detachError_);
                  detachError_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetAttachmentMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder.class);
    }

    private int bitField0_;
    public static final int ATTACHED_FIELD_NUMBER = 1;
    private boolean attached_;
    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    public boolean hasAttached() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    public boolean getAttached() {
      return attached_;
    }

    public static final int ATTACHMENTMETADATA_FIELD_NUMBER = 2;

    private static final class AttachmentMetadataDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
          com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
              io.kubernetes.client.proto.V1Storage
                  .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor,
              com.google.protobuf.WireFormat.FieldType.STRING,
              "",
              com.google.protobuf.WireFormat.FieldType.STRING,
              "");
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> attachmentMetadata_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetAttachmentMetadata() {
      if (attachmentMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttachmentMetadataDefaultEntryHolder.defaultEntry);
      }
      return attachmentMetadata_;
    }

    public int getAttachmentMetadataCount() {
      return internalGetAttachmentMetadata().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public boolean containsAttachmentMetadata(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetAttachmentMetadata().getMap().containsKey(key);
    }
    /** Use {@link #getAttachmentMetadataMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata() {
      return getAttachmentMetadataMap();
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadataMap() {
      return internalGetAttachmentMetadata().getMap();
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public java.lang.String getAttachmentMetadataOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttachmentMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public java.lang.String getAttachmentMetadataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttachmentMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int ATTACHERROR_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Storage.VolumeError attachError_;
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    public boolean hasAttachError() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeError getAttachError() {
      return attachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : attachError_;
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getAttachErrorOrBuilder() {
      return attachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : attachError_;
    }

    public static final int DETACHERROR_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.V1Storage.VolumeError detachError_;
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    public boolean hasDetachError() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeError getDetachError() {
      return detachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : detachError_;
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getDetachErrorOrBuilder() {
      return detachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : detachError_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, attached_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output,
          internalGetAttachmentMetadata(),
          AttachmentMetadataDefaultEntryHolder.defaultEntry,
          2);
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, getAttachError());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(4, getDetachError());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, attached_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
          internalGetAttachmentMetadata().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String> attachmentMetadata__ =
            AttachmentMetadataDefaultEntryHolder.defaultEntry
                .newBuilderForType()
                .setKey(entry.getKey())
                .setValue(entry.getValue())
                .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, attachmentMetadata__);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAttachError());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getDetachError());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus) obj;

      boolean result = true;
      result = result && (hasAttached() == other.hasAttached());
      if (hasAttached()) {
        result = result && (getAttached() == other.getAttached());
      }
      result =
          result && internalGetAttachmentMetadata().equals(other.internalGetAttachmentMetadata());
      result = result && (hasAttachError() == other.hasAttachError());
      if (hasAttachError()) {
        result = result && getAttachError().equals(other.getAttachError());
      }
      result = result && (hasDetachError() == other.hasDetachError());
      if (hasDetachError()) {
        result = result && getDetachError().equals(other.getDetachError());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAttached()) {
        hash = (37 * hash) + ATTACHED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAttached());
      }
      if (!internalGetAttachmentMetadata().getMap().isEmpty()) {
        hash = (37 * hash) + ATTACHMENTMETADATA_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAttachmentMetadata().hashCode();
      }
      if (hasAttachError()) {
        hash = (37 * hash) + ATTACHERROR_FIELD_NUMBER;
        hash = (53 * hash) + getAttachError().hashCode();
      }
      if (hasDetachError()) {
        hash = (37 * hash) + DETACHERROR_FIELD_NUMBER;
        hash = (53 * hash) + getDetachError().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * VolumeAttachmentStatus is the status of a VolumeAttachment request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentStatus)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 2:
            return internalGetAttachmentMetadata();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 2:
            return internalGetMutableAttachmentMetadata();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getAttachErrorFieldBuilder();
          getDetachErrorFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        attached_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableAttachmentMetadata().clear();
        if (attachErrorBuilder_ == null) {
          attachError_ = null;
        } else {
          attachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (detachErrorBuilder_ == null) {
          detachError_ = null;
        } else {
          detachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.attached_ = attached_;
        result.attachmentMetadata_ = internalGetAttachmentMetadata();
        result.attachmentMetadata_.makeImmutable();
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (attachErrorBuilder_ == null) {
          result.attachError_ = attachError_;
        } else {
          result.attachError_ = attachErrorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        if (detachErrorBuilder_ == null) {
          result.detachError_ = detachError_;
        } else {
          result.detachError_ = detachErrorBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus other) {
        if (other
            == io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance())
          return this;
        if (other.hasAttached()) {
          setAttached(other.getAttached());
        }
        internalGetMutableAttachmentMetadata().mergeFrom(other.internalGetAttachmentMetadata());
        if (other.hasAttachError()) {
          mergeAttachError(other.getAttachError());
        }
        if (other.hasDetachError()) {
          mergeDetachError(other.getDetachError());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private boolean attached_;
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public boolean hasAttached() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public boolean getAttached() {
        return attached_;
      }
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public Builder setAttached(boolean value) {
        bitField0_ |= 0x00000001;
        attached_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public Builder clearAttached() {
        bitField0_ = (bitField0_ & ~0x00000001);
        attached_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String> attachmentMetadata_;

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetAttachmentMetadata() {
        if (attachmentMetadata_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AttachmentMetadataDefaultEntryHolder.defaultEntry);
        }
        return attachmentMetadata_;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetMutableAttachmentMetadata() {
        onChanged();
        ;
        if (attachmentMetadata_ == null) {
          attachmentMetadata_ =
              com.google.protobuf.MapField.newMapField(
                  AttachmentMetadataDefaultEntryHolder.defaultEntry);
        }
        if (!attachmentMetadata_.isMutable()) {
          attachmentMetadata_ = attachmentMetadata_.copy();
        }
        return attachmentMetadata_;
      }

      public int getAttachmentMetadataCount() {
        return internalGetAttachmentMetadata().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public boolean containsAttachmentMetadata(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetAttachmentMetadata().getMap().containsKey(key);
      }
      /** Use {@link #getAttachmentMetadataMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata() {
        return getAttachmentMetadataMap();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadataMap() {
        return internalGetAttachmentMetadata().getMap();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public java.lang.String getAttachmentMetadataOrDefault(
          java.lang.String key, java.lang.String defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAttachmentMetadata().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public java.lang.String getAttachmentMetadataOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAttachmentMetadata().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAttachmentMetadata() {
        internalGetMutableAttachmentMetadata().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public Builder removeAttachmentMetadata(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAttachmentMetadata().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getMutableAttachmentMetadata() {
        return internalGetMutableAttachmentMetadata().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public Builder putAttachmentMetadata(java.lang.String key, java.lang.String value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAttachmentMetadata().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public Builder putAllAttachmentMetadata(
          java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableAttachmentMetadata().getMutableMap().putAll(values);
        return this;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeError attachError_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          attachErrorBuilder_;
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public boolean hasAttachError() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError getAttachError() {
        if (attachErrorBuilder_ == null) {
          return attachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : attachError_;
        } else {
          return attachErrorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder setAttachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (attachErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          attachError_ = value;
          onChanged();
        } else {
          attachErrorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder setAttachError(
          io.kubernetes.client.proto.V1Storage.VolumeError.Builder builderForValue) {
        if (attachErrorBuilder_ == null) {
          attachError_ = builderForValue.build();
          onChanged();
        } else {
          attachErrorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder mergeAttachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (attachErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && attachError_ != null
              && attachError_
                  != io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()) {
            attachError_ =
                io.kubernetes.client.proto.V1Storage.VolumeError.newBuilder(attachError_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            attachError_ = value;
          }
          onChanged();
        } else {
          attachErrorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder clearAttachError() {
        if (attachErrorBuilder_ == null) {
          attachError_ = null;
          onChanged();
        } else {
          attachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError.Builder getAttachErrorBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAttachErrorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getAttachErrorOrBuilder() {
        if (attachErrorBuilder_ != null) {
          return attachErrorBuilder_.getMessageOrBuilder();
        } else {
          return attachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : attachError_;
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          getAttachErrorFieldBuilder() {
        if (attachErrorBuilder_ == null) {
          attachErrorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeError,
                  io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>(
                  getAttachError(), getParentForChildren(), isClean());
          attachError_ = null;
        }
        return attachErrorBuilder_;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeError detachError_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          detachErrorBuilder_;
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public boolean hasDetachError() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError getDetachError() {
        if (detachErrorBuilder_ == null) {
          return detachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : detachError_;
        } else {
          return detachErrorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder setDetachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (detachErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detachError_ = value;
          onChanged();
        } else {
          detachErrorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder setDetachError(
          io.kubernetes.client.proto.V1Storage.VolumeError.Builder builderForValue) {
        if (detachErrorBuilder_ == null) {
          detachError_ = builderForValue.build();
          onChanged();
        } else {
          detachErrorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder mergeDetachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (detachErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && detachError_ != null
              && detachError_
                  != io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()) {
            detachError_ =
                io.kubernetes.client.proto.V1Storage.VolumeError.newBuilder(detachError_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            detachError_ = value;
          }
          onChanged();
        } else {
          detachErrorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder clearDetachError() {
        if (detachErrorBuilder_ == null) {
          detachError_ = null;
          onChanged();
        } else {
          detachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError.Builder getDetachErrorBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getDetachErrorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getDetachErrorOrBuilder() {
        if (detachErrorBuilder_ != null) {
          return detachErrorBuilder_.getMessageOrBuilder();
        } else {
          return detachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : detachError_;
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          getDetachErrorFieldBuilder() {
        if (detachErrorBuilder_ == null) {
          detachErrorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeError,
                  io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>(
                  getDetachError(), getParentForChildren(), isClean());
          detachError_ = null;
        }
        return detachErrorBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentStatus)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentStatus> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentStatus>() {
          @java.lang.Override
          public VolumeAttachmentStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeErrorOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeError)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    boolean hasTime();
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    io.kubernetes.client.proto.Meta.Time getTime();
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    boolean hasMessage();
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    java.lang.String getMessage();
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    com.google.protobuf.ByteString getMessageBytes();
  }
  /**
   *
   *
   * <pre>
   * VolumeError captures an error encountered during a volume operation.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeError}
   */
  public static final class VolumeError extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeError)
      VolumeErrorOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeError.newBuilder() to construct.
    private VolumeError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeError() {
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeError(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = time_.toBuilder();
                }
                time_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(time_);
                  time_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                message_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeError.class,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder.class);
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.Time time_;
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getTime() {
      return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
    }
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getTimeOrBuilder() {
      return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object message_;
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeError)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeError other =
          (io.kubernetes.client.proto.V1Storage.VolumeError) obj;

      boolean result = true;
      result = result && (hasTime() == other.hasTime());
      if (hasTime()) {
        result = result && getTime().equals(other.getTime());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage().equals(other.getMessage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTime()) {
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + getTime().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.VolumeError prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * VolumeError captures an error encountered during a volume operation.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeError}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeError)
        io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeError.class,
                io.kubernetes.client.proto.V1Storage.VolumeError.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeError.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = null;
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeError getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeError build() {
        io.kubernetes.client.proto.V1Storage.VolumeError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeError buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeError result =
            new io.kubernetes.client.proto.V1Storage.VolumeError(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeError) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeError) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeError other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance())
          return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000002;
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.VolumeError parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeError) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.Time time_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          timeBuilder_;
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getTime() {
        if (timeBuilder_ == null) {
          return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder setTime(io.kubernetes.client.proto.Meta.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder setTime(io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder mergeTime(io.kubernetes.client.proto.Meta.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && time_ != null
              && time_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            time_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(time_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = null;
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
        }
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getTime(), getParentForChildren(), isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      private java.lang.Object message_ = "";
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public com.google.protobuf.ByteString getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public Builder setMessage(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public Builder setMessageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeError)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeError)
    private static final io.kubernetes.client.proto.V1Storage.VolumeError DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeError();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeError> PARSER =
        new com.google.protobuf.AbstractParser<VolumeError>() {
          @java.lang.Override
          public VolumeError parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeError(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeError> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeError> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeError getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeNodeResourcesOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeNodeResources)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
     * A volume that is both attached and mounted on a node is considered to be used once, not twice.
     * The same rule applies for a unique volume that is shared among multiple pods on the same node.
     * If this field is not specified, then the supported number of volumes on this node is unbounded.
     * +optional
     * </pre>
     *
     * <code>optional int32 count = 1;</code>
     */
    boolean hasCount();
    /**
     *
     *
     * <pre>
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
     * A volume that is both attached and mounted on a node is considered to be used once, not twice.
     * The same rule applies for a unique volume that is shared among multiple pods on the same node.
     * If this field is not specified, then the supported number of volumes on this node is unbounded.
     * +optional
     * </pre>
     *
     * <code>optional int32 count = 1;</code>
     */
    int getCount();
  }
  /**
   *
   *
   * <pre>
   * VolumeNodeResources is a set of resource limits for scheduling of volumes.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeNodeResources}
   */
  public static final class VolumeNodeResources extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeNodeResources)
      VolumeNodeResourcesOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeNodeResources.newBuilder() to construct.
    private VolumeNodeResources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeNodeResources() {
      count_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeNodeResources(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                bitField0_ |= 0x00000001;
                count_ = input.readInt32();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeNodeResources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeNodeResources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeNodeResources.class,
              io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder.class);
    }

    private int bitField0_;
    public static final int COUNT_FIELD_NUMBER = 1;
    private int count_;
    /**
     *
     *
     * <pre>
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
     * A volume that is both attached and mounted on a node is considered to be used once, not twice.
     * The same rule applies for a unique volume that is shared among multiple pods on the same node.
     * If this field is not specified, then the supported number of volumes on this node is unbounded.
     * +optional
     * </pre>
     *
     * <code>optional int32 count = 1;</code>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
     * A volume that is both attached and mounted on a node is considered to be used once, not twice.
     * The same rule applies for a unique volume that is shared among multiple pods on the same node.
     * If this field is not specified, then the supported number of volumes on this node is unbounded.
     * +optional
     * </pre>
     *
     * <code>optional int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, count_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, count_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeNodeResources)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeNodeResources other =
          (io.kubernetes.client.proto.V1Storage.VolumeNodeResources) obj;

      boolean result = true;
      result = result && (hasCount() == other.hasCount());
      if (hasCount()) {
        result = result && (getCount() == other.getCount());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCount()) {
        hash = (37 * hash) + COUNT_FIELD_NUMBER;
        hash = (53 * hash) + getCount();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Storage.VolumeNodeResources prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * VolumeNodeResources is a set of resource limits for scheduling of volumes.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeNodeResources}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeNodeResources)
        io.kubernetes.client.proto.V1Storage.VolumeNodeResourcesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeNodeResources_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeNodeResources_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeNodeResources.class,
                io.kubernetes.client.proto.V1Storage.VolumeNodeResources.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeNodeResources.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeNodeResources_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeNodeResources getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeNodeResources.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeNodeResources build() {
        io.kubernetes.client.proto.V1Storage.VolumeNodeResources result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeNodeResources buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeNodeResources result =
            new io.kubernetes.client.proto.V1Storage.VolumeNodeResources(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.count_ = count_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeNodeResources) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeNodeResources) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeNodeResources other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeNodeResources.getDefaultInstance())
          return this;
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Storage.VolumeNodeResources parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeNodeResources) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private int count_;
      /**
       *
       *
       * <pre>
       * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
       * A volume that is both attached and mounted on a node is considered to be used once, not twice.
       * The same rule applies for a unique volume that is shared among multiple pods on the same node.
       * If this field is not specified, then the supported number of volumes on this node is unbounded.
       * +optional
       * </pre>
       *
       * <code>optional int32 count = 1;</code>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
       * A volume that is both attached and mounted on a node is considered to be used once, not twice.
       * The same rule applies for a unique volume that is shared among multiple pods on the same node.
       * If this field is not specified, then the supported number of volumes on this node is unbounded.
       * +optional
       * </pre>
       *
       * <code>optional int32 count = 1;</code>
       */
      public int getCount() {
        return count_;
      }
      /**
       *
       *
       * <pre>
       * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
       * A volume that is both attached and mounted on a node is considered to be used once, not twice.
       * The same rule applies for a unique volume that is shared among multiple pods on the same node.
       * If this field is not specified, then the supported number of volumes on this node is unbounded.
       * +optional
       * </pre>
       *
       * <code>optional int32 count = 1;</code>
       */
      public Builder setCount(int value) {
        bitField0_ |= 0x00000001;
        count_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Maximum number of unique volumes managed by the CSI driver that can be used on a node.
       * A volume that is both attached and mounted on a node is considered to be used once, not twice.
       * The same rule applies for a unique volume that is shared among multiple pods on the same node.
       * If this field is not specified, then the supported number of volumes on this node is unbounded.
       * +optional
       * </pre>
       *
       * <code>optional int32 count = 1;</code>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeNodeResources)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeNodeResources)
    private static final io.kubernetes.client.proto.V1Storage.VolumeNodeResources DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeNodeResources();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeNodeResources getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeNodeResources> PARSER =
        new com.google.protobuf.AbstractParser<VolumeNodeResources>() {
          @java.lang.Override
          public VolumeNodeResources parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeNodeResources(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeNodeResources> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeNodeResources> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeNodeResources getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_CSIDriver_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_CSIDriver_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_CSIDriverList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_CSIDriverList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_CSIDriverSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_CSIDriverSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_CSINode_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_CSINode_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_CSINodeDriver_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_CSINodeDriver_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_CSINodeList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_CSINodeList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_CSINodeSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_CSINodeSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_TokenRequest_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_TokenRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeNodeResources_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeNodeResources_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%k8s.io/api/storage/v1/generated.proto\022"
          + "\025k8s.io.api.storage.v1\032\"k8s.io/api/core/"
          + "v1/generated.proto\0324k8s.io/apimachinery/"
          + "pkg/apis/meta/v1/generated.proto\032/k8s.io"
          + "/apimachinery/pkg/runtime/generated.prot"
          + "o\0326k8s.io/apimachinery/pkg/runtime/schem"
          + "a/generated.proto\"\203\001\n\tCSIDriver\022B\n\010metad"
          + "ata\030\001 \001(\01320.k8s.io.apimachinery.pkg.apis"
          + ".meta.v1.ObjectMeta\0222\n\004spec\030\002 \001(\0132$.k8s."
          + "io.api.storage.v1.CSIDriverSpec\"\202\001\n\rCSID"
          + "riverList\022@\n\010metadata\030\001 \001(\0132..k8s.io.api"
          + "machinery.pkg.apis.meta.v1.ListMeta\022/\n\005i"
          + "tems\030\002 \003(\0132 .k8s.io.api.storage.v1.CSIDr"
          + "iver\"\344\001\n\rCSIDriverSpec\022\026\n\016attachRequired"
          + "\030\001 \001(\010\022\026\n\016podInfoOnMount\030\002 \001(\010\022\034\n\024volume"
          + "LifecycleModes\030\003 \003(\t\022\027\n\017storageCapacity\030"
          + "\004 \001(\010\022\025\n\rfsGroupPolicy\030\005 \001(\t\022:\n\rtokenReq"
          + "uests\030\006 \003(\0132#.k8s.io.api.storage.v1.Toke"
          + "nRequest\022\031\n\021requiresRepublish\030\007 \001(\010\"\177\n\007C"
          + "SINode\022B\n\010metadata\030\001 \001(\01320.k8s.io.apimac"
          + "hinery.pkg.apis.meta.v1.ObjectMeta\0220\n\004sp"
          + "ec\030\002 \001(\0132\".k8s.io.api.storage.v1.CSINode"
          + "Spec\"\204\001\n\rCSINodeDriver\022\014\n\004name\030\001 \001(\t\022\016\n\006"
          + "nodeID\030\002 \001(\t\022\024\n\014topologyKeys\030\003 \003(\t\022?\n\013al"
          + "locatable\030\004 \001(\0132*.k8s.io.api.storage.v1."
          + "VolumeNodeResources\"~\n\013CSINodeList\022@\n\010me"
          + "tadata\030\001 \001(\0132..k8s.io.apimachinery.pkg.a"
          + "pis.meta.v1.ListMeta\022-\n\005items\030\002 \003(\0132\036.k8"
          + "s.io.api.storage.v1.CSINode\"D\n\013CSINodeSp"
          + "ec\0225\n\007drivers\030\001 \003(\0132$.k8s.io.api.storage"
          + ".v1.CSINodeDriver\"\216\003\n\014StorageClass\022B\n\010me"
          + "tadata\030\001 \001(\01320.k8s.io.apimachinery.pkg.a"
          + "pis.meta.v1.ObjectMeta\022\023\n\013provisioner\030\002 "
          + "\001(\t\022G\n\nparameters\030\003 \003(\01323.k8s.io.api.sto"
          + "rage.v1.StorageClass.ParametersEntry\022\025\n\r"
          + "reclaimPolicy\030\004 \001(\t\022\024\n\014mountOptions\030\005 \003("
          + "\t\022\034\n\024allowVolumeExpansion\030\006 \001(\010\022\031\n\021volum"
          + "eBindingMode\030\007 \001(\t\022C\n\021allowedTopologies\030"
          + "\010 \003(\0132(.k8s.io.api.core.v1.TopologySelec"
          + "torTerm\0321\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\"\210\001\n\020StorageClassList\022"
          + "@\n\010metadata\030\001 \001(\0132..k8s.io.apimachinery."
          + "pkg.apis.meta.v1.ListMeta\0222\n\005items\030\002 \003(\013"
          + "2#.k8s.io.api.storage.v1.StorageClass\";\n"
          + "\014TokenRequest\022\020\n\010audience\030\001 \001(\t\022\031\n\021expir"
          + "ationSeconds\030\002 \001(\003\"\320\001\n\020VolumeAttachment\022"
          + "B\n\010metadata\030\001 \001(\01320.k8s.io.apimachinery."
          + "pkg.apis.meta.v1.ObjectMeta\0229\n\004spec\030\002 \001("
          + "\0132+.k8s.io.api.storage.v1.VolumeAttachme"
          + "ntSpec\022=\n\006status\030\003 \001(\0132-.k8s.io.api.stor"
          + "age.v1.VolumeAttachmentStatus\"\220\001\n\024Volume"
          + "AttachmentList\022@\n\010metadata\030\001 \001(\0132..k8s.i"
          + "o.apimachinery.pkg.apis.meta.v1.ListMeta"
          + "\0226\n\005items\030\002 \003(\0132\'.k8s.io.api.storage.v1."
          + "VolumeAttachment\"z\n\026VolumeAttachmentSour"
          + "ce\022\034\n\024persistentVolumeName\030\001 \001(\t\022B\n\020inli"
          + "neVolumeSpec\030\002 \001(\0132(.k8s.io.api.core.v1."
          + "PersistentVolumeSpec\"y\n\024VolumeAttachment"
          + "Spec\022\020\n\010attacher\030\001 \001(\t\022=\n\006source\030\002 \001(\0132-"
          + ".k8s.io.api.storage.v1.VolumeAttachmentS"
          + "ource\022\020\n\010nodeName\030\003 \001(\t\"\272\002\n\026VolumeAttach"
          + "mentStatus\022\020\n\010attached\030\001 \001(\010\022a\n\022attachme"
          + "ntMetadata\030\002 \003(\0132E.k8s.io.api.storage.v1"
          + ".VolumeAttachmentStatus.AttachmentMetada"
          + "taEntry\0227\n\013attachError\030\003 \001(\0132\".k8s.io.ap"
          + "i.storage.v1.VolumeError\0227\n\013detachError\030"
          + "\004 \001(\0132\".k8s.io.api.storage.v1.VolumeErro"
          + "r\0329\n\027AttachmentMetadataEntry\022\013\n\003key\030\001 \001("
          + "\t\022\r\n\005value\030\002 \001(\t:\0028\001\"X\n\013VolumeError\0228\n\004t"
          + "ime\030\001 \001(\0132*.k8s.io.apimachinery.pkg.apis"
          + ".meta.v1.Time\022\017\n\007message\030\002 \001(\t\"$\n\023Volume"
          + "NodeResources\022\r\n\005count\030\001 \001(\005B+\n\032io.kuber"
          + "netes.client.protoB\tV1StorageZ\002v1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_storage_v1_CSIDriver_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_storage_v1_CSIDriver_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_CSIDriver_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec",
            });
    internal_static_k8s_io_api_storage_v1_CSIDriverList_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_storage_v1_CSIDriverList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_CSIDriverList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_storage_v1_CSIDriverSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_storage_v1_CSIDriverSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_CSIDriverSpec_descriptor,
            new java.lang.String[] {
              "AttachRequired",
              "PodInfoOnMount",
              "VolumeLifecycleModes",
              "StorageCapacity",
              "FsGroupPolicy",
              "TokenRequests",
              "RequiresRepublish",
            });
    internal_static_k8s_io_api_storage_v1_CSINode_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_storage_v1_CSINode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_CSINode_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec",
            });
    internal_static_k8s_io_api_storage_v1_CSINodeDriver_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_storage_v1_CSINodeDriver_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_CSINodeDriver_descriptor,
            new java.lang.String[] {
              "Name", "NodeID", "TopologyKeys", "Allocatable",
            });
    internal_static_k8s_io_api_storage_v1_CSINodeList_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_storage_v1_CSINodeList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_CSINodeList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_storage_v1_CSINodeSpec_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_storage_v1_CSINodeSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_CSINodeSpec_descriptor,
            new java.lang.String[] {
              "Drivers",
            });
    internal_static_k8s_io_api_storage_v1_StorageClass_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_StorageClass_descriptor,
            new java.lang.String[] {
              "Metadata",
              "Provisioner",
              "Parameters",
              "ReclaimPolicy",
              "MountOptions",
              "AllowVolumeExpansion",
              "VolumeBindingMode",
              "AllowedTopologies",
            });
    internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor =
        internal_static_k8s_io_api_storage_v1_StorageClass_descriptor.getNestedTypes().get(0);
    internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_storage_v1_TokenRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_k8s_io_api_storage_v1_TokenRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_TokenRequest_descriptor,
            new java.lang.String[] {
              "Audience", "ExpirationSeconds",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor,
            new java.lang.String[] {
              "PersistentVolumeName", "InlineVolumeSpec",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor,
            new java.lang.String[] {
              "Attacher", "Source", "NodeName",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor,
            new java.lang.String[] {
              "Attached", "AttachmentMetadata", "AttachError", "DetachError",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor =
        internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_storage_v1_VolumeError_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeError_descriptor,
            new java.lang.String[] {
              "Time", "Message",
            });
    internal_static_k8s_io_api_storage_v1_VolumeNodeResources_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_k8s_io_api_storage_v1_VolumeNodeResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeNodeResources_descriptor,
            new java.lang.String[] {
              "Count",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
