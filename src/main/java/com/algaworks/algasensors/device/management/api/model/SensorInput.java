package com.algaworks.algasensors.device.management.api.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class SensorInput {

    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String ip;
    @NotNull
    @NotBlank
    private String location;
    @NotNull
    @NotBlank
    private String protocol;
    @NotNull
    @NotBlank
    private String model;
    private Boolean enabled;
}
