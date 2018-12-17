package hello;

import java.time.LocalDate;

/**
 * A POJO for pet inforamtion used to generate a response for an Alexa Flash Briefing
 *  Must include the following required elements
 * Content-Type: application/json
 * ...
 * {
 *   "uid": "urn:uuid:1335c695-cfb8-4ebb-abbd-80da344efa6b",
 *   "updateDate": "2016-05-23T00:00:00.0Z",
 *   "titleText": "Amazon Developer Blog, week in review May 23rd",
 *   "mainText": "Meet Echosim. A new online community tool for developers that simulates the look and feel of an Amazon Echo.",
 *   "redirectionUrl": "https://developer.amazon.com/public/community/blog"
 * }
 *
 */
public class Pet {

    private final long uid;
    private final LocalDate updateDate;
    private final String titleText;
    private final String mainText;
    private final String redirectionUrl;

    public Pet(long uid, LocalDate updateDate, String titleText, String mainText, String redirectionUrl ) {
        this.uid = uid;
        this.updateDate = updateDate;
	this.titleText = titleText;
        this.mainText = mainText;
        this.redirectionUrl = redirectionUrl;
    }

    public long getUid() {
        return uid;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public String getTitleText() {
        return titleText;
    }
    
    public String getMainText() {
        return mainText;
    }

    public String getRedirectionUrl() {
        return redirectionUrl;
    }



}

