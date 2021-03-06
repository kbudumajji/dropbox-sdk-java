/* DO NOT EDIT */
/* This file was generated from team.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;
import com.dropbox.core.v2.users.Name;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * Basic member profile.
 */
public class MemberProfile {
    // struct MemberProfile

    protected final String teamMemberId;
    protected final String externalId;
    protected final String email;
    protected final boolean emailVerified;
    protected final TeamMemberStatus status;
    protected final Name name;
    protected final TeamMembershipType membershipType;

    /**
     * Basic member profile.
     *
     * @param teamMemberId  ID of user as a member of a team. Must not be {@code
     *     null}.
     * @param email  Email address of user. Must not be {@code null}.
     * @param emailVerified  Is true if the user's email is verified to be owned
     *     by the user.
     * @param status  The user's status as a member of a specific team. Must not
     *     be {@code null}.
     * @param name  Representations for a person's name. Must not be {@code
     *     null}.
     * @param membershipType  The user's membership type: full (normal team
     *     member) vs limited (does not use a license; no access to the team's
     *     shared quota). Must not be {@code null}.
     * @param externalId  External ID that a team can attach to the user. An
     *     application using the API may find it easier to use their own IDs
     *     instead of Dropbox IDs like account_id or team_member_id.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MemberProfile(String teamMemberId, String email, boolean emailVerified, TeamMemberStatus status, Name name, TeamMembershipType membershipType, String externalId) {
        if (teamMemberId == null) {
            throw new IllegalArgumentException("Required value for 'teamMemberId' is null");
        }
        this.teamMemberId = teamMemberId;
        this.externalId = externalId;
        if (email == null) {
            throw new IllegalArgumentException("Required value for 'email' is null");
        }
        this.email = email;
        this.emailVerified = emailVerified;
        if (status == null) {
            throw new IllegalArgumentException("Required value for 'status' is null");
        }
        this.status = status;
        if (name == null) {
            throw new IllegalArgumentException("Required value for 'name' is null");
        }
        this.name = name;
        if (membershipType == null) {
            throw new IllegalArgumentException("Required value for 'membershipType' is null");
        }
        this.membershipType = membershipType;
    }

    /**
     * Basic member profile.
     *
     * <p> The default values for unset fields will be used. </p>
     *
     * @param teamMemberId  ID of user as a member of a team. Must not be {@code
     *     null}.
     * @param email  Email address of user. Must not be {@code null}.
     * @param emailVerified  Is true if the user's email is verified to be owned
     *     by the user.
     * @param status  The user's status as a member of a specific team. Must not
     *     be {@code null}.
     * @param name  Representations for a person's name. Must not be {@code
     *     null}.
     * @param membershipType  The user's membership type: full (normal team
     *     member) vs limited (does not use a license; no access to the team's
     *     shared quota). Must not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MemberProfile(String teamMemberId, String email, boolean emailVerified, TeamMemberStatus status, Name name, TeamMembershipType membershipType) {
        this(teamMemberId, email, emailVerified, status, name, membershipType, null);
    }

    /**
     * ID of user as a member of a team.
     *
     * @return value for this field, never {@code null}.
     */
    public String getTeamMemberId() {
        return teamMemberId;
    }

    /**
     * External ID that a team can attach to the user. An application using the
     * API may find it easier to use their own IDs instead of Dropbox IDs like
     * account_id or team_member_id.
     *
     * @return value for this field, or {@code null} if not present.
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Email address of user.
     *
     * @return value for this field, never {@code null}.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Is true if the user's email is verified to be owned by the user.
     *
     * @return value for this field.
     */
    public boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * The user's status as a member of a specific team.
     *
     * @return value for this field, never {@code null}.
     */
    public TeamMemberStatus getStatus() {
        return status;
    }

    /**
     * Representations for a person's name.
     *
     * @return value for this field, never {@code null}.
     */
    public Name getName() {
        return name;
    }

    /**
     * The user's membership type: full (normal team member) vs limited (does
     * not use a license; no access to the team's shared quota).
     *
     * @return value for this field, never {@code null}.
     */
    public TeamMembershipType getMembershipType() {
        return membershipType;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            teamMemberId,
            externalId,
            email,
            emailVerified,
            status,
            name,
            membershipType
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            MemberProfile other = (MemberProfile) obj;
            return ((this.teamMemberId == other.teamMemberId) || (this.teamMemberId.equals(other.teamMemberId)))
                && ((this.email == other.email) || (this.email.equals(other.email)))
                && (this.emailVerified == other.emailVerified)
                && ((this.status == other.status) || (this.status.equals(other.status)))
                && ((this.name == other.name) || (this.name.equals(other.name)))
                && ((this.membershipType == other.membershipType) || (this.membershipType.equals(other.membershipType)))
                && ((this.externalId == other.externalId) || (this.externalId != null && this.externalId.equals(other.externalId)))
                ;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static final class Serializer extends StructSerializer<MemberProfile> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(MemberProfile value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("team_member_id");
            StoneSerializers.string().serialize(value.teamMemberId, g);
            g.writeFieldName("email");
            StoneSerializers.string().serialize(value.email, g);
            g.writeFieldName("email_verified");
            StoneSerializers.boolean_().serialize(value.emailVerified, g);
            g.writeFieldName("status");
            TeamMemberStatus.Serializer.INSTANCE.serialize(value.status, g);
            g.writeFieldName("name");
            Name.Serializer.INSTANCE.serialize(value.name, g);
            g.writeFieldName("membership_type");
            TeamMembershipType.Serializer.INSTANCE.serialize(value.membershipType, g);
            if (value.externalId != null) {
                g.writeFieldName("external_id");
                StoneSerializers.nullable(StoneSerializers.string()).serialize(value.externalId, g);
            }
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public MemberProfile deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            MemberProfile value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_teamMemberId = null;
                String f_email = null;
                Boolean f_emailVerified = null;
                TeamMemberStatus f_status = null;
                Name f_name = null;
                TeamMembershipType f_membershipType = null;
                String f_externalId = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("team_member_id".equals(field)) {
                        f_teamMemberId = StoneSerializers.string().deserialize(p);
                    }
                    else if ("email".equals(field)) {
                        f_email = StoneSerializers.string().deserialize(p);
                    }
                    else if ("email_verified".equals(field)) {
                        f_emailVerified = StoneSerializers.boolean_().deserialize(p);
                    }
                    else if ("status".equals(field)) {
                        f_status = TeamMemberStatus.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("name".equals(field)) {
                        f_name = Name.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("membership_type".equals(field)) {
                        f_membershipType = TeamMembershipType.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("external_id".equals(field)) {
                        f_externalId = StoneSerializers.nullable(StoneSerializers.string()).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_teamMemberId == null) {
                    throw new JsonParseException(p, "Required field \"team_member_id\" missing.");
                }
                if (f_email == null) {
                    throw new JsonParseException(p, "Required field \"email\" missing.");
                }
                if (f_emailVerified == null) {
                    throw new JsonParseException(p, "Required field \"email_verified\" missing.");
                }
                if (f_status == null) {
                    throw new JsonParseException(p, "Required field \"status\" missing.");
                }
                if (f_name == null) {
                    throw new JsonParseException(p, "Required field \"name\" missing.");
                }
                if (f_membershipType == null) {
                    throw new JsonParseException(p, "Required field \"membership_type\" missing.");
                }
                value = new MemberProfile(f_teamMemberId, f_email, f_emailVerified, f_status, f_name, f_membershipType, f_externalId);
            }
            else {
                throw new JsonParseException(p, "No subtype found that matches tag: \"" + tag + "\"");
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
