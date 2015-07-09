package org.soluvas.buzz.core;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.Period;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by ceefour on 7/10/15.
 */
@Entity
@Table(schema="buzz",
        uniqueConstraints = { // with manual, you get nice constraint names, not random IDs
        },
        indexes = {
                @Index(name = "ik_autolikerule_creationtime", columnList = "creationtime"),
                @Index(name = "ik_autolikerule_modificationtime", columnList = "modificationtime"),
                @Index(name = "ik_autolikerule_buzzaccountid", columnList = "buzzaccountid"),
                @Index(name = "ik_autolikerule_periodstarttime", columnList = "periodstarttime"),
                @Index(name = "ik_autolikerule_lastfiretime", columnList = "lastfiretime"),
                @Index(name = "ik_autolikerule_nextfiretime", columnList = "nextfiretime"),
        }
)
public class AutoLikeRule implements Serializable {

    @Id
//	@GeneratedValue(generator="system-uuid")
//	@GenericGenerator(name="system-uuid", strategy="uuid2")
    @Type(type="org.hibernate.type.PostgresUUIDType")
    private UUID id;
    @Column(columnDefinition = "timestamp with time zone", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime creationTime;
    @Column(columnDefinition = "timestamp with time zone", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime modificationTime;
    @Column(nullable = false)
    private String buzzAccountId;

    @Enumerated(EnumType.STRING)
    private ExternalSite site;
    @Enumerated(EnumType.STRING)
    private UserSearchScope userSearchScope;
    private String keyword;
    private boolean likeAction;
    private boolean favoriteAction;
    private boolean quoteAction;
    private boolean followAction;
    private boolean addToListAction;

    private int maxFiresPerPeriod;
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentPeriodAsString")
    private Period period;

    @Column(columnDefinition = "timestamp with time zone")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime periodStartTime;
    private int fireCount;
    @Column(columnDefinition = "timestamp with time zone")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime lastFireTime;
    @Column(columnDefinition = "timestamp with time zone")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime nextFireTime;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public DateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
    }

    public DateTime getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(DateTime modificationTime) {
        this.modificationTime = modificationTime;
    }

    public String getBuzzAccountId() {
        return buzzAccountId;
    }

    public void setBuzzAccountId(String buzzAccountId) {
        this.buzzAccountId = buzzAccountId;
    }

    public ExternalSite getSite() {
        return site;
    }

    public void setSite(ExternalSite site) {
        this.site = site;
    }

    public UserSearchScope getUserSearchScope() {
        return userSearchScope;
    }

    public void setUserSearchScope(UserSearchScope userSearchScope) {
        this.userSearchScope = userSearchScope;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public boolean isLikeAction() {
        return likeAction;
    }

    public void setLikeAction(boolean likeAction) {
        this.likeAction = likeAction;
    }

    public boolean isFavoriteAction() {
        return favoriteAction;
    }

    public void setFavoriteAction(boolean favoriteAction) {
        this.favoriteAction = favoriteAction;
    }

    public boolean isQuoteAction() {
        return quoteAction;
    }

    public void setQuoteAction(boolean quoteAction) {
        this.quoteAction = quoteAction;
    }

    public boolean isFollowAction() {
        return followAction;
    }

    public void setFollowAction(boolean followAction) {
        this.followAction = followAction;
    }

    public boolean isAddToListAction() {
        return addToListAction;
    }

    public void setAddToListAction(boolean addToListAction) {
        this.addToListAction = addToListAction;
    }

    /**
     * Maximum number of fires per {@link #getPeriod()}.
     * The fires will be spread evenly during the period.
     * For example, if max fires is 10 per 1H, then each fire
     * will be separated by 6 minutes.
     * This value must be at least 1.
     * @return
     */
    public int getMaxFiresPerPeriod() {
        return maxFiresPerPeriod;
    }

    public void setMaxFiresPerPeriod(int maxFiresPerPeriod) {
        this.maxFiresPerPeriod = maxFiresPerPeriod;
    }

    /**
     * Length of a period.
     * @return
     */
    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    /**
     * Start time of the current {@link #getPeriod()}.
     * @return
     */
    public DateTime getPeriodStartTime() {
        return periodStartTime;
    }

    public void setPeriodStartTime(DateTime periodStartTime) {
        this.periodStartTime = periodStartTime;
    }

    /**
     * Number of fires in this period.
     * At reaching {@link #getMaxFiresPerPeriod()}, this will
     * reset back to 0, to prepare for next fire.
     * @return
     */
    public int getFireCount() {
        return fireCount;
    }

    public void setFireCount(int fireCount) {
        this.fireCount = fireCount;
    }

    public DateTime getLastFireTime() {
        return lastFireTime;
    }

    public void setLastFireTime(DateTime lastFireTime) {
        this.lastFireTime = lastFireTime;
    }

    public DateTime getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(DateTime nextFireTime) {
        this.nextFireTime = nextFireTime;
    }
}
