package com.bookstore.jpa.dtos;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public record BookRecordDto (String title,
                            UUID publisherId,
                            List<UUID> authorIds,
                            String reviewComments) {



}
