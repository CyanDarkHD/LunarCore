// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class RelicOuterClass {
  /**
   * Protobuf type {@code Relic}
   */
  public static final class Relic extends ProtoMessage<Relic> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 tid = 2;</code>
     */
    private int tid;

    /**
     * <code>optional uint32 level = 3;</code>
     */
    private int level;

    /**
     * <code>optional uint32 unique_id = 5;</code>
     */
    private int uniqueId;

    /**
     * <code>optional uint32 base_avatar_id = 7;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional uint32 exp = 10;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 main_affix_id = 14;</code>
     */
    private int mainAffixId;

    /**
     * <code>optional bool is_protected = 11;</code>
     */
    private boolean isProtected;

    /**
     * <code>repeated .RelicAffix sub_affix_list = 8;</code>
     */
    private final RepeatedMessage<RelicAffixOuterClass.RelicAffix> subAffixList = RepeatedMessage.newEmptyInstance(RelicAffixOuterClass.RelicAffix.getFactory());

    private Relic() {
    }

    /**
     * @return a new empty instance of {@code Relic}
     */
    public static Relic newInstance() {
      return new Relic();
    }

    /**
     * <code>optional uint32 tid = 2;</code>
     * @return whether the tid field is set
     */
    public boolean hasTid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 tid = 2;</code>
     * @return this
     */
    public Relic clearTid() {
      bitField0_ &= ~0x00000001;
      tid = 0;
      return this;
    }

    /**
     * <code>optional uint32 tid = 2;</code>
     * @return the tid
     */
    public int getTid() {
      return tid;
    }

    /**
     * <code>optional uint32 tid = 2;</code>
     * @param value the tid to set
     * @return this
     */
    public Relic setTid(final int value) {
      bitField0_ |= 0x00000001;
      tid = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @return this
     */
    public Relic clearLevel() {
      bitField0_ &= ~0x00000002;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 3;</code>
     * @param value the level to set
     * @return this
     */
    public Relic setLevel(final int value) {
      bitField0_ |= 0x00000002;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @return whether the uniqueId field is set
     */
    public boolean hasUniqueId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @return this
     */
    public Relic clearUniqueId() {
      bitField0_ &= ~0x00000004;
      uniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @return the uniqueId
     */
    public int getUniqueId() {
      return uniqueId;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @param value the uniqueId to set
     * @return this
     */
    public Relic setUniqueId(final int value) {
      bitField0_ |= 0x00000004;
      uniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 7;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 7;</code>
     * @return this
     */
    public Relic clearBaseAvatarId() {
      bitField0_ &= ~0x00000008;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 7;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 7;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public Relic setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000008;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @return this
     */
    public Relic clearExp() {
      bitField0_ &= ~0x00000010;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 10;</code>
     * @param value the exp to set
     * @return this
     */
    public Relic setExp(final int value) {
      bitField0_ |= 0x00000010;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 main_affix_id = 14;</code>
     * @return whether the mainAffixId field is set
     */
    public boolean hasMainAffixId() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 main_affix_id = 14;</code>
     * @return this
     */
    public Relic clearMainAffixId() {
      bitField0_ &= ~0x00000020;
      mainAffixId = 0;
      return this;
    }

    /**
     * <code>optional uint32 main_affix_id = 14;</code>
     * @return the mainAffixId
     */
    public int getMainAffixId() {
      return mainAffixId;
    }

    /**
     * <code>optional uint32 main_affix_id = 14;</code>
     * @param value the mainAffixId to set
     * @return this
     */
    public Relic setMainAffixId(final int value) {
      bitField0_ |= 0x00000020;
      mainAffixId = value;
      return this;
    }

    /**
     * <code>optional bool is_protected = 11;</code>
     * @return whether the isProtected field is set
     */
    public boolean hasIsProtected() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional bool is_protected = 11;</code>
     * @return this
     */
    public Relic clearIsProtected() {
      bitField0_ &= ~0x00000040;
      isProtected = false;
      return this;
    }

    /**
     * <code>optional bool is_protected = 11;</code>
     * @return the isProtected
     */
    public boolean getIsProtected() {
      return isProtected;
    }

    /**
     * <code>optional bool is_protected = 11;</code>
     * @param value the isProtected to set
     * @return this
     */
    public Relic setIsProtected(final boolean value) {
      bitField0_ |= 0x00000040;
      isProtected = value;
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 8;</code>
     * @return whether the subAffixList field is set
     */
    public boolean hasSubAffixList() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 8;</code>
     * @return this
     */
    public Relic clearSubAffixList() {
      bitField0_ &= ~0x00000080;
      subAffixList.clear();
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSubAffixList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getSubAffixList() {
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getMutableSubAffixList() {
      bitField0_ |= 0x00000080;
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 8;</code>
     * @param value the subAffixList to add
     * @return this
     */
    public Relic addSubAffixList(final RelicAffixOuterClass.RelicAffix value) {
      bitField0_ |= 0x00000080;
      subAffixList.add(value);
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 8;</code>
     * @param values the subAffixList to add
     * @return this
     */
    public Relic addAllSubAffixList(final RelicAffixOuterClass.RelicAffix... values) {
      bitField0_ |= 0x00000080;
      subAffixList.addAll(values);
      return this;
    }

    @Override
    public Relic copyFrom(final Relic other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        tid = other.tid;
        level = other.level;
        uniqueId = other.uniqueId;
        baseAvatarId = other.baseAvatarId;
        exp = other.exp;
        mainAffixId = other.mainAffixId;
        isProtected = other.isProtected;
        subAffixList.copyFrom(other.subAffixList);
      }
      return this;
    }

    @Override
    public Relic mergeFrom(final Relic other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTid()) {
        setTid(other.tid);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasUniqueId()) {
        setUniqueId(other.uniqueId);
      }
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasMainAffixId()) {
        setMainAffixId(other.mainAffixId);
      }
      if (other.hasIsProtected()) {
        setIsProtected(other.isProtected);
      }
      if (other.hasSubAffixList()) {
        getMutableSubAffixList().addAll(other.subAffixList);
      }
      return this;
    }

    @Override
    public Relic clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      tid = 0;
      level = 0;
      uniqueId = 0;
      baseAvatarId = 0;
      exp = 0;
      mainAffixId = 0;
      isProtected = false;
      subAffixList.clear();
      return this;
    }

    @Override
    public Relic clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      subAffixList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Relic)) {
        return false;
      }
      Relic other = (Relic) o;
      return bitField0_ == other.bitField0_
        && (!hasTid() || tid == other.tid)
        && (!hasLevel() || level == other.level)
        && (!hasUniqueId() || uniqueId == other.uniqueId)
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasExp() || exp == other.exp)
        && (!hasMainAffixId() || mainAffixId == other.mainAffixId)
        && (!hasIsProtected() || isProtected == other.isProtected)
        && (!hasSubAffixList() || subAffixList.equals(other.subAffixList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(tid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 88);
        output.writeBoolNoTag(isProtected);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < subAffixList.length(); i++) {
          output.writeRawByte((byte) 66);
          output.writeMessageNoTag(subAffixList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(tid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * subAffixList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(subAffixList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Relic mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // tid
            tid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // uniqueId
            uniqueId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // mainAffixId
            mainAffixId = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // isProtected
            isProtected = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // subAffixList
            tag = input.readRepeatedMessage(subAffixList, tag);
            bitField0_ |= 0x00000080;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.tid, tid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.uniqueId, uniqueId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.mainAffixId, mainAffixId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.isProtected, isProtected);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedMessage(FieldNames.subAffixList, subAffixList);
      }
      output.endObject();
    }

    @Override
    public Relic mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 114831: {
            if (input.isAtField(FieldNames.tid)) {
              if (!input.trySkipNullValue()) {
                tid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -294460212:
          case -538310583: {
            if (input.isAtField(FieldNames.uniqueId)) {
              if (!input.trySkipNullValue()) {
                uniqueId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100893: {
            if (input.isAtField(FieldNames.exp)) {
              if (!input.trySkipNullValue()) {
                exp = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1973876974:
          case -1426712144: {
            if (input.isAtField(FieldNames.mainAffixId)) {
              if (!input.trySkipNullValue()) {
                mainAffixId = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 569879972:
          case -1919645991: {
            if (input.isAtField(FieldNames.isProtected)) {
              if (!input.trySkipNullValue()) {
                isProtected = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -600836050:
          case 919890188: {
            if (input.isAtField(FieldNames.subAffixList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(subAffixList);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public Relic clone() {
      return new Relic().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Relic parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Relic(), data).checkInitialized();
    }

    public static Relic parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Relic(), input).checkInitialized();
    }

    public static Relic parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Relic(), input).checkInitialized();
    }

    /**
     * @return factory for creating Relic messages
     */
    public static MessageFactory<Relic> getFactory() {
      return RelicFactory.INSTANCE;
    }

    private enum RelicFactory implements MessageFactory<Relic> {
      INSTANCE;

      @Override
      public Relic create() {
        return Relic.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName tid = FieldName.forField("tid");

      static final FieldName level = FieldName.forField("level");

      static final FieldName uniqueId = FieldName.forField("uniqueId", "unique_id");

      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName exp = FieldName.forField("exp");

      static final FieldName mainAffixId = FieldName.forField("mainAffixId", "main_affix_id");

      static final FieldName isProtected = FieldName.forField("isProtected", "is_protected");

      static final FieldName subAffixList = FieldName.forField("subAffixList", "sub_affix_list");
    }
  }
}
