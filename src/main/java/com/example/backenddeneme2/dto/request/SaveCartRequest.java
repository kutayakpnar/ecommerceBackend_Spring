package com.example.backenddeneme2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SaveCartRequest {

    private Long userId;

    private List<Long> productList;


}
