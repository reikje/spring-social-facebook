package org.springframework.social.facebook.api;

import java.util.Collection;

/**
 * Wraps access to the {@code achievement} related calls of the Facebook Graph Api. {@link AchievementOperations} should
 * can only be used by applications categorized as {@code Games} in Facebook. See <a href="http://developers.facebook.com/docs/achievements/">Achievements - Facebook Developers</a>.
 *
 * @author reik, 3/9/12
 */
public interface AchievementOperations {

    /**
     * Returns a {@link Collection} of {@link Achievement}s which are associated with a Facebook application.
     * @return Collection
     */
    Collection<Achievement> getAchievements();
}
