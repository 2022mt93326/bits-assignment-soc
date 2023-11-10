package com.bits.pms.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class CreateProductDto {
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    @NotEmpty
    private String lob;
    @NotNull
    @NotEmpty
    private String description;
    @NotEmpty
    private List<@Valid Characteristic> characteristics;
    @NotEmpty
    private List<@Valid PlanDto> plans;
}
