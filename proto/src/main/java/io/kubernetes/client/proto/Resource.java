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

public final class Resource {
  private Resource() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface QuantityOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.apimachinery.pkg.api.resource.Quantity)
      com.google.protobuf.MessageOrBuilder {

    /** <code>optional string string = 1;</code> */
    boolean hasString();
    /** <code>optional string string = 1;</code> */
    java.lang.String getString();
    /** <code>optional string string = 1;</code> */
    com.google.protobuf.ByteString getStringBytes();
  }
  /**
   *
   *
   * <pre>
   * Quantity is a fixed-point representation of a number.
   * It provides convenient marshaling/unmarshaling in JSON and YAML,
   * in addition to String() and AsInt64() accessors.
   * The serialization format is:
   * &lt;quantity&gt;        ::= &lt;signedNumber&gt;&lt;suffix&gt;
   *   (Note that &lt;suffix&gt; may be empty, from the "" case in &lt;decimalSI&gt;.)
   * &lt;digit&gt;           ::= 0 | 1 | ... | 9
   * &lt;digits&gt;          ::= &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt;
   * &lt;number&gt;          ::= &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt;
   * &lt;sign&gt;            ::= "+" | "-"
   * &lt;signedNumber&gt;    ::= &lt;number&gt; | &lt;sign&gt;&lt;number&gt;
   * &lt;suffix&gt;          ::= &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt;
   * &lt;binarySI&gt;        ::= Ki | Mi | Gi | Ti | Pi | Ei
   *   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
   * &lt;decimalSI&gt;       ::= m | "" | k | M | G | T | P | E
   *   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)
   * &lt;decimalExponent&gt; ::= "e" &lt;signedNumber&gt; | "E" &lt;signedNumber&gt;
   * No matter which of the three exponent forms is used, no quantity may represent
   * a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal
   * places. Numbers larger or more precise will be capped or rounded up.
   * (E.g.: 0.1m will rounded up to 1m.)
   * This may be extended in the future if we require larger or smaller quantities.
   * When a Quantity is parsed from a string, it will remember the type of suffix
   * it had, and will use the same type again when it is serialized.
   * Before serializing, Quantity will be put in "canonical form".
   * This means that Exponent/suffix will be adjusted up or down (with a
   * corresponding increase or decrease in Mantissa) such that:
   *   a. No precision is lost
   *   b. No fractional digits will be emitted
   *   c. The exponent (or suffix) is as large as possible.
   * The sign will be omitted unless the number is negative.
   * Examples:
   *   1.5 will be serialized as "1500m"
   *   1.5Gi will be serialized as "1536Mi"
   * Note that the quantity will NEVER be internally represented by a
   * floating point number. That is the whole point of this exercise.
   * Non-canonical values will still parse as long as they are well formed,
   * but will be re-emitted in their canonical form. (So always use canonical
   * form, or don't diff.)
   * This format is intended to make it difficult to use these numbers without
   * writing some sort of special handling code in the hopes that that will
   * cause implementors to also use a fixed point implementation.
   * +protobuf=true
   * +protobuf.embed=string
   * +protobuf.options.marshal=false
   * +protobuf.options.(gogoproto.goproto_stringer)=false
   * +k8s:deepcopy-gen=true
   * +k8s:openapi-gen=true
   * </pre>
   *
   * Protobuf type {@code k8s.io.apimachinery.pkg.api.resource.Quantity}
   */
  public static final class Quantity extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.apimachinery.pkg.api.resource.Quantity)
      QuantityOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Quantity.newBuilder() to construct.
    private Quantity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Quantity() {
      string_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Quantity(
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
                string_ = bs;
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
      return io.kubernetes.client.proto.Resource
          .internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.Resource
          .internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.Resource.Quantity.class,
              io.kubernetes.client.proto.Resource.Quantity.Builder.class);
    }

    private int bitField0_;
    public static final int STRING_FIELD_NUMBER = 1;
    private volatile java.lang.Object string_;
    /** <code>optional string string = 1;</code> */
    public boolean hasString() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /** <code>optional string string = 1;</code> */
    public java.lang.String getString() {
      java.lang.Object ref = string_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          string_ = s;
        }
        return s;
      }
    }
    /** <code>optional string string = 1;</code> */
    public com.google.protobuf.ByteString getStringBytes() {
      java.lang.Object ref = string_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        string_ = b;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, string_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, string_);
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
      if (!(obj instanceof io.kubernetes.client.proto.Resource.Quantity)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.Resource.Quantity other =
          (io.kubernetes.client.proto.Resource.Quantity) obj;

      boolean result = true;
      result = result && (hasString() == other.hasString());
      if (hasString()) {
        result = result && getString().equals(other.getString());
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
      if (hasString()) {
        hash = (37 * hash) + STRING_FIELD_NUMBER;
        hash = (53 * hash) + getString().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Resource.Quantity parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.Resource.Quantity prototype) {
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
     * Quantity is a fixed-point representation of a number.
     * It provides convenient marshaling/unmarshaling in JSON and YAML,
     * in addition to String() and AsInt64() accessors.
     * The serialization format is:
     * &lt;quantity&gt;        ::= &lt;signedNumber&gt;&lt;suffix&gt;
     *   (Note that &lt;suffix&gt; may be empty, from the "" case in &lt;decimalSI&gt;.)
     * &lt;digit&gt;           ::= 0 | 1 | ... | 9
     * &lt;digits&gt;          ::= &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt;
     * &lt;number&gt;          ::= &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt;
     * &lt;sign&gt;            ::= "+" | "-"
     * &lt;signedNumber&gt;    ::= &lt;number&gt; | &lt;sign&gt;&lt;number&gt;
     * &lt;suffix&gt;          ::= &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt;
     * &lt;binarySI&gt;        ::= Ki | Mi | Gi | Ti | Pi | Ei
     *   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html)
     * &lt;decimalSI&gt;       ::= m | "" | k | M | G | T | P | E
     *   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.)
     * &lt;decimalExponent&gt; ::= "e" &lt;signedNumber&gt; | "E" &lt;signedNumber&gt;
     * No matter which of the three exponent forms is used, no quantity may represent
     * a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal
     * places. Numbers larger or more precise will be capped or rounded up.
     * (E.g.: 0.1m will rounded up to 1m.)
     * This may be extended in the future if we require larger or smaller quantities.
     * When a Quantity is parsed from a string, it will remember the type of suffix
     * it had, and will use the same type again when it is serialized.
     * Before serializing, Quantity will be put in "canonical form".
     * This means that Exponent/suffix will be adjusted up or down (with a
     * corresponding increase or decrease in Mantissa) such that:
     *   a. No precision is lost
     *   b. No fractional digits will be emitted
     *   c. The exponent (or suffix) is as large as possible.
     * The sign will be omitted unless the number is negative.
     * Examples:
     *   1.5 will be serialized as "1500m"
     *   1.5Gi will be serialized as "1536Mi"
     * Note that the quantity will NEVER be internally represented by a
     * floating point number. That is the whole point of this exercise.
     * Non-canonical values will still parse as long as they are well formed,
     * but will be re-emitted in their canonical form. (So always use canonical
     * form, or don't diff.)
     * This format is intended to make it difficult to use these numbers without
     * writing some sort of special handling code in the hopes that that will
     * cause implementors to also use a fixed point implementation.
     * +protobuf=true
     * +protobuf.embed=string
     * +protobuf.options.marshal=false
     * +protobuf.options.(gogoproto.goproto_stringer)=false
     * +k8s:deepcopy-gen=true
     * +k8s:openapi-gen=true
     * </pre>
     *
     * Protobuf type {@code k8s.io.apimachinery.pkg.api.resource.Quantity}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.apimachinery.pkg.api.resource.Quantity)
        io.kubernetes.client.proto.Resource.QuantityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.Resource
            .internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.Resource
            .internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.Resource.Quantity.class,
                io.kubernetes.client.proto.Resource.Quantity.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.Resource.Quantity.newBuilder()
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
        string_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.Resource
            .internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Resource.Quantity getDefaultInstanceForType() {
        return io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Resource.Quantity build() {
        io.kubernetes.client.proto.Resource.Quantity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Resource.Quantity buildPartial() {
        io.kubernetes.client.proto.Resource.Quantity result =
            new io.kubernetes.client.proto.Resource.Quantity(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.string_ = string_;
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
        if (other instanceof io.kubernetes.client.proto.Resource.Quantity) {
          return mergeFrom((io.kubernetes.client.proto.Resource.Quantity) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.Resource.Quantity other) {
        if (other == io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) return this;
        if (other.hasString()) {
          bitField0_ |= 0x00000001;
          string_ = other.string_;
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
        io.kubernetes.client.proto.Resource.Quantity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.Resource.Quantity) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object string_ = "";
      /** <code>optional string string = 1;</code> */
      public boolean hasString() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /** <code>optional string string = 1;</code> */
      public java.lang.String getString() {
        java.lang.Object ref = string_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            string_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /** <code>optional string string = 1;</code> */
      public com.google.protobuf.ByteString getStringBytes() {
        java.lang.Object ref = string_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          string_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /** <code>optional string string = 1;</code> */
      public Builder setString(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        string_ = value;
        onChanged();
        return this;
      }
      /** <code>optional string string = 1;</code> */
      public Builder clearString() {
        bitField0_ = (bitField0_ & ~0x00000001);
        string_ = getDefaultInstance().getString();
        onChanged();
        return this;
      }
      /** <code>optional string string = 1;</code> */
      public Builder setStringBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        string_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.apimachinery.pkg.api.resource.Quantity)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.apimachinery.pkg.api.resource.Quantity)
    private static final io.kubernetes.client.proto.Resource.Quantity DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.Resource.Quantity();
    }

    public static io.kubernetes.client.proto.Resource.Quantity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Quantity> PARSER =
        new com.google.protobuf.AbstractParser<Quantity>() {
          @java.lang.Override
          public Quantity parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Quantity(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Quantity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Quantity> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.Resource.Quantity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface QuantityValueOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.apimachinery.pkg.api.resource.QuantityValue)
      com.google.protobuf.MessageOrBuilder {

    /** <code>optional string string = 1;</code> */
    boolean hasString();
    /** <code>optional string string = 1;</code> */
    java.lang.String getString();
    /** <code>optional string string = 1;</code> */
    com.google.protobuf.ByteString getStringBytes();
  }
  /**
   *
   *
   * <pre>
   * QuantityValue makes it possible to use a Quantity as value for a command
   * line parameter.
   * +protobuf=true
   * +protobuf.embed=string
   * +protobuf.options.marshal=false
   * +protobuf.options.(gogoproto.goproto_stringer)=false
   * +k8s:deepcopy-gen=true
   * </pre>
   *
   * Protobuf type {@code k8s.io.apimachinery.pkg.api.resource.QuantityValue}
   */
  public static final class QuantityValue extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.apimachinery.pkg.api.resource.QuantityValue)
      QuantityValueOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use QuantityValue.newBuilder() to construct.
    private QuantityValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private QuantityValue() {
      string_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private QuantityValue(
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
                string_ = bs;
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
      return io.kubernetes.client.proto.Resource
          .internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.Resource
          .internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.Resource.QuantityValue.class,
              io.kubernetes.client.proto.Resource.QuantityValue.Builder.class);
    }

    private int bitField0_;
    public static final int STRING_FIELD_NUMBER = 1;
    private volatile java.lang.Object string_;
    /** <code>optional string string = 1;</code> */
    public boolean hasString() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /** <code>optional string string = 1;</code> */
    public java.lang.String getString() {
      java.lang.Object ref = string_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          string_ = s;
        }
        return s;
      }
    }
    /** <code>optional string string = 1;</code> */
    public com.google.protobuf.ByteString getStringBytes() {
      java.lang.Object ref = string_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        string_ = b;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, string_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, string_);
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
      if (!(obj instanceof io.kubernetes.client.proto.Resource.QuantityValue)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.Resource.QuantityValue other =
          (io.kubernetes.client.proto.Resource.QuantityValue) obj;

      boolean result = true;
      result = result && (hasString() == other.hasString());
      if (hasString()) {
        result = result && getString().equals(other.getString());
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
      if (hasString()) {
        hash = (37 * hash) + STRING_FIELD_NUMBER;
        hash = (53 * hash) + getString().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.Resource.QuantityValue prototype) {
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
     * QuantityValue makes it possible to use a Quantity as value for a command
     * line parameter.
     * +protobuf=true
     * +protobuf.embed=string
     * +protobuf.options.marshal=false
     * +protobuf.options.(gogoproto.goproto_stringer)=false
     * +k8s:deepcopy-gen=true
     * </pre>
     *
     * Protobuf type {@code k8s.io.apimachinery.pkg.api.resource.QuantityValue}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.apimachinery.pkg.api.resource.QuantityValue)
        io.kubernetes.client.proto.Resource.QuantityValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.Resource
            .internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.Resource
            .internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.Resource.QuantityValue.class,
                io.kubernetes.client.proto.Resource.QuantityValue.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.Resource.QuantityValue.newBuilder()
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
        string_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.Resource
            .internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Resource.QuantityValue getDefaultInstanceForType() {
        return io.kubernetes.client.proto.Resource.QuantityValue.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Resource.QuantityValue build() {
        io.kubernetes.client.proto.Resource.QuantityValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Resource.QuantityValue buildPartial() {
        io.kubernetes.client.proto.Resource.QuantityValue result =
            new io.kubernetes.client.proto.Resource.QuantityValue(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.string_ = string_;
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
        if (other instanceof io.kubernetes.client.proto.Resource.QuantityValue) {
          return mergeFrom((io.kubernetes.client.proto.Resource.QuantityValue) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.Resource.QuantityValue other) {
        if (other == io.kubernetes.client.proto.Resource.QuantityValue.getDefaultInstance())
          return this;
        if (other.hasString()) {
          bitField0_ |= 0x00000001;
          string_ = other.string_;
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
        io.kubernetes.client.proto.Resource.QuantityValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.Resource.QuantityValue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object string_ = "";
      /** <code>optional string string = 1;</code> */
      public boolean hasString() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /** <code>optional string string = 1;</code> */
      public java.lang.String getString() {
        java.lang.Object ref = string_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            string_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /** <code>optional string string = 1;</code> */
      public com.google.protobuf.ByteString getStringBytes() {
        java.lang.Object ref = string_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          string_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /** <code>optional string string = 1;</code> */
      public Builder setString(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        string_ = value;
        onChanged();
        return this;
      }
      /** <code>optional string string = 1;</code> */
      public Builder clearString() {
        bitField0_ = (bitField0_ & ~0x00000001);
        string_ = getDefaultInstance().getString();
        onChanged();
        return this;
      }
      /** <code>optional string string = 1;</code> */
      public Builder setStringBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        string_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.apimachinery.pkg.api.resource.QuantityValue)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.apimachinery.pkg.api.resource.QuantityValue)
    private static final io.kubernetes.client.proto.Resource.QuantityValue DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.Resource.QuantityValue();
    }

    public static io.kubernetes.client.proto.Resource.QuantityValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<QuantityValue> PARSER =
        new com.google.protobuf.AbstractParser<QuantityValue>() {
          @java.lang.Override
          public QuantityValue parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new QuantityValue(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<QuantityValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuantityValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.Resource.QuantityValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4k8s.io/apimachinery/pkg/api/resource/g"
          + "enerated.proto\022$k8s.io.apimachinery.pkg."
          + "api.resource\"\032\n\010Quantity\022\016\n\006string\030\001 \001(\t"
          + "\"\037\n\rQuantityValue\022\016\n\006string\030\001 \001(\tB0\n\032io."
          + "kubernetes.client.protoB\010ResourceZ\010resou"
          + "rce"
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
        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_apimachinery_pkg_api_resource_Quantity_descriptor,
            new java.lang.String[] {
              "String",
            });
    internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_apimachinery_pkg_api_resource_QuantityValue_descriptor,
            new java.lang.String[] {
              "String",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
