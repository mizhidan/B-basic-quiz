package com.thoughtworks.gtb.jdan.basicquiz.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Education {
    private long userId;
    @NotNull(message = "year cannot be empty")
    private long year;
    @NotEmpty(message = "title cannot be empty")
    private String title;
    @NotEmpty(message = "description cannot be empty")
    private String description;
}
