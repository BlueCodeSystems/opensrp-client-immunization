package org.smartregister.domain;

import androidx.annotation.Nullable;

/**
 * Lightweight photo metadata holder retained for backward compatibility with legacy OpenSRP UI code.
 */
public class Photo {

    private String filePath;
    private int resourceId = -1;

    public Photo() {
    }

    @Nullable
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(@Nullable String filePath) {
        this.filePath = filePath;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
