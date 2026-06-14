package ovh.neziw.checker.release;

import com.google.gson.annotations.SerializedName;

import java.time.ZonedDateTime;

public record Asset(
        int id,
        String name,
        long size,
        @SerializedName("download_count") int downloadCount,
        @SerializedName("content_type") String contentType,
        @SerializedName("browser_download_url") String browserDownloadUrl,
        @SerializedName("created_at") ZonedDateTime createdAt,
        @SerializedName("updated_at") ZonedDateTime updatedAt
) {
}
