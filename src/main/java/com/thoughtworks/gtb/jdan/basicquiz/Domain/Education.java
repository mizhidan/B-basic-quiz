package com.thoughtworks.gtb.jdan.basicquiz.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Education {
    @NotNull
    private long userId;
    @NotNull
    private long year;
    @NotNull
    private String title;
    @NotNull
    private String description;
}
