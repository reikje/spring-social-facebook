package org.springframework.social.facebook.api.impl;

import org.springframework.social.facebook.api.Achievement;
import org.springframework.social.facebook.api.AchievementOperations;

import java.util.Collection;

/**
 * A {@link AchievementOperations} implementation which uses the Facebook Graph Api.
 *
 * @author reik, 3/9/12
 */
class AchievementTemplate extends AbstractFacebookOperations implements AchievementOperations {

    public AchievementTemplate(final boolean isAuthorized) {
        super(isAuthorized);
    }

    @Override
    public Collection<Achievement> getAchievements() {
        throw new UnsupportedOperationException("not implemented yet");
    }
}
