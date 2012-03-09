package org.springframework.social.facebook.api;

/**
 * Encapsulates data that makes up a logical {@link Achievement} within Facebook applications that are
 * categorized as {@code Games}.
 *
 * @author reik, 3/9/12
 */
public class Achievement {

    private final String id;

    private final String title;

    private final String link;

    private final String description;

    private final String imageUrl;

    private final int points;

    public Achievement(final String id, final String title, final String link, final String description, final String imageUrl, final int points) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.description = description;
        this.imageUrl = imageUrl;
        this.points = points;
    }

    /**
     * Returns the {@code id} of this {@link Achievement} object.
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the {@link Achievement}s {@code title}.
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns a unique {@code url} which Facebook uses as callback when the {@link Achievement} is created.
     * @return String
     */
    public String getLink() {
        return link;
    }

    /**
     * Returns the {@link Achievement}s {@code description}.
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the {@link Achievement}s {@code image url}.
     * @return String
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Returns the number of points which are associated with this {@link Achievement}. Currently Facebook allows this
     * to be a value between 0 and 1000.
     * @return int
     */
    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Achievement");
        sb.append("{id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", link='").append(link).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", points=").append(points);
        sb.append('}');
        return sb.toString();
    }
}
