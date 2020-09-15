package com.thoughtworks.gtb.jdan.basicquiz.Domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private long id;
    @Min(value = 16, message = "name must over 16")
    @NotEmpty(message = "name cannot be empty")
    private String name;
    @NotNull(message = "age cannot be empty")
    private long age;
    @NotEmpty(message = "avatar cannot be empty")
    private String avatar;
    @NotEmpty(message = "description cannot be empty")
    private String description;
}
