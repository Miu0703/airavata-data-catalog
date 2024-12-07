// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: DataCatalogAPI.proto
// Protobuf Java Version: 4.28.2

package org.apache.airavata.datacatalog.api;

/**
 * Protobuf type {@code MetadataSchemaFieldDeleteRequest}
 */
public final class MetadataSchemaFieldDeleteRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:MetadataSchemaFieldDeleteRequest)
    MetadataSchemaFieldDeleteRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      MetadataSchemaFieldDeleteRequest.class.getName());
  }
  // Use MetadataSchemaFieldDeleteRequest.newBuilder() to construct.
  private MetadataSchemaFieldDeleteRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MetadataSchemaFieldDeleteRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.airavata.datacatalog.api.DataCatalogAPI.internal_static_MetadataSchemaFieldDeleteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.airavata.datacatalog.api.DataCatalogAPI.internal_static_MetadataSchemaFieldDeleteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest.class, org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest.Builder.class);
  }

  private int bitField0_;
  public static final int USER_INFO_FIELD_NUMBER = 1;
  private org.apache.airavata.datacatalog.api.UserInfo userInfo_;
  /**
   * <code>.UserInfo user_info = 1;</code>
   * @return Whether the userInfo field is set.
   */
  @java.lang.Override
  public boolean hasUserInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.UserInfo user_info = 1;</code>
   * @return The userInfo.
   */
  @java.lang.Override
  public org.apache.airavata.datacatalog.api.UserInfo getUserInfo() {
    return userInfo_ == null ? org.apache.airavata.datacatalog.api.UserInfo.getDefaultInstance() : userInfo_;
  }
  /**
   * <code>.UserInfo user_info = 1;</code>
   */
  @java.lang.Override
  public org.apache.airavata.datacatalog.api.UserInfoOrBuilder getUserInfoOrBuilder() {
    return userInfo_ == null ? org.apache.airavata.datacatalog.api.UserInfo.getDefaultInstance() : userInfo_;
  }

  public static final int METADATA_SCHEMA_FIELD_FIELD_NUMBER = 2;
  private org.apache.airavata.datacatalog.api.MetadataSchemaField metadataSchemaField_;
  /**
   * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
   * @return Whether the metadataSchemaField field is set.
   */
  @java.lang.Override
  public boolean hasMetadataSchemaField() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
   * @return The metadataSchemaField.
   */
  @java.lang.Override
  public org.apache.airavata.datacatalog.api.MetadataSchemaField getMetadataSchemaField() {
    return metadataSchemaField_ == null ? org.apache.airavata.datacatalog.api.MetadataSchemaField.getDefaultInstance() : metadataSchemaField_;
  }
  /**
   * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
   */
  @java.lang.Override
  public org.apache.airavata.datacatalog.api.MetadataSchemaFieldOrBuilder getMetadataSchemaFieldOrBuilder() {
    return metadataSchemaField_ == null ? org.apache.airavata.datacatalog.api.MetadataSchemaField.getDefaultInstance() : metadataSchemaField_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUserInfo());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getMetadataSchemaField());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserInfo());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadataSchemaField());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest)) {
      return super.equals(obj);
    }
    org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest other = (org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest) obj;

    if (hasUserInfo() != other.hasUserInfo()) return false;
    if (hasUserInfo()) {
      if (!getUserInfo()
          .equals(other.getUserInfo())) return false;
    }
    if (hasMetadataSchemaField() != other.hasMetadataSchemaField()) return false;
    if (hasMetadataSchemaField()) {
      if (!getMetadataSchemaField()
          .equals(other.getMetadataSchemaField())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUserInfo()) {
      hash = (37 * hash) + USER_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getUserInfo().hashCode();
    }
    if (hasMetadataSchemaField()) {
      hash = (37 * hash) + METADATA_SCHEMA_FIELD_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataSchemaField().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code MetadataSchemaFieldDeleteRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MetadataSchemaFieldDeleteRequest)
      org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.airavata.datacatalog.api.DataCatalogAPI.internal_static_MetadataSchemaFieldDeleteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.airavata.datacatalog.api.DataCatalogAPI.internal_static_MetadataSchemaFieldDeleteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest.class, org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest.Builder.class);
    }

    // Construct using org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getUserInfoFieldBuilder();
        getMetadataSchemaFieldFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userInfo_ = null;
      if (userInfoBuilder_ != null) {
        userInfoBuilder_.dispose();
        userInfoBuilder_ = null;
      }
      metadataSchemaField_ = null;
      if (metadataSchemaFieldBuilder_ != null) {
        metadataSchemaFieldBuilder_.dispose();
        metadataSchemaFieldBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.airavata.datacatalog.api.DataCatalogAPI.internal_static_MetadataSchemaFieldDeleteRequest_descriptor;
    }

    @java.lang.Override
    public org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest getDefaultInstanceForType() {
      return org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest build() {
      org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest buildPartial() {
      org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest result = new org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userInfo_ = userInfoBuilder_ == null
            ? userInfo_
            : userInfoBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadataSchemaField_ = metadataSchemaFieldBuilder_ == null
            ? metadataSchemaField_
            : metadataSchemaFieldBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest) {
        return mergeFrom((org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest other) {
      if (other == org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest.getDefaultInstance()) return this;
      if (other.hasUserInfo()) {
        mergeUserInfo(other.getUserInfo());
      }
      if (other.hasMetadataSchemaField()) {
        mergeMetadataSchemaField(other.getMetadataSchemaField());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getUserInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataSchemaFieldFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.apache.airavata.datacatalog.api.UserInfo userInfo_;
    private com.google.protobuf.SingleFieldBuilder<
        org.apache.airavata.datacatalog.api.UserInfo, org.apache.airavata.datacatalog.api.UserInfo.Builder, org.apache.airavata.datacatalog.api.UserInfoOrBuilder> userInfoBuilder_;
    /**
     * <code>.UserInfo user_info = 1;</code>
     * @return Whether the userInfo field is set.
     */
    public boolean hasUserInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     * @return The userInfo.
     */
    public org.apache.airavata.datacatalog.api.UserInfo getUserInfo() {
      if (userInfoBuilder_ == null) {
        return userInfo_ == null ? org.apache.airavata.datacatalog.api.UserInfo.getDefaultInstance() : userInfo_;
      } else {
        return userInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     */
    public Builder setUserInfo(org.apache.airavata.datacatalog.api.UserInfo value) {
      if (userInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userInfo_ = value;
      } else {
        userInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     */
    public Builder setUserInfo(
        org.apache.airavata.datacatalog.api.UserInfo.Builder builderForValue) {
      if (userInfoBuilder_ == null) {
        userInfo_ = builderForValue.build();
      } else {
        userInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     */
    public Builder mergeUserInfo(org.apache.airavata.datacatalog.api.UserInfo value) {
      if (userInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          userInfo_ != null &&
          userInfo_ != org.apache.airavata.datacatalog.api.UserInfo.getDefaultInstance()) {
          getUserInfoBuilder().mergeFrom(value);
        } else {
          userInfo_ = value;
        }
      } else {
        userInfoBuilder_.mergeFrom(value);
      }
      if (userInfo_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     */
    public Builder clearUserInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userInfo_ = null;
      if (userInfoBuilder_ != null) {
        userInfoBuilder_.dispose();
        userInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     */
    public org.apache.airavata.datacatalog.api.UserInfo.Builder getUserInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     */
    public org.apache.airavata.datacatalog.api.UserInfoOrBuilder getUserInfoOrBuilder() {
      if (userInfoBuilder_ != null) {
        return userInfoBuilder_.getMessageOrBuilder();
      } else {
        return userInfo_ == null ?
            org.apache.airavata.datacatalog.api.UserInfo.getDefaultInstance() : userInfo_;
      }
    }
    /**
     * <code>.UserInfo user_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.apache.airavata.datacatalog.api.UserInfo, org.apache.airavata.datacatalog.api.UserInfo.Builder, org.apache.airavata.datacatalog.api.UserInfoOrBuilder> 
        getUserInfoFieldBuilder() {
      if (userInfoBuilder_ == null) {
        userInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.apache.airavata.datacatalog.api.UserInfo, org.apache.airavata.datacatalog.api.UserInfo.Builder, org.apache.airavata.datacatalog.api.UserInfoOrBuilder>(
                getUserInfo(),
                getParentForChildren(),
                isClean());
        userInfo_ = null;
      }
      return userInfoBuilder_;
    }

    private org.apache.airavata.datacatalog.api.MetadataSchemaField metadataSchemaField_;
    private com.google.protobuf.SingleFieldBuilder<
        org.apache.airavata.datacatalog.api.MetadataSchemaField, org.apache.airavata.datacatalog.api.MetadataSchemaField.Builder, org.apache.airavata.datacatalog.api.MetadataSchemaFieldOrBuilder> metadataSchemaFieldBuilder_;
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     * @return Whether the metadataSchemaField field is set.
     */
    public boolean hasMetadataSchemaField() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     * @return The metadataSchemaField.
     */
    public org.apache.airavata.datacatalog.api.MetadataSchemaField getMetadataSchemaField() {
      if (metadataSchemaFieldBuilder_ == null) {
        return metadataSchemaField_ == null ? org.apache.airavata.datacatalog.api.MetadataSchemaField.getDefaultInstance() : metadataSchemaField_;
      } else {
        return metadataSchemaFieldBuilder_.getMessage();
      }
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     */
    public Builder setMetadataSchemaField(org.apache.airavata.datacatalog.api.MetadataSchemaField value) {
      if (metadataSchemaFieldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadataSchemaField_ = value;
      } else {
        metadataSchemaFieldBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     */
    public Builder setMetadataSchemaField(
        org.apache.airavata.datacatalog.api.MetadataSchemaField.Builder builderForValue) {
      if (metadataSchemaFieldBuilder_ == null) {
        metadataSchemaField_ = builderForValue.build();
      } else {
        metadataSchemaFieldBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     */
    public Builder mergeMetadataSchemaField(org.apache.airavata.datacatalog.api.MetadataSchemaField value) {
      if (metadataSchemaFieldBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadataSchemaField_ != null &&
          metadataSchemaField_ != org.apache.airavata.datacatalog.api.MetadataSchemaField.getDefaultInstance()) {
          getMetadataSchemaFieldBuilder().mergeFrom(value);
        } else {
          metadataSchemaField_ = value;
        }
      } else {
        metadataSchemaFieldBuilder_.mergeFrom(value);
      }
      if (metadataSchemaField_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     */
    public Builder clearMetadataSchemaField() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadataSchemaField_ = null;
      if (metadataSchemaFieldBuilder_ != null) {
        metadataSchemaFieldBuilder_.dispose();
        metadataSchemaFieldBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     */
    public org.apache.airavata.datacatalog.api.MetadataSchemaField.Builder getMetadataSchemaFieldBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataSchemaFieldFieldBuilder().getBuilder();
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     */
    public org.apache.airavata.datacatalog.api.MetadataSchemaFieldOrBuilder getMetadataSchemaFieldOrBuilder() {
      if (metadataSchemaFieldBuilder_ != null) {
        return metadataSchemaFieldBuilder_.getMessageOrBuilder();
      } else {
        return metadataSchemaField_ == null ?
            org.apache.airavata.datacatalog.api.MetadataSchemaField.getDefaultInstance() : metadataSchemaField_;
      }
    }
    /**
     * <code>.MetadataSchemaField metadata_schema_field = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.apache.airavata.datacatalog.api.MetadataSchemaField, org.apache.airavata.datacatalog.api.MetadataSchemaField.Builder, org.apache.airavata.datacatalog.api.MetadataSchemaFieldOrBuilder> 
        getMetadataSchemaFieldFieldBuilder() {
      if (metadataSchemaFieldBuilder_ == null) {
        metadataSchemaFieldBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.apache.airavata.datacatalog.api.MetadataSchemaField, org.apache.airavata.datacatalog.api.MetadataSchemaField.Builder, org.apache.airavata.datacatalog.api.MetadataSchemaFieldOrBuilder>(
                getMetadataSchemaField(),
                getParentForChildren(),
                isClean());
        metadataSchemaField_ = null;
      }
      return metadataSchemaFieldBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:MetadataSchemaFieldDeleteRequest)
  }

  // @@protoc_insertion_point(class_scope:MetadataSchemaFieldDeleteRequest)
  private static final org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest();
  }

  public static org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataSchemaFieldDeleteRequest>
      PARSER = new com.google.protobuf.AbstractParser<MetadataSchemaFieldDeleteRequest>() {
    @java.lang.Override
    public MetadataSchemaFieldDeleteRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MetadataSchemaFieldDeleteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataSchemaFieldDeleteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.airavata.datacatalog.api.MetadataSchemaFieldDeleteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
