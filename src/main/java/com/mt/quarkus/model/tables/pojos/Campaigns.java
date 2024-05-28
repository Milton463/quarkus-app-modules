/*
 * This file is generated by jOOQ.
 */
package com.mt.quarkus.model.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import com.mt.quarkus.model.enums.CampaignsEmailThreads;
import com.mt.quarkus.model.enums.CampaignsIsFavourite;
import com.mt.quarkus.model.enums.CampaignsStatus;

import org.jooq.JSON;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Campaigns implements Serializable {

    private static final long serialVersionUID = 1L;

    private ULong id;
    private UUID uid;
    private ULong userId;
    private ULong teamId;
    private ULong agencyId;
    private String title;
    private String timezone;
    private CampaignsStatus status;
    private CampaignsIsFavourite isFavourite;
    private CampaignsEmailThreads emailThreads;
    private String commonEmailSubject;
    private String apiKey;
    private LocalDateTime startTime;
    private LocalDateTime pauseTime;
    private JSON settingInfos;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Campaigns() {}

    public Campaigns(Campaigns value) {
        this.id = value.id;
        this.uid = value.uid;
        this.userId = value.userId;
        this.teamId = value.teamId;
        this.agencyId = value.agencyId;
        this.title = value.title;
        this.timezone = value.timezone;
        this.status = value.status;
        this.isFavourite = value.isFavourite;
        this.emailThreads = value.emailThreads;
        this.commonEmailSubject = value.commonEmailSubject;
        this.apiKey = value.apiKey;
        this.startTime = value.startTime;
        this.pauseTime = value.pauseTime;
        this.settingInfos = value.settingInfos;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Campaigns(
        ULong id,
        UUID uid,
        ULong userId,
        ULong teamId,
        ULong agencyId,
        String title,
        String timezone,
        CampaignsStatus status,
        CampaignsIsFavourite isFavourite,
        CampaignsEmailThreads emailThreads,
        String commonEmailSubject,
        String apiKey,
        LocalDateTime startTime,
        LocalDateTime pauseTime,
        JSON settingInfos,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.uid = uid;
        this.userId = userId;
        this.teamId = teamId;
        this.agencyId = agencyId;
        this.title = title;
        this.timezone = timezone;
        this.status = status;
        this.isFavourite = isFavourite;
        this.emailThreads = emailThreads;
        this.commonEmailSubject = commonEmailSubject;
        this.apiKey = apiKey;
        this.startTime = startTime;
        this.pauseTime = pauseTime;
        this.settingInfos = settingInfos;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.id</code>.
     */
    public ULong getId() {
        return this.id;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.id</code>.
     */
    public Campaigns setId(ULong id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.uid</code>.
     */
    public UUID getUid() {
        return this.uid;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.uid</code>.
     */
    public Campaigns setUid(UUID uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.user_id</code>.
     */
    public ULong getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.user_id</code>.
     */
    public Campaigns setUserId(ULong userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.team_id</code>.
     */
    public ULong getTeamId() {
        return this.teamId;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.team_id</code>.
     */
    public Campaigns setTeamId(ULong teamId) {
        this.teamId = teamId;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.agency_id</code>.
     */
    public ULong getAgencyId() {
        return this.agencyId;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.agency_id</code>.
     */
    public Campaigns setAgencyId(ULong agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.title</code>.
     */
    public Campaigns setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.timezone</code>.
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.timezone</code>.
     */
    public Campaigns setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.status</code>.
     */
    public CampaignsStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.status</code>.
     */
    public Campaigns setStatus(CampaignsStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.is_favourite</code>.
     */
    public CampaignsIsFavourite getIsFavourite() {
        return this.isFavourite;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.is_favourite</code>.
     */
    public Campaigns setIsFavourite(CampaignsIsFavourite isFavourite) {
        this.isFavourite = isFavourite;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.email_threads</code>.
     */
    public CampaignsEmailThreads getEmailThreads() {
        return this.emailThreads;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.email_threads</code>.
     */
    public Campaigns setEmailThreads(CampaignsEmailThreads emailThreads) {
        this.emailThreads = emailThreads;
        return this;
    }

    /**
     * Getter for
     * <code>bulk_email_tenant_01.campaigns.common_email_subject</code>.
     */
    public String getCommonEmailSubject() {
        return this.commonEmailSubject;
    }

    /**
     * Setter for
     * <code>bulk_email_tenant_01.campaigns.common_email_subject</code>.
     */
    public Campaigns setCommonEmailSubject(String commonEmailSubject) {
        this.commonEmailSubject = commonEmailSubject;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.api_key</code>.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.api_key</code>.
     */
    public Campaigns setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.start_time</code>.
     */
    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.start_time</code>.
     */
    public Campaigns setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.pause_time</code>.
     */
    public LocalDateTime getPauseTime() {
        return this.pauseTime;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.pause_time</code>.
     */
    public Campaigns setPauseTime(LocalDateTime pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.setting_infos</code>.
     * carry_on_campaign Yes,No DEFAULT Yes,prevent_previous_followup Yes ,No
     * DEFAULT Yes,sent_immediate_after_resume Yes,No DEFAULT
     * Yes,is_continue_after_fail Yes,No DEFAULT Yes,real_campaign Yes,No
     * DEFAULT Yes,edit_warning_close DEFAULT No
     */
    public JSON getSettingInfos() {
        return this.settingInfos;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.setting_infos</code>.
     * carry_on_campaign Yes,No DEFAULT Yes,prevent_previous_followup Yes ,No
     * DEFAULT Yes,sent_immediate_after_resume Yes,No DEFAULT
     * Yes,is_continue_after_fail Yes,No DEFAULT Yes,real_campaign Yes,No
     * DEFAULT Yes,edit_warning_close DEFAULT No
     */
    public Campaigns setSettingInfos(JSON settingInfos) {
        this.settingInfos = settingInfos;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.created_at</code>.
     */
    public Campaigns setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>bulk_email_tenant_01.campaigns.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>bulk_email_tenant_01.campaigns.updated_at</code>.
     */
    public Campaigns setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Campaigns other = (Campaigns) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.uid == null) {
            if (other.uid != null)
                return false;
        }
        else if (!this.uid.equals(other.uid))
            return false;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!this.userId.equals(other.userId))
            return false;
        if (this.teamId == null) {
            if (other.teamId != null)
                return false;
        }
        else if (!this.teamId.equals(other.teamId))
            return false;
        if (this.agencyId == null) {
            if (other.agencyId != null)
                return false;
        }
        else if (!this.agencyId.equals(other.agencyId))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.timezone == null) {
            if (other.timezone != null)
                return false;
        }
        else if (!this.timezone.equals(other.timezone))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.isFavourite == null) {
            if (other.isFavourite != null)
                return false;
        }
        else if (!this.isFavourite.equals(other.isFavourite))
            return false;
        if (this.emailThreads == null) {
            if (other.emailThreads != null)
                return false;
        }
        else if (!this.emailThreads.equals(other.emailThreads))
            return false;
        if (this.commonEmailSubject == null) {
            if (other.commonEmailSubject != null)
                return false;
        }
        else if (!this.commonEmailSubject.equals(other.commonEmailSubject))
            return false;
        if (this.apiKey == null) {
            if (other.apiKey != null)
                return false;
        }
        else if (!this.apiKey.equals(other.apiKey))
            return false;
        if (this.startTime == null) {
            if (other.startTime != null)
                return false;
        }
        else if (!this.startTime.equals(other.startTime))
            return false;
        if (this.pauseTime == null) {
            if (other.pauseTime != null)
                return false;
        }
        else if (!this.pauseTime.equals(other.pauseTime))
            return false;
        if (this.settingInfos == null) {
            if (other.settingInfos != null)
                return false;
        }
        else if (!this.settingInfos.equals(other.settingInfos))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.uid == null) ? 0 : this.uid.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.teamId == null) ? 0 : this.teamId.hashCode());
        result = prime * result + ((this.agencyId == null) ? 0 : this.agencyId.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.timezone == null) ? 0 : this.timezone.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.isFavourite == null) ? 0 : this.isFavourite.hashCode());
        result = prime * result + ((this.emailThreads == null) ? 0 : this.emailThreads.hashCode());
        result = prime * result + ((this.commonEmailSubject == null) ? 0 : this.commonEmailSubject.hashCode());
        result = prime * result + ((this.apiKey == null) ? 0 : this.apiKey.hashCode());
        result = prime * result + ((this.startTime == null) ? 0 : this.startTime.hashCode());
        result = prime * result + ((this.pauseTime == null) ? 0 : this.pauseTime.hashCode());
        result = prime * result + ((this.settingInfos == null) ? 0 : this.settingInfos.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Campaigns (");

        sb.append(id);
        sb.append(", ").append(uid);
        sb.append(", ").append(userId);
        sb.append(", ").append(teamId);
        sb.append(", ").append(agencyId);
        sb.append(", ").append(title);
        sb.append(", ").append(timezone);
        sb.append(", ").append(status);
        sb.append(", ").append(isFavourite);
        sb.append(", ").append(emailThreads);
        sb.append(", ").append(commonEmailSubject);
        sb.append(", ").append(apiKey);
        sb.append(", ").append(startTime);
        sb.append(", ").append(pauseTime);
        sb.append(", ").append(settingInfos);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
