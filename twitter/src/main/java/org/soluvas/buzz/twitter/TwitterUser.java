package org.soluvas.buzz.twitter;

/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import twitter4j.Status;
import twitter4j.User;

/**
 * A data interface representing Basic user information element
 *
 * @author Yusuke Yamamoto - yusuke at mac.com
 */
@Entity
public class TwitterUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id @Column(nullable=false) @Index(name="id_idx")
	private long id;
	@Id @Column(nullable=false) @Index(name="revid_idx")
	private int revId;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime fetchTime;

	private String profileBackgroundImageUrl;

	private String profileBackgroundImageUrlHttps;

	private String name;

	@Id @Column(nullable=false) @Index(name="screenName_idx")
	private String screenName;

	private String location;

	private String description;

	private boolean contributorsEnabled;

	private String profileImageUrl;

	private String biggerProfileImageUrl;

	private String miniProfileImageUrl;

	private String originalProfileImageUrl;

	private String profileImageUrlHttps;

	private String biggerProfileImageUrlHttps;

	private String miniProfileImageUrlHttps;

	private String originalProfileImageUrlHttps;

	private String profileBannerUrl;

	private String profileBannerRetinaUrl;

	private String profileBannerIpadUrl;

	private String profileBannerIpadRetinaUrl;

	private String profileBannerMobileUrl;

	private String profileBannerMobileRetinaUrl;

	private boolean profileBackgroundTiled;

	private String lang;

	private int statusesCount;

	private boolean geoEnabled;

	private boolean verified;

	private boolean translator;

	private int listedCount;

	private boolean followRequestSent;

	private String url;

	private boolean protectedState;

	private int followersCount;

	private Status status;

	private String profileBackgroundColor;

	private String profileTextColor;

	private String profileLinkColor;

	private String profileSidebarFillColor;

	private String profileSidebarBorderColor;

	private boolean profileUseBackgroundImage;

	private boolean showAllInlineMedia;

	private int friendsCount;

	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime createdAt;

	private int favouritesCount;

	private int utcOffset;

	private String timeZone;
	
	public TwitterUser() {
		super();
	}
	
	/**
	 * Clones attributes from Twitter4j's {@link User}.
	 * @param src
	 */
	public TwitterUser(User src, int revId, DateTime fetchTime) {
		super();
		this.revId = revId;
		this.fetchTime = fetchTime;
		id = src.getId();
		name = src.getName();
		screenName = src.getScreenName();
		location = src.getLocation();
		description = src.getDescription();
		contributorsEnabled = src.isContributorsEnabled();
	    profileImageUrl = src.getProfileImageURL();
	    biggerProfileImageUrl = src.getBiggerProfileImageURL();
	    miniProfileImageUrl = src.getMiniProfileImageURL();
	    originalProfileImageUrl = src.getOriginalProfileImageURL();
	    profileImageUrlHttps = src.getProfileImageURLHttps();
	    biggerProfileImageUrlHttps = src.getBiggerProfileImageURLHttps();
	    miniProfileImageUrlHttps = src.getMiniProfileImageURLHttps();
	    originalProfileImageUrlHttps = src.getOriginalProfileImageURLHttps();
	    url = src.getURL();
	    protectedState = src.isProtected();
		followersCount = src.getFollowersCount();
		status = src.getStatus();
		profileBackgroundColor = src.getProfileBackgroundColor();
		profileTextColor = src.getProfileTextColor();
		profileLinkColor = src.getProfileLinkColor();
		profileSidebarFillColor = src.getProfileSidebarFillColor();
		profileSidebarBorderColor = src.getProfileSidebarBorderColor();
		profileUseBackgroundImage = src.isProfileUseBackgroundImage();
		showAllInlineMedia = src.isShowAllInlineMedia();
		friendsCount = src.getFriendsCount();
		createdAt = new DateTime(src.getCreatedAt());
		favouritesCount = src.getFavouritesCount();
		utcOffset = src.getUtcOffset();
		timeZone = src.getTimeZone();
		profileBackgroundImageUrl = src.getProfileBackgroundImageURL();
		profileBackgroundImageUrlHttps = src.getProfileBackgroundImageUrlHttps();
		profileBannerUrl = src.getProfileBannerURL();
		profileBannerRetinaUrl = src.getProfileBannerRetinaURL();
		profileBannerIpadUrl = src.getProfileBannerIPadURL();
		profileBannerIpadRetinaUrl = src.getProfileBannerIPadRetinaURL();
		profileBannerMobileUrl = src.getProfileBannerMobileURL();
		profileBannerMobileRetinaUrl = src.getProfileBannerMobileRetinaURL();
		profileBackgroundTiled = src.isProfileBackgroundTiled();
		lang = src.getLang();
		statusesCount = src.getStatusesCount();
		geoEnabled = src.isGeoEnabled();
		verified = src.isVerified();
		translator = src.isTranslator();
		listedCount = src.getListedCount();
		followRequestSent = src.isFollowRequestSent();
	}

	/**
     * Returns the id of the user
     *
     * @return the id of the user
     */
    long getId() {
    	return id;
    }
    
    public int getRevId() {
		return revId;
	}
    
    public DateTime getFetchTime() {
		return fetchTime;
	}

    /**
     * Returns the name of the user
     *
     * @return the name of the user
     */
    String getName() {
    	return name;
    }

    /**
     * Returns the screen name of the user
     *
     * @return the screen name of the user
     */
    String getScreenName() {
    	return screenName;
    }

    /**
     * Returns the location of the user
     *
     * @return the location of the user
     */
    String getLocation() {
    	return location;
    }

    /**
     * Returns the description of the user
     *
     * @return the description of the user
     */
    String getDescription() {
    	return description;
    }

    /**
     * Tests if the user is enabling contributors
     *
     * @return if the user is enabling contributors
     * @since Twitter4J 2.1.2
     */
    boolean isContributorsEnabled() {
    	return contributorsEnabled;
    }

    /**
     * Returns the profile image url of the user
     *
     * @return the profile image url of the user
     */
    String getProfileImageUrl() {
    	return profileImageUrl;
    }
    
    String getBiggerProfileImageUrl() {
    	return biggerProfileImageUrl;
    }
    
    String getMiniProfileImageUrl() {
    	return miniProfileImageUrl;
    }
    
    String getOriginalProfileImageUrl() {
    	return originalProfileImageUrl;
    }

    /**
     * Returns the profile image url of the user, served over SSL
     *
     * @return the profile image url of the user, served over SSL
     */
    String getProfileImageUrlHttps() {
    	return profileImageUrlHttps;
    }
    
    String getBiggerProfileImageUrlHttps() {
    	return biggerProfileImageUrlHttps;
    }
    
    String getMiniProfileImageUrlHttps() {
    	return miniProfileImageUrlHttps;
    }
    
    String getOriginalProfileImageUrlHttps() {
    	return originalProfileImageUrlHttps;
    }

    /**
     * Returns the url of the user
     *
     * @return the url of the user
     */
    String getUrl() {
    	return url;
    }

    /**
     * Test if the user status is protected
     *
     * @return true if the user status is protected
     */
    boolean isProtected() {
    	return protectedState;
    }

    /**
     * Returns the number of followers
     *
     * @return the number of followers
     * @since Twitter4J 1.0.4
     */
    int getFollowersCount() {
    	return followersCount;
    }

    /**
     * Returns the current status of the user<br>
     * This can be null if the instance if from Status.getUser().
     *
     * @return current status of the user
     * @since Twitter4J 2.1.1
     */
    Status getStatus() {
    	return status;
    }

    String getProfileBackgroundColor() {
    	return profileBackgroundColor;
    }

    String getProfileTextColor() {
    	return profileTextColor;
    }

    String getProfileLinkColor() {
    	return profileLinkColor;
    }

    String getProfileSidebarFillColor() {
    	return profileSidebarFillColor;
    }

    String getProfileSidebarBorderColor() {
    	return profileSidebarBorderColor;
    }
    
    boolean isProfileUseBackgroundImage() {
    	return profileUseBackgroundImage;
    }

    boolean isShowAllInlineMedia() {
    	return showAllInlineMedia;
    }

    int getFriendsCount() {
    	return friendsCount;
    }

    DateTime getCreatedAt() {
    	return createdAt;
    }

    int getFavouritesCount() {
    	return favouritesCount;
    }

    int getUtcOffset() {
    	return utcOffset;
    }

    String getTimeZone() {
    	return timeZone;
    }

    String getProfileBackgroundImageUrl() {
    	return profileBackgroundImageUrl;
    }

    String getProfileBackgroundImageUrlHttps() {
    	return profileBackgroundImageUrlHttps;
    }

    /**
     * @since Twitter4J 3.0.0
     */
    String getProfileBannerUrl() {
    	return profileBannerUrl;
    }
    /**
     * @since Twitter4J 3.0.0
     */
    String getProfileBannerRetinaUrl() {
    	return profileBannerRetinaUrl;
    }
    /**
     * @since Twitter4J 3.0.0
     */
    String getProfileBannerIpadUrl() {
    	return profileBannerIpadUrl;
    }
    /**
     * @since Twitter4J 3.0.0
     */
    String getProfileBannerIpadRetinaUrl() {
    	return profileBannerIpadRetinaUrl;
    }
    /**
     * @since Twitter4J 3.0.0
     */
    String getProfileBannerMobileUrl() {
    	return profileBannerMobileUrl;
    }
    /**
     * @since Twitter4J 3.0.0
     */
    String getProfileBannerMobileRetinaUrl() {
    	return profileBannerMobileRetinaUrl;
    }

    boolean isProfileBackgroundTiled() {
    	return profileBackgroundTiled;
    }

    /**
     * Returns the preferred language of the user
     *
     * @return the preferred language of the user
     * @since Twitter4J 2.1.2
     */
    String getLang() {
    	return lang;
    }

    int getStatusesCount() {
    	return statusesCount;
    }

    /**
     * @return the user is enabling geo location
     * @since Twitter4J 2.0.10
     */
    boolean isGeoEnabled() {
    	return geoEnabled;
    }

    /**
     * @return returns true if the user is a verified celebrity
     * @since Twitter4J 2.0.10
     */
    boolean isVerified() {
    	return verified;
    }

    /**
     * @return returns true if the user is a translator
     * @since Twitter4J 2.1.9
     */
    boolean isTranslator() {
    	return translator;
    }

    /**
     * Returns the number of public lists the user is listed on, or -1
     * if the count is unavailable.
     *
     * @return the number of public lists the user is listed on.
     * @since Twitter4J 2.1.4
     */
    int getListedCount() {
    	return listedCount;
    }

    /**
     * Returns true if the authenticating user has requested to follow this user,
     * otherwise false.
     *
     * @return true if the authenticating user has requested to follow this user.
     * @since Twitter4J 2.1.4
     */
    boolean isFollowRequestSent() {
    	return followRequestSent;
    }
    
    /**
     * Returns Url entities for user description.
     * 
     * @return Url entities for user description
     * @since Twitter4J 3.0.3
     */
//    UrlEntity[] getDescriptionUrlEntities();
    
    /**
     * Returns Url entity for user's Url.
     * 
     * @return Url entity for user's Url.
     * @since Twitter4J 3.0.3
     */
//    UrlEntity getUrlEntity();
    
}
