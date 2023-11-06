package com.dru.care.app.patientdiary.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDeptBean {
    @JsonIgnore
    @ApiModelProperty(dataType = "java.lang.Integer", required = false)
    private Integer patientDepId;
    @ApiModelProperty(dataType = "java.lang.Integer", required = true)
    private Integer patientId;
    @ApiModelProperty(dataType = "java.lang.Integer", required = true)
    private Integer depId;
    @ApiModelProperty(dataType = "java.lang.Integer", required = false)
    private Long orgId;


}
