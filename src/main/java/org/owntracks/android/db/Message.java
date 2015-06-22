package org.owntracks.android.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table MESSAGE.
 */
public class Message {

    private String id;
    private Long tst;
    private String channel;
    private String sender;
    private String title;
    private String description;
    private String icon;
    private Integer priority;
    private String iconUrl;
    private String url;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Message() {
    }

    public Message(String id) {
        this.id = id;
    }

    public Message(String id, Long tst, String channel, String sender, String title, String description, String icon, Integer priority, String iconUrl, String url) {
        this.id = id;
        this.tst = tst;
        this.channel = channel;
        this.sender = sender;
        this.title = title;
        this.description = description;
        this.icon = icon;
        this.priority = priority;
        this.iconUrl = iconUrl;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTst() {
        return tst;
    }

    public void setTst(Long tst) {
        this.tst = tst;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}