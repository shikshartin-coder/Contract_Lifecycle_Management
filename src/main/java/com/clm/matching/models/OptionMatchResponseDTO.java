package com.clm.matching.models;

import com.clm.category.models.OptionDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OptionMatchResponseDTO {

    private OptionDTO optionDTO;
    private boolean isMatch;
}