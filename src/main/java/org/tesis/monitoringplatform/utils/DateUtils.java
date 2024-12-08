package org.tesis.monitoringplatform.utils;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtils {
    public static ZonedDateTime convertToLocalTime(Instant utcTimestamp, String timeZone) {
        // Convert the UTC Instant to a ZonedDateTime in the desired local timezone ("America/Lima")
        return utcTimestamp.atZone(ZoneId.of(timeZone));
    }
}
