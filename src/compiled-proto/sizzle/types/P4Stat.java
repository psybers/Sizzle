// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p4stat.proto

package sizzle.types;

public final class P4Stat {
  private P4Stat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface P4ChangelistStatsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 time = 1;
    boolean hasTime();
    long getTime();
  }
  public static final class P4ChangelistStats extends
      com.google.protobuf.GeneratedMessage
      implements P4ChangelistStatsOrBuilder {
    // Use P4ChangelistStats.newBuilder() to construct.
    private P4ChangelistStats(Builder builder) {
      super(builder);
    }
    private P4ChangelistStats(boolean noInit) {}
    
    private static final P4ChangelistStats defaultInstance;
    public static P4ChangelistStats getDefaultInstance() {
      return defaultInstance;
    }
    
    public P4ChangelistStats getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sizzle.types.P4Stat.internal_static_sizzle_types_P4ChangelistStats_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sizzle.types.P4Stat.internal_static_sizzle_types_P4ChangelistStats_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 time = 1;
    public static final int TIME_FIELD_NUMBER = 1;
    private long time_;
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getTime() {
      return time_;
    }
    
    private void initFields() {
      time_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, time_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, time_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static sizzle.types.P4Stat.P4ChangelistStats parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(sizzle.types.P4Stat.P4ChangelistStats prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements sizzle.types.P4Stat.P4ChangelistStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sizzle.types.P4Stat.internal_static_sizzle_types_P4ChangelistStats_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sizzle.types.P4Stat.internal_static_sizzle_types_P4ChangelistStats_fieldAccessorTable;
      }
      
      // Construct using sizzle.types.P4Stat.P4ChangelistStats.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        time_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sizzle.types.P4Stat.P4ChangelistStats.getDescriptor();
      }
      
      public sizzle.types.P4Stat.P4ChangelistStats getDefaultInstanceForType() {
        return sizzle.types.P4Stat.P4ChangelistStats.getDefaultInstance();
      }
      
      public sizzle.types.P4Stat.P4ChangelistStats build() {
        sizzle.types.P4Stat.P4ChangelistStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private sizzle.types.P4Stat.P4ChangelistStats buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        sizzle.types.P4Stat.P4ChangelistStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public sizzle.types.P4Stat.P4ChangelistStats buildPartial() {
        sizzle.types.P4Stat.P4ChangelistStats result = new sizzle.types.P4Stat.P4ChangelistStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.time_ = time_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof sizzle.types.P4Stat.P4ChangelistStats) {
          return mergeFrom((sizzle.types.P4Stat.P4ChangelistStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(sizzle.types.P4Stat.P4ChangelistStats other) {
        if (other == sizzle.types.P4Stat.P4ChangelistStats.getDefaultInstance()) return this;
        if (other.hasTime()) {
          setTime(other.getTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTime()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              time_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 time = 1;
      private long time_ ;
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getTime() {
        return time_;
      }
      public Builder setTime(long value) {
        bitField0_ |= 0x00000001;
        time_ = value;
        onChanged();
        return this;
      }
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        time_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:sizzle.types.P4ChangelistStats)
    }
    
    static {
      defaultInstance = new P4ChangelistStats(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:sizzle.types.P4ChangelistStats)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_sizzle_types_P4ChangelistStats_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_sizzle_types_P4ChangelistStats_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014p4stat.proto\022\014sizzle.types\"!\n\021P4Change" +
      "listStats\022\014\n\004time\030\001 \002(\003"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_sizzle_types_P4ChangelistStats_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_sizzle_types_P4ChangelistStats_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_sizzle_types_P4ChangelistStats_descriptor,
              new java.lang.String[] { "Time", },
              sizzle.types.P4Stat.P4ChangelistStats.class,
              sizzle.types.P4Stat.P4ChangelistStats.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
